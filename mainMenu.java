package com.example.a1022finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

class MainMenu extends AppCompatActivity {
    private Button buttonOpenDifficultyPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);
        buttonOpenDifficultyPage = (Button)findViewById(R.id.button);
        buttonOpenDifficultyPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDifficultyPage();
            }
        });
    }
    public void openDifficultyPage(){
        Intent intent = new Intent(this, difficultyPage.class);
        startActivity(intent);
    }
}