package com.narenkg.myhomeprint.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class PrinterSetting {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
	private String pageNumbers;
	private Boolean bothSide;
	private Boolean landscape;
	private Integer pagesPerSheet;
	private Boolean isColor;
	private String message;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPageNumbers() {
		return pageNumbers;
	}
	public void setPageNumbers(String pageNumbers) {
		this.pageNumbers = pageNumbers;
	}
	public Boolean getBothSide() {
		return bothSide;
	}
	public void setBothSide(Boolean bothSide) {
		this.bothSide = bothSide;
	}
	public Boolean getLandscape() {
		return landscape;
	}
	public void setLandscape(Boolean landscape) {
		this.landscape = landscape;
	}
	public Integer getPagesPerSheet() {
		return pagesPerSheet;
	}
	public void setPagesPerSheet(Integer pagesPerSheet) {
		this.pagesPerSheet = pagesPerSheet;
	}
	public Boolean getIsColor() {
		return isColor;
	}
	public void setIsColor(Boolean isColor) {
		this.isColor = isColor;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
