package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.vo.MemberVO;

public class Application {

    public static void main(String[] args) {

        MemberVO memberV0 = new MemberVO();
        System.out.println(memberV0.getInformation());

        MemberVO memberV01 = new MemberVO("user01","pass01","홍길동",20,'M',"010-1234-5678","hong123@greedy.com");
        System.out.println(memberV01.afterGetInformation());

    }

}
