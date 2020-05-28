package model.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "day_events")
public class DayEvent extends BaseEntity {
    @Column
    private LocalDate date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="schedule")
    private MedicalStaffSchedule schedule;


    @OneToMany(mappedBy = "dayEvent",cascade = CascadeType.ALL)
    private List<HourEvent> hourEventList;

    public DayEvent() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public MedicalStaffSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(MedicalStaffSchedule schedule) {
        this.schedule = schedule;
    }

    public List<HourEvent> getHourEventList() {
        return hourEventList;
    }

    public void setHourEventList(List<HourEvent> hourEventList) {
        this.hourEventList = hourEventList;
    }

    @Override
    public String toString() {
        return "DayEvent{" +
                "date=" + date +
                ", hourEventList=" + hourEventList +
                '}';
    }
}
