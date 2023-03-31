package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessUtilities_Test2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
    //  System.out.println(AccessModifiers.defaultData); // not accessible
    //  System.out.println(AccessModifiers.privateData);

  AccessModifiers.method1();
  //AccessModifiers.method2(); // not visible, protected
  //AccessModifiers.method3(); not visible, default
  //AccessModifiers.method4(); not visible, private


    }
}
