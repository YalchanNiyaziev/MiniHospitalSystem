package repository.model.entity;

import java.util.List;

public  class Doctor extends MedicalStaff {
    private String description;
    private boolean isHead;
    private List<ExaminationRequest> examinationRequestList;

    public Doctor() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHead() {
        return isHead;
    }

    public void setHead(boolean head) {
        isHead = head;
    }

    public List<ExaminationRequest> getExaminationRequestList() {
        return examinationRequestList;
    }

    public void setExaminationRequestList(List<ExaminationRequest> examinationRequestList) {
        this.examinationRequestList = examinationRequestList;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "description='" + description + '\'' +
                ", isHead=" + isHead +
                ", examinationRequestList=" + examinationRequestList +
                '}';
    }
}
