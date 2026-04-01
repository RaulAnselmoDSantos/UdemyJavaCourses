import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class MainHeritageExercise {
    public static void main(String[] args){

        Account acc = new Account(1001, "Alex", 0.0);

        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        //UP CASTING
        // An object's has is a super class of the down object, so Account (super) can be an BusinessAccount (Subclass of Account)
        Account acc1 = bacc;
        // Also a type who you can instance, so create an object type Account (super class) and attribute to a BusinessAccount (Subclass)
        // Using the constructor of the subclasses
        Account acc2 = new BusinessAccount(1003, "John", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //DOWNCASTING
        // I can't do the same in the opposite, an object with the type of subclass can't receive an object who are one of the superclass type
        // Ex: BusinessAccount = Account without casting = (type of subclass) object who are the type of superclass:
        BusinessAccount acc4 = (BusinessAccount) acc2;
        // Before casting with the right class you can use the attributes of the subclass
        acc4.loan(100.00);

        // Here we are verify the type of the object to do the casting because you can't do the casting between subclasses
        // of the sabe superclass
        // you can't cast the SavingsAccount to BusinessAccount;
        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Updated!");
        }

    }
}
