package com.dumas.sbta.quick.start;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static org.junit.Assert.assertEquals;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/03/31 14:43
 */
@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = {QuickStartApplication.class})
@SpringBootTest(classes = QuickStartApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class QuickStartApplicationTest {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception{
        this.base = new URL("http://localhost:" + port + "/api/demo/echo");
    }

    @Test
    public void testsDemo(){
        ResponseEntity<String> response = template.getForEntity(base.toString(), String.class);
        assertEquals(response.getBody(), "echo");
    }
}
