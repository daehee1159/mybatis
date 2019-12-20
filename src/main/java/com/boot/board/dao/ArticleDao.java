package com.boot.board.dao;

import com.boot.board.dto.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper //ArticleDao 의 구현체를 마이바티스가 대신 구현해줌
public interface ArticleDao {
    public List<Article> getList();
}
