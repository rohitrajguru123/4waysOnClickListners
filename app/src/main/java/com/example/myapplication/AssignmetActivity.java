package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.NoCopySpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class AssignmetActivity extends AppCompatActivity {


//    int[] colors = {R.color.red , R.color.Green };
    ConstraintLayout mainContainer;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    EditText editText;
    Button btn;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assignment);

        initializeView();
        initializeListeners();

//        Resources r = getResources(R.color.red);
    }

    private void initializeView() {
        mainContainer = findViewById(R.id.mainContainer);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        editText = findViewById(R.id.editText);
        btn = findViewById(R.id.btn);
    }

    private void initializeListeners() {
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onClick(View view) {

//              Using if() else

                        if (editText.getText().toString().equals("ONE") || editText.getText().toString().equals("one")){
                            textView1.setBackgroundColor(getResources().getColor(R.color.red));
                            textView2.setBackgroundColor(getResources().getColor(R.color.Green));
                            textView3.setBackgroundColor(getResources().getColor(R.color.Green));
                        } else if (editText.getText().toString().equals("TWO") || editText.getText().toString().equals("two")) {
                            textView1.setBackgroundColor(getResources().getColor(R.color.Green));
                            textView2.setBackgroundColor(getResources().getColor(R.color.red));
                            textView3.setBackgroundColor(getResources().getColor(R.color.Green));
                        } else if (editText.getText().toString().equals("THREE") || editText.getText().toString().equals("three")) {
                            textView1.setBackgroundColor(getResources().getColor(R.color.Green));
                            textView2.setBackgroundColor(getResources().getColor(R.color.Green));
                            textView3.setBackgroundColor(getResources().getColor(R.color.red));
                        }else {
                            textView1.setBackgroundColor(getResources().getColor(R.color.red));
                            textView2.setBackgroundColor(getResources().getColor(R.color.red));
                            textView3.setBackgroundColor(getResources().getColor(R.color.red));
                        }


                    }
                }
        );
    }
}
