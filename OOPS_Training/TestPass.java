class Fish {
    String name;

    public Fish(String name) {
        this.name = name;
    }
}

class Croc {
    String name;

    public Croc(String name) {
        this.name = name;
    }

    public void eatCaseA(Fish f) {
        System.out.println("[Case A] " + this.name + " is eating " + f.name);
        f = null;
    }

    public void eatCaseB(Fish f) {
        System.out.println("[Case B] " + this.name + " is eating " + f.name);
        f = new Fish("Flippy");
    }

    public void eatCaseC(Fish f) {
        System.out.println("[Case C] " + this.name + " is eating " + f.name);
        f.name = "Flippy";
    }

    public void eatCaseD(Fish f) {
        if (f == null) {
            System.out.println("[Case D] No fish to eat!");
        } else {
            System.out.println("[Case D] " + this.name + " is eating " + f.name);
        }
    }
}

public class TestPass {
    public static void main(String[] args) {
        System.out.println("Case A: f = null inside eat()");
        Fish fishA = new Fish("fishy");
        Croc crocA = new Croc("cocky");
        System.out.println("Before eat(), fish name: " + fishA.name);
        crocA.eatCaseA(fishA);
        System.out.println("After eat(), fish name: " + fishA.name);
        System.out.println();

        System.out.println(" Case B: f = new Fish(\"Flippy\") inside eat()");
        Fish fishB = new Fish("fishy");
        Croc crocB = new Croc("cocky");
        System.out.println("Before eat(), fish name: " + fishB.name);
        crocB.eatCaseB(fishB);
        System.out.println("After eat(), fish name: " + fishB.name);
        System.out.println();

        System.out.println(" Case C: f.name = \"Flippy\" inside eat()");
        Fish fishC = new Fish("fishy");
        Croc crocC = new Croc("cocky");
        System.out.println("Before eat(), fish name: " + fishC.name);
        crocC.eatCaseC(fishC);
        System.out.println("After eat(), fish name: " + fishC.name);
        System.out.println();

        System.out.println(" Case D: Passing null to eat()");
        Fish fishD = null;
        Croc crocD = new Croc("cocky");
        crocD.eatCaseD(fishD);
    }
}
