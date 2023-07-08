package prgms.spring_week1.io;

import prgms.spring_week1.menu.Menu;

import java.util.Scanner;

public class Input {
    private final Scanner sc = new Scanner(System.in);

    public String inputString() {
        return sc.nextLine();
    }

    public Menu selectMenu() {
        String selectOption = this.inputString();
        return Menu.findMenuType(selectOption);
    }

    public Integer insertDiscountValue() {
        int discountValue = Integer.parseInt(this.inputString());

        return discountValue;
    }

}
