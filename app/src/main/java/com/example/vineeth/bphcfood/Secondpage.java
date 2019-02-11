package com.example.vineeth.bphcfood;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class Secondpage extends AppCompatActivity {

    private ImageView imgLogo, imgProfilePic;
    private TextView txvShared;

    private Button mLogoutBtn;

    private FirebaseAuth mAuth;

    private GoogleSignInClient mGoogleSignInClient;

    private GoogleApiClient mGoogleApiClient;


    private FirebaseAuth.AuthStateListener mAuthListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
// TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.overridePendingTransition(R.anim.animation_leave,
                R.anim.animation_enter);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_secondpage);






        mAuth = FirebaseAuth.getInstance();
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if(firebaseAuth.getCurrentUser()==null){
                    startActivity(new Intent(Secondpage.this,MainActivity.class));
                }
            }
        };


        mLogoutBtn = (Button) findViewById(R.id.logout);

        mLogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();




            }
        });



        ImageButton imageButton1 = (ImageButton)findViewById(R.id.imageButton1);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Secondpage.this,options1.class);
                startActivity(intent2);
            }
        });



        ImageButton imageButton2 = (ImageButton)findViewById(R.id.imageButton2);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(Secondpage.this,option2.class);
                startActivity(intent3);
            }
        });





    }



    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }


}
