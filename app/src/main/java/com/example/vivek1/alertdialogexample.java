package com.example.vivek1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alertdialogexample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alertdialogexample);
        Button btn1 = findViewById(R.id.btn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder b=new AlertDialog.Builder(alertdialogexample.this);
                b.setTitle("Alert Message: ");
                b.setMessage("You Have Coded Alert Dialog...");
                b.setPositiveButton("OK",null);
                b.create();
                b.show();

            }
        });


    }
}