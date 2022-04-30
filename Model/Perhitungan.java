package Model;

import Interface.CthInterface;

public class Perhitungan implements CthInterface {
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(int _a,int _b,int _hasil){
        this.a = _a;
        this.b = _b;
        this.hasil = 0;
        this.hasil = _hasil;
        PrintJudulClass("judul dlm method perhitungan");

    }
    private void PrintJudulClass(String jdl){
        System.out.println(jdl);
    }
    @Override
    public void PrintJudul() {
        // TODO Auto-generated method stub
        System.out.println("judul gunakan interface");
    }
    @Override
    public void HitungPertambahan() {
        // TODO Auto-generated method stub
        this.hasil = this.a+this.b;
    }
    @Override
    public void HitungPerkalian() {
        // TODO Auto-generated method stub
        this.hasil = this.a*this.b;
    }
    public int hitungptmbh(int angka1,int angka2){
        this.a = angka1;
        this.b = angka2;
        HitungPertambahan();
        return this.hasil;
    }
    public int hitungkali(int angka3,int angka4){
        this.a = angka3;
        this.b = angka4;
        HitungPerkalian();
        return this.hasil;
    }
}

    

