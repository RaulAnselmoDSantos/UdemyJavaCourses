
import DAO.UserDAOv2;
import Model.UserModel;
import enums.MenuAccountOptions;
import exception.EmptyStorageException;
import exception.UserNotFoundException;
import exception.validatorException;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import static validator.UserValidator.verifyModel;

public class MainUserDAOv2ExceptionExecise {

    private final static UserDAOv2 dao = new UserDAOv2();

    private final static Scanner sc = new Scanner(System.in);

    public static String Options() {
        StringBuilder builder = new StringBuilder();
        builder.append("====================================\n").append("\n");
        builder.append("===== Chose an option =====").append("\n");
        builder.append("==================================").append("\n");
        builder.append("Opção 1 - Register").append("\n");
        builder.append("Opção 2 - Update Account").append("\n");
        builder.append("Opção 3 - Delete Account").append("\n");
        builder.append("Opção 4 - Find by Identify Number").append("\n");
        builder.append("Opção 5 - List All").append("\n");

        builder.append("Opção 0 - Leave").append("\n");
        return builder.toString();
    }

    private static UserModel validateInputs(long id,
                                            String name,
                                            String email,
                                            LocalDate birthdate) throws validatorException {
        UserModel user = new UserModel(id, name, email, birthdate);
        verifyModel(user);
        return user;
    }

    public static UserModel requestUserCREATE() throws validatorException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        long id = 0;
        System.out.println("Type the name of the User: ");
        var name = sc.next();
        System.out.println("Type the email of the User: ");
        var email = sc.next();
        System.out.println("Type the birthdate of the User dd/MM/yyyy: ");
        var birthdateStr = sc.next();

        LocalDate birthdate =  LocalDate.parse(birthdateStr, formatter);

        return validateInputs(id, name, email, birthdate);
    }

    public static UserModel requestUserUPDATE() throws validatorException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Type the ID of the User: ");
        long id = sc.nextInt();
        System.out.println("Type the name of the User: ");
        var name = sc.next();
        System.out.println("Type the email of the User: ");
        var email = sc.next();
        System.out.println("Type the birthdate of the User dd/MM/yyyy: ");
        var birthdateStr = sc.next();

        LocalDate birthdate =  LocalDate.parse(birthdateStr, formatter);

        return validateInputs(id, name, email, birthdate);
    }

    public static long requestUserId(){
        System.out.println("Type the ID of the User: ");
        return sc.nextInt();
    }


    public static void main(String[] args) {

        int option = -1;

        do{
            System.out.println(Options());
            var userInput = sc.nextInt();
            var selectedOption = MenuAccountOptions.values()[userInput];

            switch (selectedOption) {
                //Opção 1 - Register
                case CREATE -> {
                    try{
                        System.out.println("Saving User");
                        dao.save(requestUserCREATE());
                    }catch (validatorException ex){
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
                    }
                }
                //Opção 2 - Update Account
                case UPDATE -> {
                    try{
                        System.out.println("Updating User");
                        dao.update(requestUserUPDATE());
                    }catch (UserNotFoundException | EmptyStorageException ex){
                        System.out.println(ex.getMessage());
                    }catch (validatorException ex){
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
                    }
                }
                //Opção 3 - Delete Account
                case DELETE -> {
                    try{
                        System.out.println("Deleting User");
                        dao.deleteById(requestUserId());
                    }catch (UserNotFoundException | EmptyStorageException ex){
                        System.out.println(ex.getMessage());
                        sc.nextLine();
                    }catch (InputMismatchException  ex){
                        System.out.println("Type only numbers");
                        sc.nextLine();
                    }finally {
                        System.out.println("====================================");
                    }
                }
                //Opção 4 - Find by Identify Number
                case FIND_BY_ID -> {
                    try{
                        System.out.println("Finding User");
                        var user = dao.findById(requestUserId());
                        System.out.println(user);
                    }catch (UserNotFoundException | EmptyStorageException ex){
                        System.out.println(ex.getMessage());
                    }
                }
                //Opção 5 - List All
                case FIND_ALL -> {
                    try{
                        System.out.println("Listing Users");
                        var users = dao.findAll();
                        users.forEach(System.out::println);
                    }catch (EmptyStorageException ex){
                        System.out.println(ex.getMessage());
                    }
                }
                //Opção 0 - Leave
                case EXIT -> {
                    System.out.println("Thanks for coming!");
                    option = 0;
                }
                default -> {
                    System.out.println("Invalid option");
                    System.out.println("Press any key to continue...");
                    sc.nextLine();
                }
            }
        }while(option != 0);

    }
}
