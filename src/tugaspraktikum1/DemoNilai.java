public class DemoNilai {
    public static void main(String[] args){
        Nilai nilai1 = new Nilai();
        Nilai nilai2 = new Nilai();
        
        nilai1.NIM = 22106388;
        nilai1.name = "Erika Sita Dewi";
        nilai1.absen = 100;
        nilai1.tugas = 100;
        nilai1.UTS = 100;
        nilai1.UAS = 100;
        nilai1.Nilai();
        nilai1.CetakNilai();
        
        System.out.println();
        
        nilai2.NIM = 22106392;
        nilai2.name = "Dewi Sita Erika";
        nilai2.absen = 90;
        nilai2.tugas = 98;
        nilai2.UTS = 80;
        nilai2.UAS = 70;
        nilai2.Nilai();
        nilai2.CetakNilai();
    }
}
