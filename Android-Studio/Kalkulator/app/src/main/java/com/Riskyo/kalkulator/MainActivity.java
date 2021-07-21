package com.Riskyo.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText bil_1, bil_2;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Hitung(View view) {
        bil_1 = findViewById(R.id.etBil_1);
        bil_2 = findViewById(R.id.etBil_2);
        hasil = findViewById(R.id.tvHasil);

        if ( bil_1.getText().toString().equals("") ){
            bil_1.setError("Harus Di isi");
        }else if ( bil_2.getText().toString().equals("") ){
            bil_2.setError("Harus Di isi");
        }else {
            Double a = Double.parseDouble(bil_1.getText().toString());
            Double b = Double.parseDouble(bil_2.getText().toString());

            Kalkulator calc = new Kalkulator();

            Double c = calc.penjumlahan(a, b);

            hasil.setText(c + "");
        }
    }
}