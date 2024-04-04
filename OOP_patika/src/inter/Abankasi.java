package inter;

public class Abankasi implements IBanka {
    private String bankaAdi;
    private String terminalID;//refactorlayıp adı değiştirirsen hepsi değişir
    private String password;

    public Abankasi(String bankaAdi, String terminalID, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalID = terminalID;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAdress) {
        System.out.println("Kullanıcı ip: " + ipAdress);
        System.out.println("Makina ip: " + this.hostIdAdress);
        System.out.println(this.bankaAdi + "  Bağlanıldı !");
        return true;
    }

    @Override
    public boolean payment(String cardNumber, double price, String expiryDate, String cvc) {
        System.out.println("Bakadan cevap bekleniyor ...");
        System.out.println("İşlem başarılı oldu");
        return true;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
