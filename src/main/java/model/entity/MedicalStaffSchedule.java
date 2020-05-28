package model.entity;

import model.entity.enums.MonthType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "schedules")
@Inheritance(strategy = InheritanceType.JOINED)
public class MedicalStaffSchedule extends BaseEntity {

    @Enumerated(value = EnumType.STRING)
    private MonthType month;

    @OneToMany(mappedBy = "schedule",cascade = CascadeType.ALL)
//    @JoinColumn(name = "day_event_id",referencedColumnName = "id")
    List<DayEvent> dayEvents;

    public MedicalStaffSchedule() {
    }

    public MonthType getMonth() {
        return month;
    }

    public void setMonth(MonthType month) {
        this.month = month;
    }

    public List<DayEvent> getDayEvents() {
        return dayEvents;
    }

    public void setDayEvents(List<DayEvent> dayEvents) {
        this.dayEvents = dayEvents;
    }

    @Override
    public String toString() {
        return "MedicalStaffSchedule{" +
                "month=" + month +
                ", dayEvents=" + dayEvents +
                '}';
    }
}
