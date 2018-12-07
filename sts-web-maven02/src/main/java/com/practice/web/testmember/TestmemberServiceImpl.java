package com.practice.web.testmember;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestmemberServiceImpl implements TestmemberService{
    @Autowired TestmemberDAO testmemberDAO;
    
//    public void add(TestmemberVO testmemberVO) throws Exception {
//        System.out.println("test중!!!!!=======Service======");
//        testmemberDAO.insert(testmemberVO);
//        System.out.println("test중!!!!!=======Service insert 확인======");
//    }
    
    @Override
    public Map<String, Object> add(TestmemberVO testmemberVO) {
        // TODO Auto-generated method stub
        System.out.println("test중!!!!!=======Service======");
        
        Map<String, Object> resultMap = new HashMap<String, Object>();
                int insertResult = 0;
        try {
                    
            insertResult =  testmemberDAO.insert(testmemberVO);        
            resultMap.put("result", "success");      //초기값 0; 성공시 횟수를 반환
        System.out.println("test중!!!!!=======Service insert 확인======");
        
        } catch(Exception e) {
            e.printStackTrace();
        }
         
        return resultMap;
    }
}
