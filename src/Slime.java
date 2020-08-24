public class Slime extends Enemy{
    //inst. var
    int size;


    //construc
    public Slime(String dragonName, int might, boolean isHostile, int size)
    {
        super(dragonName,might,isHostile);
        this.size = size;
    }//end all construct

    public Slime()
    {
        super();
        this.size = 5;
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


    @Override
    public String toString() {
        return super.toString() + "\n Size : " + size;
    }
}
