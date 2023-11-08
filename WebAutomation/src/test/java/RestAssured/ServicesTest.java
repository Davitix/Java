package RestAssured;

import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

import static io.restassured.RestAssured.*;

public class ServicesTest {

    @Test
    public void getExample(){
        Response response;
        response = given().get("https://swapi.dev/api/people/2/");
        Assert.assertEquals(response.getStatusCode(),200);
    }

    @Test
    public void getDataExample(){
        /*1. Test the endpoint people/2/ and check the success response, the skin color to be gold,
          and the amount of films it appears on (should be 6).*/
        Response response = given().get("https://swapi.dev/api/people/2/");
        Assert.assertEquals(response.getStatusCode(),200);
        JsonPath json = response.jsonPath();
        String text = json.get("skin_color");
        Assert.assertEquals(text, "gold");
        List<String> books = json.get("films");
        Assert.assertEquals(books.size(),6);

        /* 2. Request the endpoint of the second movie in which people/2/ was present (using the response
        from people/2/). Check the release date to be in the correct date format, and the response to include
        characters, planets, starships, vehicles and species, each element including more than 1 element. */
        String second = books.get(1);
        response = given().get(second);
        json = response.jsonPath();
        String releaseDate = json.get("release_date");
        try {
            Date dateFormat = new SimpleDateFormat("yyyy-MM-dd").parse(releaseDate);
            Assert.assertTrue(true);
        } catch (Exception e) {
            Assert.assertTrue(false);
        }

        List<String> characters = json.get("characters");
        List<String> planets = json.get("planets");
        List<String> starships = json.get("starships");
        List<String> vehicles = json.get("vehicles");
        List<String> species = json.get("species");

        Assert.assertTrue(characters.size()>1);
        Assert.assertTrue(planets.size()>1);
        Assert.assertTrue(starships.size()>1);
        Assert.assertTrue(vehicles.size()>1);
        Assert.assertTrue(species.size()>1);

        /* 3. Request the endpoint of the first planet present in the last film's response (using the
        previous response). Check the gravity and the terrains matching the exact same values returned
        by the request (Use fixtures to store and compare the data of terrains and gravity). */
        String planet = planets.get(0);
        response = given().get(planet);
        json = response.jsonPath();

        Assert.assertEquals(json.get("gravity"),"1.1 standard");
        Assert.assertEquals(json.get("terrain"),"tundra, ice caves, mountain ranges");

        /* 4. On the same response from the planet, grab the url element on the response, and request it.
        Validate the response being exactly the same from the previous one.*/
        Assert.assertEquals(json.get("url"),planet);

        /* 5. Request the /films/7/ and check the response having a 404 code.*/
        response = given().get("https://swapi.dev/api/films/7/");
        Assert.assertEquals(response.getStatusCode(),404);
    }
}
