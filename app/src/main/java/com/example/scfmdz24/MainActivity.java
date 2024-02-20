package com.example.scfmdz24;

import androidx.appcompat.app.AppCompatActivity;
import static android.app.ProgressDialog.show;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String title_c = "Узнай больше, нажав <O программе>";

        Button button2_c = findViewById(R.id.button2_o);
        ImageButton btn_dlf_c = findViewById(R.id.btn_dlf_o);

        button2_c.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                showInfo(title_c);

            }
        });



        }



    public void About(View v) {
        Intent intent = new Intent(this, About_2.class);
        startActivity(intent);
    }
    public void toDo(View v) {
        Intent intent2 = new Intent(this, DolphinActivity.class);
        startActivity(intent2);
    }

    public void toDo2(View v) {
        Intent intent2 = new Intent(this, seaWay.class);
        startActivity(intent2);
    }



    public void showInfo(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

    }


