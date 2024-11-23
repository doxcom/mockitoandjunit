package com.example.unit_testing;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations={"classpath:test-configuration.properties"}) //this is linked to properties file into src/resources path
class UnitTestingApplicationTests {

	@Test
	void contextLoads() {
	}

}
