package com.example.user.points;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ButtonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Buttons(this));
    }
}
