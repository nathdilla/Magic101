public class Dragon extends Enemy{
    //inst. var
    boolean hasFire;
    double wingSpan;


    //construc
    public Dragon(String dragonName, int might, boolean isHostile, boolean hasFire, double wingSpan)
    {
        super(dragonName,might,isHostile);
        this.hasFire = hasFire;
        this.wingSpan = validateWingSpan(wingSpan);
    }//end all construct

    public Dragon()
    {
        super();
        this.hasFire = false;
        this.wingSpan = 0;
    }//end null construc
//getters n setters
    public void setWingSpan(double wingSpan) {
        this.wingSpan = validateWingSpan(wingSpan);
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public double validateWingSpan (double wingSpan)
    {
        while (wingSpan < 0)
        {
            System.out.println("You can't have negative Wings. Try again.");
            wingSpan++; //********delete later when user input
        }
        return wingSpan;
    }//end method validateWingSpan

    public String shootFire(int distance)
    {
        if (hasFire == true)
        {
            if (distance < 50)
            {
                return "You got burned!";
            }
            else
            {
                return "Miss-fire!";
            }
        }
        else
        {
            return "I have no fire!";
        }
    }

    //toString **test output method


    @Override
    public String toString() {
        return super.toString() + "\n hasFire: " + hasFire
                + "\nWing span: " + wingSpan;
    }
}
