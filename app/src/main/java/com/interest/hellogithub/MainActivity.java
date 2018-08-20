package com.interest.hellogithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hello github
        System.out.println("this is remote code ");

        //add some funciton
        System.out.println("a new feature");
        int res = NewFunction.add(1, 2);
        System.out.println("result = " + res);

    }
}
