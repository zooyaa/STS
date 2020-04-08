package com.multicampus.finalproject.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateUtil {

    private static RestTemplate restTemplate;

    @Autowired
    public RestTemplateUtil(RestTemplate restTemplate) {
        this.restTemplate=restTemplate;
    }

    // public static ResponseEntity<String> getResponseEntity(String key){
    //     //header setting
    //     HttpHeaders headers = new HttpHeaders();
    //     headers.add("Authentication", key);


    //     HttpEntity<Map<String, String>> httpEntity = new HttpEntity<>(headers);

    //     Map<String, String> params = new HashMap<>();
    //     params.put("name", "jaeyeon");

    //     //순서대로 url, method, entity(header, params), return type
    //     return restTemplate.exchange("http://localhost:8080/entity?name={name}", HttpMethod.GET, httpEntity, String.class, params);
    // }

    public static ResponseEntity<String> post(String imgString){
        // MultiValueMap<String,String> map = new LinkedMultiValueMap<String,String>();
        
        return restTemplate.postForEntity("http://70.12.50.158:5000/testapi",imgString, String.class);
        // return restTemplate.getForEntity("http://localhost:5000/testapi", String.class);
    }
}