import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class RSATest {

    @Test
    public void HomePageCheck() throws MalformedURLException, URISyntaxException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("firefox");
        // caps.setPlatform(Platform.);
        // caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        // caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");

        // URL deprecated, URI

        WebDriver driver = new RemoteWebDriver(new URI("http://192.168.1.115:4444").toURL(), caps);
        driver.get("https://rahulshettyacademy.com/");
        System.out.printf(driver.getTitle());
        driver.quit();
    }
}
