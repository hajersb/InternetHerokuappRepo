package internet.Herokuapp.pom.com;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

	public static String BaseUrl = "http://th+e-internet.herokuapp.com";

	public static Map<String, String> PageUrls = new HashMap<String, String>();

	static {

		PageUrls.put("home", BaseUrl + "/");
		PageUrls.put("checkboxes", BaseUrl + "/checkboxes");
		PageUrls.put("dropdown", BaseUrl + "/dropdown");
		PageUrls.put("dynamic_controls", BaseUrl + "/dynamic_controls");
		PageUrls.put("form authentication", BaseUrl + "/login");
		PageUrls.put("inputs", BaseUrl + "/inputs");
		PageUrls.put("secure area", BaseUrl + "/secure");
	}

	public static WebDriver driver;

	public BasePage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[contains(text(),'Elemental Selenium')]")
	static WebElement footerLink;

	@FindBy(xpath = "//body/div[2]/a[1]/img[1]")
	static WebElement forkMeToGithubLink;

	public static String getPageFooterText() {
		return footerLink.getText();

	}

	public abstract String getPageTitleText();

}
