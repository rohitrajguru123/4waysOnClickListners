package com.example.myapplication;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.sql.Struct;

public class LoginActivity extends AppCompatActivity {

    LinearLayout linearlayout;
    TextView text;
    EditText nameEditText;
    EditText passwordEditText;
    Button btn;

    String [] colors;
    int [] integers;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        initilizeViews();
        initializeListener();
//use resources from xml files in code by using getresources() method
        Resources r = getResources();
        String welcome = r.getString(R.string.welcome);
        Log.e("tag",welcome);
        Log.e("tag", R.string.welcome+"");

        colors = r.getStringArray(R.array.colours);
        integers = r.getIntArray(R.array.numbers);


        //treaditional loops

        for (int i = 0; i < 5; i++) {
            Log.e("tag",colors[i]);

        }

        for (int i = 0; i < 5; i++) {

            Log.e("tag",integers[i]+"");
        }

        //for each loop mardern loop
        for (String c: colors){
            Log.e("tag",c);
        }

        for (int n: integers){
            Log.e("tag",n+"");
        }

    }




    private void initilizeViews() {
        linearlayout = findViewById(R.id.linearlayout);
        nameEditText = findViewById(R.id.nameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        btn = findViewById(R.id.btn);
    }
    private void initializeListener() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nameEditText.getText().toString().equals("Rohit") && passwordEditText.getText().toString().equals("Rohit@123")){
                    Toast.makeText(LoginActivity.this,"Login Succed",Toast.LENGTH_LONG).show();
                    text = nameEditText;

                }else {
                    Toast.makeText(LoginActivity.this,"Login Failed ",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}

