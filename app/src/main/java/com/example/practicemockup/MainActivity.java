package com.example.practicemockup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int playing;
    MediaPlayer kangarooSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView kangaroo=(ImageView)findViewById(R.id.imageView);
        kangarooSound=new MediaPlayer();
        kangarooSound=MediaPlayer.create(this,R.raw.track1);
        playing=0;
        Button bttnFirst=(Button)findViewById(R.id.bttnFirst);

        kangaroo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (playing){
                    case 0:
                        kangarooSound.start();
                        playing=1;
                        break;
                    case 1:
                        kangarooSound.pause();
                        playing=0;
                        break;
                }
            }
        });
        bttnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
    }
}