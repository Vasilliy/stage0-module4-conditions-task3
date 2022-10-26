package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        int january = 31;
        int february = 28;
        int march = 31;
        int april = 30;
        int may = 31;
        int june = 30;
        int july = 31;
        int august = 31;
        int september = 30;
        int october = 31;
        int november = 30;
        int december = 31;


        if ( month==1){
            System.out.println(january);
        }
        else if ( month==2){
            System.out.println(february);
        }
        else if ( month==3){
            System.out.println(march);
        }
        else if ( month==4){
            System.out.println(april);
        }
        else if ( month==5){
            System.out.println(may);
        }
        else if ( month==6){
            System.out.println(june);
        }
        else if ( month==7){
            System.out.println(july);
        }
        else if ( month==8){
            System.out.println(august);
        }
        else if ( month==9){
            System.out.println(september);
        }
        else if ( month==10){
            System.out.println(october);
        }
        else if ( month==11){
            System.out.println(november);
        }
        else if ( month==12){
            System.out.println(december);
        }

        else {
            System.out.println("wrong number!");
        }
        }
    }

