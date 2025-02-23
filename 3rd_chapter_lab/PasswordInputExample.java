import javax.swing.*;

public class PasswordInputExample {
    public static void main(String[] args) {
        JPasswordField passwordField = new JPasswordField();
        int option = JOptionPane.showConfirmDialog(null, passwordField, "Enter Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if(option == JOptionPane.OK_OPTION) {
            char[] password = passwordField.getPassword();
            System.out.println("Password: " + new String(password));
        } else {
            System.out.println("User canceled the dialog");
        }
    }
}
