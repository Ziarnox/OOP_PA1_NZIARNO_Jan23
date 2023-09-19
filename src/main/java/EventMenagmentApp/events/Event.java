package EventMenagmentApp.events;

import EventMenagmentApp.Employees.Helper;
import EventMenagmentApp.Employees.Organiser;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private String name;
    private List<Organiser> organisers;
    private List<Helper> helpers;
    public Organiser chiefOrganiser;

    public Event(String name) {
        this.name = name;
        organisers = new ArrayList<>();
        helpers = new ArrayList<>();
    }
    public void addOrganiser(Organiser organiser) {
        organisers.add(organiser);
    }

    public void addHelper(Helper helper) {
        helpers.add(helper);
    }

    public void assignChiefOrganiser(Organiser organiser) {
        chiefOrganiser = organiser;
    }

    public boolean canStartEvent() {
        return helpers.size() >= 10 && organisers.size() >= 3 && chiefOrganiser != null;
    }
}
