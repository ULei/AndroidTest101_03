package tw.com.bluemoon.androidtest101_03;

import java.util.Calendar;

/**
 * Created by Chris on 2015/11/7.
 */
public class Shop {
    private Calendar c;

    public void sell() {
        c = Calendar.getInstance();
        int month = c.get(Calendar.MONTH) + 1;

        if(isSpring(month) || isSummer(month)){
            System.out.println("賣冰");
        }else{
            System.out.println("賣薑母鴨");
        }
    }

    //3-5
    private boolean isSpring(int month) {
        return month > 2 && month < 6;
    }

    //6-8
    private boolean isSummer(int month) {
        return month > 5 && month < 9;
    }
}
