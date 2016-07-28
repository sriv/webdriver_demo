import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class SampleTest {
    @Test
    public void gotoGetStartedPage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://getgauge.io");
        assertTrue(driver.getTitle().contains("Gauge"));
        driver.quit();
    }
}
