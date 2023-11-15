// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Hero person = new Hero(400, 30, "CriticalStrike");
        Hero person2 = new Hero(300, 20, "ComboHits");
        System.out.println("Health:" + person.getHealth() + " Damage:" + person.getDamage() + " Skill:" + person.getSkill());
        System.out.println("Health:" + person2.getHealth() + " Damage:" + person2.getDamage());


        Boss kraken = new Boss();
        kraken.setBossHealth(1000);
        kraken.setBossDamage(50);
        kraken.setDefenceType("Physical");
        System.out.println("BossHealth:" + kraken.getBossHealth() + " BossDamage:" + kraken.getBossDamage() + " BossDefenceType:" + kraken.getDefenceType());


        System.out.println(createHeroes());
        Hero[] heroes = createHeroes();

        for (Hero hero :heroes
             ){
            System.out.println("HeroHealth:"+hero.getHealth() + " HeroDamage:" + hero.getDamage() + " HeroSkill:" +hero.getSkill());
        }

    }

    public static Hero[] createHeroes(){

        Hero[] heroes = new Hero[3];

        heroes[0] = new Hero(250, 20, "Reincarnation");
        heroes[1] = new Hero(220, 10, "Stan");
        heroes[2] = new Hero(270, 15);

        return heroes;
    }
}

