public class CustomCredentialCheckException extends Exception {
    public CustomCredentialCheckException(String message) {
        super(message);
    }
    public static boolean checkLogin(String username, String pwd)
    throws  CustomCredentialCheckException {
        if(username.equals("admin") && pwd.equals("12345")) {
            return true;
        }
        else {
            throw new CustomCredentialCheckException("Invalid credentials");
        }
    }
	

}
