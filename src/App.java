public class App {

    public static void main(String[] args) {
            //Contoh penggunaan polimorfisme dinamis pada member sebuah minimarket
            Member regulerMember = new MemberReguler();
            Member silverMember = new MemberSilver();
            Member goldMember = new MemberGold();
            Member platinumMember = new MemberPlatinum();

            double jumlahBayar1 = regulerMember.hitungTotalBayar(7000000);
            double jumlahBayar2 = silverMember.hitungTotalBayar(7000000);
            double jumlahBayar3 = goldMember.hitungTotalBayar(7000000);
            double jumlahBayar4 = platinumMember.hitungTotalBayar(7000000);

            System.out.println("Total bayar member reguler :" +jumlahBayar1);
            System.out.println("Total bayar member silver :" +jumlahBayar2);
            System.out.println("Total bayar member gold :" +jumlahBayar3);
            System.out.println("Total bayar member platinum :" +jumlahBayar4);
    }
}