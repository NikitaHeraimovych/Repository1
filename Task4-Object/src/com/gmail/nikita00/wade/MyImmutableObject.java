package com.gmail.nikita00.wade;

import java.util.Date;

public final class MyImmutableObject {
    private final Date date;

    public MyImmutableObject (Date date) {
        this.date = date;
    }

    public Date getDate(){
        return new Date (date.getTime ());
    }
    public MyImmutableObject setDate(Date date){
        return new MyImmutableObject (date);
    }
}
