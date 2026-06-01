package edu.ban7.demodevopscda26back.unit;

import edu.ban7.demodevopscda26back.HelloController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HelloTest {

    @Test
    public void getUserByExistingId_shouldReturnCode200() {
        HelloController helloController = new HelloController();
        ResponseEntity<String> reponse = helloController.hello();
        Assertions.assertEquals(HttpStatus.OK, reponse.getStatusCode());
    }

}
