 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoquilometragem;

import java.util.Scanner;

/**
 *
 * @author rodrigo.gregori
 */
public class CalculoQuilometragem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kms;
        int litros;
        int kmsTotal = 0;
        int litrosTotal = 0;
        double media;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos km vc fez ou digite -1 para terminar? ");
        kms = entrada.nextInt();

        while (kms >= 0) {
            System.out.println("quantos litros utilizou?");
            litros = entrada.nextInt();

            kmsTotal = kmsTotal + kms;
            litrosTotal = litrosTotal + litros;
            media = (double) kms / litros;

            System.out.printf("%nA media igual : %.2f", media);
            System.out.printf("%nOs kms totais : %d", kmsTotal);
            System.out.printf("%nTotal de litros: %d ", litrosTotal);

            System.out.printf("%nQuantos km vc fez ou digite -1 para terminar? ");
            kms = entrada.nextInt();

        }
    }

}
