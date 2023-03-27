package com.bookingservice.booking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookingApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void TestController() throws URISyntaxException{
		try{
			URL url = new URL("localhost:8082/test");
		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		urlConnection.connect();
		assertEquals(HttpURLConnection.HTTP_OK, urlConnection.getResponseCode());
		}catch(IOException e){
			System.err.println("Error creating HTTP connection");
			e.printStackTrace();
		}
}
}
