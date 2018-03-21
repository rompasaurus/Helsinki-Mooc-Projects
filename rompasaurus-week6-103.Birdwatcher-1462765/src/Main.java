import java.util.Scanner;
public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        String command ="";
        BirdDB birds = new BirdDB();
        String name = " ";
        String latinName = " ";
        menu();
        while(!command.equals("Quit")){
            command = reader.nextLine();
            if(command.equals("Add")){
                System.out.print("Name: ");
                name = reader.nextLine();
                System.out.println("Latin Name: ");
                latinName = reader.nextLine();
                //Bird bird = new Bird(name,latinName);
                birds.addBird(new Bird(name,latinName));
            }else if(command.equals("Observation")){
                System.out.print("What was observed:? ");
                name = reader.nextLine();
                if(!birds.isBird(name)){
                   System.out.println("Is not a bird!"); 
                }
            }else if(command.equals("Statistics")){
                birds.printBirdStats();
            }else if(command.equals("Show")){
                System.out.print("What? ");
                name = reader.nextLine();
                birds.printBirdStats(name);
            }else{
               System.out.println("Try again");
           }
        }   
        }

    
    public static void menu(){
        System.out.println("Type a command");
        System.out.println("Add - adds a bird ");
        System.out.println("Observation - adds an observation");
        System.out.println("Statistics");
        System.out.println("Show - prints one bird");
        System.out.println("Quit - terminates the program");
    }

}
