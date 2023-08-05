package com.oop;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Child extends Base{
    
    public static void main(String[] args) {
        Child child=new Child();
        
        Class<Child> class1  = child.getClass();
        Field[] fields = child.getClass().getFields();
        if(fields!=null && fields.length!=0){
            for (Field field : fields) {
                System.out.println(field.getName());
            }
        }
        System.out.println(Arrays.toString(fields));
    
    }

}
