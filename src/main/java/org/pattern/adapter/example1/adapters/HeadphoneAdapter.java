package org.pattern.adapter.example1.adapters;

import org.pattern.adapter.example1.headfone.Headphone;
import org.pattern.adapter.example1.mobile.Mobile;

public class HeadphoneAdapter implements Adapter {

    Mobile mobileWithTypeCPort;
    Headphone headphoneWith3Point5mmJack;

    public HeadphoneAdapter(Mobile mobileWithTypeCPort, Headphone headphoneWith3Point5mmJack) {
        this.mobileWithTypeCPort = mobileWithTypeCPort;
        this.headphoneWith3Point5mmJack = headphoneWith3Point5mmJack;
    }
    @Override
    public void input() {
        headphoneWith3Point5mmJack.input();
    }

    @Override
    public void output() {
        mobileWithTypeCPort.port();
    }
}
