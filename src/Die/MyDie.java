package Die;

public class MyDie {
    public static void main(String[] args) {
//        Die d1 = new Die();
//        d1.name = "1번";
//        d1.roll();
//        System.out.println(d1.name);
//        System.out.println(d1.getNumber());
//
//        EvenDie d3 = new EvenDie();
//        d3.roll();
//        System.out.println("d3 : " + d3.getNumber());
//
//        Dietest d4 = new Dietest();
//        d4.roll();
//        System.out.println("d4 : " + d4.getNumber());
//
//        OddDie d5 = new OddDie("D5");
//        d5.roll();
//        System.out.println("d5 : " + d5.getNumber());

        Die d1 = new Die("BK");
        EvenDie d2 = new EvenDie();
        OddDie d3 = new OddDie("D3");

        d1.roll();

        Die [] dies = new Die[3];

        dies[0] = d1;
        dies[1] = d2;
        dies[2] = d3;

        for (Die d : dies){
            d.roll();
            System.out.println("Die" + ":" + d.getNumber());
        }

        FairDie d6 = new FairDie();
        d6.roll();
        System.out.println("d6 : " + d6.getNumber());

        WDie d7 = new WDie();
        System.out.println("WDie : " + d7.roll());
    }
}