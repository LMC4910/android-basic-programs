package com.example.ep2;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText e1,e2,e3,e4;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db=new DatabaseHelper(this);
        e1=findViewById(R.id.et1);
        e2=findViewById(R.id.et2);
        e3=findViewById(R.id.et3);
        e4=findViewById(R.id.et4);
        tv=findViewById(R.id.tv);
    }

    public void insert(View view){
        boolean status =db.insert(e1.getText().toString(),
                Integer.parseInt(e2.getText().toString()),
                Integer.parseInt(e3.getText().toString()),
                Integer.parseInt(e4.getText().toString()));
    }
    public void report(View view){
        Cursor c=db.select();
        if (c.getCount()==0){
            return;
        }
        StringBuffer buf=new StringBuffer();
        while(c.moveToNext()){
            buf.append("Name : "+c.getString(1));
            buf.append(" Age : "+c.getString(2));
            buf.append(" Haemoglobin : "+c.getString(3));
            buf.append(" Sugar : "+c.getString(4));
            buf.append("\n");
            tv.setText(buf);
        }
    }

}
