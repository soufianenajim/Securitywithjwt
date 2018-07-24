package com.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OAuth2Server1Application.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class OAuth2Server1ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
