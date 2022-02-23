package com.example.ep7;




import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
public class TouristSpots extends AppCompatActivity {

    ImageView img_andaman,img_jog,img_dal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_spots);
        img_andaman = (ImageView)findViewById(R.id.andaman_img);
        img_jog = (ImageView)findViewById(R.id.img_jog);
        img_dal = (ImageView)findViewById(R.id.img_dal);
        img_andaman.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Andaman ",Toast.LENGTH_SHORT).show();
                String url="https://www.planetware.com/tourist-attractions/nepal-nep.htm";
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i1);
            }
        });
        img_jog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Jog falls ",Toast.LENGTH_SHORT).show();
                String url="https://www.planetware.com/tourist-attractions/nepal-nep.htm";
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i2);
            }
        });
        img_dal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Dal Lake ",Toast.LENGTH_SHORT).show();
                String url="https://www.planetware.com/tourist-attractions/nepal-nep.htm";
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i3);
            }
        });
    }
}