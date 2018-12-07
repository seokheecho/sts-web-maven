package com.practice.web.testmember;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestmemberServiceImpl implements TestmemberService{
    @Autowired TestmemberDAO testmemberDAO;
    
    public void add(TestmemberVO testmemberVO) throws Exception {
        System.out.println("test중!!!!!=======Service======");
        testmemberDAO.insert(testmemberVO);
        System.out.println("test중!!!!!=======Service insert 확인======");
    }
    
}
