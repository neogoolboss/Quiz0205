package com.greedy.level01.basic.member.model.vo;

public class MemberVO {

    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;

    public void setId() {

        this.id = id;

    }

    public void setPwd() {

        this.pwd = pwd;

    }

    public void setName() {

        this.name = name;

    }

    public void setAge() {

        this.age = age;

    }

    public void setGender() {

        this.gender = gender;

    }

    public void setPhone() {

        this.phone = phone;

    }

    public void setEmail() {

        this.email = email;

    }

    public String getId() {

        return id;

    }

    public String getPwd() {

        return pwd;

    }

    public String getName() {

        return name;

    }

    public int getAge() {

        return age;

    }

    public char getGender() {

        return gender;

    }

    public String getPhone() {

        return phone;

    }

    public String getEmail() {

        return email;

    }

    public MemberVO() {
//        System.out.println("MemberVO 클래스의 기본 생성자 호출함...");
    }

    public MemberVO(String id, String pwd, String name, int age, char gender, String phone, String email) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
//        System.out.println("MemberVO 클래스의 id, pwd, name을 초기화하는 생성자 호출함...");
    }

    public MemberVO(MemberVO otherMemberVO){

        this(otherMemberVO.id, otherMemberVO.pwd, otherMemberVO.name, otherMemberVO.age, otherMemberVO.gender, otherMemberVO.phone, otherMemberVO.email);

    }

    public String getInformation() {
        return "id = " + this.id + "\npwd = " + this.pwd + "\nname : " + this.name + "\nage : " + this.age + "\ngender : " + this.gender + "\nphone : " + this.phone + "\nemail : " + email;

    }

    public String afterGetInformation() {
        return "변경 후 id = " + this.id + "\n변경 후 pwd = " + this.pwd + "\n변경 후 name : " + this.name + "\n변경 후 age : " + this.age + "\n변경 후 gender : " + this.gender + "\n변경 후 phone : " + this.phone + "\n변경 후 email : " + email;

    }

}
