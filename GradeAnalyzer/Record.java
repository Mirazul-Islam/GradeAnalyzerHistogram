/**
 * author: Mirazul Islam
 * date: 10/12/2020
 * description: Saw class a subclass of Tool, and it only contains setFunction.
 */

public class Record {
    String name;
    int grade;

    public Record(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    //Setters
    public void setName(String name) {this.name = name;}

    public void setGrade(int grade) {this.grade = grade;}

    //Getters
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
