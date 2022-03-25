package internet.Herokuapp.pom.com;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	@FindBy(tagName = "h1")
	WebElement pageTitle;

	@FindBy(tagName = "h2")
	WebElement subHeader;
	
	@FindBy(xpath = "") //////////// MANQUE
	List<WebElement> allSubPages;
	
	@FindBy(xpath = "") //////////// MANQUE
	List<WebElement> allSubPagesLinks;
	
	@Override
	public String getPageTitleText() {
		// TODO Auto-generated method stub
		return pageTitle.getText() ;
	}

	public HomePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String getSubheaderText() {
		
		return subHeader.getText();
	}
}
