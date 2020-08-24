public abstract class Enemy {
    String name;
    int might;
    boolean isHostile;

    public Enemy(String name, int might, boolean isHostile)
    {
        this.name = name;
        this.might = might;
        this.isHostile = isHostile;
    }

    public Enemy()
    {
        this.name = null;
        might = 0;
        isHostile = true;
    }//end null construc

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", might=" + might +
                ", isHostile=" + isHostile +
                '}';
    }
}
