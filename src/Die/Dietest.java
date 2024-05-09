package Die;

class Dietest extends Die{
    @Override
    void roll() {
        super.roll();
        int number = super.getNumber();
        if(number <= 3)
            super.setNumber(number = 1);
        else
            super.setNumber(number = 6);
    }
}
