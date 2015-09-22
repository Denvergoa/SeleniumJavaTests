package com;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
 
public class ResultsPage extends Page{
	
	
    
	public ResultsPage(WebDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
   
    
    @FindBy (xpath = "//*[@id='title_page']/div/div/div[2]/h1")
    private WebElement suggestions;
    
    
    public String getSuggestionsReturned() {
    	return ((WebElement) suggestions).getText();

}
}

    
    
    
   





//    @FindBy (xpath = "//*[@id='title_page']/div/div/div[3]/ul/li[3]/p")
//    private WebElement numberOfSuggestions;
    
   
    
    
//    public void getResult(){
//    List <WebElement> result = driver.findElements(By.xpath("//*[@id='title_page']/div/div/div[3]/ul/li"));
//	for (int i = 0; i < result.size(); i++){
//	System.out.println(result.get(i).getText());
//	}
//    }
    
//    public String getSuggestionsReturned() {
//    	return ((WebElement) suggestions).getText();
    
  //(( + 
    //((WebElement) numberOfSuggestions).getText()

//public String getSuggestionsReturned() {
//	return ((WebElement) suggestions).getText();
//}
//
//	}


//вывод результатов