package threeC.seleniumTests.world;

import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;

public class TestUrl {

	private String url; 
	private LinkedList Errors; 
	private String state; 
	
	public TestUrl( String url ) {
		this.url = url;
	}

	public String browserLogs() {	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramse_000\\OneDrive\\Globant\\3cInteractive\\SeleniumTests\\ChromeDriverSelenium\\chromedriver.exe");
		ChromeOptions caps = new ChromeOptions();
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.BROWSER, Level.ALL);
        caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
		
		WebDriver driver = new ChromeDriver(caps);
		driver.get(this.url);
    	System.out.println("-------------------------------------------");
    	System.out.println("url evaluated: " + this.url);
		LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
		int numberEntries = 0; 
        for (LogEntry entry : logEntries) {
            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
            numberEntries++; 
        }
        System.out.println("number of error's: " + numberEntries);
        driver.get(this.url);
      
        driver.close();
		
		return "finish"; 
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public LinkedList getErrors() {
		return Errors;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "TestUrl [url=" + url + ", Errors=" + Errors + ", state=" + state + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Errors == null) ? 0 : Errors.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestUrl other = (TestUrl) obj;
		if (Errors == null) {
			if (other.Errors != null)
				return false;
		} else if (!Errors.equals(other.Errors))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	
}

