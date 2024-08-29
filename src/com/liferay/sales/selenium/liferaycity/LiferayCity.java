package com.liferay.sales.selenium.liferaycity;

import com.liferay.sales.selenium.api.ClickpathBase;
import com.liferay.sales.selenium.api.ScriptManager;
import com.liferay.sales.selenium.chrome.ChromeDriverInitializer;
import com.liferay.sales.selenium.liferaycity.gartner.LiferayCityGartnerClickpath1;
import com.liferay.sales.selenium.liferaycity.gartner.LiferayCityGartnerClickpath2;
import com.liferay.sales.selenium.liferaycity.gartner.LiferayCityGartnerClickpath3;
import com.liferay.sales.selenium.liferaycity.gartner.LiferayCityGartnerClickpath4;
import com.liferay.sales.selenium.liferaycity.gartner.LiferayCityGartnerClickpath5;
import com.liferay.sales.selenium.liferaycity.gartner.LiferayCityGartnerClickpath6;
import com.liferay.sales.selenium.liferaycity.gartner.LiferayCityGartnerClickpath7;
import com.liferay.sales.selenium.liferaycity.gartner.LiferayCityGartnerClickpath8;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;

public class LiferayCity extends ScriptManager {

    public static void main(String[] args) {
        try {
            doIt(args);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void doIt(String[] args) {
// Before starting the script, make adjustments in this top block
// to reflect the behavior that you need.
// Inspect the clickpaths.
// If you run the A/B-Test, note that you'll have to prepare the 
// content according to the documentation
// https://docs.google.com/document/d/1h2E7UUt_i3yqwge25Pd8YXOLHt3Jujz4VBAdgHSeKQw/edit#heading=h.w4lf8kpcller

        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        String userCSVPath = System.getenv("LIFERAY_CITY_USER_CSV_PATH");
        String baseUrl = System.getenv("LIFERAY_CITY_BASE_URL");
        String clickPath = System.getenv("LIFERAY_CITY_CLICK_PATH");
        int repeats = Integer.valueOf(System.getenv("LIFERAY_CITY_REPEAT_COUNT"));

        String[][] cityUsers = readUserCSV(userCSVPath);
//        String baseUrl = "https://webserver-lctcity5-prd.lfr.cloud/";
//        String[] arguments = new String[]{"--headless", "--remote-allow-origins=*"};
		String[] arguments = new String[] { "--remote-allow-origins=*" };

        Map<String, ClickpathBase[]> clipathMap = new HashMap<>();

        // business
        clipathMap.put("business1", new ClickpathBase[]{
            // News and Business
            new LiferayCityGartnerClickpath1(new ChromeDriverInitializer(arguments), baseUrl),
        });
        clipathMap.put("business2", new ClickpathBase[]{
            // Business and Business Documents
            new LiferayCityGartnerClickpath2(new ChromeDriverInitializer(arguments), baseUrl),
        });
        clipathMap.put("business3", new ClickpathBase[]{
            // News and Business
            new LiferayCityGartnerClickpath3(new ChromeDriverInitializer(arguments), baseUrl)
        });
        clipathMap.put("business4", new ClickpathBase[]{
            // News Business and Doc
            new LiferayCityGartnerClickpath4(new ChromeDriverInitializer(arguments), baseUrl),
        });
        clipathMap.put("city1", new ClickpathBase[]{
            // News and City
            new LiferayCityGartnerClickpath5(new ChromeDriverInitializer(arguments), baseUrl)
        });
        clipathMap.put("city2", new ClickpathBase[] {
            // News Kids, City Life
            new LiferayCityGartnerClickpath6(new ChromeDriverInitializer(arguments), baseUrl),
        });
        clipathMap.put("city3", new ClickpathBase[] {
            // News, City Life and Documents
            new LiferayCityGartnerClickpath7(new ChromeDriverInitializer(arguments), baseUrl),
        });
        clipathMap.put("city4", new ClickpathBase[] {
            // News and Kids
            new LiferayCityGartnerClickpath8(new ChromeDriverInitializer(arguments), baseUrl)
        });

        Map<String, String> userPaths = new HashMap<>();

        userPaths.put("ac1", "business1");
        userPaths.put("ac2", "business2");
        userPaths.put("ac3", "business3");
        userPaths.put("ac4", "business4");
        userPaths.put("ac5", "business1");
        userPaths.put("ac6", "business2");
        userPaths.put("ac7", "city1");
        userPaths.put("ac8", "city2");
        userPaths.put("ac9", "city3");
        userPaths.put("ac10", "city4");
        userPaths.put("ac11", "city1");
        userPaths.put("ac12", "city2");
        userPaths.put("ac13", "city4");
        userPaths.put("ac14", "business4");

        userPaths.put("ac15", "city1");
        userPaths.put("ac16", "business1");
        userPaths.put("ac17", "business2");
        userPaths.put("ac18", "business3");
        userPaths.put("ac19", "business4");
        userPaths.put("ac20", "business1");
        userPaths.put("ac21", "business2");
        userPaths.put("ac22", "city1");
        userPaths.put("ac23", "city2");
        userPaths.put("ac24", "city3");
        userPaths.put("ac25", "city4");
        userPaths.put("ac26", "city1");
        userPaths.put("ac27", "city2");
        userPaths.put("ac28", "city4");
        userPaths.put("ac29", "business4");
        userPaths.put("ac30", "city1");

// Typically, nothing more to "configure" below this line. 
// Anything that you need to customize your scripts is above.

        System.out.println("Running clickpaths for " + repeats + " times. Site: " + baseUrl);

        long start = System.currentTimeMillis();
        LinkedList<String> log = new LinkedList<String>();

        for (int i = 1; i <= repeats; i++) {
            long thisStart = System.currentTimeMillis();
            ClickpathBase path = null;
            int pos = (int) (Math.random() * cityUsers.length);

            String[] user = cityUsers[pos];
            String username = user[0];
            String password = user[1];

            ClickpathBase[] paths = null;

            paths = clipathMap.get(userPaths.get(username));

            System.out.println("User: " + username);

            pos = (int) (Math.random() * paths.length);
            path = paths[pos];
            System.out.println("Number of failures so far:" + log.size());
            System.out.println("#" + i + "/" + repeats + ": Running user " + user[0] + " with path "
                    + pos + " (" + path.getClass().getSimpleName() + ", using "
                    + path.getDriver().getClass().getSimpleName()
                    + ")");
            path.setDefaultSleep(4000);
            try {
                path.run(username, password);
            } catch (Exception e) {
                StringWriter sw = new StringWriter();
                PrintWriter pw = new PrintWriter(sw);
                e.printStackTrace(pw);
                String tstamp = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss", Locale.ENGLISH).format(LocalDateTime.now());
                log.add(
                        tstamp + "\n" +
                                "" + i + ", [" + user[0] + ", path" + pos + "]\n" +
                                e.getClass().getName() + " " +
                                e.getMessage() + "\n" +
                                sw
                );
                path.writePageToDisk("ERROR", "" + i);

            }
            if (path != null) {
                path.quit();
                path = null;
            }
            long now = System.currentTimeMillis();
            long runtime = now - start;
            long expectedTimeSpan = (runtime / (i + 1)) * repeats;
            long thisTimeSpan = now - thisStart;
            Date expectedEnd = new Date(start + expectedTimeSpan);
            System.out.println("Runtime (current/average) in sec: " + (thisTimeSpan / 1000) + "/" + (runtime / ((i + 1) * 1000)));
            System.out.println("Expected remaining run time:      " + expectedEnd);
            System.out.println("Current time:                     " + new Date());

            System.out.println();
        }

        System.out.println("==================================================");
        System.out.println("End of run");
        System.out.println("Failed attempts: " + log.size());
        for (String string : log) {
            System.out.println(string);
            System.out.println("---------------------------------------------");
        }
    }
}
