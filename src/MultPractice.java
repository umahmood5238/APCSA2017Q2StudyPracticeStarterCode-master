/**
 * Created by Teacher on 4/1/2019.
 */
public class MultPractice implements StudyPractice {
    int firstInteger;
    int secondInteger;
    public MultPractice (int first, int second) {
        this.firstInteger = first;
        this.secondInteger = second;
    }
    public String getProblem() {
        return firstInteger + " TIMES " + secondInteger;
    }
    public void nextProblem() {
        secondInteger++;
    }
}
