package com.sparta.assignment.controller;

import com.sparta.assignment.dto.OderRequestDto;
import com.sparta.assignment.dto.RestaurantRequestDto;
import com.sparta.assignment.model.Oder;
import com.sparta.assignment.service.OderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OderController {
    private final OderService oderService;

    @Autowired
    public OderController(OderService oderService) {
        this.oderService = oderService;
    }


    @PostMapping("/oder/request")
    public Oder createOder(@RequestBody OderRequestDto requestDto) {



        return oderService.createOder(requestDto);

    }




}
