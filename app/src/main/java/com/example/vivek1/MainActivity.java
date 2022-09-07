package com.example.vivek1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btn1);
        EditText val= findViewById(R.id.txt1);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                String t = val.getText().toString();

                Log.d( "Your Tag", t);

                Toast.makeText(MainActivity.this,t, Toast.LENGTH_SHORT).show();
            }
        });
    }
}