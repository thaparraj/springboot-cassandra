package com.example.cassandra.itests;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CassandraApplicationIT {
    @Test
    public void test1() {
        System.out.println("---Int test 1");
    }
}
