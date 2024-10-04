package com.study.board.service;


import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//boardcontroller로 이동
@Service
public class BoardService {


    @Autowired
    private BoardRepository boardRepository;

    public void write(Board board) { //Board 엔티티 객체를 받아서 데이터베이스에 저장

        boardRepository.save(board);

    }

    //3 글을 불러와야 하니까 서비스에서 처리
    public List<Board> boardList() {// list에 빨간색이 뜨면 컨트롤 스페이스

        return boardRepository.findAll();

    }
}
