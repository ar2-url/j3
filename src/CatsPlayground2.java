public class CatsPlayground2 {

        // todo utworz klase pies ktory posiada atrybuty: name, id, kind, haveFlees  jak w //boolean
        // konstruktor id - wymagany , reszta opcjonalna
        // getery setery
        // toString -
        // napisz metode do pobawienia sie z psem - na zasadzie mrrrr, mrrr

        public static void main(String[] args) {
            Cat2 mruczek = new Cat2("Mruczek", 10.2);
            mruczek.setOwnerName("Zbyszek");
            mruczek.feed();
            mruczek.scratch();

            Cat2 miauczek = new Cat2("miauczek", 4.1);
            miauczek.feed();

            System.out.println(mruczek);    //?????????????


            // utworz tablice kotow  i wypelnic 3 kotami i wyswietl w petli for imiona kotow w tablicy




            Cat2 cat1 = new Cat2("siersciuch", 2);
            Cat2 cat2 = new Cat2("wlochacz", 4);
            Cat2 cat3 = new Cat2("persian", 6);

            Cat2[] cats = new Cat2[3];
            cats[0] = cat1;
            cats[1] = cat2;
            cats[2] = cat3;

            // gdy wrzucimy samo System.out.println(cats.length); to wyswietli tylko ilosc kotow

            for(int i = 0; i < cats.length; i++) {          // gdy mniejsze lub rowne <= 3 to wyrzuca blad bo tablica ma 0,1 i 2
                System.out.println(cats[i].getName());
            }
        }


}
