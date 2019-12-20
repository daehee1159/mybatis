package com.boot.board.service;

import com.boot.board.dao.ArticleDao;
import com.boot.board.dto.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleDao articleDao;
    // 이제 ArticleService는 데이터 관련해서는 모두 Dao에게 위임

    public List<Article> getList() {
        //이건 가짜 데이터임, 중간 확인용
//        Article article1 = new Article(1, "2019-12-19 12:12:12", "제목1", "내용1");
//        Article article2 = new Article(2, "2019-12-19 12:13:12", "제목2", "내용2");
//        Article article3 = new Article(3, "2019-12-19 12:14:12", "제목3", "내용3");
//
//        List<Article> list = new ArrayList<>();
//
//        list.add(article1);
//        list.add(article2);
//        list.add(article3);
//
//        return list;

        return articleDao.getList();
    }
}
