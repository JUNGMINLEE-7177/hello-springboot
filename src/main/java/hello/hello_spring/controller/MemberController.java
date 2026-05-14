package hello.hello_spring.controller;

import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberServcice;

    @Autowired
    public MemberController(MemberService memberServcice) {
        this.memberServcice = memberServcice;
    }
}
