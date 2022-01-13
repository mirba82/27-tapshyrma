package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        /*Box деген generic класс тузунуз.
Ичинде Box деген объектти кайтарган статический generic метод болсун.*/

      Box<Box>box = new Box<>();
      box.setValue(new Box());
      box.method(box);
     // box.setValue(45);


    }

}
