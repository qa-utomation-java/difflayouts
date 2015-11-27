
public class Main {

    public static void main(String[] args) {

        Browser browser = new Browser();

        FileStream fileStream = new FileStream(GlobalConfig.CURRENT_DIR, GlobalConfig.FILE_INPUT_DATA_TEST_URL);
        for (String sitemapUrl : fileStream.getUrls()) {
            WebPage webPage = new WebPage(sitemapUrl);

            browser.loadUrl(webPage);
            browser.shootScreen(460, 500);
            browser.shootScreen(1024, 768);

        }

        browser.shutDown();
    }
}
