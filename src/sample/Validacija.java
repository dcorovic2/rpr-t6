package sample;

public class Validacija {

    public Validacija(){}

    public boolean validno(String s){
        if(s.length()<20 && s.length()>=1 && !s.equals("    ")) return true;
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
        if(n.length()==0) return true;
        if(n.length()==9){
            try{
                Long.parseLong(n);
            } catch (NumberFormatException e){
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean validnoOdsjek(String n) {
        if(n.toUpperCase().equals("EE") || n.toUpperCase().equals("RI") || n.toUpperCase().equals("AE") || n.toUpperCase().equals("TK")) return true;
        return false;
    }

    public boolean validnoGodine(String n) {
        if(n.toLowerCase().equals("prva") || n.toLowerCase().equals("druga") || n.toLowerCase().equals("treca")) return true;
        return false;
    }

    public boolean validnoCiklus(String n) {
        if(n.toLowerCase().equals("bachelor") || n.toLowerCase().equals("master") || n.toLowerCase().equals("doktorski ciklus") || n.toLowerCase().equals("strucni studij")) return true;
        return false;
    }

    public boolean validnoMail(String n) {
        if(n.length()>0 && n.contains("@") && (n.contains("com") || n.contains("ba"))) return true;
        return false;
    }

    public boolean validnoJMBG(String n) {
        int vel = n.length();
        if(vel == 13){
            try{
                Long.parseLong(n);
                if((Integer.parseInt(n.substring(0, 2)) >= 1 && Integer.parseInt(n.substring(0, 2)) <= 31) && (Integer.parseInt(n.substring(2, 5)) >= 1 && Integer.parseInt(n.substring(2, 5)) <= 12) && (Integer.parseInt(n.substring(5, 8)) >= 900 && Integer.parseInt(n.substring(5, 8)) <= 18)){
                    return true;
                }
            } catch (NumberFormatException e){
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean validnoRodjenje(String n, String jmbg) {
        if(n.length() == 10) {
            String poredbe = n.substring(0, 2);
            poredbe += n.substring(3, 5);
            poredbe += n.substring(7, 10);

            if (jmbg.contains(poredbe)) return true;
        }
        return false;
    }
}
