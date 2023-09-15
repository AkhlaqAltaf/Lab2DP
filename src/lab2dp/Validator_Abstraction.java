
package lab2dp;

interface Validator {

    // this is validator will use for validating email
    public boolean emailValidator(String email);

    // this method will use for validating passeword
    public boolean passwordValidator(String password);
    // this is for message

    public String message(String message);
}
