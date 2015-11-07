package tw.com.bluemoon.androidtest101_03;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Calendar;

import mockit.Expectations;
import mockit.Mocked;

/**
 * Created by Chris on 2015/11/7.
 */
public class ShopTest {
    Shop shop;
    @Mocked
    Calendar calendar;
    @BeforeMethod
    public void setUp() throws Exception {
        shop = new Shop();
        System.out.println();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        shop = null;
    }

    @DataProvider(name = "months")
    public Object[][] getMonths() {

        return new Object[][] {
                { 1 }, { 2 }, { 3 }, { 4 }, { 5 }, { 6 }, { 7 }, { 8 }, { 9 }, { 10 }
                , { 11 }, { 12 }
        };
    }

    @Test(dataProvider = "months")
    public void testSell(final int m) throws Exception {
        new Expectations() {{
            calendar.get(Calendar.MONTH); result = m - 1;
        }};

        System.out.println("month=" + m);
        shop.sell();
    }
}