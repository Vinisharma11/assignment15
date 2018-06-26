package com.example.joker.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    View.OnClickListener clickListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickListener = (v) -> {System.out.print("hi");};

        btn = findViewById(R.id.button);
        btn.setOnClickListener(clickListener);


    }
}
