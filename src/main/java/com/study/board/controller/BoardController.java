package com.study.board.controller;


import com.study.board.entity.Board;
import com.study.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

  @Autowired
  private BoardService boardService;

  @GetMapping("/board/write") //localhost:8080/board/write 로 접속하면 보여짐
  public String boardWriteForm(){ //boardWriteForm은 변수명같은데,,

      return "boardwrite"; //템플릿안에있는 html 파일
  }

  @PostMapping("/board/writepro")
//  public String boardWritePro(String title, String content){ //html title과 content을 받을거다.
    public String boardWritePro(Board board){ //일일이 받기 힘드니 board.java에 있는 board를 받기로 한다.

//      System.out.println("제목 : "+ title);
//      System.out.println("내용 : "+ content); 확인했으니 주석처리
//      System.out.println(board.getTitle()); 확인했으니 주석

        boardService.write(board); // boardservice를 인식할 수 없으니 @Autowired 설정


      return"";
  }


}
