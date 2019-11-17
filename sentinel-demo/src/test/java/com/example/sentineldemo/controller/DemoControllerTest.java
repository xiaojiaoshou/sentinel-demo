package com.example.sentineldemo.controller;

import com.example.sentineldemo.SentinelDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SentinelDemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class DemoControllerTest {

    @Autowired
    private DemoController demoController;

    @Test
    public void test() throws InterruptedException {
//            ExecutorService executorService = Executors.newFixedThreadPool(10);
//            for (int i = 0; i < 10; i++) {
//                executorService.execute(new Runnable() {
//                    @Override
//                    public void run() {
//                        String test = demoController.test();
//                        System.out.println(test);
//                    }
//                });
//                Thread.sleep(100);
//        }
    }

}