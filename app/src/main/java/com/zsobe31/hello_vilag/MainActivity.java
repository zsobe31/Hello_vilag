package com.zsobe31.hello_vilag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // gomb elerese
        Button btnTime = findViewById(R.id.btnTime);

        // szovegmezo elerese
        final TextView tvData = findViewById(R.id.tvData);

        // gomb megnyomasara esemenykzelo lefutasa
        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String time = "Az idő: " + new Date(System.currentTimeMillis()).toString();
                Toast.makeText(MainActivity.this, time, Toast.LENGTH_LONG).show();

                tvData.setText("Szia, üdv neked!");
            }
        });

    }
}
