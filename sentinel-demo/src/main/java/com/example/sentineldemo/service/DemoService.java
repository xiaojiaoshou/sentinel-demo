package com.example.sentineldemo.service;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.example.sentineldemo.utils.ExceptionUtil;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @SentinelResource(value = "test1", blockHandler = "handleException", blockHandlerClass = {ExceptionUtil.class})
    public void test1() {
        System.out.println("执行了test1方法");

    }

    @SentinelResource(value = "test2", blockHandler = "handleException2", blockHandlerClass = {ExceptionUtil.class})
    public String test2(String id) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行了test2方法");

        return "test2";
    }

    /**
     *  测试 defaultFallback
     * @param id
     * @return
     */
    @SentinelResource(value = "test3", defaultFallback = "defaultException", fallbackClass = {ExceptionUtil.class},exceptionsToIgnore = Exception.class)
    public String test3(String id) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行了test3方法");
        return "test3";
    }
}
