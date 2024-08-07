package com.example.emojisdescriptor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_description);

        // Back Botton
        ImageView back = findViewById(R.id.img_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(MainDescription.this, MainEmojis.class);
                startActivity(back);
            }
        });

        // Face with Sunglasses
        Intent withSunglasses = getIntent();
        int emojiImageId1 = withSunglasses.getIntExtra("emojiImageId",0);
        String emojiNameId1 = withSunglasses.getStringExtra("emojiNameId");
        String emojiDescriptionId1 = withSunglasses.getStringExtra("emojiDescriptionId");

        ImageView emojiImageView = findViewById(R.id.img_emoji);
        emojiImageView.setImageResource(emojiImageId1);
        TextView emojiTextViewName = findViewById(R.id.title_emoji);
        emojiTextViewName.setText(emojiNameId1);
        TextView emojiTextView = findViewById(R.id.text_emoji);
        emojiTextView.setText(emojiDescriptionId1);

        // Face with Tear
        Intent withTear = getIntent();
        int emojiImageId2 = withTear.getIntExtra("emojiImageId",0);
        String emojiNameId2 = withTear.getStringExtra("emojiNameId");
        String emojiDescriptionId2 = withTear.getStringExtra("emojiDescriptionId");

        ImageView emojiImageView2 = findViewById(R.id.img_emoji);
        emojiImageView2.setImageResource(emojiImageId2);
        TextView emojiTextViewName2 = findViewById(R.id.title_emoji);
        emojiTextViewName2.setText(emojiNameId2);
        TextView emojiTextView2 = findViewById(R.id.text_emoji);
        emojiTextView2.setText(emojiDescriptionId2);

        // Face with Hearts Eyes
        Intent withHeartEyes = getIntent();
        int emojiImageId3 = withHeartEyes.getIntExtra("emojiImageId",0);
        String emojiNameId3 = withHeartEyes.getStringExtra("emojiNameId");
        String emojiDescriptionId3 = withHeartEyes.getStringExtra("emojiDescriptionId");

        ImageView emojiImageView3 = findViewById(R.id.img_emoji);
        emojiImageView3.setImageResource(emojiImageId3);
        TextView emojiTextViewName3 = findViewById(R.id.title_emoji);
        emojiTextViewName3.setText(emojiNameId3);
        TextView emojiTextView3 = findViewById(R.id.text_emoji);
        emojiTextView3.setText(emojiDescriptionId3);

        // Face with Hearts
        Intent withHearts = getIntent();
        int emojiImageId4 = withHearts.getIntExtra("emojiImageId",0);
        String emojiNameId4 = withHearts.getStringExtra("emojiNameId");
        String emojiDescriptionId4 = withHearts.getStringExtra("emojiDescriptionId");

        ImageView emojiImageView4 = findViewById(R.id.img_emoji);
        emojiImageView4.setImageResource(emojiImageId4);
        TextView emojiTextViewName4 = findViewById(R.id.title_emoji);
        emojiTextViewName4.setText(emojiNameId4);
        TextView emojiTextView4 = findViewById(R.id.text_emoji);
        emojiTextView4.setText(emojiDescriptionId4);

        // Shushing Face
        Intent shushing = getIntent();
        int emojiImageId5 = shushing.getIntExtra("emojiImageId",0);
        String emojiNameId5 = shushing.getStringExtra("emojiNameId");
        String emojiDescriptionId5 = shushing.getStringExtra("emojiDescriptionId");

        ImageView emojiImageView5 = findViewById(R.id.img_emoji);
        emojiImageView5.setImageResource(emojiImageId5);
        TextView emojiTextViewName5 = findViewById(R.id.title_emoji);
        emojiTextViewName5.setText(emojiNameId5);
        TextView emojiTextView5 = findViewById(R.id.text_emoji);
        emojiTextView5.setText(emojiDescriptionId5);

        // Sleeping Face
        Intent sleeping = getIntent();
        int emojiImageId6 = sleeping.getIntExtra("emojiImageId",0);
        String emojiNameId6 = sleeping.getStringExtra("emojiNameId");
        String emojiDescriptionId6 = sleeping.getStringExtra("emojiDescriptionId");

        ImageView emojiImageView6 = findViewById(R.id.img_emoji);
        emojiImageView6.setImageResource(emojiImageId6);
        TextView emojiTextViewName6 = findViewById(R.id.title_emoji);
        emojiTextViewName6.setText(emojiNameId6);
        TextView emojiTextView6 = findViewById(R.id.text_emoji);
        emojiTextView6.setText(emojiDescriptionId6);

        // Pouting Face
        Intent pouting = getIntent();
        int emojiImageId7 = pouting.getIntExtra("emojiImageId",0);
        String emojiNameId7 = pouting.getStringExtra("emojiNameId");
        String emojiDescriptionId7 = pouting.getStringExtra("emojiDescriptionId");

        ImageView emojiImageView7 = findViewById(R.id.img_emoji);
        emojiImageView7.setImageResource(emojiImageId7);
        TextView emojiTextViewName7 = findViewById(R.id.title_emoji);
        emojiTextViewName7.setText(emojiNameId7);
        TextView emojiTextView7 = findViewById(R.id.text_emoji);
        emojiTextView7.setText(emojiDescriptionId7);

        // Rolling Face
        Intent rolling = getIntent();
        int emojiImageId8 = rolling.getIntExtra("emojiImageId",0);
        String emojiNameId8 = rolling.getStringExtra("emojiNameId");
        String emojiDescriptionId8 = rolling.getStringExtra("emojiDescriptionId");

        ImageView emojiImageView8 = findViewById(R.id.img_emoji);
        emojiImageView8.setImageResource(emojiImageId8);
        TextView emojiTextViewName8 = findViewById(R.id.title_emoji);
        emojiTextViewName8.setText(emojiNameId8);
        TextView emojiTextView8 = findViewById(R.id.text_emoji);
        emojiTextView8.setText(emojiDescriptionId8);

        // Hugging Face
        Intent hugging = getIntent();
        int emojiImageId9 = hugging.getIntExtra("emojiImageId",0);
        String emojiNameId9 = hugging.getStringExtra("emojiNameId");
        String emojiDescriptionId9 = hugging.getStringExtra("emojiDescriptionId");

        ImageView emojiImageView9 = findViewById(R.id.img_emoji);
        emojiImageView9.setImageResource(emojiImageId9);
        TextView emojiTextViewName9 = findViewById(R.id.title_emoji);
        emojiTextViewName9.setText(emojiNameId9);
        TextView emojiTextView9 = findViewById(R.id.text_emoji);
        emojiTextView9.setText(emojiDescriptionId9);

        // Pleading Face
        Intent pleading = getIntent();
        int emojiImageId10 = pleading.getIntExtra("emojiImageId",0);
        String emojiNameId10 = pleading.getStringExtra("emojiNameId");
        String emojiDescriptionId10 = pleading.getStringExtra("emojiDescriptionId");

        ImageView emojiImageView10 = findViewById(R.id.img_emoji);
        emojiImageView10.setImageResource(emojiImageId10);
        TextView emojiTextViewName10 = findViewById(R.id.title_emoji);
        emojiTextViewName10.setText(emojiNameId10);
        TextView emojiTextView10 = findViewById(R.id.text_emoji);
        emojiTextView10.setText(emojiDescriptionId10);

        // Fearful Face
        Intent fearful = getIntent();
        int emojiImageId11 = fearful.getIntExtra("emojiImageId",0);
        String emojiNameId11 = fearful.getStringExtra("emojiNameId");
        String emojiDescriptionId11 = fearful.getStringExtra("emojiDescriptionId");

        ImageView emojiImageView11 = findViewById(R.id.img_emoji);
        emojiImageView11.setImageResource(emojiImageId11);
        TextView emojiTextViewName11 = findViewById(R.id.title_emoji);
        emojiTextViewName11.setText(emojiNameId11);
        TextView emojiTextView11 = findViewById(R.id.text_emoji);
        emojiTextView11.setText(emojiDescriptionId11);

        // Hot Face
        Intent hot = getIntent();
        int emojiImageId12 = hot.getIntExtra("emojiImageId",0);
        String emojiNameId12 = hot.getStringExtra("emojiNameId");
        String emojiDescriptionId12 = hot.getStringExtra("emojiDescriptionId");

        ImageView emojiImageView12 = findViewById(R.id.img_emoji);
        emojiImageView12.setImageResource(emojiImageId12);
        TextView emojiTextViewName12 = findViewById(R.id.title_emoji);
        emojiTextViewName12.setText(emojiNameId12);
        TextView emojiTextView12 = findViewById(R.id.text_emoji);
        emojiTextView12.setText(emojiDescriptionId12);

        // Cold Face
        Intent cold = getIntent();
        int emojiImageId13 = cold.getIntExtra("emojiImageId",0);
        String emojiNameId13 = cold.getStringExtra("emojiNameId");
        String emojiDescriptionId13 = cold.getStringExtra("emojiDescriptionId");

        ImageView emojiImageView13 = findViewById(R.id.img_emoji);
        emojiImageView13.setImageResource(emojiImageId13);
        TextView emojiTextViewName13 = findViewById(R.id.title_emoji);
        emojiTextViewName13.setText(emojiNameId13);
        TextView emojiTextView13 = findViewById(R.id.text_emoji);
        emojiTextView13.setText(emojiDescriptionId13);

        // Crying Face
        Intent crying = getIntent();
        int emojiImageId14 = crying.getIntExtra("emojiImageId",0);
        String emojiNameId14 = crying.getStringExtra("emojiNameId");
        String emojiDescriptionId14 = crying.getStringExtra("emojiDescriptionId");

        ImageView emojiImageView14 = findViewById(R.id.img_emoji);
        emojiImageView14.setImageResource(emojiImageId14);
        TextView emojiTextViewName14 = findViewById(R.id.title_emoji);
        emojiTextViewName14.setText(emojiNameId14);
        TextView emojiTextView14 = findViewById(R.id.text_emoji);
        emojiTextView14.setText(emojiDescriptionId14);

        // Screaming Face
        Intent screaming = getIntent();
        int emojiImageId15 = screaming.getIntExtra("emojiImageId",0);
        String emojiNameId15 = screaming.getStringExtra("emojiNameId");
        String emojiDescriptionId15 = screaming.getStringExtra("emojiDescriptionId");

        ImageView emojiImageView15 = findViewById(R.id.img_emoji);
        emojiImageView15.setImageResource(emojiImageId15);
        TextView emojiTextViewName15 = findViewById(R.id.title_emoji);
        emojiTextViewName15.setText(emojiNameId15);
        TextView emojiTextView15 = findViewById(R.id.text_emoji);
        emojiTextView15.setText(emojiDescriptionId15);

        // Face with Symbols
        Intent symbols = getIntent();
        int emojiImageId16 = symbols.getIntExtra("emojiImageId",0);
        String emojiNameId16 = symbols.getStringExtra("emojiNameId");
        String emojiDescriptionId16 = symbols.getStringExtra("emojiDescriptionId");

        ImageView emojiImageView16 = findViewById(R.id.img_emoji);
        emojiImageView16.setImageResource(emojiImageId16);
        TextView emojiTextViewName16 = findViewById(R.id.title_emoji);
        emojiTextViewName16.setText(emojiNameId16);
        TextView emojiTextView16 = findViewById(R.id.text_emoji);
        emojiTextView16.setText(emojiDescriptionId16);


    }
}