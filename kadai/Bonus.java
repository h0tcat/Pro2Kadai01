package kadai;

public class Bonus{
    private String number;

    private int pay, rank;
    private int paiedLeave, absence;

    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }

    public void setPay(int pay){
        this.pay = pay;
    }
    public int getPay(){
        return pay;
    }

    public void setRank(int rank){
        this.rank = rank;
    }
    public int getRank(){
        return rank;
    }

    public void setPaiedLeave(int paiedLeave){
        this.paiedLeave = paiedLeave;
    }
    public int getPaidedLeave(){
        return paiedLeave;
    }

    public void setAbsence(int absence){
        this.absence = absence;
    }
    public int getAbsence(){
        return absence;
    }


    public double getAccessRate(){
        double accessRate = 0.0;

        switch(rank){
            case 0:
                accessRate = 1.30;
                break;
            case 1:
                accessRate = 1.05;
                break;
            case 2:
                accessRate = 1.00;
                break;
            case 3:
                accessRate = 0.95;
                break;
            case 4:
                accessRate = 0.80;
                break;
        }

        return accessRate;
    }

    public double getAbsenceRate(){

        double gengakuRate = 0;
        if(paiedLeave - absence < 0 ){
            int kekkinn = absence - paiedLeave;
            gengakuRate = (kekkinn / 20.0);   
        }
        return gengakuRate;
    }

    public int getBonus(){
        return (int)Math.round((pay * getAccessRate() - pay * getAbsenceRate()));
    }
}