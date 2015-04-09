/*
 * Copyright 2011-2013 Hippo B.V. (http://www.onehippo.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onehippo.gogreen;

import com.thoughtworks.selenium.Selenium;

import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public abstract class GoGreenTest {

    private static Selenium SELENIUM;
    private static FirefoxDriver DRIVER;

    protected Selenium selenium;

    @BeforeSuite
    @Parameters("driver.url")
    public void startSelenium(@Optional("http://localhost:8080") String url) {
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("extensions.checkCompatibility.5.0", false);
        DRIVER = new FirefoxDriver(profile);

        SELENIUM = new WebDriverBackedSelenium(DRIVER, url);
    }

    @BeforeClass
    public void retrieveSelenium() {
        selenium = SELENIUM;
    }

    @AfterSuite
    public void stopSelenium() {
        DRIVER.quit();
    }

}
