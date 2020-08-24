public class Monster extends Enemy{
    //inst. var
    int regenAmt;
    String terrain;

    //construc
    public Monster(String dragonName, int might, boolean isHostile,  int regenAmt)
    {
        super(dragonName,might,isHostile);
        this.regenAmt = regenAmt;
    }//end all construct

    public Monster()
    {
        super();
        this.regenAmt = 5;
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
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "\n regenAmt : " + regenAmt;
    }
}
