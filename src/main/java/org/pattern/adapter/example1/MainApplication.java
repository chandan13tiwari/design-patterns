package org.pattern.adapter.example1;

import org.pattern.adapter.example1.adapters.HeadphoneAdapter;
import org.pattern.adapter.example1.headfone.Headphone;
import org.pattern.adapter.example1.headfone.HeadphoneWith3Point5mmJack;
import org.pattern.adapter.example1.mobile.Mobile;
import org.pattern.adapter.example1.mobile.MobileWithTypeC;

public class MainApplication {
    public static void main(String[] args) {
        Mobile mobileWithTypeCPort = new MobileWithTypeC();
        Headphone headphoneWith3Point5mmJack = new HeadphoneWith3Point5mmJack();

        HeadphoneAdapter headphoneAdapter = new HeadphoneAdapter(mobileWithTypeCPort, headphoneWith3Point5mmJack);

        System.out.println("~~~~ Mobile Port ~~~~");
        mobileWithTypeCPort.port();

        System.out.println("~~~~ Headphone Input Jack ~~~~");
        headphoneWith3Point5mmJack.input();

        System.out.println("~~~~ Adapter Required ~~~~");
        System.out.print("End 1: ");
        headphoneAdapter.input();
        System.out.print("End 2: ");
        headphoneAdapter.output();
    }
}
