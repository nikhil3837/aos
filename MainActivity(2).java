package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.*;
import android.os.Bundle;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
 Button b1;
 EditText e1,e2,e3,e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);
        b1=(Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String fn=e1.getText().toString();
                String ln=e2.getText().toString();
                String con=e3.getText().toString();
                String email=e4.getText().toString();

                if(fn.isEmpty())
                    Toast.makeText(getApplicationContext(),"FN should not be empty",Toast.LENGTH_SHORT).show();
                if(ln.isEmpty())
                    Toast.makeText(getApplicationContext(),"LN should not be empty",Toast.LENGTH_SHORT).show();
                if(con.isEmpty() ||con.length()!=10)
                    Toast.makeText(getApplicationContext(),"Contact not valid",Toast.LENGTH_SHORT).show();
                if(!isEmp(email))
                    Toast.makeText(getApplicationContext(),"Email not valid",Toast.LENGTH_SHORT).show();
                else

                    Toast.makeText(getApplicationContext(),"All values clear",Toast.LENGTH_SHORT).show();
            }
        });
    }
    boolean isEmp(String str)
    {
        CharSequence fn=str.toString();
        return  (TextUtils.isEmpty(fn) && Patterns.EMAIL_ADDRESS.matcher(fn).matches());
    }
}
