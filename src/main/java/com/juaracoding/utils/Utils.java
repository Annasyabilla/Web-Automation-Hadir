package com.juaracoding.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.juaracoding.drivers.DriverSingleton.driver;


public class Utils {

    public static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int testCount = 0;

    public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String pathDestination = System.getProperty("user.dir")+"/FailedTestScreenshot/"
                +screenshotName+"_"+dateName+".png";
        File destination = new File(pathDestination);
        FileUtils.copyFile(source, destination);

        return pathDestination;
    }


    public static void waitAndClick(WebElement buttonElement) {
        try {
            // Tunggu hingga elemen dapat diklik
            WebDriverWait wait = new WebDriverWait(driver, 30);
            WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(buttonElement));

            // Klik tombol
            clickableButton.click();
            System.out.println("Tombol berhasil diklik!");
        } catch (Exception e) {
            System.out.println("Gagal mengklik tombol: " + e.getMessage());
            throw e; // Lempar exception untuk memastikan kegagalan tercatat
        }
    }
}
