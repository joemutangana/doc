package calculator;

public class Calculate {
    
    void sum(){
        System.out.println("This is for summing up your values");
    }

    private void sub(){
        System.out.println("This is for making the different between two values");

    }

    protected void mult(){
        System.out.println("You want multiplication? here I am!");
    }

    public void division(){
        System.out.println("You want to distribute something? Call me!");
    }
    
    protected void getSub(){
        System.out.println("You will view the sub");
        sub();
    }
}
