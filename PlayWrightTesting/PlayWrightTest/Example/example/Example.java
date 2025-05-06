package example;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.LoadState;


public class Example {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Runnable runnable = Example::doAccommodationBooking;
            new Thread(runnable).start();
        }

//        for (int i = 0; i < 20; i++) {
//            Runnable runnable = Example::callIcSalesFunnelPage;
//            new Thread(runnable).start();
//        }

        //doAccommodationBooking();

    }

    private static void callIcSalesFunnelPage() {
        try (Playwright playwright = Playwright.create()) {

            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();

            String url = "https://book.dqs.booking.com/travel_insurance_buy.html?&order_id=b34ddd4c-3adb-4ba6-a03c-66ce60c96bb4&quote_id=e75b643e-62cb-4b80-918f-4f6b0cf15f8c&b_feature_running_STTI_SALES_FUNNEL_EXPOSURE_INTEGRATION=1&adplat=www-BOOKING_HOTEL_CONFIRMATION-MAIN_COLUMN-insurance-PRODUCT-6mzP4cWCenC7WBnu2Il6gQ&label=gog235jc-1DCBIoggI46AdICVgDaFCIAQGYAQm4ARjIAQzYAQPoAQH4AQOIAgGoAgS4ArLu76QGwAIB0gIkYTQzOTBjZGYtMmZkMi00MmViLWJmYWEtYWRkNmZhZmViZGRm2AIE4AIB&aid=356980";
            page.navigate(url);
        }
    }

    private static void doAccommodationBooking() {
        try (Playwright playwright = Playwright.create()) {

            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();

            //1st page
            page.navigate("https://book.dqs.booking.com/book.html?test=1;hotel_id=7341430&lang=en&exp_tt_phttps://book.dqs.booking.com/book.html?test=1;hotel_id=7341430&lang=en&exp_tt_pb_instant_checkout_insurance_www=1&exp_ins_rci_prebook_sales_www=0&i_am_from=gb&selected_currency=gbpb_instant_checkout_insurance_www=1&exp_ins_rci_prebook_sales_www=0&i_am_from=gb&selected_currency=gbp");
            page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Number of nights")).selectOption("8");
            page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Check-in date")).selectOption("27");
            //page.locator("#check-availability__checkin-yearmonth").selectOption("2024-03");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Accept")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Check availability")).click();
            //page.click(".bui-button.bui-button--primary.bui-button--large");
            page.waitForLoadState(LoadState.NETWORKIDLE);

            //2nd page
            page.locator("#unit-734143002_351983146_0_0_0").selectOption("1");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("I'll reserve")).click();
            page.waitForLoadState(LoadState.NETWORKIDLE);

            //3rd page
            page.getByLabel("First name\n *").click();
            page.getByLabel("First name\n *").fill("chinmaya.panigrahi@test.com");
            page.getByLabel("Last name\n *").click();
            page.getByLabel("Last name\n *").fill("panigrahi");
            page.getByPlaceholder("Watch out for typos").click();
            page.getByPlaceholder("Watch out for typos").fill("chinmaya.panigrahi@test.com");
            page.getByPlaceholder("+44").click();
            page.getByPlaceholder("+44").fill("+443232323233");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next: Final details")).click();
            page.waitForLoadState(LoadState.NETWORKIDLE);

            //4th page
            //page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Yes, continue")).click();
            //page.getByPlaceholder("+44").click();
            //page.getByPlaceholder("+44").fill("+443232323233");
            page.frameLocator("iframe[title=\"Payment\"]").getByLabel("Card number*").click();
            page.frameLocator("iframe[title=\"Payment\"]").getByLabel("Card number*").fill("2223 5204 4356 0010");
            page.frameLocator("iframe[title=\"Payment\"]").getByLabel("Expiry date*").fill("03/30");
            page.frameLocator("iframe[title=\"Payment\"]").getByLabel("CVC*").fill("7373");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Complete booking")).click();
            Thread.sleep(90000);

            //5th page i.e booking confirmation page
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close dialog")).click();
            Thread.sleep(9000);

            System.out.println("Current URL: " + page.url());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


