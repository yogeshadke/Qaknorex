package Qaknorex;

public class PrisonerWarn {
    public void printPrisonerToWarn(int n, int m, int s) {
      
        int position = (s + m - 1) % n;
       
        if (position == 0) {
            position = n;
        }
        System.out.println("Prisoner to warn: " + position);
    }

    public static void main(String[] args) {
        PrisonerWarn prisonerWarn = new PrisonerWarn();
       
        prisonerWarn.printPrisonerToWarn(5, 2, 1); 
       
        prisonerWarn.printPrisonerToWarn(5, 2, 2); 
    }
}
