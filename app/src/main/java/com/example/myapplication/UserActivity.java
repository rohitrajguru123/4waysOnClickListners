package com.example.myapplication;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {

    Resources resources;
    int[] images = {R.drawable.ghj,R.drawable.hfjhf,R.drawable.hjjfxh,R.drawable.mmmm};
    int currentIndex = 0;
    ImageView imageview;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_details);
        initializeViews();
        initializeListener();
    }

    private void initializeViews() {
        imageview = findViewById(R.id.imgView);
        imageview.setImageResource(images[currentIndex]);



    }

    private void initializeListener() {
        imageview.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        currentIndex = ++currentIndex % images.length;
                        imageview.setImageResource(images[currentIndex]);
                    }
                }
        );
    }
}
