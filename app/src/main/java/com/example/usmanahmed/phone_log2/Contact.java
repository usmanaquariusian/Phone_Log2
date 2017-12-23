package com.example.usmanahmed.phone_log2;

/**
 * Created by Usman Ahmed on 17/10/2017.
 */

public class Contact
{
    String Name;
    String Id;

    public Contact(String name, String id) {
        Name = name;
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public String getId() {
        return Id;
    }
}
