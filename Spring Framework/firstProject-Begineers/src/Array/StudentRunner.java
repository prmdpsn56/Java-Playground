package Array;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class StudentRunner {
    public ArrayList<Integer> Marks = new ArrayList<Integer>();
    public String Name;

    public StudentRunner(String Name, int ...Marks){
        for (int i = 0; i < Marks.length; i++) {
            this.Marks.add(Marks[i]);
        }
        this.Name = Name;
    }

    public int getTotalMarks(){
            int sum = 0;
            for (int mark: Marks){
                sum += mark;
            }
            return sum;
    }

    public int getNumberOfMarks(){
        return Marks.size();
    }

    public int getMaximumMarks(){
        return Collections.max(Marks);
    }

    public BigDecimal getAveragemark(){
     BigDecimal result = new BigDecimal(getTotalMarks()).divide(new BigDecimal(Marks.size()));

     return result;
    }

    public String toString(){
        return Name + Marks;
    }

    public void addMark(int Mark){
           Marks.add(Mark);
    }

    public void removeMarkAtIndex (int index) {
        Marks.remove(index);

    }
}
