package com.SelfParkingSystems.ParkingServer.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    @GetMapping("/integration")
    public String test(){
        return "ParkingController integration test ok.";
    }

//    @GetMapping("/message/{message}")
//    public String test(@PathVariable String message){
//        return service.sendMessageToParkingController(message);
//    }
}
