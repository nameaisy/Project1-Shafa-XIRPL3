/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiRestauran;

/**
 *
 * @author names
 */
public class Minuman extends Menu {
    public Minuman(String nama_minum, double harga){
        setNamaMenu(nama_minum);
        setHarga(harga);
        setKategori("Minuman");
    }
}
