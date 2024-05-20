package Die;

public class OddDie extends Die{

    //Constructor(생성자)
    OddDie(String name){
        super(name);
    }
    void roll(){
        super.roll();
        int number = super.getNumber();
        //int number =
        if (number % 2 !=0)
            super.setNumber(number);
        else
            super.setNumber(number-1);
    }

}