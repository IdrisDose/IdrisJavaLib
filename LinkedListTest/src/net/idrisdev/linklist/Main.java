package net.idrisdev.linklist;

/**
 * Created by d0se on 7/04/17.
 */
public class Main {

    public static void main(String[] args) {
        IntList intList = new IntList();
        GenList list = new GenList<String>();

        list.append("String");
        list.append("StringTwo");

        intList.append(3);
        intList.append(5);

        intList.printData();
        list.printData();
    }
}
