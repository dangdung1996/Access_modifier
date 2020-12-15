package mypack;
import pack.*;
public class B {
    public static void main(String[] args) {
        A obj = new A();
        obj = new A();
        obj.msg();
        //protected
        class B extends A{

            public static void main(String args[]){

                B obj = new B();

                obj.msg();

            }

            //public
            class B{

                public static void main(String args[]){

                    A obj = new A();

                    obj.msg();

                }

            }
}
