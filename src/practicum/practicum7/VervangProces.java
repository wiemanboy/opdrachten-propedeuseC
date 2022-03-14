package practicum.practicum7;

public class VervangProces implements OpmaakProces{
    private String oud;
    private String nieuw;

    VervangProces(String oud, String nieuw){
        this.oud = oud;
        this.nieuw = nieuw;
    }

    public String maakOp(String input){
        return input.replace(oud,nieuw);
    }
}
