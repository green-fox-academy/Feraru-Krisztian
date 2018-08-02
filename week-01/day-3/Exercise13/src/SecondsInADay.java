public class SecondsInADay {
    public static void main(String[] args) {
        int cH = 15;
        int cM = 21;
        int cS = 45;
        int sPM = 60;
        int sPH = 60 * sPM;
        int hPD = 24;
        int sPD = sPH * hPD;
        System.out.println(sPD - ((cH * sPH) + (cM * sPM) + cS));
    }
}