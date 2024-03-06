package org.kshrd.pp.group3.views;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Scanner;

public class InsertProductView {
    Scanner scanner=new Scanner(System.in);
    public void Header(){
        CellStyle numberStyle = new CellStyle(CellStyle.HorizontalAlign.CENTER);
        CellStyle numberStyle1 = new CellStyle(CellStyle.HorizontalAlign.LEFT);
        Table t = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND_HEADER_AND_COLUMNS);
        t.setColumnWidth(0, 100, 120);

        t.addCell("PRODUCT OPTION", numberStyle);
        t.addCell("      W) Write      R) Read        U) Update      D) Delete      ",numberStyle1 );
        t.addCell("      S) Search     Se) Set Row    S) Save        Un) Unsaved      ",numberStyle1 );
        t.addCell("      B) Backup     R) Restore     H)elp          E) Exit      ",numberStyle1 );

        System.out.println(t.render());
        System.out.print("=> Choose an option () :");

    }

    public void insertProduct(){
        System.out.println("=======> Input Information about Product <=======");
        System.out.print("->Input product Name :");
        String productname=scanner.nextLine();
        System.out.print("->Input Unit Price : ");
        String unitPrice=scanner.nextLine();
        System.out.print("->Input Quantity :");
        String qty=scanner.nextLine();
    }
    public void option(){
        do {
            Header();
            String option=scanner.nextLine();
            switch (option){
                case "w":
                    insertProduct();
                    break;
                case "r":
                    break;
                case "u":
                    break;
                case "d":
                    break;
                case "s":
                    break;
                case "se":
                    break;
                case "sa":
                    break;
                case "un":
                    break;
                case "ba":
                    break;
                case "re":
                    break;
                case "e":
                    System.exit(0);
                    break;
            }
        }while (true);
    }

    public static void main(String[] args) {
        InsertProductView insertProductView=new InsertProductView();
        insertProductView.option();
    }


}