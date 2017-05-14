package com.examples.anroidpractice9;

/**
 * Created by Mac on 2017. 5. 14..
 */

public class Data {
    private String title;
    private String memo;

    public Data(String title, String memo) {
        this.title = title;
        this.memo = memo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
