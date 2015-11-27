import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class Browser {

    public WebDriver driver;
    public WebDriverWait wait;
    private WebPage webPage;

    public Browser() {
        this.driver = new FirefoxDriver();
        this.wait = new WebDriverWait(driver, 50);
        this.driver.manage().window().maximize();
    }

    public void shootScreen(int width, int height) {
        driver.manage().window().setSize(new Dimension(width, height));
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(this.webPage.getFileName() + new String(String.valueOf(width)) + ".png"));
        } catch (IOException e) {
            System.err.println("Error ScreenShot" + e.getMessage());
        }
    }

    public void shutDown() {
        this.driver.quit();
    }

    public void loadUrl(WebPage webPage) {
        this.webPage = webPage;
        //this.driver.manage().window().maximize();
        this.driver.get(this.webPage.getUrl());
    }
}
