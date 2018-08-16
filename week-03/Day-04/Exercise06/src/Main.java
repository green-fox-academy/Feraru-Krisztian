public class Main {
    public static void main(String[] args) {

        Sharpie sh1 = new Sharpie("red", 20, 78);
        Sharpie sh2 = new Sharpie("green", 20, 22);
        Sharpie sh3 = new Sharpie("blue", 20, 34);
        Sharpie sh4 = new Sharpie("black", 20, 0);
        Sharpie sh5 = new Sharpie("yellow", 20, 75);
        Sharpie sh6 = new Sharpie("purple", 20, 100);
        Sharpie sh7 = new Sharpie("white", 20, 10);
        Sharpie sh8 = new Sharpie("brown", 20, 54);
        Sharpie sh9 = new Sharpie("blond", 20, 0);
        Sharpie sh10 = new Sharpie("bronze", 20, 67);
        Sharpie sh11 = new Sharpie("capri", 25, 99);
        Sharpie sh12 = new Sharpie("coffee", 25, 80);
        Sharpie sh13 = new Sharpie("cream", 25, 18);
        Sharpie sh14 = new Sharpie("ecru", 25, 43);
        Sharpie sh15 = new Sharpie("lime", 25, 2);
        Sharpie sh16 = new Sharpie("orange", 25, 0);
        Sharpie sh17 = new Sharpie("fluorescent blue", 25, 56);
        Sharpie sh18 = new Sharpie("flesh", 25, 91);
        Sharpie sh19 = new Sharpie("diamond", 25, 55);
        Sharpie sh20 = new Sharpie("coral", 25, 38);

        SharpieSet theSharpieSet = new SharpieSet();


        theSharpieSet.listOfSharpie.add(sh1);
        theSharpieSet.listOfSharpie.add(sh2);
        theSharpieSet.listOfSharpie.add(sh3);
        theSharpieSet.listOfSharpie.add(sh4);
        theSharpieSet.listOfSharpie.add(sh5);
        theSharpieSet.listOfSharpie.add(sh6);
        theSharpieSet.listOfSharpie.add(sh7);
        theSharpieSet.listOfSharpie.add(sh8);
        theSharpieSet.listOfSharpie.add(sh9);
        theSharpieSet.listOfSharpie.add(sh10);
        theSharpieSet.listOfSharpie.add(sh11);
        theSharpieSet.listOfSharpie.add(sh12);
        theSharpieSet.listOfSharpie.add(sh13);
        theSharpieSet.listOfSharpie.add(sh14);
        theSharpieSet.listOfSharpie.add(sh15);
        theSharpieSet.listOfSharpie.add(sh16);
        theSharpieSet.listOfSharpie.add(sh17);
        theSharpieSet.listOfSharpie.add(sh18);
        theSharpieSet.listOfSharpie.add(sh19);
        theSharpieSet.listOfSharpie.add(sh20);


        System.out.println(theSharpieSet.countUsable());
        System.out.println(theSharpieSet.listOfSharpie.toString());

        theSharpieSet.removeTrash();
        System.out.println(theSharpieSet.listOfSharpie.toString());

    }
}
