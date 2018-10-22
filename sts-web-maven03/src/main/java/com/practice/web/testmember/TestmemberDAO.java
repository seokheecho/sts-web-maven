package com.practice.web.testmember;

import org.springframework.stereotype.Repository;

@Repository("testmemberDAO")
public interface TestmemberDAO {
//  int insert(TestmemberVO testmemberVO);

    public abstract int insert(TestmemberVO testmemberVO);
}
