
package com.riskyo.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etbarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
    }

    public void load(){
        etbarang = findViewById(R.id.etBarang);
    }

    public void btnBarang(View view) {
        String barang = etbarang.getText().toString();
        Intent intent = new Intent(this, Barang.class);
        intent.putExtra("Isi", barang);
        startActivity(intent);
    }

    public void btnPenjualan(View view) {
        String jual = etbarang.getText().toString();
        Intent intent = new Intent(this, Penjualan.class);

        intent.putExtra("ISI1",jual);
        startActivity(intent);
    }

    public void btnPembelian(View view) {
        String beli = etbarang.getText().toString();
        Intent intent = new Intent (this, Pembelian.class);
        intent.putExtra("Isi2", beli);
        startActivity(intent);
    }
}