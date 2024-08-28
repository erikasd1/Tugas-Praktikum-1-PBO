public class MahasiswaBeraksi {
    public static void main(String[] args){
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();
        
        mahasiswa1.name = "Erika Sita Dewi";
        mahasiswa1.npm = 231070078;
        mahasiswa1.detail();
        mahasiswa1.membaca();
        mahasiswa1.nyontek();
        mahasiswa1.modifikasi();
        
        System.out.println();
        
        mahasiswa2.name = "Dewi Sita Erika";
        mahasiswa2.npm = 231040123;
        mahasiswa2.detail();
        mahasiswa2.membaca();
        mahasiswa2.nyontek();
        mahasiswa2.modifikasi();
    }
}
