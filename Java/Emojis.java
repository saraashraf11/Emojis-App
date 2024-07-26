package com.example.emojis;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Emojis extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_emojis);




        // Welcome Message
        Toast welcome = Toast.makeText(getApplicationContext(),"💕Welcome All💕",Toast.LENGTH_LONG);
        welcome.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
        welcome.show();

        // open Face with Sunglasses
        Button btn_withSunglasses = findViewById(R.id.btn_withSunglasses);
        btn_withSunglasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent withSunglasses = new Intent(Emojis.this, faceWithSunglasses.class);
                startActivity(withSunglasses);
            }
        });

        // open Face with Tear
        Button btn_withTear = findViewById(R.id.btn_withTear);
        btn_withTear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent withTear = new Intent(Emojis.this, faceWithTear.class);
                startActivity(withTear);
            }
        });

        // open Face with Heart Eyes
        Button btn_withHeartEyes = findViewById(R.id.btn_withHeartEyes);
        btn_withHeartEyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent withHeartEyes = new Intent(Emojis.this, faceWithHeartEyes.class);
                startActivity(withHeartEyes);
            }
        });

        // open Face with Hearts
        Button btn_withHearts = findViewById(R.id.btn_withHearts);
        btn_withHearts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent withHearts = new Intent(Emojis.this, faceWithHearts.class);
                startActivity(withHearts);
            }
        });

        // open Shushing Face
        Button btn_shushing = findViewById(R.id.btn_shushing);
        btn_shushing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shushing = new Intent(Emojis.this, shushingFace.class);
                startActivity(shushing);
            }
        });

        // open Sleeping Face
        Button btn_sleeping = findViewById(R.id.btn_sleeping);
        btn_sleeping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sleeping = new Intent(Emojis.this, sleepingFace.class);
                startActivity(sleeping);
            }
        });

        // open Pouting Face
        Button btn_pouting = findViewById(R.id.btn_pouting);
        btn_pouting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pouting = new Intent(Emojis.this, poutingFace.class);
                startActivity(pouting);
            }
        });

        // open Rolling Face
        Button btn_rolling = findViewById(R.id.btn_rolling);
        btn_rolling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rolling = new Intent(Emojis.this, rollingFace.class);
                startActivity(rolling);
            }
        });

        // open Hugging Face
        Button btn_hugging = findViewById(R.id.btn_hugging);
        btn_hugging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hugging = new Intent(Emojis.this, huggingFace.class);
                startActivity(hugging);
            }
        });

        // open Hugging Face
        Button btn_pleading = findViewById(R.id.btn_pleading);
        btn_pleading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pleading = new Intent(Emojis.this, pleadingFace.class);
                startActivity(pleading);
            }
        });

        // open Fearful Face
        Button btn_fearful = findViewById(R.id.btn_fearful);
        btn_fearful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fearful = new Intent(Emojis.this, fearfulFace.class);
                startActivity(fearful);
            }
        });

        // open Hot Face
        Button btn_hot= findViewById(R.id.btn_hot);
        btn_hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hot = new Intent(Emojis.this, hotFace.class);
                startActivity(hot);
            }
        });

        // open Cold Face
        Button btn_cold= findViewById(R.id.btn_cold);
        btn_cold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cold = new Intent(Emojis.this, coldFace.class);
                startActivity(cold);
            }
        });

        // open Crying Face
        Button btn_crying= findViewById(R.id.btn_crying);
        btn_crying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crying = new Intent(Emojis.this, cryingFace.class);
                startActivity(crying);
            }
        });

        // open Screaming Face
        Button btn_screaming= findViewById(R.id.btn_screaming);
        btn_screaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screaming = new Intent(Emojis.this, screamingFace.class);
                startActivity(screaming);
            }
        });

        // open Face with Symbols
        Button btn_withSymbols= findViewById(R.id.btn_withSymblos);
        btn_withSymbols.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent withSymbols = new Intent(Emojis.this, faceWithSymbols.class);
                startActivity(withSymbols);
            }
        });
    }



//    // Tool Bar
//    public Boolean onOptionsItemSelected(Menu menu){
//        getMenuInflater().inflate(R.menu.tool_bar,menu);
//        return true;
//    }
//    public boolean onOptionsItemSelected(@NonNull MenuItem item){
//        int id = item.getItemId();
//        if(id == R.id.about_us){
//            Intent i = new Intent(Emojis.this,faceWithSymbols.class);
//            startActivity(i);
//        }
//        if (id == R.id.contact_us) {
//            Intent i = new Intent(Emojis.this,faceWithSymbols.class);
//            startActivity(i);
//        }
//        if(id == R.id.rate_us){
//            Intent i = new Intent(Emojis.this,faceWithSymbols.class);
//            startActivity(i);
//        }
//        return super.onOptionsItemSelected(item);
//    }

}
