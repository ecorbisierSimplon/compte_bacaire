import java.util.*;

public class Statistiques {

    public static void main(String[] args) {
        System.setProperty("console.encoding", "UTF-16");

        int nbCB = 0, nbCheque = 0, nbVirement = 0, nbDebit = 0;
        float prctCB, prctCh, prctVi;

        Scanner lectureClavier = new Scanner(System.in);

        System.out.println(" Nombre de paiement par Carte Bleue : ");
        nbCB = lectureClavier.nextInt();
        System.out.println(" Nombre de cheque : ");
        nbCheque = lectureClavier.nextInt();
        System.out.println(" Nombre de virements : ");
        nbVirement = lectureClavier.nextInt();

        nbDebit = nbCB + nbCheque + nbVirement;

        prctCB = (float) nbCB / nbDebit * 100;
        prctCh = (float) nbCheque / nbDebit * 100;
        prctVi = (float) nbVirement / nbDebit * 100;

        System.out.println("Vous avez emis " + nbDebit + " ordres de debits");
        System.out.println("dont " + prctCB + " par Carte Bleue");
        System.out.println("     " + prctCh + " par cheque");
        System.out.println("     " + prctVi + " par virement");

        lectureClavier.close();
    }
}