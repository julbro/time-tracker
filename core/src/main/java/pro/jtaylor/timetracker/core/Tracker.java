package pro.jtaylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    public Tracker() {

    }

    void add(TimeEntry entry) {
        entries.add(entry);
    }

//    public void remove(TimeEntry entry) {
//        entries.remove(entry);
//    }

    int size() {
        return entries.size();
    }

//    public TimeEntry get(int index) {
//        return entries.get(index);
//    }
}

