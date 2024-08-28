public class Mahasiswa {
    String name;
    int npm;
    
    void detail(){
        System.out.println("Nama Mahasiswa: " +this.name);
        System.out.println("NPM Mahasiswa: " +this.npm);
    }
    
    void membaca(){
        System.out.println("Mahasiswa diminta untuk membaca petunjuk pengerjaan tugas.");
    }
    
    void nyontek(){
        System.out.println("Saat mengerjakan tugas, mahasiswa dilarang menyontek.");
    }
    
    void modifikasi(){
        System.out.println("Mahasiswa dapat memodifikasi contoh program yang ada.");
    }
}
