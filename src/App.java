import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Classt, Fo, De, Co, Ca, In, Sa, Ra;
        String Nome;

        System.out.println("Escolha a sua classe:");
        System.out.println("1. Bárbaro");
        Classt = sc.nextInt();
        sc.nextLine();

        System.out.println("Escolha a sua raça:");
        System.out.println("1. Humano");
        System.out.println("2. Anão");
        System.out.println("3. Elfo");
        System.out.println("4. Meio-Orc");
        Ra = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite seu nome: ");
        Nome = sc.nextLine();

        System.out.println("Digite sua força: ");
        Fo = sc.nextInt();
        System.out.println("Digite sua destreza: ");
        De = sc.nextInt();
        System.out.println("Digite sua constituição: ");
        Co = sc.nextInt();
        System.out.println("Digite seu carisma: ");
        Ca = sc.nextInt();
        System.out.println("Digite sua sabedoria: ");
        Sa = sc.nextInt();
        System.out.println("Digite sua inteligencia: ");
        In = sc.nextInt();

        if (Classt == 1) {
            Barberian p1 = new Barberian(Fo, De, Co, Sa, In, Ca, "Barbaro", Ra, Nome);
            p1.Status();
        }
    }
}
