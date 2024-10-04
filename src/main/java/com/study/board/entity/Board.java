package com.study.board.entity; //Board 같은 이름오로 만들어 주는 게 좋음.


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//db에 있는 테이블을 의미
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //mysql 전용

    private Integer id;

    private String title;

    private String content;



}
