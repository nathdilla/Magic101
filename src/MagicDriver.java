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
        //print object toString
        System.out.println(happy.toString());
        System.out.println(nobody.toString());

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
    }//end main
}//end driver class
