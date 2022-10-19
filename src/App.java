import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Classt, Fo, De, Co, Ca, In, Sa, Ra;
        String Nome;

        System.out.println(
                "Escolha a sua classe: \n 1. Bárbaro \n 2. Bruxo \n 3. Bardo \n 4. Clérigo \n 5. Druida \n 6. Feiticeiro \n 7. Guerreiro \n 8. Ladino \n 9. Mago \n 10. Monge \n 11. Paladino \n 12. Patrulheiro");
        Classt = sc.nextInt();
        sc.nextLine();

        System.out.println(
                "Escolha a sua raça: \n 1. Humano \n 2. Anão \n 3. Elfo \n 4. Meio-Orc \n 5. Halfling \n 6. Draconato \n 7. Gnomo \n 8. Meio-elfo \n 9. Tiefling");
        Ra = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite seu nome: ");
        Nome = sc.nextLine();

        System.out.println(
                "Agora você irá escolher os seus atributos, você possui os valores 15 14 13 12 10 e 8 para distribuir entre eles, você não poderá repetir os valores!");

        // Atributos do jogador
        System.out.println("Digite sua força: ");
        Fo = sc.nextInt();
        System.out.println("Digite sua destreza: ");
        De = sc.nextInt();
        // Sistema anti-trapaça
        if (Fo == De) {
            System.out.println("ERRO! VOCÊ TRAPACEOU");
        } else {
            System.out.println("Digite sua constituição: ");
            Co = sc.nextInt();
            if (Co == Fo || Co == De) {
                System.out.println("ERRO! VOCÊ TRAPACEOU ");
            } else {
                System.out.println("Digite seu carisma: ");
                Ca = sc.nextInt();
                if (Ca == Fo || Ca == De || Ca == Co) {
                    System.out.println("ERRO! VOCÊ TRAPACEOU ");
                } else {
                    System.out.println("Digite sua sabedoria: ");
                    Sa = sc.nextInt();
                    if (Sa == Ca || Sa == Co || Sa == De || Sa == Fo) {
                        System.out.println("ERRO! VOCÊ TRAPACEOU ");
                    } else {
                        System.out.println("Digite sua inteligencia: ");
                        In = sc.nextInt();
                        if (In == Sa || In == Ca || In == Co || In == De || In == Fo) {
                            System.out.println("ERRO! VOCÊ TRAPACEOU ");
                        } else {
                            // Sub-Raça do jogador ##EM DESENVOLVIMENTO##
                            // Classe do jogador
                            if (Classt == 1) {
                                Barberian p1 = new Barberian(Fo, De, Co, Sa, In, Ca, "Barbaro", Ra, Nome);
                                p1.Status();
                            }
                        }
                    }
                }
            }
        }

    }
}
