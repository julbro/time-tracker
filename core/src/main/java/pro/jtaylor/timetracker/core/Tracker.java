package pro.jtaylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;

/***
 * @author Jason
 * @since 2015-08-03
 */
@Component
public class Tracker {
    /***
     * ArrayList of timeEntry objects that compose the timesheet
     */
    @Autowired
    private List<TimeEntry> entries;

    public Tracker() {
        entries = new ArrayList<>();
    }

    /***
     * Adds entry to timesheet
     * @param entry timesheet entry to add to tracker timesheet
     */
    void add(TimeEntry entry) {
        Assert.notNull(entry);
        entries.add(entry);
    }

//    public void remove(TimeEntry entry) {
//        entries.remove(entry);
//    }

    /***
     * Gets number of entries in timesheet
     * @return entries in timesheet
     */
    int size() {
        return entries.size();
    }

//    public TimeEntry get(int index) {
//        return entries.get(index);
//    }
}

