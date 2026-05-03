package com.example.demo;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/paypal")
@CrossOrigin("*")
public class Catalog {
	
	 @Autowired
	 private APIContext apiContext;


	private final String BASE_URL = "https://api-m.sandbox.paypal.com/v1/catalogs/products?Prefer=return=minimal&PayPal_Request_Id=72";
	private final String GETPRODUCT_URL = "https://api-m.sandbox.paypal.com/v1/catalogs/products?page_size=90&page=1&total_required=true";
	@Value("${paypal.client.id}")
    private String clientId;
    @Value("${paypal.client.secret}")
    private String clientSecret;    
    
    String url = "https://api-m.sandbox.paypal.com/v1/oauth2/token";
	
	
	public String Token() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.setBasicAuth(clientId, clientSecret);
        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
        body.add("grant_type", "client_credentials");
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(body, headers);
        ResponseEntity<Map> response = restTemplate.postForEntity(url, request, Map.class);   
        String Token =  (String) response.getBody().get("access_token");
        return Token;
    }
	@PostMapping("/product")
    public ResponseEntity<Object> createProduct(@RequestBody ProductRequest productRequest) {
		
    	RestClient restClient = RestClient.create();

    	 ResponseEntity<String> result = restClient.post()
            .uri(BASE_URL)
            .header(HttpHeaders.AUTHORIZATION, "Bearer " + Token())
            .contentType(MediaType.APPLICATION_JSON)
            .body(productRequest)
            .retrieve()
            .toEntity(String.class);
    	 var statusCode = result.getBody();

         // Return a response with the same status code as the external service
         return ResponseEntity.status(201)
                 .body("External service returned status: " + statusCode);
    //	retun return ResponseEntity.ok("Request successful!");
    }
	@GetMapping("/getList/products")
    public ResponseEntity<Object> getProduct() {
		
    	RestClient restClient = RestClient.create();

    	 ResponseEntity<Object> result = restClient.get()
            .uri(GETPRODUCT_URL)
            .header(HttpHeaders.AUTHORIZATION, "Bearer " + Token())
            .retrieve()
            .toEntity(Object.class);
    	 var statusCode = result.getBody();
    	 System.out.println(result);
         return ResponseEntity.status(200)
                 .body(statusCode);
    }

}
