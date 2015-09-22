package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.FilterPage;
import com.ResultsPage;

import java.util.List;

public class SearchRunner {
	

public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://rozetka.com.ua/notebooks/c80004/filter/");
	FilterPage rozetkaNotebooks = PageFactory.initElements(driver, FilterPage.class);
	
	rozetkaNotebooks.searchNotebook(1);
	rozetkaNotebooks.searchPrice("5000", "10000");
	rozetkaNotebooks.refreshButtonClick();
	rozetkaNotebooks.searchNotebook(0);
	
	List <WebElement> suggestions = driver.findElements(By.xpath("//*[@id='title_page']/div/div/div[3]/ul/li"));

	for (int i = 0; i < suggestions.size(); i++){
		System.out.println(suggestions.get(i).getText());
	}
	
	driver.close();
}
}














//rozetkaNotebooks.searchProcessor(0);
//resultsPage.getSuggestionsReturned();
//rozetkaNotebooks.searchColor(index)
//rozetkaNotebooks.searchHddMemory(index)
//rozetkaNotebooks.searchHddType(index)
//rozetkaNotebooks.searchLanguage(index)
//rozetkaNotebooks.searchOpticalType(index)
//rozetkaNotebooks.searchOsType(index)
//rozetkaNotebooks.searchProducer(index)
//rozetkaNotebooks.searchRam(index)
//rozetkaNotebooks.searchScreenCover(index)
//rozetkaNotebooks.searchScreenDimension(index)
//rozetkaNotebooks.searchScreenSensor(index)
//rozetkaNotebooks.searchScreenSize(index)
//rozetkaNotebooks.searchScreenType(index)
//rozetkaNotebooks.searchVideocardMemory(index)
//rozetkaNotebooks.searchWeight(index)
	
//if (first == a) {
//	System.out.println("equals");
//}
//else {
//	System.out.println("Not equals");


//ResultsPage resultsPage = new ResultsPage(driver);
//FilterPage filterPage = new FilterPage(driver);
//Thread.sleep(2000);


//List <WebElement> result = driver.findElements(By.xpath("//*[@id='title_page']/div/div/div[3]/ul/li"));
//for (int i = 0; i < result.size(); i++){
//System.out.println(result.get(i).getText());
//}



//ResultsPage searchSuggestion = rozetkaNotebooks.search(0, "2000", "10000");
//WebElement result = driver.findElement(By.xpath("//*[@id='title_page']/div/div/div[3]/ul/li[1]/a"));

//public void getResult(){
//	List <WebElement> suggestions = driver.findElements(By.xpath("//*[@id='title_page']/div/div/div[3]/ul/li"));
//	for (int i = 0; i < suggestions.size(); i++){
//	System.out.println(suggestions.get(i).getText());

