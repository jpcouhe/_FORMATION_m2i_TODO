import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayDeque toDo = createTodo();





        int choice = 0;
        String task;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Que voulez vous faire? \n");
            System.out.println("1 - afficher la tache en cours \n");
            System.out.println("2 - valider la tache en cours \n");
            System.out.println("3 - ajouter une tache \n");
            System.out.println("4 - afficher toutes les taches à faire \n");
            System.out.println("5 - partir \n");

            choice = sc.nextInt();


            switch (choice){
                case 1:  System.out.println("La prochaine tache à faire est : " + toDo.getFirst() + "\n") ;
                break;
                case 2 : System.out.println("La prochaine tache à faire est : " + toDo.poll()+ "\n");
                break;
                case 3 :
                    System.out.println("quelle tache voulez vous faire?");
                    task= sc.next();
                    toDo.add(task);
                    System.out.println("tache ajoutée");
                    break;
                case 4 : System.out.println(toDo);
                break;
                case 5 : System.out.println("Fermeture du programme \n");
                break;
            }

        }while(choice != 5);

    //Un utilisateur rentre une clé une valeur et derriere l'utilisateur rentre un nom et retourne la définition

    Map<Integer, String> map = new HashMap<>();
    map.put(1, "truc");

    map.get(1);


    }


    public static ArrayDeque createTodo(){
        int numberTask;
        int count = 0;
        String task;

        ArrayDeque<String> toDo = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Combien de taches voulez vous faire? ");
        numberTask = sc.nextInt();

        do{

            System.out.println("Quelle est la " + (count + 1 )+ " tache que vous voulez faire? \n");
            task= sc.next();
            toDo.add(task);
            numberTask--;
            count++;


        }while (numberTask != 0);

        return toDo;
    };



}