package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class1 {
@FindBy(id="email")
private WebElement un;
@FindBy(id="pass")
private WebElement pwd;
@FindBy(name="login")
private WebElement log;
public Pom_Class1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}//abc
public void un_fild()
{
	un.sendKeys("abcdefgh");
}
public void pwd_field()
{
	pwd.sendKeys("123");
	}
public void login_click() 
{
	log.click();
	}
}
