package com.example.scfmdz24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class About_2 extends AppCompatActivity {

    private Button ex_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about2);

        String title_ex = "Кнопка ещё в разработке>";

      ImageButton btn_ex_c = findViewById(R.id.exit_button);
        btn_ex_c.setOnClickListener(v -> {

            showMessage(title_ex);});
    }

    private void showMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
    public void back_1() {
        Intent Intent3 = new Intent(this, MainActivity.class);
        startActivity(Intent3);
    }
}