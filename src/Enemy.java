public abstract class Enemy {
    String name;
    int might;
    boolean isHostile;
    static int countEnemies = 0;

    public Enemy(String name, int might, boolean isHostile)
    {
        this.name = name;
        this.might = might;
        this.isHostile = isHostile;
        countEnemies++;
    }

    public Enemy()
    {
        this.name = null;
        might = 0;
        isHostile = true;
        countEnemies++;
    }//end null construc

    public String getName() {
        return name;
    }

    public int getMight() {
        return might;
    }

    public void setMight(int might) {
        this.might = might;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", might=" + might +
                ", isHostile=" + isHostile +
                '}';
    }
}
