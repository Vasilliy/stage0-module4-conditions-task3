package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        int pr;

        if (salary <= 10000 && salary > 0) {
            pr = 15;
            System.out.println((double) salary * (100 - pr) / 100);
        } else if (salary > 10000 && salary <= 20000) {
            pr = 18;
            System.out.println((double) salary * (100 - pr) / 100);
        } else if (salary > 20000) {
            pr = 20;
            System.out.println((double) salary * (100 - pr) / 100);
        } else {

            System.out.println("wrong input!");
        }
    }
}