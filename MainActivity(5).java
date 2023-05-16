package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bc,bdot,bplus,bmin,bmul,bdiv,bans,blog;
    EditText edt1;
    float n,ans;
    char op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button5);
        b5=(Button)findViewById(R.id.button8);
        b6=(Button)findViewById(R.id.button7);
        b7=(Button)findViewById(R.id.button9);
        b8=(Button)findViewById(R.id.button12);
        b9=(Button)findViewById(R.id.button11);
        b0=(Button)findViewById(R.id.button16);
        bc=(Button)findViewById(R.id.button15);
        bdot=(Button)findViewById(R.id.button13);
        bplus=(Button)findViewById(R.id.button4);
        bmin=(Button)findViewById(R.id.button6);
        bmul=(Button)findViewById(R.id.button10);
        bdiv=(Button)findViewById(R.id.button14);
        bans=(Button)findViewById(R.id.button17);
        blog=(Button)findViewById(R.id.button18);
        edt1=(EditText)findViewById(R.id.editText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(""+edt1.getText().toString()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(""+edt1.getText().toString()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(""+edt1.getText().toString()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(""+edt1.getText().toString()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(""+edt1.getText().toString()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(""+edt1.getText().toString()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(""+edt1.getText().toString()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(""+edt1.getText().toString()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(""+edt1.getText().toString()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(""+edt1.getText().toString()+"0");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(" ");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(""+edt1.getText().toString()+".");
            }
        });
       bplus.setOnClickListener(new View.OnClickListener() {
           @Override


           public void onClick(View view) {
               n=Integer.parseInt(edt1.getText().toString());
               op='+';
               edt1.setText(" ");
           }
       });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=Integer.parseInt(edt1.getText().toString());
                op='-';
                edt1.setText(" ");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=Integer.parseInt(edt1.getText().toString());
                op='*';
                edt1.setText(" ");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=Integer.parseInt(edt1.getText().toString());
                op='/';
                edt1.setText(" ");
            }
        });
        bans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (op=='+')
                {
                    ans=n+(Float.parseFloat(edt1.getText().toString()));
                }
                if (op=='-')
                {
                    ans=n-(Float.parseFloat(edt1.getText().toString()));
                }
                if (op=='*')
                {
                    ans=n*(Float.parseFloat(edt1.getText().toString()));
                }
                if (op=='/')
                {
                    ans=n/(Float.parseFloat(edt1.getText().toString()));
                }
           edt1.setText(""+ans);
            }

        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //n=Integer.parseInt((String) edt1.getText());
                ans=(float)Math.log(n);
                edt1.setText(""+ans);
            }
        });
    }
}
