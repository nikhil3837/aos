package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String mpattern="^[0-9]{6}";
              String country="^[0-4]{3}";
              if(e1.getText().toString().matches(mpattern) && e2.getText().toString().matches(country))
              {
                  Toast.makeText(getApplicationContext(),"Valid Mobile No.",Toast.LENGTH_SHORT).show();
              }
              else
                  Toast.makeText(getApplicationContext(),"Invalid Mobile No.",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
