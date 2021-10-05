package com.example.testingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.bumptech.glide.Glide;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    public Button greetingButton;
    public TextView mainText;
    public ImageView mainImage;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        greetingButton = findViewById(R.id.grettingButton);
//        mainText = findViewById(R.id.textview1);
        mainImage = findViewById(R.id.imageView);




//        greetingButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mainText.setText("this is my first project");
//                mainText.append( " \n second set of values");
//            }
//        });



//        String url = "https://compote.slate.com/images/697b023b-64a5-49a0-8059-27b963453fb1.gif?width=840";
//
//        //Picasso.with(this).load(url).into(imageView);
//        Picasso.with(this).load(url).into(mainImage);

        Glide.with(this).load("https://compote.slate.com/images/697b023b-64a5-49a0-8059-27b963453fb1.gif?width=840").into(mainImage);





    }


}