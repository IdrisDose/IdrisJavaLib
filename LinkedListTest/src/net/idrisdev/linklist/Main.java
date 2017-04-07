package net.idrisdev.linklist;

/**
 * Created by d0se on 7/04/17.
 */
public class Main {

    public static void main(String[] args) {
        GenList list = new GenList<String>();
        GenList intList = new GenList<Integer>();

        list.append("String");
        list.append("StringTwo");

        for(int i =0; i <= 125; i++){
            intList.append(i);
        }

        intList.prepend(1337);
        intList.prepend((int)intList.getHead()+10);

        list.printData();
        intList.printData();
    }
}
