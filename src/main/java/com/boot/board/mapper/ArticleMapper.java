package com.boot.board.mapper;

import com.boot.board.dto.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {

    List<Article> getList();

}
