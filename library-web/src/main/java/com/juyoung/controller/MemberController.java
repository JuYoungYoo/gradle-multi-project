package com.juyoung.controller;

import com.juyoung.domain.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/")
    public Member get(){
        return new Member("chloe", "juy5790@outlook.com");
    }
}
