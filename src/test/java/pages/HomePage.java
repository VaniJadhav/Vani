package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class HomePage {
	
	@Test
		public void test() {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanij\\Downloads\\Work\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	ExtentHtmlReporter htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir") + "./extent/myReport.html");
	htmlReporter.config().setDocumentTitle("TestExtent");
	htmlReporter.config().setReportName("report");
	
	ExtentReports report= new ExtentReports();
	
	report.attachReporter(htmlReporter);
	ExtentTest test=report.createTest("TestCase");
	
	driver.get("https://myprojects.sharepoint.com/sites/Demo_Test");
	test.debug("launched");
	report.flush();
}
}