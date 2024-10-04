package com.study.board.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

  @GetMapping("/board/write") //localhost:8080/board/write 로 접속하면 보여짐
  public String boardWriteForm(){ //boardWriteForm은 변수명같은데,,

      return "boardwrite"; //템플릿안에있는 html 파일
  }

  @PostMapping("/board/writepro")
  public String boardWritePro(String title, String content){



      return"";
  }

}
