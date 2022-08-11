/*
08/10/2022
Per Schloas Demo Mutable Class
created by Nancy Ripplinger
*/
public class MutableExample {  
    private String s;  
    MutableExample(String s) {  
    this.s = s;  
    }  
    public String getName() {  
    return s;  
    }  
    public void setName(String teacher) {  
    this.s = teacher;  
    }  
    public static void main(String[] args) {  
    MutableExample obj = new MutableExample("Nancy Ripplinger");  
    System.out.println(obj.getName());  
// Here, we can update the name using the setName method.  
    obj.setName("Jane Doe");  
    System.out.println(obj.getName()); 
// Just for fun keep resetting teacher
// Here, we can update the name using the setName method.
//Now use this demo and trun it into an Immutable Class     
    }  
    }  
