public class Ficha_Personagem {

    // Atributos
    private int Forc, Dex, Con, Sab, Inte, Car;
    private float ModForc, ModDex, ModCon, ModSab, ModInte, ModCar;
    private String Classe, Nome, Raca;
    private int Lvl, Exp;
    private float HpTotal, HpAtual, Ac;
    // Metodos especiais;

    private void setModForc() {
        this.ModForc = (this.Forc - 10) / 2;
    }

    private void setModDex() {
        this.ModDex = (this.Dex - 10) / 2;
    }

    private void setModCon() {
        this.ModCon = (this.Con - 10) / 2;
    }

    private void setModCar() {
        this.ModCar = (this.Car - 10) / 2;
    }

    private void setModInte() {
        this.ModInte = (this.Inte - 10) / 2;
    }

    private void setModSab() {
        this.ModSab = (this.Sab - 10) / 2;
    }
    // Classes e suas feets

    // Metodos publicos
    public void Status() {
        System.out.println("=======================");
        System.out.println("Nome: " + this.Nome);
        System.out.println("Raca: " + this.Raca);
        System.out.println("Classe: " + this.Classe);
        System.out.println("Nivel:" + this.Lvl);
        System.out.println("=======================");
        System.out.println("Forca: " + this.Forc + " / " + this.ModForc);
        System.out.println("Destreza: " + this.Dex + " / " + this.ModDex);
        System.out.println("Constituicao: " + this.Con + " / " + this.ModCon);
        System.out.println("Carisma: " + this.Car + " / " + this.ModCar);
        System.out.println("Sabedoria: " + this.Sab + " / " + this.ModSab);
        System.out.println("Inteligencia: " + this.Inte + " / " + this.ModInte);
        System.out.println("=======================");
        System.out.println("Classe de armadura:" + this.Ac);
        System.out.println("Vida:" + this.HpAtual + " / " + this.HpTotal);
        System.out.println("Exp:" + this.Exp);
        System.out.println("=======================");
    }

    // Construtor
    public Ficha_Personagem(int Forct, int Dext, int Cont, int Sabt, int Intet, int Cart, String Classe, int Raca,
            String Nome) {
        int BrFo, BrDe, BrCo, BrIn, BrCa, BrSa;
        BrFo = 0;
        BrDe = 0;
        BrCo = 0;
        BrIn = 0;
        BrCa = 0;
        BrSa = 0;
        if (Raca == 1) {
            this.Raca = "Humano";
            BrFo = 1;
            BrDe = 1;
            BrCo = 1;
            BrIn = 1;
            BrCa = 1;
            BrSa = 1;
        }
        if (Raca == 2) {
            this.Raca = "Anão";
            BrCo = 2;
            BrFo = 2;
        }
        if (Raca == 3) {
            this.Raca = "Elfo";
            BrDe = 2;
            BrIn = 1;
        }
        if (Raca == 4) {
            this.Raca = "Meio-Orc";
            BrFo = 2;
            BrCo = 1;
        }

        this.Forc = Forct + BrFo;
        this.Dex = Dext + BrDe;
        this.Con = Cont + BrCo;
        this.Sab = Sabt + BrSa;
        this.Inte = Intet + BrIn;
        this.Car = Cart + BrCa;
        this.Lvl = 1;
        this.Exp = 0;
        this.Ac = 10;
        setModForc();
        setModDex();
        setModCon();
        setModSab();
        setModInte();
        setModCar();
        this.Classe = Classe;
        this.Nome = Nome;
    }
}
