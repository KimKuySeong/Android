package com.example.wjddu.myfirstapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.shapes.Shape;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button goteam, clobtn, gogitbtn;
    ImageView timg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goteam = findViewById(R.id.goteam);
        clobtn = findViewById(R.id.clobtn);
        gogitbtn = findViewById(R.id.gogitbtn);


        goteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tintent = new Intent(getApplicationContext(), team_info.class);
                startActivity(tintent);
                Toast.makeText(getApplicationContext(), "팀 소개 화면입니다.", Toast.LENGTH_SHORT).show();
            }
        });


        gogitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/KimKuySeong/CameraAPP_2"));
                startActivity(myIntent);
            }
        });


        clobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                moveTaskToBack(true);
                Toast.makeText(getApplicationContext(), "어플을 종료했습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        timg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}
