package com.example.vineeth.bphcfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class option2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option2);
        this.overridePendingTransition(R.anim.anim_down,
                R.anim.anim_up);
    }
}
