package com.boot.board.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private int id;
    private String regDate;
    private String title;
    private String body;
}
