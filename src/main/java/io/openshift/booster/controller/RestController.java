package io.openshift.booster.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    
      @RequestMapping("/test")

    public String testMe(){

        return "OK";

    }

    @RequestMapping("/currency")
    public ResponseEntity<String> currency(){

         ResponseEntity<String> response =null;

        try{

            RestTemplate restTemplate=new RestTemplate();

            String currResURL = "http://data.fixer.io/api/latest?access_key=98c6aa43ad8aa06dddb50f138e8b64b2";

             response =restTemplate.getForEntity(currResURL, String.class);

           

        }catch(Exception e){

            e.printStackTrace();

        }

        return response;

    }
}
