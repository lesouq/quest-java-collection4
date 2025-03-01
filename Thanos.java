import java.util.Comparator;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
;
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        Comparator<Hero> coparator = new Comparator<Hero>(){
            @Override
            public int Compare(Hero orig, Hero compare){
                return orig.getname().compareTo(compare.getName());
            }
        };
        Map<Hero, Flower> treeparty = new TreeMap<>(comparator);
        treeParty.put(hulk, rose);
        treeparty.put(thor, rose);
        treeparty.put(scarletWitch, rose);
        treeparty.put(captainAmerica, lily);
        treeparty.put(doctorStrange, violet);
        treeparty.put(blackWidow, violet);
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet

        // TODO 2 : Print if `begonia` is contained in the TreeMap
        System.out.println(treeParty.containsValue(begonia));
        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        for(Hero hero : treeParty.keyset()){
            Flower flower = treeParty.get(hero);
            System.out.println(flower.getName());
        }
    }
}
