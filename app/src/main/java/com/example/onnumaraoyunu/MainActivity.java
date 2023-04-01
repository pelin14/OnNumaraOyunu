package com.example.onnumaraoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText cevap1,cevap2,cevap3,cevap4,cevap5,cevap6,cevap7,cevap8,cevap9,cevap10;
    private Button onaylaButton;
    private int bilinen_sayi = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cevap1 = findViewById(R.id.cevap1);
        cevap2 = findViewById(R.id.cevap2);
        cevap3 = findViewById(R.id.cevap3);
        cevap4 = findViewById(R.id.cevap4);
        cevap5 = findViewById(R.id.cevap5);
        cevap6 = findViewById(R.id.cevap6);
        cevap7 = findViewById(R.id.cevap7);
        cevap8 = findViewById(R.id.cevap8);
        cevap9 = findViewById(R.id.cevap9);
        cevap10 = findViewById(R.id.cevap10);

        onaylaButton=findViewById(R.id.onaylaButton);



        Random r = new Random();
        String sayi = "";
        int cekilen_sayi = 0;
        int uretilen_sayi;


        ArrayList<Integer> sayilar = new ArrayList<>();

        do{
            uretilen_sayi = (int)(Math.random() * 80) + 1;
            if(!sayi.contains(String.valueOf(uretilen_sayi))){
                sayilar.add(uretilen_sayi);
                sayi += String.valueOf(uretilen_sayi);
                cekilen_sayi++;
            }
        }while(cekilen_sayi != 22);

        onaylaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0 ; i<sayilar.size() ; i++){
                    if(cevap1.getText().toString().equals(String.valueOf(sayilar.get(i)))){
                        bilinen_sayi++;
                    }
                    if(cevap2.getText().toString().equals(String.valueOf(sayilar.get(i)))){
                        bilinen_sayi++;
                    }
                    if(cevap3.getText().toString().equals(String.valueOf(sayilar.get(i)))){
                        bilinen_sayi++;
                    }
                    if(cevap4.getText().toString().equals(String.valueOf(sayilar.get(i)))){
                        bilinen_sayi++;
                    }
                    if(cevap5.getText().toString().equals(String.valueOf(sayilar.get(i)))){
                        bilinen_sayi++;
                    }
                    if(cevap6.getText().toString().equals(String.valueOf(sayilar.get(i)))){
                        bilinen_sayi++;
                    }
                    if(cevap7.getText().toString().equals(String.valueOf(sayilar.get(i)))){
                        bilinen_sayi++;
                    }
                    if(cevap8.getText().toString().equals(String.valueOf(sayilar.get(i)))){
                        bilinen_sayi++;
                    }
                    if(cevap9.getText().toString().equals(String.valueOf(sayilar.get(i)))){
                        bilinen_sayi++;
                    }
                    if(cevap10.getText().toString().equals(String.valueOf(sayilar.get(i)))){
                        bilinen_sayi++;
                    }

                    ArrayList<String> tahminler = new ArrayList<>();
                    tahminler.add(cevap1.getText().toString());
                    tahminler.add(cevap2.getText().toString());
                    tahminler.add(cevap3.getText().toString());
                    tahminler.add(cevap4.getText().toString());
                    tahminler.add(cevap5.getText().toString());
                    tahminler.add(cevap6.getText().toString());
                    tahminler.add(cevap7.getText().toString());
                    tahminler.add(cevap8.getText().toString());
                    tahminler.add(cevap9.getText().toString());
                    tahminler.add(cevap10.getText().toString());

                    Intent intent = new Intent(MainActivity.this,SonucActivity.class);
                    intent.putIntegerArrayListExtra("cekilis",sayilar);
                    intent.putStringArrayListExtra("tahminler",tahminler);
                    intent.putExtra("bilinen",bilinen_sayi);
                    startActivity(intent);

                }
            }
        });









    }
}