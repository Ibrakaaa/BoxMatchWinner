package Giris;

public class Match {
    Fight f1;
    Fight f2;
    int minWeight;
    int maxWeight;
    Fight oppenent;


    Match(Fight f1, Fight f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.oppenent = f1;

    }

    void go() {
        if (isCheck()) {
            while (this.f1.healt > 0 && this.f2.healt > 0) {
                System.out.println("===== YENI ROUND========");
                if(oppenent.isChance()){
                    System.out.println("Maca: "+this.f2.name+ " basliyor.");
                    this.f2.healt = f1.hit(f2);
                    if(isWin()){
                        break;
                    }

                }
                if(f1.isChance()){
                    System.out.println("Maca: "+this.f1.name+ " basliyor.");
                    this.f1.healt = f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                }



                System.out.println(this.f1.name + " kalan saglik : " + this.f1.healt);
                System.out.println(this.f2.name + " Kalan saglik : " + this.f2.healt);

            }

        } else {
            System.out.println("Sporcularin Sikletleri Uymuyor...");

        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);

    }

    boolean isWin() {
        if (this.f2.healt == 0) {
            System.out.println("Kazanan: " + this.f1.name);
            return true;
        }
        if (this.f1.healt == 0) {
            System.out.println("Kazanan: " + this.f2.name);
            return true;

        }return false;
    }
}







