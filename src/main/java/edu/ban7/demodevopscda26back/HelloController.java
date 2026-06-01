package edu.ban7.demodevopscda26back;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloController {

    @Value("${jwt.secret}")
    protected String jwtSecret;

    @GetMapping("/")
    public ResponseEntity<String> hello () {
       return new ResponseEntity<>("Hello dev, jwt secret = " + jwtSecret, HttpStatus.OK);
    }

}
