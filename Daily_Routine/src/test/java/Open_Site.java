import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Open_Site {

    @Test
    public void checkAllWebsites() {

        String[] sitesToCheck = {
                "https://dmax.lk/",
                "https://avionanalytics.com/",
                "https://sacsae.com/",
                "https://www.lankaship.lk/",
                "https://www.djyohee.com/",
                "https://caelusk.com/",
                "https://sawlaasia.org/",
                "https://hnuf.org/",
                "https://www.gamodhconstruction.com/",
                "https://oceanserve.lk/"

        };

        for (String url : sitesToCheck) {
            WebDriver driver = new ChromeDriver();
            try {
                driver.get(url);

                String title = driver.getTitle();
                if (title != null && !title.isEmpty()) {
                    System.out.println("[SUCCESS] " + title + " is working." );
                } else {
                    System.out.println("[WARNING] " + url + " is not working (Page loaded but no title found).");
                }

            } catch (Exception e) {
                String title = driver.getTitle();
                System.out.println("[FAILURE] " + url + title + " is not working.");
            } finally {

                driver.quit();
            }
        }

        System.out.println("---Daily Routine Completed ---");
    }


}
