package com.ethan.client;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-client.xml" }, inheritLocations = false)
public class InitClientTest {

	@Test
	public void test() throws IOException {
		System.in.read();
	}

}
