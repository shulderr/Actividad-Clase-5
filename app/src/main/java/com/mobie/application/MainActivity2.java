package com.mobie.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView l1, l2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        l1 = (TextView)findViewById(R.id.l1p2);
        l2 = (TextView)findViewById(R.id.l2p2);
        res = (TextView)findViewById(R.id.resP2);

        String dato1 = getIntent().getStringExtra("dato1");
        l1.setText("Lado Uno: " + dato1);
        String dato2 = getIntent().getStringExtra("dato2");
        l2.setText("Lado Dos: " + dato2);
        String dato3 = getIntent().getStringExtra("dato3");
        res.setText("Resultado: " + dato3);
    }
}