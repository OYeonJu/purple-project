package com.latte.love.purple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//이 프로젝트의 메인 클래스
//프로젝트의 최상단에 위치해야함

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //내장 WAS를 실행시킴
        SpringApplication.run(Application.class, args);
    }
}
