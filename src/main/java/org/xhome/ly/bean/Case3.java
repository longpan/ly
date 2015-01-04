package org.xhome.ly.bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Case3 {
    private Integer id;

    private String name;

    private Integer interrogationRecordId;

    private Date operationData;

    private String operatorName;

    private String operatorDetail;

    private String afType;

    private String afCourseDisease;

    private String arrhythmiaDiagnose;

    private String electrophysiologyDiagnose;

    private String postoperationDiagnose;

    private String laBore;

    private String lvBore;

    private String lvefBore;

    private String raBore;

    private String rvBore;

    private String ucgRemarks;

    private String antiArrhythmiaDrugs;

    private String invaliDantiArrhythmiaDrugs;

    private String mergerArrhythmia;

    private String imagingInsideHeart;

    private String inducedWay;

    private String checkMedication;

    private String tachycardiaRegulation;

    private String ccl;

    private String inspectionMethod;

    private String ablationProcedure;

    private String ablationLines;

    private String targetPosition;

    private String ablationEnergy;

    private String ablationJudgement;

    private String ablationEndPoint;

    private String dischargeTime;

    private String xrayExposureTime;

    private Integer ablationTimes;

    private String intraoperativeCableRate;

    private String beforeHeartRate;

    private String beforeRr;

    private String beforeAf;

    private String beforeRemarks;

    private String inHeartRate;

    private String inRr;

    private String inAf;

    private String inRemarks;

    private String globalRemarks;

    private String keyword1;

    private String keyword2;

    private String keyword3;

    private String operationNumber;

    private String caseNumber;

    private String afFrequency;

    private String afEveryAttackTime;

    private String afLastAttackTime;

    private String cardioversionMethod;

    private String cardioversionMedication;

    private String complication;

    private String beforeAntioagulant;

    private String laThrombusDetection;

    private String testMethod;

    private String lungVein;

    private String gpAblation;

    private String vagalReflex;

    private String intraoperativeVagusReflexAreas;

    private String beforeRe;

    private String inRe;

    private String afDuration;

    private Patient patient;

    private Doctor doctor;



    private String operationDataStr;

    public List<FollowUp> getFollowUps() {
        return followUps;
    }

    public void setFollowUps(List<FollowUp> followUps) {
        this.followUps = followUps;
    }

    List<FollowUp> followUps;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return "房颤";
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getInterrogationRecordId() {
        return interrogationRecordId;
    }

    public void setInterrogationRecordId(Integer interrogationRecordId) {
        this.interrogationRecordId = interrogationRecordId;
    }

    public Date getOperationData() {
        return operationData;
    }

    public void setOperationData(Date operationData) {
        this.operationData = operationData;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public String getOperatorDetail() {
        return operatorDetail;
    }

    public void setOperatorDetail(String operatorDetail) {
        this.operatorDetail = operatorDetail == null ? null : operatorDetail.trim();
    }

    public String getAfType() {
        return afType;
    }

    public void setAfType(String afType) {
        this.afType = afType == null ? null : afType.trim();
    }

    public String getAfCourseDisease() {
        return afCourseDisease;
    }

    public void setAfCourseDisease(String afCourseDisease) {
        this.afCourseDisease = afCourseDisease == null ? null : afCourseDisease.trim();
    }

    public String getArrhythmiaDiagnose() {
        return arrhythmiaDiagnose;
    }

    public void setArrhythmiaDiagnose(String arrhythmiaDiagnose) {
        this.arrhythmiaDiagnose = arrhythmiaDiagnose == null ? null : arrhythmiaDiagnose.trim();
    }

    public String getElectrophysiologyDiagnose() {
        return electrophysiologyDiagnose;
    }

    public void setElectrophysiologyDiagnose(String electrophysiologyDiagnose) {
        this.electrophysiologyDiagnose = electrophysiologyDiagnose == null ? null : electrophysiologyDiagnose.trim();
    }

    public String getPostoperationDiagnose() {
        return postoperationDiagnose;
    }

    public void setPostoperationDiagnose(String postoperationDiagnose) {
        this.postoperationDiagnose = postoperationDiagnose == null ? null : postoperationDiagnose.trim();
    }

    public String getLaBore() {
        return laBore;
    }

    public void setLaBore(String laBore) {
        this.laBore = laBore == null ? null : laBore.trim();
    }

    public String getLvBore() {
        return lvBore;
    }

    public void setLvBore(String lvBore) {
        this.lvBore = lvBore == null ? null : lvBore.trim();
    }

    public String getLvefBore() {
        return lvefBore;
    }

    public void setLvefBore(String lvefBore) {
        this.lvefBore = lvefBore == null ? null : lvefBore.trim();
    }

    public String getRaBore() {
        return raBore;
    }

    public void setRaBore(String raBore) {
        this.raBore = raBore == null ? null : raBore.trim();
    }

    public String getRvBore() {
        return rvBore;
    }

    public void setRvBore(String rvBore) {
        this.rvBore = rvBore == null ? null : rvBore.trim();
    }

    public String getUcgRemarks() {
        return ucgRemarks;
    }

    public void setUcgRemarks(String ucgRemarks) {
        this.ucgRemarks = ucgRemarks == null ? null : ucgRemarks.trim();
    }

    public String getAntiArrhythmiaDrugs() {
        return antiArrhythmiaDrugs;
    }

    public void setAntiArrhythmiaDrugs(String antiArrhythmiaDrugs) {
        this.antiArrhythmiaDrugs = antiArrhythmiaDrugs == null ? null : antiArrhythmiaDrugs.trim();
    }

    public String getInvaliDantiArrhythmiaDrugs() {
        return invaliDantiArrhythmiaDrugs;
    }

    public void setInvaliDantiArrhythmiaDrugs(String invaliDantiArrhythmiaDrugs) {
        this.invaliDantiArrhythmiaDrugs = invaliDantiArrhythmiaDrugs == null ? null : invaliDantiArrhythmiaDrugs.trim();
    }

    public String getMergerArrhythmia() {
        return mergerArrhythmia;
    }

    public void setMergerArrhythmia(String mergerArrhythmia) {
        this.mergerArrhythmia = mergerArrhythmia == null ? null : mergerArrhythmia.trim();
    }

    public String getImagingInsideHeart() {
        return imagingInsideHeart;
    }

    public void setImagingInsideHeart(String imagingInsideHeart) {
        this.imagingInsideHeart = imagingInsideHeart == null ? null : imagingInsideHeart.trim();
    }

    public String getInducedWay() {
        return inducedWay;
    }

    public void setInducedWay(String inducedWay) {
        this.inducedWay = inducedWay == null ? null : inducedWay.trim();
    }

    public String getCheckMedication() {
        return checkMedication;
    }

    public void setCheckMedication(String checkMedication) {
        this.checkMedication = checkMedication == null ? null : checkMedication.trim();
    }

    public String getTachycardiaRegulation() {
        return tachycardiaRegulation;
    }

    public void setTachycardiaRegulation(String tachycardiaRegulation) {
        this.tachycardiaRegulation = tachycardiaRegulation == null ? null : tachycardiaRegulation.trim();
    }

    public String getCcl() {
        return ccl;
    }

    public void setCcl(String ccl) {
        this.ccl = ccl == null ? null : ccl.trim();
    }

    public String getInspectionMethod() {
        return inspectionMethod;
    }

    public void setInspectionMethod(String inspectionMethod) {
        this.inspectionMethod = inspectionMethod == null ? null : inspectionMethod.trim();
    }

    public String getAblationProcedure() {
        return ablationProcedure;
    }

    public void setAblationProcedure(String ablationProcedure) {
        this.ablationProcedure = ablationProcedure == null ? null : ablationProcedure.trim();
    }

    public String getAblationLines() {
        return ablationLines;
    }

    public void setAblationLines(String ablationLines) {
        this.ablationLines = ablationLines == null ? null : ablationLines.trim();
    }

    public String getTargetPosition() {
        return targetPosition;
    }

    public void setTargetPosition(String targetPosition) {
        this.targetPosition = targetPosition == null ? null : targetPosition.trim();
    }

    public String getAblationEnergy() {
        return ablationEnergy;
    }

    public void setAblationEnergy(String ablationEnergy) {
        this.ablationEnergy = ablationEnergy == null ? null : ablationEnergy.trim();
    }

    public String getAblationJudgement() {
        return ablationJudgement;
    }

    public void setAblationJudgement(String ablationJudgement) {
        this.ablationJudgement = ablationJudgement == null ? null : ablationJudgement.trim();
    }

    public String getAblationEndPoint() {
        return ablationEndPoint;
    }

    public void setAblationEndPoint(String ablationEndPoint) {
        this.ablationEndPoint = ablationEndPoint == null ? null : ablationEndPoint.trim();
    }

    public String getDischargeTime() {
        return dischargeTime;
    }

    public void setDischargeTime(String dischargeTime) {
        this.dischargeTime = dischargeTime == null ? null : dischargeTime.trim();
    }

    public String getXrayExposureTime() {
        return xrayExposureTime;
    }

    public void setXrayExposureTime(String xrayExposureTime) {
        this.xrayExposureTime = xrayExposureTime == null ? null : xrayExposureTime.trim();
    }

    public Integer getAblationTimes() {
        return ablationTimes;
    }

    public void setAblationTimes(Integer ablationTimes) {
        this.ablationTimes = ablationTimes;
    }

    public String getIntraoperativeCableRate() {
        return intraoperativeCableRate;
    }

    public void setIntraoperativeCableRate(String intraoperativeCableRate) {
        this.intraoperativeCableRate = intraoperativeCableRate == null ? null : intraoperativeCableRate.trim();
    }

    public String getBeforeHeartRate() {
        return beforeHeartRate;
    }

    public void setBeforeHeartRate(String beforeHeartRate) {
        this.beforeHeartRate = beforeHeartRate == null ? null : beforeHeartRate.trim();
    }

    public String getBeforeRr() {
        return beforeRr;
    }

    public void setBeforeRr(String beforeRr) {
        this.beforeRr = beforeRr == null ? null : beforeRr.trim();
    }

    public String getBeforeAf() {
        return beforeAf;
    }

    public void setBeforeAf(String beforeAf) {
        this.beforeAf = beforeAf == null ? null : beforeAf.trim();
    }

    public String getBeforeRemarks() {
        return beforeRemarks;
    }

    public void setBeforeRemarks(String beforeRemarks) {
        this.beforeRemarks = beforeRemarks == null ? null : beforeRemarks.trim();
    }

    public String getInHeartRate() {
        return inHeartRate;
    }

    public void setInHeartRate(String inHeartRate) {
        this.inHeartRate = inHeartRate == null ? null : inHeartRate.trim();
    }

    public String getInRr() {
        return inRr;
    }

    public void setInRr(String inRr) {
        this.inRr = inRr == null ? null : inRr.trim();
    }

    public String getInAf() {
        return inAf;
    }

    public void setInAf(String inAf) {
        this.inAf = inAf == null ? null : inAf.trim();
    }

    public String getInRemarks() {
        return inRemarks;
    }

    public void setInRemarks(String inRemarks) {
        this.inRemarks = inRemarks == null ? null : inRemarks.trim();
    }

    public String getGlobalRemarks() {
        return globalRemarks;
    }

    public void setGlobalRemarks(String globalRemarks) {
        this.globalRemarks = globalRemarks == null ? null : globalRemarks.trim();
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

    public String getOperationNumber() {
        return operationNumber;
    }

    public void setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber == null ? null : operationNumber.trim();
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber == null ? null : caseNumber.trim();
    }

    public String getAfFrequency() {
        return afFrequency;
    }

    public void setAfFrequency(String afFrequency) {
        this.afFrequency = afFrequency == null ? null : afFrequency.trim();
    }

    public String getAfEveryAttackTime() {
        return afEveryAttackTime;
    }

    public void setAfEveryAttackTime(String afEveryAttackTime) {
        this.afEveryAttackTime = afEveryAttackTime == null ? null : afEveryAttackTime.trim();
    }

    public String getAfLastAttackTime() {
        return afLastAttackTime;
    }

    public void setAfLastAttackTime(String afLastAttackTime) {
        this.afLastAttackTime = afLastAttackTime == null ? null : afLastAttackTime.trim();
    }

    public String getCardioversionMethod() {
        return cardioversionMethod;
    }

    public void setCardioversionMethod(String cardioversionMethod) {
        this.cardioversionMethod = cardioversionMethod == null ? null : cardioversionMethod.trim();
    }

    public String getCardioversionMedication() {
        return cardioversionMedication;
    }

    public void setCardioversionMedication(String cardioversionMedication) {
        this.cardioversionMedication = cardioversionMedication == null ? null : cardioversionMedication.trim();
    }

    public String getComplication() {
        return complication;
    }

    public void setComplication(String complication) {
        this.complication = complication == null ? null : complication.trim();
    }

    public String getBeforeAntioagulant() {
        return beforeAntioagulant;
    }

    public void setBeforeAntioagulant(String beforeAntioagulant) {
        this.beforeAntioagulant = beforeAntioagulant == null ? null : beforeAntioagulant.trim();
    }

    public String getLaThrombusDetection() {
        return laThrombusDetection;
    }

    public void setLaThrombusDetection(String laThrombusDetection) {
        this.laThrombusDetection = laThrombusDetection == null ? null : laThrombusDetection.trim();
    }

    public String getTestMethod() {
        return testMethod;
    }

    public void setTestMethod(String testMethod) {
        this.testMethod = testMethod == null ? null : testMethod.trim();
    }

    public String getLungVein() {
        return lungVein;
    }

    public void setLungVein(String lungVein) {
        this.lungVein = lungVein == null ? null : lungVein.trim();
    }

    public String getGpAblation() {
        return gpAblation;
    }

    public void setGpAblation(String gpAblation) {
        this.gpAblation = gpAblation == null ? null : gpAblation.trim();
    }

    public String getVagalReflex() {
        return vagalReflex;
    }

    public void setVagalReflex(String vagalReflex) {
        this.vagalReflex = vagalReflex == null ? null : vagalReflex.trim();
    }

    public String getIntraoperativeVagusReflexAreas() {
        return intraoperativeVagusReflexAreas;
    }

    public void setIntraoperativeVagusReflexAreas(String intraoperativeVagusReflexAreas) {
        this.intraoperativeVagusReflexAreas = intraoperativeVagusReflexAreas == null ? null : intraoperativeVagusReflexAreas.trim();
    }

    public String getBeforeRe() {
        return beforeRe;
    }

    public void setBeforeRe(String beforeRe) {
        this.beforeRe = beforeRe == null ? null : beforeRe.trim();
    }

    public String getInRe() {
        return inRe;
    }

    public void setInRe(String inRe) {
        this.inRe = inRe == null ? null : inRe.trim();
    }

    public String getAfDuration() {
        return afDuration;
    }

    public void setAfDuration(String afDuration) {
        this.afDuration = afDuration == null ? null : afDuration.trim();
    }

    public String getOperationDataStr() {
        if (operationData == null)
            return "";
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd ");
        return format.format(operationData);
    }

    public void setOperationDataStr(String operationDataStr) {
        this.operationDataStr = operationDataStr;
    }
}