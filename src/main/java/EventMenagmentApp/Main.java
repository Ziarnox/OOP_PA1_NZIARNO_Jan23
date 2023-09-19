package EventMenagmentApp;

import EventMenagmentApp.Employees.Helper;
import EventMenagmentApp.Employees.Organiser;
import EventMenagmentApp.events.Event;

public class Main {
    public static void main(String[] args) {
        EventMenagmentApp.EventMenagmentComp.EventManagementCompany company = new EventMenagmentApp.EventMenagmentComp.EventManagementCompany();

        Organiser organiser1 = new Organiser("Organiser1");
        Organiser organiser2 = new Organiser("Organiser2");
        Organiser organiser3 = new Organiser("Organiser3");
        Helper helper1 = new Helper("Helper1");
        Helper helper2 = new Helper("Helper2");
        Helper helper3 = new Helper("Helper3");
        Helper helper4 = new Helper("Helper4");
        Helper helper5 = new Helper("Helper5");
        Helper helper6 = new Helper("Helper6");
        Helper helper7 = new Helper("Helper7");
        Helper helper8 = new Helper("Helper8");
        Helper helper9 = new Helper("Helper9");
        Helper helper10 = new Helper("Helper10");


        Event wedding = new Event("Wedding");
        wedding.addOrganiser(organiser1);
        wedding.addOrganiser(organiser2);
        wedding.addHelper(helper1);
        wedding.addHelper(helper2);
        wedding.addHelper(helper2);
        wedding.addHelper(helper3);
        wedding.addHelper(helper4);
        wedding.addHelper(helper5);
        wedding.addHelper(helper6);
        wedding.addHelper(helper7);
        wedding.addHelper(helper8);
        wedding.addHelper(helper9);
        wedding.addHelper(helper10);
        wedding.assignChiefOrganiser(organiser1);
        company.organiseEvent(wedding);

        Event conference = new Event("Conference");
        conference.addOrganiser(organiser1);
        conference.addOrganiser(organiser2);
        conference.addOrganiser(organiser3);
        conference.addHelper(helper1);
        conference.addHelper(helper2);
        conference.addHelper(helper3);
        conference.addHelper(helper4);
        conference.addHelper(helper5);
        conference.addHelper(helper6);
        conference.addHelper(helper7);
        conference.addHelper(helper8);
        conference.addHelper(helper9);
        conference.addHelper(helper10);
        conference.assignChiefOrganiser(organiser2);
        company.organiseEvent(conference);

        Event cocktailparty = new Event("cocktail party");
        cocktailparty.addOrganiser(organiser1);
        cocktailparty.addOrganiser(organiser2);
        cocktailparty.addOrganiser(organiser3);
        cocktailparty.addHelper(helper1);
        cocktailparty.addHelper(helper2);
        cocktailparty.addHelper(helper3);
        cocktailparty.addHelper(helper4);
        cocktailparty.addHelper(helper5);
        cocktailparty.addHelper(helper6);
        cocktailparty.addHelper(helper7);
        cocktailparty.addHelper(helper8);
        cocktailparty.addHelper(helper9);
        cocktailparty.addHelper(helper10);
        cocktailparty.assignChiefOrganiser(organiser2);
        company.organiseEvent(cocktailparty);


        String chiefOrganiserWithMostEvents = company.getChiefOrganiserWithMostEvents();
        System.out.println("Chief Organiser with the most events: " + chiefOrganiserWithMostEvents);
    }
}