// public fields can be access from anywhere class , package

// private fields cant be access outside the class or package 
//as well as you cant extend 


//  protected can be access in class ,inherit and only within the
//same package


// defualt only in class and same package 


import newpackage.Rand;


public class Main {
    
    
    public static void main(String[] args) {
        
        
       Testing obj = new Testing();
       
       obj.name = "sharnjit" ;
      
       obj.pro ="sharnjit" ;
       
       System.out.println(obj.name);
        
        Rand obj1 = new Rand();
        obj1.name = "singh";
     
        
        System.out.println(obj1.name);
        
        
        
    }
    
}
