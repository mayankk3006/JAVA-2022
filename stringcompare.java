public class stringcompare{
    public static void main(String[] args) {
        String name="Mayank";
        String title="kumar";

        if(name.equals(title)){
            System.out.println("They are equal");
        
        }
        else{
            System.out.println("they are not equal");
        }

            //DO NOT USE == to check for string equality
       //Gives correct answer here
       if(name == title) {
        System.out.println("They are the same string");
    } else {
        System.out.println("They are different strings");
    }

    //Gives incorrect answer here
    if(new String("Tony") == new String("Tony")) {
        System.out.println("They are the same string");
    } else {
        System.out.println("They are different strings");
    }

    }
}