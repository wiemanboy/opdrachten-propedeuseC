package practicum.practicum7;

public class KleineletterProces implements OpmaakProces{

    public KleineletterProces(){}

    public String maakOp(String input){
        return input.substring(0, 3).toLowerCase() + input.substring(3);
    }
}

