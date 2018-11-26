package sample;

public class Validacija {

    public Validacija(){}

    public boolean validno(String s){
        if(s.length()<20 && s.length()>=1) return true;
        return false;
    }

    public boolean validnoIndeks(String n) {
        if(n.length()>0 && n.length()<=5){
            try{
                Integer.parseInt(n);
            } catch (NumberFormatException e){
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean validnoTelefon(String n) {
        if(n.length()>0 && n.length()<=9){
            try{
                Integer.parseInt(n);
            } catch (NumberFormatException e){
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean validnoOdsjek(String n) {
        if(n.equals("EE") || n.equals("RI") || n.equals("AE") || n.equals("TK")) return true;
        return false;
    }

    public boolean validnoGodine(String n) {
        if(n.equals("prva") || n.equals("druga") || n.equals("treca")) return true;
        return false;
    }

    public boolean validnoCiklus(String n) {
        if(n.equals("bachelor") || n.equals("master") || n.equals("doktorski ciklus") || n.equals("strucni studij")) return true;
        return false;
    }

    public boolean validnoMail(String n) {
        if(n.length()>0 && n.contains("@") && (n.contains("com") || n.contains("ba"))) return true;
        return false;
    }

    public boolean validnoJMBG(String n) {
        if(n.length() == 13){
            try{
                Integer.parseInt(n);
            } catch (NumberFormatException e){
                return false;
            }
            return true;
        }
        return false;
    }
}
