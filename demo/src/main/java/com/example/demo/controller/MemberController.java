package com.example.demo.controller;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MemberController {

    @Autowired
    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping("/member")
    public List<Member> OrderType(){
        return memberRepository.findAll().stream().collect(Collectors.toList());

    }


}
