import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class GoogleTest {

    @Test
    public void HomePageCheck() throws MalformedURLException, URISyntaxException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");
        // caps.setPlatform(Platform.);

        // URL deprecated, URI

        WebDriver driver = new RemoteWebDriver(new URI("http://192.168.1.115:4444").toURL(), caps);
        driver.get("https://www.google.com/");


    }
}
