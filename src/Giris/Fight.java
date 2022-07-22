package Giris;

public class Fight {
    String name;
    int damage;
    int healt;
    int weight;
    int chance;

    Fight(String name, int damage, int healt, int weight,int chance){
        this.name = name;
        this.damage = damage;
        this.healt = healt;
        this.weight = weight;
        this.chance = chance;

    }

    int hit(Fight oppenent){
        System.out.println(this.name+ " ==> "+oppenent.name+" "+this.damage+" hasar vurdu.");

        if(oppenent.healt-this.damage<0)
            return 0;
        return oppenent.healt - this.damage;
    }
    boolean isChance(){
        double randomNumber = Math.random()*10;
        return randomNumber <= this.chance;

    }
}
