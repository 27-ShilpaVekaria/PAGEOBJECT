package org.example;

import org.junit.After;
import org.junit.Before;

public class Hooks extends Util  {
    BrowserManager browserManager = new BrowserManager();
    @Before
    public void OpenBrowser(){
        browserManager.chroBrowser();
    }

    @After
    public void closeBrowser() {
        driver.quit();

    }
}
