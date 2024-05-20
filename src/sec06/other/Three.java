package sec06.other;

import sec06.One;

public class Three {//다른패키지 다른클래스
    void print(){
        One o = new One();
        //System.out.println(o.secret);
        //System.out.println(o.roommate);
        //System.out.println(o.child);
        System.out.println(o.anybody);
    }
}
