package com;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterPage extends Page {

	public FilterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id='sort_named_filters']/li/label/a") // �����
	private List<WebElement> notebookFields;

	@FindBy(xpath = "//*[@id='sort_producer']/li/label/a") // �������������
	private List<WebElement> producerFields;

	@FindBy(xpath = "//*[@id='price[min]']") // ���� ��
	private WebElement minpriceField;

	@FindBy(xpath = "//*[@id='price[max]']") // ���� ��
	private WebElement maxpriceField;

	@FindBy(xpath = "//*[@id='submitprice']") // ������ "��"
	private WebElement submitButton;

	@FindBy(xpath = "//*[@id='sort_20861']/li/label/a") // �����
	private List<WebElement> screenSizeFields;

	@FindBy(xpath = "//*[@id='sort_25800']/li/label/a") // ����������
	private List<WebElement> screenDimensionFields;

	@FindBy(xpath = "//*[@id='sort_36519']/li/label/a") // ��� ������
	private List<WebElement> screenTypeFields;

	@FindBy(xpath = "//*[@id='sort_23541']/li/label/a") // �������� ������
	private List<WebElement> screenCoverFields;

	@FindBy(xpath = "//*[@id='sort_26413']/li/label/a") // ��������� �����
	private List<WebElement> screenSensorFields;

	@FindBy(xpath = "//*[@id='sort_processor']/li/label/a") // ���������
	private List<WebElement> processorFields;

	@FindBy(xpath = "//*[@id='sort_20863']/li/label/a") // ����� �����������
														// ������
	private List<WebElement> ramFields;

	@FindBy(xpath = "//*[@id='sort_20881']/li/label/a") // ����������
	private List<WebElement> videocardFields;

	@FindBy(xpath = "//*[@id='sort_28042']/li/label/a") // ����� ����������
	private List<WebElement> videocardMemoryFields;

	@FindBy(xpath = "//*[@id='sort_36514']/li/label/a") // ��� ����������
	private List<WebElement> hddTypeFields;

	@FindBy(xpath = "////*[@id='sort_20882']/li/label/a") // ����� ����������
	private List<WebElement> hddMemoryFields;

	@FindBy(xpath = "//*[@id='sort_20868']/li/label/a") // ���������� ������
	private List<WebElement> opticalTypeFields;

	@FindBy(xpath = "//*[@id='sort_20886']/li/label/a") // ������������ �������
	private List<WebElement> osTypeFields;

	@FindBy(xpath = "//*[@id='sort_56017']/li/label/a") // ���������� ���������
														// ����������
	private List<WebElement> languageFields;

	@FindBy(xpath = "//*[@id='sort_20884']/li/label/a") // ���
	private List<WebElement> weightFields;

	@FindBy(xpath = "//*[@id='sort_21737']/li/label/a") // ����
	private List<WebElement> colorFields;

	@FindBy(xpath = "//*[@id='title_page']/div/div/div[3]/ul/li[3]/noindex/a") // ������
																				// "��������"
	private WebElement refreshButton;

	@FindBy(xpath = "//*[@id='page2']/a")
	private WebElement nextButton;

	public ResultsPage searchNotebook(int index) {
		notebookFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchProducer(int index) {
		producerFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchPrice(String minPrice, String maxPrice) {
		minpriceField.clear();
		minpriceField.sendKeys(minPrice);
		maxpriceField.clear();
		maxpriceField.sendKeys(maxPrice);
		submitButton.click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchScreenSize(int index) {
		screenSizeFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchScreenDimension(int index) {
		screenDimensionFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchScreenType(int index) {
		screenTypeFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchScreenCover(int index) {
		screenCoverFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchScreenSensor(int index) {
		screenSensorFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchProcessor(int index) {
		processorFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchRam(int index) {
		ramFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchVideocard(int index) {
		videocardFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchVideocardMemory(int index) {
		videocardMemoryFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchHddType(int index) {
		hddTypeFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchHddMemory(int index) {
		hddMemoryFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchOpticalType(int index) {
		opticalTypeFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchOsType(int index) {
		osTypeFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchLanguage(int index) {
		languageFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchWeight(int index) {
		weightFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage searchColor(int index) {
		colorFields.get(index).click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage nextButtonClick() {
		nextButton.click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

	public ResultsPage refreshButtonClick() {
		refreshButton.click();
		return PageFactory.initElements(_driver, ResultsPage.class);
	}
}
