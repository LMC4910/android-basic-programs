package com.example.exp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText n1,n2;
        Button add,sub,div,mul;
        TextView res;

        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        add = findViewById(R.id.add);
        sub =findViewById(R.id.sub);
        div=findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        res = findViewById(R.id.res);


        add.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       int a=Integer.parseInt(n1.getText().toString());
                                       int b=Integer.parseInt(n2.getText().toString());
                                       int c=a+b;
                                       res.setText("Result= "+c);
                                   }
                               }
        );
        sub.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       int a=Integer.parseInt(n1.getText().toString());
                                       int b=Integer.parseInt(n2.getText().toString());
                                       int c=a-b;
                                       res.setText("Result= "+c);
                                   }
                               }
        );
        mul.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       int a=Integer.parseInt(n1.getText().toString());
                                       int b=Integer.parseInt(n2.getText().toString());
                                       int c=a*b;
                                       res.setText("Result= "+c);
                                   }
                               }
        );
        div.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       int a=Integer.parseInt(n1.getText().toString());
                                       int b=Integer.parseInt(n2.getText().toString());
                                       int c=a/b;
                                       res.setText("Result= "+c);
                                   }
                               }
        );
    }
}
