package pageObjects.Admin_Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void verifyHomePage() {
        if (!driver.getCurrentUrl().equals("https://www.happyfox.com/home")) {
            throw new IllegalStateException("Not on the home page");
        }
    }

    public void navigateToProfile() {
        driver.findElement(By.id("profileLink")).click();
    }

    public class TablePage extends BasePage {

        private final By rowLocator = By.xpath("//table[@id='dataTable']/tbody/tr");

        public TablePage(WebDriver driver) {
            super(driver);
        }

        public void retrieveRowTexts() {
            List<WebElement> rows = driver.findElements(rowLocator);

            for (int i = 0; i < rows.size(); i++) {
                WebElement row = rows.get(i);
                String rowText = row.getText();
                System.out.println("Row " + i + " Text: " + rowText);
            }
        }

    }


}
