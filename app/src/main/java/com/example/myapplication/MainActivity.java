package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStepAge(View view) {
        EditText tbname = findViewById(R.id.tbName);
        String NameUser = tbname.getText().toString();

        setContentView(R.layout.step2);

        TextView tvName = findViewById(R.id.tvName);
        tvName.setText("Очень приятно познакомиться "+NameUser+" \n Меня зовут бисквит ...\n Сколько тебе лет?");

    }
}