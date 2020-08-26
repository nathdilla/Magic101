public class Sorcerer {
    String name;
    int might;
    int health;
    String spell;
    boolean isBoy;
    boolean isVisible = true;


    //constructor full
    public Sorcerer(String name, int might, int health, String spell, boolean isBoy)
    {
        this.name = name;
        this.might = might;
        this.health = health;
        this.spell = spell;
        this.isBoy = isBoy;
    }
    //def constructor
    public Sorcerer()
    {
        this.name = null;
        this.might = 5;
        this.health = 10;
        this.spell = "vanish";
        this.isBoy = true;
    }

    //getters n setters

    public int getMight() {
        return might;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public String getSpell() {
        return spell;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMight(int might) {
        this.might = might;
    }

    public void setBoy(boolean boy) {
        isBoy = boy;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public boolean vanish(String spell)
    {
        if (spell == "vanish")
        {
            if (isVisible == true)
            {
                isVisible = false;
            }
            else
            {
                isVisible = true;
            }
            return isVisible;
        }
        else
        {
            return false;
        }
    }

    public String strike(int might)
    {
        if (might < 5)
        {
            return spell + " was not effective!";
        }
        else
        {
            return spell + " was effective!";
        }
    }

    @Override
    public String toString() {
        return "Sorcerer{" +
                "name='" + name + '\'' +
                ", might=" + might +
                ", health=" + health +
                ", spell='" + spell + '\'' +
                ", isBoy=" + isBoy +
                ", isVisible=" + isVisible +
                '}';
    }
}
