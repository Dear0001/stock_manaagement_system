import org.kshrd.pp.group3.utils.InputValidator;

import java.util.Scanner;

public class TestValidationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputValidator validator = new InputValidator();
//        do {
//            String option = validator.validateChooseOption();
//            System.out.println(option);
//            System.out.print("y to continue, n to quit! : ");
//            char ch = sc.nextLine().charAt(0);
//            System.out.println(ch);
//            if(ch == 'n' || ch == 'N'){
//                break;
//            }
//        }while(true);

        System.out.println(validator.select1_Or_0());
        System.out.println(validator.validateSelectYOrB());

        //validator.validationSelectBetween2("[0-1]", "Choose 0 or 1 : ", "Please input only 0 or 1!");
        //validator.validationSelectBetween2("\\b(y|n)\\b", "Choose y or n : ", "Please input only y or n!");

    }
}
