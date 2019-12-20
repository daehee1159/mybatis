package com.boot.board.dao;

import com.boot.board.dto.Article;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component  //이렇게 해야 AutoWired 에 의한 연결에 적용됨
public class ArticleDaoImpl implements ArticleDao {

    public List<Article> getList() {

        Article article1 = new Article(1, "2019-12-19 12:12:12", "제목1", "내용1");
        Article article2 = new Article(2, "2019-12-19 12:13:12", "제목2", "내용2");
        Article article3 = new Article(3, "2019-12-19 12:14:12", "제목3", "내용3");

        List<Article> list = new ArrayList<>();

        list.add(article1);
        list.add(article2);
        list.add(article3);

        return list;
    }
}
