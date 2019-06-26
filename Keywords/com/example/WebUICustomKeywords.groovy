package com.example
import groovy.json.JsonSlurper

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom
import groovy.time.TimeCategory as TimeCategory
import java.time.LocalDateTime;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class WebUICustomKeywords {

	/**
	 * Check if element present in timeout
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up 
	 * @return true if element present, otherwise false
	 */
	@Keyword
	def isElementPresent(TestObject to, int timeout){
		//Use Katalon built-in function to find elements with time out 1 seconds
		List<WebElement> elements = WebUiBuiltInKeywords.findWebElements(to, timeout)
		return elements.size() > 0
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table 
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}

	/**
	 * Get all cells of HTML table row
	 * @param row a WebElement instance represent for HTML table row 
	 * @param tagName HTML column tag name, usually is TD/TH
	 * @return All cells inside HTML table row 
	 */
	@Keyword
	def List<WebElement> getHtmlTableColumns(WebElement row, String tagName) {
		List<WebElement> selectedColumns = row.findElements(By.tagName(tagName))
		return selectedColumns
	}

	@Keyword //input message
	def promptMesg(message){
		// a jframe here isn't strictly necessary, but it makes the example a little more real
		JFrame frame = new JFrame("InputDialog Example #1");
		// prompt the user to enter their name

		if (message == null){
			String verifycode = JOptionPane.showInputDialog(frame, "Please input verifycode?");
		}else {
			String verifycode = JOptionPane.showInputDialog(frame, message);
		}

	}

	@Keyword //show message
	def showMesg(message){
		// a jframe here isn't strictly necessary, but it makes the example a little more real
		JFrame frame = new JFrame("InputDialog Example #1");
		// prompt the user to enter their name
		if (message == null){
			String veridycode = JOptionPane.showMessageDialog(null,"Complete to press OK");
		}else {
			String veridycode = JOptionPane.showMessageDialog(null,message);
		}
	}

	@Keyword //show drop down list
	def dropDownList(message){
		String[] possibleValues = ["後臺操作日誌", "電文日誌查詢", "推播發送紀錄查詢", "郵件發送日誌查詢", "金融交易紀錄", "信用卡交易紀錄"];
		String selectedValue = JOptionPane.showInputDialog(null,"請選擇要執行的功能項目", "Input",
				JOptionPane.INFORMATION_MESSAGE, null,
				possibleValues, possibleValues[0]);
	}


	@Keyword
	def randomNumber(TestObject to, int minimum, int maximum) {
		def randomNumber = ThreadLocalRandom.current().nextInt(minimum, maximum + 1)
	}
}