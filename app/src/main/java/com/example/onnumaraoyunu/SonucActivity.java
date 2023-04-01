package com.example.onnumaraoyunu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;

import com.example.onnumaraoyunu.databinding.ActivitySonucBinding;

import java.util.ArrayList;

public class SonucActivity extends AppCompatActivity {

    private ActivitySonucBinding tasarim;
    private int ikramiye;
    private ArrayList<Integer> sonuclar;
    private ArrayList<String> tahminler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_sonuc);

        sonuclar = getIntent().getIntegerArrayListExtra("cekilis");
        tahminler = getIntent().getStringArrayListExtra("tahminler");
        int bilinen_adet = getIntent().getIntExtra("bilinen",0);


        tasarim.sonuc1.setText(String.valueOf(sonuclar.get(0)));
        tasarim.sonuc2.setText(String.valueOf(sonuclar.get(1)));
        tasarim.sonuc3.setText(String.valueOf(sonuclar.get(2)));
        tasarim.sonuc4.setText(String.valueOf(sonuclar.get(3)));
        tasarim.sonuc5.setText(String.valueOf(sonuclar.get(4)));
        tasarim.sonuc6.setText(String.valueOf(sonuclar.get(5)));
        tasarim.sonuc7.setText(String.valueOf(sonuclar.get(6)));
        tasarim.sonuc8.setText(String.valueOf(sonuclar.get(7)));
        tasarim.sonuc9.setText(String.valueOf(sonuclar.get(8)));
        tasarim.sonuc10.setText(String.valueOf(sonuclar.get(9)));
        tasarim.sonuc11.setText(String.valueOf(sonuclar.get(10)));
        tasarim.sonuc12.setText(String.valueOf(sonuclar.get(11)));
        tasarim.sonuc13.setText(String.valueOf(sonuclar.get(12)));
        tasarim.sonuc14.setText(String.valueOf(sonuclar.get(13)));
        tasarim.sonuc15.setText(String.valueOf(sonuclar.get(14)));
        tasarim.sonuc16.setText(String.valueOf(sonuclar.get(15)));
        tasarim.sonuc17.setText(String.valueOf(sonuclar.get(16)));
        tasarim.sonuc18.setText(String.valueOf(sonuclar.get(17)));
        tasarim.sonuc19.setText(String.valueOf(sonuclar.get(18)));
        tasarim.sonuc20.setText(String.valueOf(sonuclar.get(19)));
        tasarim.sonuc21.setText(String.valueOf(sonuclar.get(20)));
        tasarim.sonuc22.setText(String.valueOf(sonuclar.get(21)));

        tasarim.secilen1.setText(tahminler.get(0));
        tasarim.secilen2.setText(tahminler.get(1));
        tasarim.secilen3.setText(tahminler.get(2));
        tasarim.secilen4.setText(tahminler.get(3));
        tasarim.secilen5.setText(tahminler.get(4));
        tasarim.secilen6.setText(tahminler.get(5));
        tasarim.secilen7.setText(tahminler.get(6));
        tasarim.secilen8.setText(tahminler.get(7));
        tasarim.secilen9.setText(tahminler.get(8));
        tasarim.secilen10.setText(tahminler.get(9));


        renklendir();
        tasarim.adetTxt.setText(String.valueOf(bilinen_adet));
        ikramiye_hesapla(bilinen_adet);
        tasarim.ikramiyeTxt.setText(String.valueOf(ikramiye + " TL"));

    }
    public void ikramiye_hesapla(int sayi){
        if(sayi == 0){
            this.ikramiye = 10;
        }
        else if(sayi == 6){
            this.ikramiye = 1000;
        }
        else if(sayi == 7){
            this.ikramiye = 5000;
        }
        else if(sayi == 8){
            this.ikramiye = 25000;
        }
        else if(sayi == 9){
            this.ikramiye = 5000000;
        }
        else if(sayi == 10){
            this.ikramiye = 1000000000;
        }
        else{
            this.ikramiye = 0;
        }
    }
    public void renklendir(){
        if(sonuclar.contains(Integer.parseInt(tasarim.secilen1.getText().toString()))){
            ViewCompat.setBackgroundTintList(tasarim.secilen1,ColorStateList.valueOf(Color.parseColor("#49F40A")));
        }
        if(sonuclar.contains(Integer.parseInt(tasarim.secilen2.getText().toString()))){
            ViewCompat.setBackgroundTintList(tasarim.secilen2,ColorStateList.valueOf(Color.parseColor("#49F40A")));
        }
        if(sonuclar.contains(Integer.parseInt(tasarim.secilen3.getText().toString()))){
            ViewCompat.setBackgroundTintList(tasarim.secilen3,ColorStateList.valueOf(Color.parseColor("#49F40A")));
        }
        if(sonuclar.contains(Integer.parseInt(tasarim.secilen4.getText().toString()))){
            ViewCompat.setBackgroundTintList(tasarim.secilen4,ColorStateList.valueOf(Color.parseColor("#49F40A")));
        }
        if(sonuclar.contains(Integer.parseInt(tasarim.secilen5.getText().toString()))){
            ViewCompat.setBackgroundTintList(tasarim.secilen5,ColorStateList.valueOf(Color.parseColor("#49F40A")));
        }
        if(sonuclar.contains(Integer.parseInt(tasarim.secilen6.getText().toString()))){
            ViewCompat.setBackgroundTintList(tasarim.secilen6,ColorStateList.valueOf(Color.parseColor("#49F40A")));
        }
        if(sonuclar.contains(Integer.parseInt(tasarim.secilen7.getText().toString()))){
            ViewCompat.setBackgroundTintList(tasarim.secilen7,ColorStateList.valueOf(Color.parseColor("#49F40A")));
        }
        if(sonuclar.contains(Integer.parseInt(tasarim.secilen8.getText().toString()))){
            ViewCompat.setBackgroundTintList(tasarim.secilen8,ColorStateList.valueOf(Color.parseColor("#49F40A")));
        }
        if(sonuclar.contains(Integer.parseInt(tasarim.secilen9.getText().toString()))){
            ViewCompat.setBackgroundTintList(tasarim.secilen9,ColorStateList.valueOf(Color.parseColor("#49F40A")));
        }
        if(sonuclar.contains(Integer.parseInt(tasarim.secilen10.getText().toString()))){
            ViewCompat.setBackgroundTintList(tasarim.secilen10,ColorStateList.valueOf(Color.parseColor("#49F40A")));
        }
    }




}