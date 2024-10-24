package org.example.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//프레젠테이션 계층
@RestController
public class TestController{
    @Autowired // 빈을 주입
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMembers(){ // 제네릭 메서드
        List<Member> members = testService.getAllMembers();
        return members;
    }
}
