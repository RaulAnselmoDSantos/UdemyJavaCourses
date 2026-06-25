package Model.entities;

public class PetMachine {
    private boolean clean = true;
    private int shampoo = 10;
    private int water = 30;

    private Pet pet;

    public PetMachine() {}

    public boolean isClean() {
        return clean;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    public boolean hastPet() {
        if (pet != null) {
            System.out.println("Yes the Pet is: " +  pet.getName());
            return true;
        }
        return false;
    }

    public void cleanMachine() {
        if (water > 3 && shampoo > 1) {
            water -= 3;
            shampoo -= 1;
            clean = true;
        } else {
            System.out.println("Water: " + water + ", Shampoo: " + shampoo);
            System.out.println("There are not water or shampoo, you need 3L of Water and 1L of Shampoo");
        }
        System.out.println("The Machine are clean now!");
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        if (this.pet.isClean()) {
            System.out.println("The pet " + this.pet.getName() + " has been cleaned!");
        } else {
            System.out.println("The pet " + this.pet.getName() + " has been removed too early!");
        }
        this.pet = null;
        System.out.println("The Pet has been removed!");
    }

    public void setPet(Pet pet) {
        if (!isClean()) {
            System.out.println("Clean the Machine fist!");
            return;
        }
        if (hastPet()) {
            System.out.println("The pet " + pet.getName() + " are inside!");
            return;
        }
        this.pet = pet;
        System.out.println("The Pet has been inside!");
    }

    public void takeAShower() {
        if (!hastPet()) {
            System.out.println("Put the pet in the machine!");
            return;
        }
        if (water < 10 || shampoo < 2) {
            System.out.println("Supply the Machine first!");
            return;
        }
        water -= 10;
        shampoo -= 2;
        this.pet.setClean(true);
        System.out.println("The pet " + pet.getName() + " is clean!");
    }

    public void addWater() {
        if (water >= 30) {
            System.out.println("The Machine are full of water!");
        } else {
            water += 2;
            System.out.println("You supplied Water sucessfully! +2L");
        }
    }

    public void addShampoo() {
        if (shampoo >= 10) {
            System.out.println("The Machine are full of shampoo!");
            return;
        }
        shampoo += 2;
        System.out.println("You supplied Shampoo sucessfully! +2L");
    }


}
