
public class Main {

    public static void main(String[] args) {

        Browser browser = new Browser();

        FileStream fileStream = new FileStream(GlobalConfig.CURRENT_DIR, GlobalConfig.FILE_INPUT_DATA_TEST_URL);
        for (String sitemapUrl : fileStream.getUrls()) {
            WebPage webPage = new WebPage(sitemapUrl);

            browser.loadUrl(webPage);
            browser.shootScreen(320, 480);
            browser.shootScreen(360, 640);
            browser.shootScreen(768, 1024);
            browser.shootScreen(800, 1280);
            browser.shootScreen(980, 1280);
            browser.shootScreen(1280, 600);
            browser.shootScreen(1920, 900);

        }

        browser.shutDown();
    }
}
