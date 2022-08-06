package compomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement loc;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement roomnum;
	
	@FindBy(id = "datepick_in")
	private WebElement datep;
	
	@FindBy(id = "datepick_out")
	private WebElement dateo;
	
	@FindBy(id = "adult_room")
	private WebElement adultroom;
	
	@FindBy(id = "child_room")
	private WebElement child_room;
	
	@FindBy(id = "Submit")
	private WebElement Submit;
	
	@FindBy(id = "radiobutton_0")
	private WebElement Rbtn;
	
	@FindBy(id = "continue")
	private WebElement ctnu;

	public SelectHotelPage(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnum() {
		return roomnum;
	}

	public WebElement getDatep() {
		return datep;
	}

	public WebElement getDateo() {
		return dateo;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getRbtn() {
		return Rbtn;
	}

	public WebElement getCtnu() {
		return ctnu;
	}
		
	
	
	
}
