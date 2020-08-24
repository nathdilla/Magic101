public class Monster extends Enemy{
    //inst. var
    String terrain;

    //construc
    public Monster(String dragonName, int might, boolean isHostile, String terrain)
    {
        super(dragonName,might,isHostile);
        this.terrain = terrain;
    }//end all construct

    public Monster()
    {
        super();
        this.terrain = "land";
    }//end null construc;

    //toString **test output method

    public String mightReact()
    {
        if (might < 10)
        {
            return "Weak!";
        }else if (might >=10)
        {
            return "Careful!";
        }else
        {
            return "Woah!";
        }
    }

    public String compareTerrain()
    {
        if (terrain.equalsIgnoreCase("land"))
        {
            return "You can run away";
        }
        else if (terrain.equalsIgnoreCase("water"))
        {
            return "You can swim away";
        }
        else
            {
            return "Bummer for you!";
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n terrain : " + terrain;
    }
}
