package com.esprit.firstapp.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
public class ArticleWithStockDTO {
	private Long id;
	private String name;
	private int size;
	private String id_stock;
	private StockDTO stockdto;
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}

	public StockDTO getStockdto() {
		return stockdto;
	}


	
	

}
