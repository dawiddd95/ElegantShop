package com.elegantshop;


import com.elegantshop.api.UserRegisterLoginFacade;
import com.elegantshop.model.User;
import com.elegantshop.facade.UserRegisterLoginFacadeImpl;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void startMenu() {
        System.out.println("MANAGEMENT MENU");
        System.out.println("1 - Zaloguj się");
        System.out.println("2 - Zarejestruj się");
        System.out.println("0 - Wyjdź");
    }

    public static void main(String[] args) {
        UserRegisterLoginFacade userFacade = UserRegisterLoginFacadeImpl.getInstance();
        boolean appOn = true;
        boolean loggedOn = false;
        int read;

        while (appOn) {
            startMenu();
            read = scanner.nextInt();

            switch (read) {
                case 1:
                    System.out.println("Podaj login:");
                    String loginLog = scanner.next();
                    System.out.println("Podaj hasło:");
                    String passwordLog = scanner.next();
                    if (userFacade.loginUser(loginLog, passwordLog)) {
                        loggedOn = true;
                        System.out.println("Zalogowałeś się!");
                    } else {
                        System.out.println("Niepoprawne dane!");
                    }
                    break;
                case 2:
                    System.out.println("Podaj login:");
                    String loginReg = scanner.next();
                    System.out.println("Podaj hasło:");
                    String passwordReg = scanner.next();
                    User user = new User(1L, loginReg, passwordReg);
                    if (userFacade.registerUser(user)) {
                        System.out.println("Zarejestrowałeś się!");
                    } else {
                        System.out.println("Cos poszło nie tak!");
                    }
                    break;
                case 0:
                    appOn = false;
                    break;
            }
        }


    }
}
