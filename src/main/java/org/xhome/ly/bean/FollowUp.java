package org.xhome.ly.bean;

import java.util.Date;

public class FollowUp {
    private Integer id;

    private Integer interrogationRecordId;

    private Date followUpTime;

    private String followUpMethod;

    private String onsetEvidence;

    private String evidenceSource;

    private String postoperativeAnticoagulation;

    private String postoperativeComplications;

    private String postoperativeArrhythmias;

    private String postoperatieAdds;

    private String postoperatieMedication;

    private String echocardiographicTime;

    private String postoperatieLa;

    private String postoperatieLv;

    private String postoperatieLvef;

    private String leftThrombosis;

    private String checkMethod;

    private String keyword1;

    private String keyword2;

    private String keyword3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInterrogationRecordId() {
        return interrogationRecordId;
    }

    public void setInterrogationRecordId(Integer interrogationRecordId) {
        this.interrogationRecordId = interrogationRecordId;
    }

    public Date getFollowUpTime() {
        return followUpTime;
    }

    public void setFollowUpTime(Date followUpTime) {
        this.followUpTime = followUpTime;
    }

    public String getFollowUpMethod() {
        return followUpMethod;
    }

    public void setFollowUpMethod(String followUpMethod) {
        this.followUpMethod = followUpMethod == null ? null : followUpMethod.trim();
    }

    public String getOnsetEvidence() {
        return onsetEvidence;
    }

    public void setOnsetEvidence(String onsetEvidence) {
        this.onsetEvidence = onsetEvidence == null ? null : onsetEvidence.trim();
    }

    public String getEvidenceSource() {
        return evidenceSource;
    }

    public void setEvidenceSource(String evidenceSource) {
        this.evidenceSource = evidenceSource == null ? null : evidenceSource.trim();
    }

    public String getPostoperativeAnticoagulation() {
        return postoperativeAnticoagulation;
    }

    public void setPostoperativeAnticoagulation(String postoperativeAnticoagulation) {
        this.postoperativeAnticoagulation = postoperativeAnticoagulation == null ? null : postoperativeAnticoagulation.trim();
    }

    public String getPostoperativeComplications() {
        return postoperativeComplications;
    }

    public void setPostoperativeComplications(String postoperativeComplications) {
        this.postoperativeComplications = postoperativeComplications == null ? null : postoperativeComplications.trim();
    }

    public String getPostoperativeArrhythmias() {
        return postoperativeArrhythmias;
    }

    public void setPostoperativeArrhythmias(String postoperativeArrhythmias) {
        this.postoperativeArrhythmias = postoperativeArrhythmias == null ? null : postoperativeArrhythmias.trim();
    }

    public String getPostoperatieAdds() {
        return postoperatieAdds;
    }

    public void setPostoperatieAdds(String postoperatieAdds) {
        this.postoperatieAdds = postoperatieAdds == null ? null : postoperatieAdds.trim();
    }

    public String getPostoperatieMedication() {
        return postoperatieMedication;
    }

    public void setPostoperatieMedication(String postoperatieMedication) {
        this.postoperatieMedication = postoperatieMedication == null ? null : postoperatieMedication.trim();
    }

    public String getEchocardiographicTime() {
        return echocardiographicTime;
    }

    public void setEchocardiographicTime(String echocardiographicTime) {
        this.echocardiographicTime = echocardiographicTime == null ? null : echocardiographicTime.trim();
    }

    public String getPostoperatieLa() {
        return postoperatieLa;
    }

    public void setPostoperatieLa(String postoperatieLa) {
        this.postoperatieLa = postoperatieLa == null ? null : postoperatieLa.trim();
    }

    public String getPostoperatieLv() {
        return postoperatieLv;
    }

    public void setPostoperatieLv(String postoperatieLv) {
        this.postoperatieLv = postoperatieLv == null ? null : postoperatieLv.trim();
    }

    public String getPostoperatieLvef() {
        return postoperatieLvef;
    }

    public void setPostoperatieLvef(String postoperatieLvef) {
        this.postoperatieLvef = postoperatieLvef == null ? null : postoperatieLvef.trim();
    }

    public String getLeftThrombosis() {
        return leftThrombosis;
    }

    public void setLeftThrombosis(String leftThrombosis) {
        this.leftThrombosis = leftThrombosis == null ? null : leftThrombosis.trim();
    }

    public String getCheckMethod() {
        return checkMethod;
    }

    public void setCheckMethod(String checkMethod) {
        this.checkMethod = checkMethod == null ? null : checkMethod.trim();
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
}