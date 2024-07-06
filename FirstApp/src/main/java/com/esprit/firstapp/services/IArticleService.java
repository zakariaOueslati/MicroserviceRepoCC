package com.esprit.firstapp.services;

import java.util.List;
import java.util.Map;

import com.esprit.firstapp.entities.Article;
import com.esprit.firstapp.entities.ArticleWithStockDTO;

public interface IArticleService {
	
	ArticleWithStockDTO addArticle(ArticleWithStockDTO article);

	Article updateArticle(Long id, Map<String, Object> article);


	void deleteArticleById(Long id);


	List<ArticleWithStockDTO> getAllArticle();

	ArticleWithStockDTO getArticleById(Long id);

}
