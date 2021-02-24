import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random meuRandom = new Random();
        int jogadaA = meuRandom.nextInt(6);
        int jogadaB = meuRandom.nextInt(6);

        System.out.println("Jogada A - Par - " + jogadaA);
        System.out.println("Jogada B - Ímpar - " + jogadaB);

        if (((jogadaA+jogadaB)%2) == 0){
            System.out.println("Jogador A ganhou!");
        }else{
            System.out.println("Jogador B ganhou!");
        }
    }
}