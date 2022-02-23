package com.example.ep6;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText uid,pwd;
        Button login;
        uid=(EditText) findViewById(R.id.editTextTextPersonName);
        pwd=(EditText) findViewById(R.id.editTextTextPassword);
        login=(Button) findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (uid.getText().toString().equals("Ramiz") && pwd.getText().toString().equals("ramiz123")) {
                    Toast.makeText(MainActivity.this, "login successful", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, welcome.class);
                    i.putExtra("username", uid.getText().toString());
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this, "login unsuccessful", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}