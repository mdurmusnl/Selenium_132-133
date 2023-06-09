package com.myfirstproject.day09;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownloadTest extends TestBase {
    @Test
    public void downloadTest() throws InterruptedException {
//        https://testcenter.techproeducation.com/index.php?page=file-download
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");
//        Download b10 all test cases, code.docx  file
        driver.findElement(By.partialLinkText("b10 all test cases")).click();
        Thread.sleep(2000);//wait until the file is download COMPLETELY
//        Then verify if the file downloaded successfully
        String filePath = System.getProperty("user.home")+"/Downloads/b10 all test cases, code.docx";//teacher says for windows use //  but it works in / way
        Assert.assertTrue(Files.exists(Paths.get(filePath)));



    }
}
