package com.demo.rpc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

// spring注解用法
public interface HelloFacade {

//    @PostMapping(value = "/postJson", consumes = "application/json")
//    OrderDto postJson (@RequestBody OrderDto dto);
//
//    @PostMapping(value = "/postForm", consumes = "application/x-www-form-urlencoded")
//    OrderDto postForm (OrderDto dto);
//
//    @GetMapping("/get")
//    OrderDto get(@RequestParam("id") Long id, @RequestParam("name") String name);
//
//    @GetMapping("/getByMap")
//    OrderDto getByMap(@RequestParam("param") Map<String, Object> param);
//
//    @GetMapping("/getById/{id}")
//    OrderDto getById(@PathVariable("id") Long id);

    @GetMapping("/getStrById/{id}")
    String testStr(@PathVariable("id") String id);
}