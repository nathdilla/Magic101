public class MagicDriver
{
    public static void main(String[] args)
    {
        //create obj
        Dragon happy = new Dragon("Happy",20,true,true);
        Dragon nobody = new Dragon();
        //print object toString
        System.out.println(happy.toString());
        System.out.println(nobody.toString());

        happy.setName("Sad");
        System.out.println("Happy is now called " + happy.getName());
        System.out.println(happy.toString());
    }//end main
}//end driver class
