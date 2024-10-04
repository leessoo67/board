package com.study.board.repository;


import com.study.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//상속받는 repository
@Repository//무조건 생성
public interface BoardRepository extends JpaRepository<Board,Integer> { //<,> 어떤 entity를 넣을것이냐, it의 type, integer 을 설정
}
