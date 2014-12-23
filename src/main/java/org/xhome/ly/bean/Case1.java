package org.xhome.ly.bean;

import java.util.Date;

public class Case1 {
    private Integer id;

    private String name;

    private Integer interrogationRecordId;

    private Date operationData;

    private String operatorName;

    private String operatorDetail;

    private String vtType;

    private String vtCourseDisease;

    private String arrhythmiaDiagnose;

    private String electrophysiologyDiagnose;

    private String postoperationDiagnose;

    private String mechanism;

    private String part;

    private String laBore;

    private String lvBore;

    private String lvefBore;

    private String raBore;

    private String rvBore;

    private String ucgRemarks;

    private String ecgType;

    private String electricalOffset;

    private String preopreativeExamination;

    private String antiArrhythmiaDrugs;

    private String invaliDantiArrhythmiaDrugs;

    private String mergerArrhythmia;

    private String imagingInsideHeart;

    private String inducedWay;

    private String checkMedication;

    private String tachycardiaRegulation;

    private String ccl;

    private String inspectionMethod;

    private String diastolicPotential;

    private String pPotentialExamination;

    private String ablationProcedure;

    private String ablationLines;

    private String targetPosition;

    private String ablationEnergy;

    private String ablationJudgement;

    private String ablationEndPoint;

    private String effectiveTargetSite;

    private String dischargeTime;

    private String xrayExposureTime;

    private Integer ablationTimes;

    private String intraoperativeCableRate;

    private String beforeHeartRate;

    private String beforeVt;

    private String beforeRont;

    private String beforeRemarks;

    private String inHeartRate;

    private String inVt;

    private String inRont;

    private String inRemarks;

    private String globalRemarks;

    private String keyword1;

    private String keyword2;

    private String keyword3;

    private String operationNumber;

    private String caseNumber;

    private String vtFrequency;

    private String vtEveryAttackTime;

    private String vtLastAttackTime;

    private String cardioversionMethod;

    private String cardioversionMedication;

    private String complication;

    private String vtDuration;

    private Patient patient;



    private Doctor doctor;

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
        return name;
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

    public String getVtType() {
        return vtType;
    }

    public void setVtType(String vtType) {
        this.vtType = vtType == null ? null : vtType.trim();
    }

    public String getVtCourseDisease() {
        return vtCourseDisease;
    }

    public void setVtCourseDisease(String vtCourseDisease) {
        this.vtCourseDisease = vtCourseDisease == null ? null : vtCourseDisease.trim();
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

    public String getMechanism() {
        return mechanism;
    }

    public void setMechanism(String mechanism) {
        this.mechanism = mechanism == null ? null : mechanism.trim();
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part == null ? null : part.trim();
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

    public String getEcgType() {
        return ecgType;
    }

    public void setEcgType(String ecgType) {
        this.ecgType = ecgType == null ? null : ecgType.trim();
    }

    public String getElectricalOffset() {
        return electricalOffset;
    }

    public void setElectricalOffset(String electricalOffset) {
        this.electricalOffset = electricalOffset == null ? null : electricalOffset.trim();
    }

    public String getPreopreativeExamination() {
        return preopreativeExamination;
    }

    public void setPreopreativeExamination(String preopreativeExamination) {
        this.preopreativeExamination = preopreativeExamination == null ? null : preopreativeExamination.trim();
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

    public String getDiastolicPotential() {
        return diastolicPotential;
    }

    public void setDiastolicPotential(String diastolicPotential) {
        this.diastolicPotential = diastolicPotential == null ? null : diastolicPotential.trim();
    }

    public String getpPotentialExamination() {
        return pPotentialExamination;
    }

    public void setpPotentialExamination(String pPotentialExamination) {
        this.pPotentialExamination = pPotentialExamination == null ? null : pPotentialExamination.trim();
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

    public String getEffectiveTargetSite() {
        return effectiveTargetSite;
    }

    public void setEffectiveTargetSite(String effectiveTargetSite) {
        this.effectiveTargetSite = effectiveTargetSite == null ? null : effectiveTargetSite.trim();
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

    public String getBeforeVt() {
        return beforeVt;
    }

    public void setBeforeVt(String beforeVt) {
        this.beforeVt = beforeVt == null ? null : beforeVt.trim();
    }

    public String getBeforeRont() {
        return beforeRont;
    }

    public void setBeforeRont(String beforeRont) {
        this.beforeRont = beforeRont == null ? null : beforeRont.trim();
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

    public String getInVt() {
        return inVt;
    }

    public void setInVt(String inVt) {
        this.inVt = inVt == null ? null : inVt.trim();
    }

    public String getInRont() {
        return inRont;
    }

    public void setInRont(String inRont) {
        this.inRont = inRont == null ? null : inRont.trim();
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

    public String getVtFrequency() {
        return vtFrequency;
    }

    public void setVtFrequency(String vtFrequency) {
        this.vtFrequency = vtFrequency == null ? null : vtFrequency.trim();
    }

    public String getVtEveryAttackTime() {
        return vtEveryAttackTime;
    }

    public void setVtEveryAttackTime(String vtEveryAttackTime) {
        this.vtEveryAttackTime = vtEveryAttackTime == null ? null : vtEveryAttackTime.trim();
    }

    public String getVtLastAttackTime() {
        return vtLastAttackTime;
    }

    public void setVtLastAttackTime(String vtLastAttackTime) {
        this.vtLastAttackTime = vtLastAttackTime == null ? null : vtLastAttackTime.trim();
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

    public String getVtDuration() {
        return vtDuration;
    }

    public void setVtDuration(String vtDuration) {
        this.vtDuration = vtDuration == null ? null : vtDuration.trim();
    }
}