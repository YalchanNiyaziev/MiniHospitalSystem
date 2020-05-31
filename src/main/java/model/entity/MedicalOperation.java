package model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="medical_operations")
public class MedicalOperation extends HealthService{

//    @ManyToMany(cascade = {
//            CascadeType.PERSIST,
//            CascadeType.MERGE
//    })
    @ManyToMany
    @JoinTable(name="medical_staff_operation",
            joinColumns = { @JoinColumn(name = "medical_operation_id") },
            inverseJoinColumns = { @JoinColumn(name = "medical_staff_id") })
    private Set<MedicalStaff> team;

    @Column(name="procedure_description")
    private String procedureDescription;
    @Column(name = "procedure_conclusion")
    private String procedureConclusion;
    public MedicalOperation() {
    }

    public Set<MedicalStaff> getTeam() {
        return team;
    }

    public void setTeam(Set<MedicalStaff> team) {
        this.team = team;
    }

    public String getProcedureDescription() {
        return procedureDescription;
    }

    public void setProcedureDescription(String procedureDescription) {
        this.procedureDescription = procedureDescription;
    }

    public String getProcedureConclusion() {
        return procedureConclusion;
    }

    public void setProcedureConclusion(String procedureConclusion) {
        this.procedureConclusion = procedureConclusion;
    }
}
