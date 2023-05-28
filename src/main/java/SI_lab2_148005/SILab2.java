
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public static boolean function (User user, List<User> allUsers) { // step 1
        if (user==null || user.getPassword()==null || user.getEmail()==null){ // step 2
            throw new RuntimeException("Mandatory information missing!"); // step 3
        }

        if (user.getUsername()==null){ // step 4
            user.setUsername(user.getEmail());// step 5
        }

        int same = 1;// step6
        if (user.getEmail().contains("@") && user.getEmail().contains(".")) {// step 7
            same = 0;// step 8
            for (int i=0;i<allUsers.size();i++) {    //step 9
                User existingUser = allUsers.get(i);  //step 10
                if (existingUser.getEmail() == user.getEmail()) { //step 11
                    same += 1; //step 12
                }
                if (existingUser.getUsername() == user.getUsername()) {  //step 13
                    same += 1;  //step 14
                }
            } //step 15
        }

        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}"; //step 16
        String password = user.getPassword();  //step 17
        String passwordLower = password.toLowerCase(); //step 18

        if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8) { //step 19
            return false; // step 20
        }
        else {
            if (!passwordLower.contains(" ")) { //step 21
                for (int i = 0; i < specialCharacters.length(); i++) {  //step 22
                    if (password.contains(String.valueOf(specialCharacters.charAt(i)))) {  //step 23
                        return same == 0;   //step 24
                    }
                } //step 25
            }
        }
        return false; //step 26
    } //step 27

}