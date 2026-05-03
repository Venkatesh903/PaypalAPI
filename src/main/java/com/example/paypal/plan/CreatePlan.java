package com.example.paypal.plan;
import com.example.demo.ProductRequest;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/paypal")
@CrossOrigin("*")
public class CreatePlan {
	private final String BASE_URL = "https://api-m.sandbox.paypal.com//v1/billing/plans?Prefer=return=minimal&PayPal_Request_Id=72";
	private final String GETPRODUCT_URL = "https://api-m.sandbox.paypal.com/v1/billing/plans";
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
	@PostMapping("/createplan")
    public ResponseEntity<Object> createProduct(@RequestBody PlanProduct product) {
		
    	RestClient restClient = RestClient.create();

    	 ResponseEntity<Object> result = restClient.post()
            .uri(BASE_URL)
            .header(HttpHeaders.AUTHORIZATION, "Bearer " + Token())
            .contentType(MediaType.APPLICATION_JSON)
            .body(product)
            .retrieve()
            .toEntity(Object.class);
    	 var statusCode = result.getBody();


         return ResponseEntity.status(201)
                 .body(statusCode);
    }
	@GetMapping("/list/plans/products")
    public ResponseEntity<Object> ListProduct() {
		
    	RestClient restClient = RestClient.create();
    	int size = 10;
    	int page = 1;
    	boolean required = true;
    	String product_id = "PROD-22H58998FH896301X";

    	 ResponseEntity<Object> result = restClient.get()
            .uri("https://api-m.sandbox.paypal.com/v1/billing/plans?product_id="+product_id+"&page_size="+size+"&page="+page+"&total_required="+true)
            .header(HttpHeaders.AUTHORIZATION, "Bearer " + Token())
            .retrieve()
            .toEntity(Object.class);

		
//    	MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
//    	params.add("product_id", product_id);
//    	params.add("page_size", String.valueOf(10));
//    	params.add("page", String.valueOf(1));
//    	params.add("total_required", String.valueOf(true));
//
//    	String uri = UriComponentsBuilder.fromPath(GETPRODUCT_URL)
//    	    .queryParams(params)
//    	    .toUriString();

//    	ResponseEntity<Object> result = restClient.get()
//    	    .uri(uri)
//    	    .header(HttpHeaders.AUTHORIZATION, "Bearer " + Token())
//          .retrieve()
//          .toEntity(Object.class);

		var statusCode = result.getBody();
      return ResponseEntity.status(201)
              .body(statusCode);

    }
}
