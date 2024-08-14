public class Tea {
    void prepareRecipe(){
        boilWater();
        steepTeaBag ( );
        pourInCup ( );
        addLemon ();
    }

    public void boilWater(){
        System.out.println("Boiling Water");
    }
    public void steepTeaBag ( ) {
        System.out.println ("Steeping the Tea");
    }
    public void pourInCup ( ) {
        System.out.println("Pouring into cup");
    }
    public void addLemon ( ) {
        System.out.println ("Adding Lemon");
    }
}
