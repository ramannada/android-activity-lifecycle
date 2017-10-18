package com.example.ramannada.tugas2;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class DisplayActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView tvName = (TextView) findViewById(R.id.tv_display_name);
        TextView tvEmail = (TextView) findViewById(R.id.tv_display_email);
        TextView tvPassword = (TextView) findViewById(R.id.tv_display_password);


        tvName.setText(getIntent().getStringExtra("name"));
        tvEmail.setText(getIntent().getStringExtra("email"));
        tvPassword.setText(getIntent().getStringExtra("password"));
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "onStart DisplayActivity dijalankan", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "onResume DisplayActivity dijalankan", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "onPause DisplayActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "onRestart DisplayActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "onStop DisplayActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "onDestroy DisplayActivity", Toast.LENGTH_SHORT).show();
    }
}
