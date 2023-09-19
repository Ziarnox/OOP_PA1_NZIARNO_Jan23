package EventMenagmentApp.EventMenagmentComp;

import EventMenagmentApp.events.Event;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManagementCompany {
    private Map<String, Integer> chiefOrganiserCount;
    private List<Event> events;

    public EventManagementCompany() {
        chiefOrganiserCount = new HashMap<>();
        events = new ArrayList<>();
    }

    public void organiseEvent(Event event) {
        if (event.canStartEvent()) {
            String chiefOrganiserName = event.chiefOrganiser.getName();
            chiefOrganiserCount.put(chiefOrganiserName, chiefOrganiserCount.getOrDefault(chiefOrganiserName, 0) + 1);
            events.add(event);
        } else {
            System.out.println("Event cannot start without all empolyees.");
        }
    }

    public String getChiefOrganiserWithMostEvents() {
        String chiefOrganiser = null;
        int maxEvents = 0;

        for (Map.Entry<String, Integer> entry : chiefOrganiserCount.entrySet()) {
            if (entry.getValue() > maxEvents) {
                maxEvents = entry.getValue();
                chiefOrganiser = entry.getKey();
            }
        }

        return chiefOrganiser;
    }
}