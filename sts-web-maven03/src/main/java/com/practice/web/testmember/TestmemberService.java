package com.practice.web.testmember;

import java.util.Map;

public interface TestmemberService {
    // void add(TestmemberVO testmemberVO) throws Exception;
    
    //등록
    public abstract Map<String, Object> add(TestmemberVO testmemberVO);
}
