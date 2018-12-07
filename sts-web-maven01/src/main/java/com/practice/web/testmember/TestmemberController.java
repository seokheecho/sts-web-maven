package com.practice.web.testmember;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

@RequestMapping(value="/testmember")
public class TestmemberController {

    @Autowired TestmemberService testmemberService;
    
    
    @RequestMapping("/testform")
    public void testform(Model model) {
        model.addAttribute("name", "TestForm _ 홍길동");
    }
    
    @RequestMapping(value="/add", method = RequestMethod.POST)
    public String add(TestmemberVO testmemberVO) throws Exception {
        System.out.println("test중!!!!!=======Controller======");
        testmemberService.add(testmemberVO);
        
        return "/testmember/testsuccess";
        
    }
 

}
