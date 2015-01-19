package org.xhome.ly.bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MedicalHistory {
    private Integer id;

    private Integer patientId;

    private String typeName;

    private Date oprateTime;

    private String detail;

    private String keyword1;

    private String keyword2;

    private String keyword3;

    private String oprateTimeStr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Date getOprateTime() {
        return oprateTime;
    }

    public void setOprateTime(Date oprateTime) {
        this.oprateTime = oprateTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getKeyword1() {
        return keyword1;
    }

    public void setKeyword1(String keyword1) {
        this.keyword1 = keyword1 == null ? null : keyword1.trim();
    }

    public String getKeyword2() {
        return keyword2;
    }

    public void setKeyword2(String keyword2) {
        this.keyword2 = keyword2 == null ? null : keyword2.trim();
    }

    public String getKeyword3() {
        return keyword3;
    }

    public void setKeyword3(String keyword3) {
        this.keyword3 = keyword3 == null ? null : keyword3.trim();
    }



    public void setOprateTimeStr(String followUpTimeStr) {
        this.oprateTimeStr = oprateTimeStr;
    }

    public String getOprateTimeStr() {
        if (oprateTime == null)
            return "";
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd ");
        return format.format(oprateTime);
    }
}