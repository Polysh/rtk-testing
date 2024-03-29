package rtktest.web;

import io.qameta.allure.Attachment;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.text.DecimalFormat;

import static rtktest.web.Environment.webDriver;

public class Utils {

    public static String formatDecimalToString(double value) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        return decimalFormat.format(value);
    }

    @Attachment
    public static byte[] makeScreenshoot() {
        return ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.BYTES);
    }

    public static void scrollIntoElementWithJavaScript(WebElement webElement) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webElement);
    }
}
