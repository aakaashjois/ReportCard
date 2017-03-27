public class ReportCard {
  
  private String subjectName;
  private int subjectScore;
  
  public ReportCard(String name, int score) {
    this.subjectName = name;
    this.subjectScore = score;
  }
  
  public void setSubjectName(String name) {
    this.subjectName = name;
  }
  
  public void setSubjectScore(int score) {
    this.subjectScore = score;
  }
  
  public String getSubjectName() {
    return this.subjectName;
  }
  
  public int getSubjectScore() {
    return this.subjectScore;
  }
  
  public String toString() {
    return ("You scored " + this.subjectScore + " in " + this.subjectName + ".");
  }
}