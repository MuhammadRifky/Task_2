/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 * @author Muhammad Rifky Putra Ananda
 * 1301154404
 */
public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String Status;
    private char Nilai[];
    private int i;
    
    public Mahasiswa() {
        i = 0;
        Status = "Tidak Lulus";
        Nilai = new char[10];
    }
    
    public Mahasiswa(String NIM, String Nama){
        this.NIM = NIM;
        this.Nama = Nama;
        i = 0;
        Status = "Tidak Lulus";
        Nilai = new char[10];
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    public char getNilai(int i){
        return Nilai[i];
    }
    
    public void addNilai(char Nilai){
        if(i < 10){
            this.Nilai[i] = Nilai;
            i++;
        }
    }
    
    public char cekNilai(Mahasiswa m){
        char no = 'X';
        for(char indeks = 'A'; indeks < 'E'; indeks++){
            for(int a = 0; a < 10; a++){
                if(Nilai[a] == indeks){
                    for(int b = 0; b < m.i; b++){
                        if(m.Nilai[b] == indeks){
                            return indeks;
                        }
                    }
                }
            }
        }
        return no;
    }
    
    public String toString(){
        String mhs;
        int j;
        mhs = NIM+"_"+Nama+"_"+Status+"_Nilai = ";
        for(j = 0; j < i; j++){
            mhs = mhs + Nilai[j] + ", ";
        }
        return mhs;
    }
}
