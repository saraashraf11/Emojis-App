package com.example.emojisdescriptor;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainEmojis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_emojis);

        // Welcome Message
        Toast welcome = Toast.makeText(getApplicationContext(),"💕Welcome All💕",Toast.LENGTH_LONG);
        welcome.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
        welcome.show();

        // Face with Sunglasses
        Button withSunglasses = findViewById(R.id.btn_withSunglasses);
        withSunglasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent withSunglasses = new Intent(MainEmojis.this,MainDescription.class);
                withSunglasses.putExtra("emojiImageId",R.drawable.smiling_face_with_sunglasses_svgrepo_com);
                withSunglasses.putExtra("emojiNameId","Smiling Face with Sunglasses");
                withSunglasses.putExtra("emojiDescriptionId","A yellow face with a broad, closed smile wearing black sunglasses, as if a pair of classic Wayfarers. Often used to convey the slang sense of cool. May also express a confident, carefree attitude or that something is excellent.\n" +
                        "\n" +
                        "\uD83E\uDD13 Nerd Face wears similarly shaped eyeglasses.\n" +
                        "\n" +
                        "On Snapchat, this emoji next to a contact denotes that you have best friends in common with this person.\n" +
                        "\n" +
                        "Smiling Face with Sunglasses was approved as part of Unicode 6.0 in 2010 and added to Emoji 1.0 in 2015.");
                startActivity(withSunglasses);
            }
        });

        // Face with Tear
        Button withTear = findViewById(R.id.btn_withTear);
        withTear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent withTear = new Intent(MainEmojis.this,MainDescription.class);
                withTear.putExtra("emojiImageId",R.drawable.smiling_face_with_tear_svgrepo_com);
                withTear.putExtra("emojiNameId","Smiling Face with Tear");
                withTear.putExtra("emojiDescriptionId","A yellow face with open eyes, a thin closed-mouth smile, and a single tear falling from one of its eyes. Can be used to express a wide range of emotions and expressions including gratitude, tender happiness, an attempt to look happy when actually sad, or smiling through pain. Can also be a response to something that is bittersweet.\n" +
                        "\n" +
                        "This emoji and \uD83D\uDE42 Slightly Smiling Face have a similar smile, and \uD83D\uDE22 Crying Face and \uD83D\uDE3F Crying Cat have a similar lone tear. Not to be confused with \uD83D\uDE02 Face with Tears of Joy, which has a wide toothy grin and tears coming from both eyes.\n" +
                        "\n" +
                        "Smiling Face with Tear was approved as part of Unicode 13.0 in 2020 and added to Emoji 13.0 in 2020.");
                startActivity(withTear);
            }
        });

        // Face with Heart Eyes
        Button withHeartEyes = findViewById(R.id.btn_withHeartEyes);
        withHeartEyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent withHeartEyes = new Intent(MainEmojis.this,MainDescription.class);
                withHeartEyes.putExtra("emojiImageId",R.drawable.smiling_face_with_heart_eyes_svgrepo_com);
                withHeartEyes.putExtra("emojiNameId","Smiling Face with Heart-Eyes");
                withHeartEyes.putExtra("emojiDescriptionId","A yellow face with an open smile, sometimes showing teeth, and red, cartoon-styled hearts for eyes. Often conveys enthusiastic feelings of love, infatuation, and adoration, e.g., I love/am in love with this person or thing.\n" +
                        "\n" +
                        "This emoji has a cat variant, \uD83D\uDE3B Smiling Cat Face With Heart-Eyes.\n" +
                        "\n" +
                        "Smiling Face with Heart-Eyes was approved as part of Unicode 6.0 in 2010 under the name \"Smiling Face with Heart-Shaped Eyes\" and added to Emoji 1.0 in 2015.");
                startActivity(withHeartEyes);
            }
        });

        // Face with Hearts
        Button withHearts = findViewById(R.id.btn_withHearts);
        withHearts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent withHearts = new Intent(MainEmojis.this,MainDescription.class);
                withHearts.putExtra("emojiImageId",R.drawable.smiling_face_with_hearts_svgrepo_com);
                withHearts.putExtra("emojiNameId","Smiling Face with Hearts");
                withHearts.putExtra("emojiDescriptionId","A yellow face with smiling eyes, a closed smile, rosy cheeks, and several hearts floating around its head. Expresses a range of happy, affectionate feelings, especially being in love. The placement of the hearts varies slightly by platform.\n" +
                        "\n" +
                        "Apples design features the same expression as its ☺\uFE0F Smiling Face emoji design.\n" +
                        "\n" +
                        "Smiling Face with Hearts was approved as part of Unicode 11.0 in 2018 under the name \"Smiling Face with Smiling Eyes and Three Hearts\" and added to Emoji 11.0 in 2018.");
                startActivity(withHearts);
            }
        });

        // Shushing Face
        Button shushing= findViewById(R.id.btn_shushing);
        shushing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shushing = new Intent(MainEmojis.this,MainDescription.class);
                shushing.putExtra("emojiImageId",R.drawable.shushing_face_svgrepo_com);
                shushing.putExtra("emojiNameId","Shushing Face");
                shushing.putExtra("emojiDescriptionId","A yellow face placing an index finger over pursed lips, as if issuing Shh! or Shush! for silence. Some platforms feature raised eyebrows. Apple’s design suggests the face is tilting back slightly.\n" +
                        "\n" +
                        "May convey silence, quiet, secrecy, and discreetness. May also create a sense of buzz and anticipation, e.g., an exclusive sneak peek or news scoop.\n" +
                        "\n" +
                        "See also \uD83E\uDD10 Zipper-Mouth Face. Joins \uD83E\uDD17 Hugging Face, \uD83E\uDD14 Thinking Face, and \uD83E\uDD2D Face With Hand Over Mouth as one of the few smileys featuring hands.\n" +
                        "\n" +
                        "Shushing Face was approved as part of Unicode 10.0 in 2017 under the name \"Face with Finger Covering Closed Lips\" and added to Emoji 5.0 in 2017.");
                startActivity(shushing);
            }
        });

        // Sleeping Face
        Button sleeping = findViewById(R.id.btn_sleeping);
        sleeping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sleeping = new Intent(MainEmojis.this,MainDescription.class);
                sleeping.putExtra("emojiImageId",R.drawable.sleeping_face_svgrepo_com);
                sleeping.putExtra("emojiNameId","Sleeping Face");
                sleeping.putExtra("emojiDescriptionId","A yellow face with eyes closed and mouth letting out three, cartoon-styled Zzz’s overhead to indicate its sound asleep. The Zzz’s appear blue or purple across most platforms. May also represent boredom (slang, snooze).\n" +
                        "\n" +
                        "Generally used instead of \uD83D\uDE2A Sleepy Face to convey sleep or sleepiness.\n" +
                        "\n" +
                        "        Sleeping Face was approved as part of Unicode 6.1 in 2012 and added to Emoji 1.0 in 2015.");
                startActivity(sleeping);
            }
        });

        // Pouting Face
        Button pouting = findViewById(R.id.btn_pouting);
        pouting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pouting = new Intent(MainEmojis.this,MainDescription.class);
                pouting.putExtra("emojiImageId",R.drawable.pouting_face_svgrepo_com);
                pouting.putExtra("emojiNameId","Enraged Face");
                pouting.putExtra("emojiDescriptionId","A red face with an angry expression: frowning mouth with eyes and eyebrows scrunched downward. Bears the same expression as \uD83D\uDE20 Angry Face on most platforms and may convey more intense degrees of anger, e.g., hate or rage.\n" +
                        "\n" +
                        "Samsung’s design previously featured a yellow face with the \uD83D\uDCA2 Anger Symbol on its forehead. Microsoft’s design previously featured a yellow face with a more hurt expression.\n" +
                        "\n" +
                        "Not to be confused with \uD83D\uDE4E Person With Pouting Face. This emoji also has a cat variant, \uD83D\uDE3E Pouting Cat Face.\n" +
                        "\n" +
                        "Enraged Face was approved as part of Unicode 6.0 in 2010 under the name \"Pouting Face\" and added to Emoji 1.0 in 2015.");
                startActivity(pouting);
            }
        });

        // Rolling Face
        Button rolling = findViewById(R.id.btn_rolling);
        rolling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rolling = new Intent(MainEmojis.this,MainDescription.class);
                rolling.putExtra("emojiImageId",R.drawable.rolling_on_the_floor_laughing_svgrepo_com);
                rolling.putExtra("emojiNameId","Rolling on the Floor Laughing");
                rolling.putExtra("emojiDescriptionId","A yellow face with a big grin and scrunched, X-shaped eyes, tilted on its side as if rolling on the floor laughing (the internet acronym ROFL). Sheds two tears and tilts right on most platforms. Often conveys hysterical laughter more intense than \uD83D\uDE02 Face With Tears of Joy.\n" +
                        "\n" +
                        "Using shown tilted leftwards, though WhatsApp design tilts to the right.\n" +
                        "\n" +
                        "Microsoft design previously featured a smiley with hands and feet.\n" +
                        "\n" +
                        "Rolling on the Floor Laughing was approved as part of Unicode 9.0 in 2016 and added to Emoji 3.0 in 2016.");
                startActivity(rolling);
            }
        });

        // Hugging Face
        Button hugging = findViewById(R.id.btn_hugging);
        hugging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hugging = new Intent(MainEmojis.this,MainDescription.class);
                hugging.putExtra("emojiImageId",R.drawable.hugging_face_svgrepo_com);
                hugging.putExtra("emojiNameId","Smiling Face with Open Hands");
                hugging.putExtra("emojiDescriptionId","A yellow face smiling with open hands, as if giving a hug. May be used to offer thanks and support, show love and care, or express warm, positive feelings more generally.\n" +
                        "\n" +
                        "Due to its hand gesture, often used to represent jazz hands, indicating such feelings as excitement, enthusiasm, or a sense of flourish or accomplishment.\n" +
                        "\n" +
                        "Joins \uD83E\uDD14 Thinking Face, \uD83E\uDD2B Shushing Face, and \uD83E\uDD2D Face With Hand Over Mouth as one of the few smileys featuring hands. For a more obvious hug, see \uD83E\uDEC2 People Hugging (new in 2020).\n" +
                        "\n" +
                        "Smiling Face with Open Hands was approved as part of Unicode 8.0 in 2015 under the name \"Hugging Face\" and added to Emoji 1.0 in 2015.");
                startActivity(hugging);
            }
        });

        // Pleading Face
        Button pleading = findViewById(R.id.btn_pleading);
        pleading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pleading = new Intent(MainEmojis.this,MainDescription.class);
                pleading.putExtra("emojiImageId",R.drawable.pleading_face_svgrepo_com);
                pleading.putExtra("emojiNameId","Pleading Face");
                pleading.putExtra("emojiDescriptionId","A yellow face with furrowed eyebrows, a small frown, and large, “puppy dog” eyes, as if begging, pleading, or yearning (possibly even in a NSFW manner, depending on the context). May also represent adoration or feeling touched by a loving gesture.\n" +
                        "\n" +
                        "Huaweis design for this emoji includes a pair of \uD83D\uDE4F Folded Hands.\n" +
                        "\n" +
                        "At its peak the Pleading Face was the third most popular emoji used on Twitter, and was the most commonly found emoji in tweets that include hearts. Used in sequence with pointing hands to indicate a bashful or shy pose (\uD83E\uDD7A\uD83D\uDC49\uD83D\uDC48) particularly on TikTok.\n" +
                        "\n" +
                        "Pleading Face was approved as part of Unicode 11.0 in 2018 under the name \"Face with Pleading Eyes\" and added to Emoji 11.0 in 2018.");
                startActivity(pleading);
            }
        });

        // Fearful Face
        Button fearful = findViewById(R.id.btn_fearful);
        fearful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fearful = new Intent(MainEmojis.this,MainDescription.class);
                fearful.putExtra("emojiImageId",R.drawable.fearful_face_svgrepo_com);
                fearful.putExtra("emojiNameId","Fearful Face");
                fearful.putExtra("emojiDescriptionId","A face with small, open eyes, open frown, raised eyebrows, and a pale blue forehead, as if experiencing a cold flash.\n" +
                        "\n" +
                        "While intended to represent fear (less intense than \uD83D\uDE31 Face Screaming in Fear), it also conveys a wide variety of emotions, including feeling amazed, shocked, sad, upset, and cold. Bears the same expression as \uD83D\uDE27 Anguished Face on most platforms.\n" +
                        "\n" +
                        "Unlike other vendors, Huaweis design shows this emoji holding a hand over its mouth, albeit differently to \uD83E\uDEE2 Face with Open Eyes and Hand Over Mouth and \uD83E\uDD2D Face with Hand Over Mouth. Samsung’s design previously showed upper teeth and tongue.\n" +
                        "\n" +
                        "Fearful Face was approved as part of Unicode 6.0 in 2010 and added to Emoji 1.0 in 2015.");
                startActivity(fearful);
            }
        });

        // Hot Face
        Button hot = findViewById(R.id.btn_hot);
        hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hot = new Intent(MainEmojis.this,MainDescription.class);
                hot.putExtra("emojiImageId",R.drawable.hot_face_svgrepo_com);
                hot.putExtra("emojiNameId","Hot Face");
                hot.putExtra("emojiDescriptionId","A reddish-orange face with furrowed eyebrows, tongue stuck out, and beads of sweat, as if overheated from high temperatures. Number and position of sweat droplets vary by platforms. May also represent physical attractiveness (slang, hot).\n" +
                        "\n" +
                        "Most platforms feature expressions that are variations on \uD83D\uDE30 Anxious Face With Sweat or \uD83D\uDE25 Sad but Relieved Face.\n" +
                        "\n" +
                        "Hot Face was approved as part of Unicode 11.0 in 2018 under the name \"Overheated Face\" and added to Emoji 11.0 in 2018.");
                startActivity(hot);
            }
        });

        // Cold Face
        Button cold = findViewById(R.id.btn_cold);
        cold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cold = new Intent(MainEmojis.this,MainDescription.class);
                cold.putExtra("emojiImageId",R.drawable.cold_face_svgrepo_com);
                cold.putExtra("emojiNameId","Cold Face");
                cold.putExtra("emojiDescriptionId","An icy-blue face with gritted teeth usually depicted with icicles clinging to its cheeks or jaw, as if frozen from extreme cold. May also represent unfriendliness (slang, cold) or excellence (slang, cool or chill).\n" +
                        "\n" +
                        "Apples design features the same expression as its \uD83D\uDE2C Grimacing Face. Huaweis design has a chipped \uD83E\uDDB7 Tooth.\n" +
                        "\n" +
                        "Cold Face was approved as part of Unicode 11.0 in 2018 under the name \"Freezing Face\" and added to Emoji 11.0 in 2018.");
                startActivity(cold);
            }
        });

        // Crying Face
        Button crying = findViewById(R.id.btn_crying);
        crying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crying = new Intent(MainEmojis.this,MainDescription.class);
                crying.putExtra("emojiImageId",R.drawable.crying_face_svgrepo_com);
                crying.putExtra("emojiNameId","Crying Face");
                crying.putExtra("emojiDescriptionId","A yellow face with an open mouth wailing and streams of heavy tears flowing from closed eyes. May convey inconsolable grief but also other intense feelings, such as uncontrollable laughter, pride or overwhelming joy.\n" +
                        "\n" +
                        "In March 2021, \uD83D\uDE2D Loudly Crying Face became the most popular emoji on Twitter. It held this position until January 2022, when \uD83D\uDE02 Face with Tears of Joy returned as the top emoji on the platform.\n" +
                        "\n" +
                        "Loudly Crying Face was approved as part of Unicode 6.0 in 2010 and added to Emoji 1.0 in 2015.");
                startActivity(crying);
            }
        });

        // Screaming Face
        Button screaming = findViewById(R.id.btn_screaming);
        screaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screaming = new Intent(MainEmojis.this,MainDescription.class);
                screaming.putExtra("emojiImageId",R.drawable.face_screaming_in_fear_svgrepo_com);
                screaming.putExtra("emojiNameId","Face Screaming in Fear");
                screaming.putExtra("emojiDescriptionId","A yellow face screaming in fear, depicted by wide, white eyes, a long, open mouth, hands pressed on cheeks, and a pale blue forehead, as if it has lost its color. Its expression evokes Edvard Munch’s iconic painting The Scream.\n" +
                        "\n" +
                        "While intended to represent horror and fright, it commonly conveys such feelings as shock, awe, disbelief, and intense excitement, as a screaming fan.\n" +
                        "\n" +
                        "Samsung design previously featured a ghost flying from its mouth. \uD83D\uDE40 Weary Cat Face bears a similar expression.\n" +
                        "\n" +
                        "Face Screaming in Fear was approved as part of Unicode 6.0 in 2010 and added to Emoji 1.0 in 2015.");
                startActivity(screaming);
            }
        });

        // Face with Symbols
        Button withSymbols = findViewById(R.id.btn_withSymblos);
        withSymbols.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent withSymbols = new Intent(MainEmojis.this,MainDescription.class);
                withSymbols.putExtra("emojiImageId",R.drawable.face_with_symbols_on_mouth_svgrepo_com);
                withSymbols.putExtra("emojiNameId","Face with Symbols");
                withSymbols.putExtra("emojiDescriptionId","An angry-red face with a black bar and white grawlixes covering its mouth, indicating its swearing or being vulgar. Grawlixes are typographical symbols (e.g., @#$%!) representing swear words or obscenities. Often used to convey an outburst of anger, frustration, or rage.\n" +
                        "\n" +
                        "Most platforms feature the same eyes as on their \uD83D\uDE20 Angry Face and \uD83D\uDE21 Enraged Face.\n" +
                        "\n" +
                        "Face with Symbols on Mouth was approved as part of Unicode 10.0 in 2017 under the name \"Serious Face with Symbols Covering Mouth\" and added to Emoji 5.0 in 2017.");
                startActivity(withSymbols);
            }
        });
    }
}