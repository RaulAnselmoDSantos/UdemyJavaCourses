import Model.entities.Pet;
import Model.entities.PetMachine;

import java.util.Scanner;

public class MainPetShowerMachine {

    public static String Options() {
        StringBuilder builder = new StringBuilder();
        builder.append("====================================\n").append("\n");
        builder.append("===== Chose an option =====").append("\n");
        builder.append("==================================").append("\n");
        builder.append("Opção 1 - Has pet in the Machine?").append("\n");
        builder.append("Opção 2 - Put the pet in the Machine").append("\n");
        builder.append("Opção 3 - Supply water to the Machine").append("\n");
        builder.append("Opção 4 - Supply Shampoo to the Machine").append("\n");
        builder.append("Opção 5 - Verify the water level").append("\n");
        builder.append("Opção 6 - Verify the Shampoo level").append("\n");
        builder.append("Opção 7 - Give the pet a beth").append("\n");
        builder.append("Opção 8 - Remove the pet of the Machine").append("\n");
        builder.append("Opção 9 - Clean the Machine").append("\n");
        builder.append("Opção 0 - Leave").append("\n");
        return builder.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = -1;
        PetMachine Pm = new PetMachine();
        do{
            System.out.println(Options());
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                //Opção 1 - Has pet in the Machine?
                case 1:
                    System.out.println("Has Pet: " + Pm.hastPet());
                    break;
                //Opção 2 - Put the pet in the Machine
                case 2:
                    if (!Pm.hastPet()) {
                        System.out.println("Enter the Pet's name: ");
                        String pName = sc.nextLine();
                        Pet pet = new Pet(pName);
                        System.out.println("Pet " + pet.getName() + " has been created.");
                        Pm.setPet(pet);
                    } else {
                        System.out.println("The Machine only bath one pet by time");
                    }

                    break;
                //Opção 3 - Supply water to the Machine
                case 3:
                    Pm.addWater();
                    break;
                //Opção 4 - Supply Shampoo to the Machine
                case 4:
                    Pm.addShampoo();
                    break;
                //Opção 5 - Verify the water level
                case 5:
                    System.out.println("Amount of Water: " + Pm.getWater());
                    break;
                //Opção 6 - Verify the Shampoo level
                case 6:
                    System.out.println("Amount of Shampoo: " + Pm.getShampoo());
                    break;
                //Opção 7 - Give the pet a beth
                case 7:
                    Pm.takeAShower();
                    break;
                //Opção 8 - Remove the pet of the Machine
                case 8:
                    Pm.removePet();
                    break;
                //Opção 9 - Clean the Machine
                case 9:
                    Pm.cleanMachine();
                    break;
                //Opção 0 - Leave
                case 0:
                    System.out.println("Thanks for coming!");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            if (option != 0) {
                System.out.println("Press any key to continue...");
                sc.nextLine();
            }
        }while(option != 0);

    }

}

