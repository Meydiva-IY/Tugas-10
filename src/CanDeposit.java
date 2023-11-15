public interface CanDeposit {
    //Interface bisa deposit 
    public Integer cekSaldo();
    public void deposit(Integer jumlahDeposit);
    public void tarikTunai(Integer jumlahTarikTunai);
}