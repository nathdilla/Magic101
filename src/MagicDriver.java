import java.util.ArrayList;

public class MagicDriver
{
    public static void main(String[] args)
    {
        //create obj
        Dragon happy = new Dragon("Happy", 20, false, true, -5);
        Dragon nobody = new Dragon();
        Monster ogre = new Monster("OgreBob", 15, true, "air");
        Monster nothing = new Monster();
        Slime joe = new Slime("Joe", 12, true, 2);
        Slime noone = new Slime();
        Sorcerer apprentice = new Sorcerer("apprentice", 7, 16, "vanish", false);
        Sorcerer who = new Sorcerer();

        ArrayList<Enemy> enemyArrayList = new ArrayList<>();
        enemyArrayList.add(happy);
        enemyArrayList.add(nobody);
        enemyArrayList.add(ogre);
        enemyArrayList.add(nothing);

        System.out.printf("Watch out, there are %d enemies attacking! %n%n", Enemy.countEnemies);

        //print object toString
        for (int i = 0; i < enemyArrayList.size(); i++)
        {
            System.out.println(enemyArrayList.get(i));
        }

        System.out.println(apprentice.toString());
        System.out.println(who.toString());

        nobody.setWingSpan(-2);
        System.out.println(nobody.toString());

        System.out.println(ogre.mightReact());
        System.out.println(ogre.compareTerrain());

        System.out.println(joe.sizeReact());
        joe.setSize(-5);
        joe.setSize(7);
        System.out.println(joe.sizeReact());
        joe.setSize(23);
        System.out.println(joe.sizeReact());

        System.out.println(happy.shootFire(2));
        System.out.println(happy.shootFire(20));

        System.out.println(apprentice.strike(1));
        System.out.println(apprentice.strike(6));

        System.out.println("Ogre's might is " + ogre.getMight());
        System.out.println("Happy's wing span is " + happy.getWingSpan());

    }//end main
}//end driver class
