package com.practice.web.testmember;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(value="/testmember")
public class TestmemberController {

    @Autowired TestmemberService testmemberService;
    
    
    /*
     * sts-web-maven/app/testmember/testform //==> frontend => WEB-INF(.jsp)
     * (web.xml 설정에서 <url-pattern>/app/*</url-pattern> 진행 시 경로)
     * 
     * sts-web-maven/testmember/testform //==> frontend => WEB-INF(.jsp) 
     * (web.xml 설정에서 <url-pattern>/</url-pattern> 진행 시 경로)
     */
//    @RequestMapping("/testform")
//    public void testform(Model model) {
//        model.addAttribute("name", "TestForm _ 홍길동");
//    }
//    
//    @RequestMapping(value="/add", method = RequestMethod.POST)
//    public String add(TestmemberVO testmemberVO) throws Exception {
//        System.out.println("test중!!!!!=======Controller======");
//        testmemberService.add(testmemberVO);
//        
//        return "/testmember/testsuccess";
//        
//    }
    
    /*
     * sts-web-maven/testmember/testform.html // ==> frontend - backend 분리 => webapp (.html, .js)
     * 
     *** web.xml 설정에서 <url-pattern>/app/*</url-pattern> 진행 시 
     * http://localhost:8080/sts-web-maven/app/testmember/add 경로로 Request를 해야한다.
     */
    @RequestMapping(value="/add", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> add(@RequestBody TestmemberVO testmemberVO){
        System.out.println("test중!!!!!=======Controller======");
        System.out.println(testmemberVO);
        Map<String, Object> result = testmemberService.add(testmemberVO);
        result.put("status", "success");
        System.out.println("test중!!!!!=======Controller======");
        System.out.println(testmemberVO);
      
        return result;
    }
    
    
}
