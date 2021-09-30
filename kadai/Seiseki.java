package kadai;

public class Seiseki{
  private String no, name, kamoku;
  private int[] tokuten;

  public String getNo(){
    return no;
  }
  public void setNo(String no){
    this.no = no;
  }

  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  
  public String getKamoku(){
    return kamoku;
  }
  public void setKamoku(String kamoku){
    this.kamoku = kamoku;
  }

  public int[] getTokuten(){
    return tokuten;
  }
  public void setTokuten(int[] tokuten){
    this.tokuten = tokuten;
  }

  public void setTokutenN(int i, int ten){
    tokuten[i] = ten;
  }
  public int getTokutenN(int i){
    return tokuten[i];
  }

  public double getAverage(){
    double avg = 0;
    for(int score : tokuten){
      avg += score;
    }

    return (double)(avg / tokuten.length);
  }

  public String getGrade(){
    double avgScore = getAverage();

    if(avgScore >= 95.0){
      return "秀";
    }else if(avgScore >= 85.0 && avgScore < 95.0){
      return "優";
    }else if(avgScore >= 70.0 && avgScore < 85.0){
      return "良";
    }else if(avgScore >= 60.0 && avgScore < 70.0){
      return "可";
    }else if(avgScore < 60.0){
      return "不可";
    }
    return null;
  }
}