public class Main {
    public static void main(String[] args) {

        int deposit = 100; // начальный депозит
        int donate = 28000; // сумма пополнения счета
        int bonus = donate  / 100; // количество бонусов
        if (donate > 999) {
            System.out.println("Сумма на вашем счете " + (deposit + donate + bonus) + "руб");
            System.out.println(" Количество начисленных оператором бонусов " + bonus +"руб");
        } else {
            System.out.println(" Бонусы не начислены ");
        }
    }
}

