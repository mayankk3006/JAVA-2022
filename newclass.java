 class Student {
            String name;
            String color;
            int age;

            public void write(){
                System.out.println("Writing something");

            }  

            public void printcolor(){
                System.out.println(this.color);
            }

            public void printinfo(){
                System.out.println(this.name);
                System.out.println(this.age);
            }
          //user defined constructor follows
                Student(Student s2){
                this.age=s2.age;
                this.name=s2.name;
            }
            Student(){
                
            }
}

public class newclass{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Mayank";
        s1.age=22;
        s1.printinfo();
        
      Student s2=new Student(s1);
        
        //NAME OF CLASS STARTS FROM CAPITAL LETTER 
        
    }
} 