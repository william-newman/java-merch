package merch.validators;

import merch.models.User;

public class UserValidator {

    // Declaration
    private User user;

    // Constructor
    public UserValidator(User user) {
        this.user = user;
    }

    // Validation methods
    public boolean validData() {
        return true;
    }
    // TODO: user validation
}
