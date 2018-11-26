package sample;

public class validnoImePrezime {

    public validnoImePrezime(){
    }

    public boolean validno(String s){
        if(s.length()<20 && s.length()>=1) return true;
        return false;
    }
}
