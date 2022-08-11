public final class ImmutableExample {  
    private final String teacher;  
    ImmutableExample(final String teacher) {  
    this.teacher = teacher;  
    }  
    public final String getName() {  
    return teacher;  
    }  
// Remember we can not use setName methods so take it out of the code      
    //public final setName(String teacher) {  
    //this.s = teacher;  
    //}  
    public static void main(String[] args) {  
    ImmutableExample obj = new ImmutableExample("Nancy Ripplinger");  
    System.out.println(obj.getName()); 
    //ImmutableExample obj = new ImmutableExample("Jane Doe");  
    //System.out.println(obj.getName()); 
    }  
    }  