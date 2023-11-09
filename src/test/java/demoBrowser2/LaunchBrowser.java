package demoBrowser2;
import demoBrowser2.BeforeAfter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchBrowser {
    WebDriver driver;
  //  BeforeAfter ba=new BeforeAfter(driver);
    //LaunchBrowser(WebDriver driver)
//    {
//        this.driver=driver;
//    }

@Test(enabled = false)
    public void launch()
{
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    System.out.println("URL:"+driver.getCurrentUrl());
    driver.manage().window().maximize();
    WebElement ele = driver.findElement(By.id("APjFqb"));
    ele.sendKeys("testNG");
    ele.sendKeys(Keys.ENTER);
}

@Test(enabled = false)
    void add()
{
    int a=10,b=20;
    int c=a+b;
    //System.out.println("add:"+c);
    //System.out.println();
    String abc="";

    String str =new String("abc");
    System.out.println(str);
    str.concat("xyz");
    System.out.println(str);
    StringBuilder sb=new StringBuilder(str);
    sb.append("qwe");
    System.out.println(sb);
}
//     @BeforeTest
//    public void setUp()
//    {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }
//    @AfterTest
//    public void tearDown()
//    {
//        driver.close();
//    }
@Test
    public void frames()
{
   WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/frames");
    driver.manage().window().maximize();
    int num=driver.findElements(By.tagName("iframe")).size();
    System.out.println("Number of frames:"+num);
    driver.switchTo().frame("frame1");
    String title=driver.findElement(By.id("sampleHeading")).getText();
    System.out.println("Title:"+title);
    driver.switchTo().parentFrame();
    driver.switchTo().frame("frame2");
   String t= driver.findElement(By.id("sampleHeading")).getText();
    System.out.println("T:"+t);

    //driver.switchTo().defaultContent();
    //driver.switchTo().parentFrame();
    //driver.findElement(By.id("framesWrapper"));
}

}
