import machine.Machine;

import java.util.Scanner;

public class Main {

    private static final Scanner in = new Scanner(System.in);
    private static final Machine machine = new Machine();

    public static void main(String[] args) {

        System.out.println("Bienvenue !");
        System.out.println("Que souhaitez vous faire ?");
        while(true) {
            displayChoices();
            int choice = Integer.parseInt(in.nextLine());
            switch (choice) {
                case 1:
                    programCard();
                    break;
                case 2:
                    reprogramCard();
                    break;
                case 3:
                    cancelCard();
                    break;
                case 4:
                    bookRoom();
                    break;
                case 5:
                    unbookRoom();
                    break;
                case 6:
                    looseCard();
                    break;
                case 7:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Je n'ai pas compris, veuillez réessayer.");
                    break;
            }
        }
    }

    public static void displayChoices() {
        System.out.println("1 - Programmer une carte");
        System.out.println("2 - Reprogrammer une carte");
        System.out.println("3 - Annuler une carte");
        System.out.println("4 - Prendre une chambre");
        System.out.println("5 - Rendre une chambre");
        System.out.println("6 - Une carte a été perdue");
        System.out.println("7 - Quitter");
        System.out.println("Réponse : ");
    }

    public static void looseCard() {
        System.out.println("Entrez le numéro de la carte perdue.");
        System.out.println("Réponse : ");
        int cardId = Integer.parseInt(in.nextLine());
        machine.looseCard(cardId);

        System.out.println("La carte " + cardId + " est maintenant notée comme perdue.");
    }

    public static void unbookRoom() {
        System.out.println("Entrez le numéro de chambre à rendre.");
        System.out.println("Réponse : ");
        int roomId = Integer.parseInt(in.nextLine());
        machine.unbookRoom(roomId);

        System.out.println("La chambre " + roomId + " a bien été rendue.");
    }

    public static void bookRoom() {
        System.out.println("Entrez le numéro de chambre à réserver");
        System.out.println("Réponse : ");
        String roomId = in.nextLine();
        System.out.println("Entrez votre nom");
        System.out.println("Réponse : ");
        String nom = in.nextLine();
        machine.bookRoom(roomId, nom);

        System.out.println("La chambre " + roomId + " est maintenant occupée par " + nom + ".");
    }

    public static void programCard() {
        System.out.println("Entrez le numéro de carte à programmer");
        System.out.println("Réponse : ");
        int cardId = Integer.parseInt(in.nextLine());
        System.out.println("Entrez le numéro de chambre à affecter à la carte");
        System.out.println("Réponse : ");
        String roomId = in.nextLine();
        machine.programCard(cardId, roomId);

        System.out.println("Le numéro de chambre " + roomId + " a bien été affecté à la carte " + cardId + ".");
    }

    public static void reprogramCard() {
        System.out.println("Entrez le numéro de carte à reprogrammer");
        System.out.println("Réponse : ");
        int cardId = Integer.parseInt(in.nextLine());
        System.out.println("Entrez le numéro de chambre à affecter à la carte");
        System.out.println("Réponse : ");
        String roomId = in.nextLine();
        machine.reprogramCard(cardId, roomId);

        System.out.println("Le numéro de chambre " + roomId + " a bien été affecté à la carte " + cardId + ".");
    }

    public static void cancelCard() {
        System.out.println("Entrez le numéro de la carte à annuler");
        System.out.println("Réponse : ");
        int cardId = Integer.parseInt(in.nextLine());
        machine.cancelCard(cardId);

        System.out.println("La carte " + cardId + " a bien été annulée.");
    }
}
