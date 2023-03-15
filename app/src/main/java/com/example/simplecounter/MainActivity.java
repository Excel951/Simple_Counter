package com.example.simplecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnreset;
    private Button btntambah;
    private EditText hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnreset=(Button)findViewById(R.id.btnreset);
        btntambah=(Button)findViewById(R.id.btntambah);
        hasil=(EditText)findViewById(R.id.hasil);
    }

    public int tambah;
    public void setBtntambah(View view) {
        tambah=Integer.parseInt(hasil.getText().toString());
        tambah=tambah+1;
        hasil.setText(String.valueOf(tambah));
    }

    public void setBtnreset(View view) {
        tambah=0;
        hasil.setText(String.valueOf(tambah));
    }
}