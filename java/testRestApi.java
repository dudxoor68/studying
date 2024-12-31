package com.example.restApi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class testRestApi {

	public static void main(String[] args) {
		
	            RestTemplate restTemplate = new RestTemplate();
	            
	            String url = "https://apis.data.go.kr/B551172/getExaminationRateBreastCancer/TotalBreastCancerTrend?serviceKey=123&pageNo=1&numOfRows=20&resultType=json";
	            
	            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
	            
	            System.out.println("Response Code: " + response.getStatusCode());
	            System.out.println("Response Body: " + response.getBody());

	}

}
