package utils;

import static org.hamcrest.Matchers.containsString;

import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class ApiTeste {
    @Test
    @DisplayName("Validate create user")
    public void testValidateCreateUser() {
        baseURI = "https://reqres.in/api";
        basePath = "/users";



        // Enviar a requisição POST e obter a resposta
        Response response = given()
                .header("Content-Type", "application/json") // Definindo o Content-Type como JSON
                .body("{\"name\":\"Evelyn\", \"job\":\"QA Engineer\"}")
                .when()
                .post("/users");

        response.then().log().all().assertThat().statusCode(201);

        response.then().log().all()
                .body("name", containsString("Evelyn"))
                .body("job", containsString("QA Engineer"))
                .assertThat();

    }
}
