package Zoo;

//In its most common form, an interface is a group of related methods with empty bodies. Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler. If your class claims to implement an interface, all methods defined by that interface must appear in its source code before the class will successfully compile.
@FunctionalInterface //in this case is even functional because it defines only one abstract method.
 interface Fly {
    void flying();
}
