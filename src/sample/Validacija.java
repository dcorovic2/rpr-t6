package sample;

public class Validacija {

    public Validacija(){
    }

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
}
