import Model.Perhitungan;

public class JlnPerhitungan {

    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4, 6, 0);

        s.PrintJudul();

        int HasilPertambahan = s.hitungptmbh(4, 6);
        System.out.println(HasilPertambahan);

        int HasilPerkalian = s.hitungkali(4, 6);
        System.out.println(HasilPerkalian);
    }
    
}
