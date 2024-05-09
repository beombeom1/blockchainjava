package Die;

class EvenDie extends Die{
    void roll(){
        super.roll();
        int number = super.getNumber();
        //int number =
        if (number % 2 ==0)
            super.setNumber(number);
        else
            super.setNumber(number+1);
    }
}