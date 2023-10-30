import java.util.Scanner;
public class AutoCompleteAndTemplates {
    private String nama;
    private int umur;

    public void Informatika (String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        AutoCompleteAndTemplates Hafis = new AutoCompleteAndTemplates();
        Hafis.tampilkanInformasi();
        Hafis.setNama("Pras");
        Hafis.setUmur(35);
        Hafis.tampilkanInformasi();
    }
}
