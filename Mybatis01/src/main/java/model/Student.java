package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int sno;
    private String sname;
    private String sgender;
    private Date sbirthday;

    public Student(String sname, String sgender, Date sbirthday) {
        this.sname = sname;
        this.sgender = sgender;
        this.sbirthday = sbirthday;
    }
}
