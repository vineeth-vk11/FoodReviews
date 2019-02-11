package com.example.vineeth.bphcfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class options1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options1);
        this.overridePendingTransition(R.anim.anim_down,
                R.anim.anim_up);



        ImageButton imageButton19 = (ImageButton)findViewById(R.id.imageButton19);

        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8=new Intent(options1.this,display.class);
                startActivity(intent8);
            }
        });
    }
}
