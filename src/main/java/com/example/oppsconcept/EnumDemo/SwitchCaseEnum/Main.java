package com.example.oppsconcept.EnumDemo.SwitchCaseEnum;

public class Main {

    public static void main(String[] args) {

        Day day = Day.SUNDAY;
        // NEW Switch Cse

        String res = switch (day){
            case MONDAY -> "M";
            case SUNDAY -> "Sun";
            default -> "Weenkend";
        };

        System.out.println(res);

        // OLD Switch case
//        switch (day){
//            case MONDAY:{
//                System.out.println("Today is Monday  :)  ");
//                break;
//            }
//            case TUESDAY:{
//                System.out.println("Today is Tuesday");
//                break;
//            }
//        }
    }
}
