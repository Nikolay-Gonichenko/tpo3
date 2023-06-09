package ru.itmo.tpo3.chrome;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckEvacuationClickTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
    System.setProperty("webdriver.http.factory", "jdk-http-client");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void checkEvacuationClick() {
    driver.get("http://angely-sveta.ru/russian/default_ru.htm");
    driver.manage().window().setSize(new Dimension(866, 622));
    driver.switchTo().frame(1);
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div/table/tbody/tr/td/a/img"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector("table:nth-child(1) a > img")).click();
    driver.switchTo().frame(0);
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'zip/evacuation_af_bo_part_1_of_7_www.angels-light.org.zip\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//td[2]/table/tbody/tr/td[2]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'zip/evacuation_fr_gh_part_3_of_7_www.angels-light.org.zip\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'zip/evacuation_gi_is_part_4_of_7_www.angels-light.org.zip\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'zip/evacuation_it_ph_part_5_of_7_www.angels-light.org.zip\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'zip/evacuation_po_uk_part_6_of_7_www.angels-light.org.zip\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'zip/evacuation_un_zi_part_7_of_7_www.angels-light.org.zip\')]"));
      assert(elements.size() > 0);
    }
  }
}
