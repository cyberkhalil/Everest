package gui.examFrames;

import java.sql.Date;

public class Exam {

    private int exam_id;
    private String exam_name;
    private int exam_price;
    private Date exam_time;

    public int getExam_id() {
        return exam_id;
    }

    public String getExam_name() {
        return exam_name;
    }

    public int getExam_price() {
        return exam_price;
    }

    public Date getExam_time() {
        return exam_time;
    }

}
