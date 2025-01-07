import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleTest {

    @Test
    public void HomePageCheck() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");
        // caps.setPlatform(Platform.);
        // caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        // caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");

        // URL deprecated, URI

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.115:4444"), caps);
        driver.get("https://www.google.com/");
        System.out.printf(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("vitaliy ponomarev");
        driver.quit();


    }
}
