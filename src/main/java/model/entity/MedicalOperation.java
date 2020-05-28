package model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="medical_operations")
public class MedicalOperation extends HealthService{

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name="medical_staff_operation",
            joinColumns = { @JoinColumn(name = "medical_operation_id") },
            inverseJoinColumns = { @JoinColumn(name = "medical_staff_id") })
    private Set<MedicalStaff> team;

    public MedicalOperation() {
    }

    public Set<MedicalStaff> getTeam() {
        return team;
    }

    public void setTeam(Set<MedicalStaff> team) {
        this.team = team;
    }
}
