import java.util.Scanner;
import java.util.Random;


public class DungeonHeroes {
   //constants
   //chances of getting different variety of rooms
   //0-70 monster
   //71-81 store
   //82-90 1d4 basic treasures
   //91-92 1d2 advanced treasures
   //93 1 epic treasure (unguarded)
   //94-99 exit
   public static final int MONSTER_CHANCE = 70;
   public static final int STORE_CHANCE = 81;
   public static final int BASIC_TREASURE_CHANCE = 90;
   public static final int ADVANCED_TREASURE_CHANCE = 92;
   public static final int EPIC_TREASURE_CHANCE = 93;
   public static final int EXIT_CHANCE = 99;
   
   
   //global variables
   public static Player g_player; //all information for the player.
   public static Scanner input; //handles player input
   public static Random rand; //handles random numbers
   public static MonsterList monsters; //stores the types of monsters
   

   public static void main(String[] args) {
      System.out.println("Welcome to Dungeon Heroes!");
      System.out.println();
      
      //setup global variables
      input = new Scanner(System.in);
      rand = new Random();
      monsters = new MonsterList();
   
      createCharacter(); //player chooses their player class
      g_player.status(); //tests player & shows status
      
      //main loop
      boolean playGame = true;
      //startRoom(); //starting room      
      while(playGame) {
         playGame = false;
      }
         
   
   }// end main
   
   public static void createCharacter() {
      //name
      System.out.print("What name would you like to be know by hero?");
      Scanner input = new Scanner(System.in);
      String name = input.nextLine();
      System.out.println("Welcome " + name + "!");
      
      //check for class
      boolean validClass = false;
      while (!validClass) {
         System.out.print("Do you want to play a mighty (W)arrior or cunning (T)hief?");
         String response = input.nextLine().toUpperCase();
         if(response.substring(0,1).equals("W")) {
            //warrior
            validClass = true;
            g_player = new Player(name, "WARRIOR");
         } else if(response.substring(0,1).equals("T")) {
            //thief
            validClass = true;
            g_player = new Player(name, "THIEF");
         } else {
            System.out.println("Invalid Class. Please choose (W)arrior or(T)hief!");
         }
      }
      
   }// end chooseClass
   
   //startRoom the starting room
   //return String (the first character of the players response)
   public static String startRoom(Scanner input) {
      System.out.println("Three months ago, you set out from your village looking for glory and riches.");
      System.out.println("After a long journey into the mountains, you came across a cave.");
      System.out.println("You hear horrible noises coming from inside. Do you want to (E)nter or (L)eave?");
      
   return "E";

   }
   

}//end DungeonHeroes