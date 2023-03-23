package checker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import enumerators.StatesEnum;

public class CpfChecker {

    public static boolean checkNummberOfCharacters(String cpf){
        return Pattern.matches("[0-9]{11}", cpf);
    }

    public static boolean checkTaxRegion(String cpf, StatesEnum state){
        if(state.getTaxRegion() == cpf.charAt(8)){
            return true;
        } else{
            return false;
        }
    }
}

