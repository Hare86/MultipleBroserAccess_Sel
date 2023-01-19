package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {

        /*System.out.println("Hello world!");*/
        // Create a Chrome driver instance
        WebDriver chromeDriver = new ChromeDriver();

        // Perform actions on the Chrome browser
        chromeDriver.get("http://www.google.com");

        // Create a Firefox driver instance
        WebDriver firefoxDriver = new FirefoxDriver();

        // Perform actions on the Firefox browser
        firefoxDriver.get("http://www.facebook.com");

        WebDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://www.linkedin.com/login/");

        chromeDriver.close();
        firefoxDriver.quit();
        edgeDriver.close();

    }
}