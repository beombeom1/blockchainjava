package Die;

public interface IDie {
    int roll();
    default int getValue(){
        return 0;
    };
}
