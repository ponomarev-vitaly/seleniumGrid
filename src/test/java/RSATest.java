import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class RSATest {

    @Test
    public void HomePageCheck() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("firefox");
        caps.setCapability("moz:firefoxOptions", Map.of("binary", "C:\\Program Files\\Mozilla Firefox\\firefox.exe"));

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.115:4444"), caps);
        driver.get("https://rahulshettyacademy.com/");
        System.out.printf(driver.getTitle());
        driver.quit();
    }
}
