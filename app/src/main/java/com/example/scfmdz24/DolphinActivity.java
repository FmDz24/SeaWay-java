package com.example.scfmdz24;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DolphinActivity extends AppCompatActivity {

    ImageButton dolph;

    MediaPlayer dolph_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolphin);

        ImageButton dolph = findViewById(R.id.delphin_Button);

        dolph_sound = MediaPlayer.create(this, R.raw.dolphin_sound);
        dolph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(dolph_sound);

            }
        });
    }

    private void soundPlayButton(MediaPlayer sound) {
        if (sound.isPlaying()) {
            sound.pause();
        }
        sound.seekTo(0);
        sound.start();
        }
    }
