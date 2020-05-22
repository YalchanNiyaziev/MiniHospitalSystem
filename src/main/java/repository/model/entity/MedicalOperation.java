package repository.model.entity;

import java.util.List;

public class MedicalOperation extends HealthService{
    private List<MedicalStaff> team;

    public MedicalOperation() {
    }

    public List<MedicalStaff> getTeam() {
        return team;
    }

    public void setTeam(List<MedicalStaff> team) {
        this.team = team;
    }
}
