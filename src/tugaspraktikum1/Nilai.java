public class Nilai {
    int NIM;
    String name;
    double absen, tugas, UTS, UAS, akhir;
    
    void Nilai(){
        System.out.println("NIM: " +this.NIM);
        System.out.println("Nama: " +this.name);
        this.absen = absen *0.1;
        this.tugas = tugas*0.2;
        this.UTS = UTS*0.3;
        this.UAS = UAS*0.4;
        this.akhir = (this.absen + this.tugas + this.UTS + this.UAS);
    }
    
    void CetakNilai(){
        System.out.println("Nilai Absen [10%]: " +this.absen);
        System.out.println("Nilai Tugas[20%]: " +this.tugas);
        System.out.println("Nilai UTS[30%]: " +this.UTS);
        System.out.println("Nilai UAS[40%]: " +this.UAS);
        System.out.println("Nilai Akhir: " +this.akhir);
    }
}
