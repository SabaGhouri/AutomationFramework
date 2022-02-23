package Factory;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    private String _driver;
    private String Name;

    public WebDriver driver;

    public void setUp(String browserName){
        switch (browserName){
            case "chrome":
                setchromeDriver();
            case "fireFox":
                setFireFoxDriver();
            case "Edge":
                setEdgeDriver();
            default:
                System.out.println("Enter right browser");
        }
    }
    public void setchromeDriver(){

    }
    public void setFireFoxDriver(){}
    public void setEdgeDriver(){}

    public WebDriver getDriver() {
        return driver;
    }





}
