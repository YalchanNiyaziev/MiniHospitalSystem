package model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="doctors")
@Inheritance(strategy = InheritanceType.JOINED)
public  class Doctor extends MedicalStaff {
    @Column
    private String description;

    @Column(name = "is_head")
    private boolean isHead;
    // @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
    private List<ExaminationRequest> examinationRequestList;

    public Doctor() {
        super();
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
