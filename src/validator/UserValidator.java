package validator;

import Model.UserModel;
import exception.validatorException;

public class UserValidator {

    private UserValidator(){}

    public static boolean stringIsBlank(final String value){
        return value == null || value.trim().isBlank();
    }

    public static boolean lengthRange(final int value){
        return value < 3 || value > 25;
    }

    public static void verifyModel(final UserModel model) throws validatorException {
        if (stringIsBlank(model.getName())) {
            throw new validatorException(" ---> " + model.getName() + "\n Invalid name!");
        }
        if (lengthRange(model.getName().length())) {
            throw new validatorException(" ---> " + model.getName() + "\n Length of name must be between 3 and 20 caracteres!");
        }
        if (stringIsBlank(model.getEmail())) {
            System.out.println();
            throw new validatorException(" ---> " + model.getEmail() + "\n Invalid email!");
        }
        if (lengthRange(model.getEmail().length())) {
            throw new validatorException(" ---> " + model.getEmail() + "\n Length of name must be between 3 and 20 caracteres!");
        }
        if (!model.getEmail().contains("@") || !model.getEmail().contains(".com")) {
            throw new validatorException(" ---> " + model.getEmail() + "\n Email must have @ and .com!");
        }
    }

}
