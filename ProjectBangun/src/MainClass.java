
import BangunRuang.Balok;
import BangunRuang.Bola;
import BangunRuang.Tabung;
import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangundatar.PersegiPanjang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("======================================");
        Persegi persegi = new Persegi();
        System.out.println("Persegi");
        persegi.tampilHasil();
        System.out.println("======================================");
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("Lingkaran");
        lingkaran.tampilHasil();
        System.out.println("======================================");
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        System.out.println("Persegi Panjang");
        persegiPanjang.tampilHasil();
        System.out.println("======================================");
        Tabung tabung = new Tabung();
        System.out.println("Tabung");
        tabung.tampilHasil();
        System.out.println("======================================");
        Balok balok = new Balok();
        System.out.println("Balok");
        balok.tampilHasil();
        System.out.println("======================================");
        Bola bola = new Bola();
        System.out.println("Bola");
        bola.tampilHasil();
        System.out.println("======================================");
    }
}
