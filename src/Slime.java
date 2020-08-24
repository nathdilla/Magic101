public class Slime extends Enemy{
    //inst. var
    int size;


    //construc
    public Slime(String dragonName, int might, boolean isHostile, int size)
    {
        super(dragonName,might,isHostile);
        this.size = validateSize(size);
    }//end all construct

    public Slime()
    {
        super();
        this.size = 5;
    }//end null construc

    public String sizeReact()
    {
        if (size <= 5)
        {
            return "I am puny";
        }
        else if (size > 5 && size <=10)
        {
            return "I am a possible threat.";
        }
        else
        {
            return "I am a HUGE threat. Run away while you can.";
        }
    }

    public int validateSize (int size)
    {
        while (size < 0)
        {
            System.out.println("You can't have negative size. Try again.");
            size++; //********delete later when user input
        }
        return size;
    }//end method validateWingSpan
    //toString **test output method


    @Override
    public String toString() {
        return super.toString() + "\n Size : " + size;
    }
}
