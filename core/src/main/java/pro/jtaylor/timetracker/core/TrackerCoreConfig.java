package pro.jtaylor.timetracker.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jason
 * @since 6/19/2015.
 */
@Configuration
@ComponentScan("pro.jtaylor.timetracker.core")
public class TrackerCoreConfig {

    /***
     * Create new empty timesheet
     * @return empty ArrayList of TimeEntry
     */
    @Bean(name = "timesheet")
    public List<TimeEntry> timeEntries() {
        return new ArrayList<>();
    }
}
