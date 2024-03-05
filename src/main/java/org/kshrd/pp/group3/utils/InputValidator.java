package org.kshrd.pp.group3.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputValidator {
    Scanner sc = new Scanner(System.in);

    public String validateOption1(){
        String input;
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        while(true){
            System.out.print("choose option : ");
            input = sc.nextLine();
            if(pattern.matcher(input).matches()){
                break;
            }
            else {
                System.out.println("Invalid input, input only string!");
            }
        }
        return input;
    }

    public void validateEnterPage(){
        //input only number : page 1 and the totalPage
    }

    public int validateNumber() {
        String input;
        Pattern pattern = Pattern.compile("[1-5]");
        while (true) {
            System.out.print("-> Choose an option() : ");
            input = sc.nextLine();
            if (pattern.matcher(input).matches()) {
                break;
            } else {
                System.out.println("Invalid option. Please enter a number between 1 and 5.");
            }
        }
        return Integer.parseInt(input);
    }

    public String validateChooseOption() {
        String input;
        Pattern pattern = Pattern.compile("\\b(f|p|n|l|g|w|r|u|d|s|se|sa|un|ba|re|e)\\b+", Pattern.CASE_INSENSITIVE);
        while (true) {
            System.out.println("f:first, p:previous, n:next l:last, g:goto");
            System.out.print("-> Choose an option() : ");
            input = sc.nextLine();
            if (pattern.matcher(input).matches()) {
                break;
            } else {
                System.out.println("Invalid option, choose above option");
            }
        }
        return input;
    }

    public int select1_Or_0(){
        String input;
        Pattern pattern = Pattern.compile("[0-1]");
        while (true) {
            System.out.print("-> Choose 0 or 1 : ");
            input = sc.nextLine();
            if (pattern.matcher(input).matches()) {
                break;
            } else {
                System.out.println("Invalid option, choose only 0 or 1");
            }
        }
        return Integer.parseInt(input);
    }

    public String validateSelectYOrB(){
        String input;
        Pattern pattern = Pattern.compile("\\b(y|b)\\b", Pattern.CASE_INSENSITIVE);
        while (true) {
            System.out.print("-> Choose Y or B : ");
            input = sc.nextLine();
            if (pattern.matcher(input).matches()) {
                break;
            } else {
                System.out.println("Invalid option, choose only Y or B");
            }
        }
        return input;
    }

    public String validateProductName(){
        String input;
        Pattern pattern = Pattern.compile("^[a-zA-Z]+( [a-zA-Z]+)*$");
        while (true) {
            System.out.print("-> Enter Product Name : ");
            input = sc.nextLine();
            if (pattern.matcher(input).matches()) {
                break;
            } else {
                System.out.println("Invalid input, cannot enter number!");
            }
        }
        return input;
    }

    public double validateUnitPrice(){
        String input;
        Pattern pattern = Pattern.compile("\\d+");
        while (true) {
            System.out.print("-> Enter Product Name : ");
            input = sc.nextLine();
            if (pattern.matcher(input).matches()) {
                break;
            } else {
                System.out.println("Invalid input, cannot enter number!");
            }
        }
        return Double.parseDouble(input);

    }

    public int validateQty(){
        //input only number
        String input;
        Pattern pattern = Pattern.compile("\\d+");
        while (true) {
            System.out.print("-> Enter Product Qty : ");
            input = sc.nextLine();
            if (pattern.matcher(input).matches()) {
                break;
            } else {
                System.out.println("Invalid input, please input only number!");
            }
        }
        return Integer.parseInt(input);
    }

    public String validateUpdateProductName(){
        String input;
        Pattern pattern = Pattern.compile("^[a-zA-Z]+( [a-zA-Z]+)*$");
        while (true) {
            System.out.print("-> Change Product Name to : ");
            input = sc.nextLine();
            if (pattern.matcher(input).matches()) {
                break;
            } else {
                System.out.println("Invalid input, cannot enter number!");
            }
        }
        return input;
    }

    public double validateUpdateUnitPrice(){
        String input;
        Pattern pattern = Pattern.compile("\\d+");
        while (true) {
            System.out.print("-> Change Product Unit Price to : ");
            input = sc.nextLine();
            if (pattern.matcher(input).matches()) {
                break;
            } else {
                System.out.println("Invalid input, cannot enter number!");
            }
        }
        return Double.parseDouble(input);

    }

    public int validateUpdateQty(){
        //input only number
        String input;
        Pattern pattern = Pattern.compile("\\d+");
        while (true) {
            System.out.print("-> Change Product Qty to : ");
            input = sc.nextLine();
            if (pattern.matcher(input).matches()) {
                break;
            } else {
                System.out.println("Invalid input, please input only number!");
            }
        }
        return Integer.parseInt(input);
    }

    public void validateInputIdToUpdate(){
        //input from 1 to total product
    }

    public void validateIdToRestore(){
        //input the id that exist in "List of Backup Data"
    }


}
