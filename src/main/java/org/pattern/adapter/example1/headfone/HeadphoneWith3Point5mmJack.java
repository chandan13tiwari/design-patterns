package org.pattern.adapter.example1.headfone;

public class HeadphoneWith3Point5mmJack implements Headphone{
    @Override
    public void input() {
        System.out.println("3.5mm Jack");
    }
}
