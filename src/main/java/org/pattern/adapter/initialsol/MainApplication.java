package org.pattern.adapter.initialsol;

import org.pattern.adapter.initialsol.adapters.HeadphoneAdapter;
import org.pattern.adapter.initialsol.headfone.Headphone;
import org.pattern.adapter.initialsol.headfone.HeadphoneWith3Point5mmJack;
import org.pattern.adapter.initialsol.mobile.Mobile;
import org.pattern.adapter.initialsol.mobile.MobileWithTypeC;

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
