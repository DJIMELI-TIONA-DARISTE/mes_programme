public class Player {
   
    private String nName;
    private int nLevel;

    public  Player()
    {
        this.nName="INCONNUE";
        System.out.println("name of player: "+this.nName+ " level of player: " +this.nLevel);

    }
    public Player(String name)
    {
        this.nName=name;
        this.nLevel=1;
        System.out.println("name of player: "+this.nName+ " level of player: " +this.nLevel);
    }
    public Player (String name, int level)
    {
        this.nName=name;
        this.nLevel=level;
        System.out.println("name of player: "+this.nName+ " level of player: " +this.nLevel);
    }

    public void attact() {
        System.out.println(this.nName+" EST ATTAQUER");
        this.nLevel-=1;
        System.out.println("NOUVEAU LEVEL: "+this.nLevel);
    }
}
