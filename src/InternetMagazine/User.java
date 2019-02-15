package InternetMagazine;

import java.util.Objects;
import java.util.Scanner;

public class User {

    public String login, password;

    public enum AuthenticationLogin {
        RegisteredUser, User, Admin
    }

    public enum AuthenticationPass {
        regUser, user, admin
    }

    enum Users {
        User1("RegisteredUser", "regUser"), User2("User", "user"), User3("Admin", "admin");
        String login, password;

        Users(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        Users() {
        }
    }


    static Users log, pass;


    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    public void authentication() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose one from list and write login");
        if (scan.hasNextLine()) {
            login = scan.nextLine();
            System.out.println("Write password");
            password = scan.nextLine();
        }
        switch (login) {
            case "RegisteredUser":
                if (password.equals(AuthenticationPass.regUser.toString())) {
                    System.out.println("Hello " + AuthenticationLogin.RegisteredUser);
                } else {
                    System.out.println("Error");
                }
                break;
            case "User":
                if (password.equals(AuthenticationPass.user.toString())) {
                    System.out.println("Hello " + AuthenticationLogin.User);
                }
                break;
            case "Admin":
                if (password.equals(AuthenticationPass.admin.toString())) {
                    System.out.println("Hello " + AuthenticationLogin.Admin);
                }
                break;

            default:
                System.out.println("Hello new user");
        }

    }

    public void list(Users User1) {
        System.out.println("User login: " + User1.login + ". User password: " + User1.password);
    }
}
