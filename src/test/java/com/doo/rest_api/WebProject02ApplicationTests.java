package com.doo.rest_api;

import com.doo.rest_api.dto.User02;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebProject02ApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("-------------------------");

		// Text JSON -> Object
		// Object -> Text JSON

		// controller req json(text) -> object
		// response object -> json(text)

		var objectMapper = new ObjectMapper();

		// object -> text
		// "object mapper get method" using...
		var user02 = new User02("doo", 10, "010-1111-222");
		var text = objectMapper.writeValueAsString(user02);
		System.out.println(text);

		// text -> object
		// "object mapper" need default constructor
		var objectUser02 = objectMapper.readValue(text, User02.class);
		System.out.println(objectUser02);

	}
}
