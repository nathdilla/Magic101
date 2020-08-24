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

    //getters

    public int getMight() {
        return might;
    }

    public String getName() {
        return name;
    }


    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setHostile(boolean hostile) {
        isHostile = hostile;
    }

    public void setMight(int might) {
        this.might = might;
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

    //toString **test output method


    @Override
    public String toString() {
        return super.toString() + "\n hasFire: " + hasFire
                + "\nWing span: " + wingSpan;
    }
}
