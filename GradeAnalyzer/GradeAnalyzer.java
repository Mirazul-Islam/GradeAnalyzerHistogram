
import java.lang.reflect.Array;


/**
 * Basic record keeping class
 */
public class GradeAnalyzer {

    //setting up a list for Records and for storing summary data on grades
    private List<Record> gradeList;
    private int[] gradeSummary;

    public GradeAnalyzer(){
       //your work starts here
        gradeList = new List<Record>();
        gradeSummary = new int[10];
    }

    /**
     * This method adds a student to the record list
     * @param r : Record, the record to be added
     */
    public void addRecord(Record r){
        gradeList.add(r);
    }

    /**
     * This method removes a student record from the Record list
     * @param r : Record, the student record to remove
     */
    public void removeRecord(Record r){
        gradeList.remove(r);
    }


    /**
     * This method removes all the student record from the Record list
     */
    public void clearAllRecord(){
        gradeList.clear();
    }


    /**
     * prints all the student record from the Record list
     */
    public void printAllRecords(){
        Record r = gradeList.first();
        System.out.println(r.getName()+","+r.getGrade());
        for(int i=1; i<gradeList.size(); i++) {
            r = gradeList.next();
            System.out.println(r.getName() + "," + r.getGrade());
        }
    }


    /**
     * prints Histogram of the student record from the Record list
     */
    public void printHistogram() {
        Record r = gradeList.first();
        for(int i = 0; i < gradeList.size(); i++)
        {
            if(((r.getGrade()/10)<10)) {
                gradeSummary[(r.getGrade() / 10)]++;

            }else{
                gradeSummary[9]++;
            }
            r=gradeList.next();
        }


        String star ="";
        int min=0;
        int max= 10;
        for(int i=0; i<gradeSummary.length;i++){
            star ="";
            for(int j=0; j<gradeSummary[i];j++){
                star+="*";
            }System.out.println(min+"-"+max+"|"+star);
            min+=10;
            max+=10;
        }

    }



}
