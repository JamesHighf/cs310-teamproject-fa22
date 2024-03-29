package edu.jsu.mcis.cs310.tas_fa22;

import edu.jsu.mcis.cs310.tas_fa22.dao.*;
import java.time.*;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class PunchListRangeFindTest {
    
    private DAOFactory daoFactory;
    
    @Before
    public void setup() {

        daoFactory = new DAOFactory("tas.jdbc");
        
    }
    
    @Test
    public void testFindPunchListRange1() {

        BadgeDAO badgeDAO = daoFactory.getBadgeDAO();
        PunchDAO punchDAO = daoFactory.getPunchDAO();

        /* Create StringBuilders for Test Output */
        
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        /* Create Timestamp and Badge Objects for Punch List */
        
        LocalDate ts1 = LocalDate.of(2018, Month.SEPTEMBER, 17);
        LocalDate ts2 = LocalDate.of(2018, Month.SEPTEMBER, 21);

        Badge b = badgeDAO.find("67637925");

        /* Retrieve Punch List #1 (created by DAO) */
        
        ArrayList<Punch> p1 = punchDAO.list(b, ts1, ts2);

        /* Export Punch List #1 Contents to StringBuilder */
        
        for (Punch p : p1) {
            s1.append(p.printOriginal());
            s1.append("\n");
        }

        /* Create Punch List #2 (created manually) */
        
        ArrayList<Punch> p2 = new ArrayList<>();

        /* Add Punches */
        p2.add(punchDAO.find(4716));
        p2.add(punchDAO.find(4811));
        p2.add(punchDAO.find(4813));
        p2.add(punchDAO.find(4847));
        p2.add(punchDAO.find(4884));
        p2.add(punchDAO.find(4949));
        p2.add(punchDAO.find(5018));
        p2.add(punchDAO.find(5132));
        p2.add(punchDAO.find(5177));
        p2.add(punchDAO.find(5267));
        p2.add(punchDAO.find(5324));
        p2.add(punchDAO.find(5392));

        /* Export Punch List #2 Contents to StringBuilder */
        
        for (Punch p : p2) {
            s2.append(p.printOriginal());
            s2.append("\n");
        }

        /* Compare Output Strings */
        
        assertEquals(s2.toString(), s1.toString());

    }
    
    @Test
    public void testFindPunchListRange2() {

        BadgeDAO badgeDAO = daoFactory.getBadgeDAO();
        PunchDAO punchDAO = daoFactory.getPunchDAO();

        /* Create StringBuilders for Test Output */
        
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        /* Create Timestamp and Badge Objects for Punch List */
        
        LocalDate ts1 = LocalDate.of(2018, Month.SEPTEMBER, 22);
        LocalDate ts2 = LocalDate.of(2018, Month.SEPTEMBER, 27);

        Badge b = badgeDAO.find("87176FD7");

        /* Retrieve Punch List #1 (created by DAO) */
        
        ArrayList<Punch> p1 = punchDAO.list(b, ts1, ts2);

        /* Export Punch List #1 Contents to StringBuilder */
        
        for (Punch p : p1) {
            s1.append(p.printOriginal());
            s1.append("\n");
        }

        /* Create Punch List #2 (created manually) */
        
        ArrayList<Punch> p2 = new ArrayList<>();

        /* Add Punches */
        p2.add(punchDAO.find(5505));
        p2.add(punchDAO.find(5566));
        p2.add(punchDAO.find(5630));
        p2.add(punchDAO.find(5689));
        p2.add(punchDAO.find(5793));
        p2.add(punchDAO.find(5812));
        p2.add(punchDAO.find(5820));
        p2.add(punchDAO.find(5832));
        p2.add(punchDAO.find(5945));
        p2.add(punchDAO.find(5962));
        p2.add(punchDAO.find(5966));
        p2.add(punchDAO.find(5975));
        p2.add(punchDAO.find(6089));
        p2.add(punchDAO.find(6112));
        p2.add(punchDAO.find(6118));
        p2.add(punchDAO.find(6129));

        /* Export Punch List #2 Contents to StringBuilder */
        
        for (Punch p : p2) {
            s2.append(p.printOriginal());
            s2.append("\n");
        }

        /* Compare Output Strings */
        
        assertEquals(s2.toString(), s1.toString());

    }
    
    @Test
    public void testFindPunchListRange3() {

        BadgeDAO badgeDAO = daoFactory.getBadgeDAO();
        PunchDAO punchDAO = daoFactory.getPunchDAO();

        /* Create StringBuilders for Test Output */
        
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        /* Create Timestamp and Badge Objects for Punch List */
        
        LocalDate ts1 = LocalDate.of(2018, Month.SEPTEMBER, 5);
        LocalDate ts2 = LocalDate.of(2018, Month.SEPTEMBER, 12);

        Badge b = badgeDAO.find("95497F63");

        /* Retrieve Punch List #1 (created by DAO) */
        
        ArrayList<Punch> p1 = punchDAO.list(b, ts1, ts2);

        /* Export Punch List #1 Contents to StringBuilder */
        
        for (Punch p : p1) {
            s1.append(p.printOriginal());
            s1.append("\n");
        }

        /* Create Punch List #2 (created manually) */
        
        ArrayList<Punch> p2 = new ArrayList<>();

        /* Add Punches */
        p2.add(punchDAO.find(3463));
        p2.add(punchDAO.find(3482));
        p2.add(punchDAO.find(3548));
        p2.add(punchDAO.find(3586));
        p2.add(punchDAO.find(3659));
        p2.add(punchDAO.find(3694));
        p2.add(punchDAO.find(3765));
        p2.add(punchDAO.find(3830));
        p2.add(punchDAO.find(3916));
        p2.add(punchDAO.find(3965));
        p2.add(punchDAO.find(4057));
        p2.add(punchDAO.find(4126));
        p2.add(punchDAO.find(4234));
        p2.add(punchDAO.find(4279));

        /* Export Punch List #2 Contents to StringBuilder */
        
        for (Punch p : p2) {
            s2.append(p.printOriginal());
            s2.append("\n");
        }

        /* Compare Output Strings */
        
        assertEquals(s2.toString(), s1.toString());

    }
    
    @Test
    public void testFindPunchListRangeEdgeCase() {
        
        BadgeDAO badgeDAO = daoFactory.getBadgeDAO();
        PunchDAO punchDAO = daoFactory.getPunchDAO();

        /* Create StringBuilders for Test Output */
        
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        /* Create Timestamp and Badge Objects for Punch List */
        
        LocalDate ts1 = LocalDate.of(2018, Month.SEPTEMBER, 28);
        LocalDate ts2 = LocalDate.of(2018, Month.OCTOBER, 1);

        Badge b = badgeDAO.find("95497F63");

        /* Retrieve Punch List #1 (created by DAO) */
        
        ArrayList<Punch> p1 = punchDAO.list(b, ts1, ts2);

        /* Export Punch List #1 Contents to StringBuilder */
        
        for (Punch p : p1) {
            s1.append(p.printOriginal());
            s1.append("\n");
        }

        /* Create Punch List #2 (created manually) */
        
        ArrayList<Punch> p2 = new ArrayList<>();

        /* Add Punches */
        p2.add(punchDAO.find(6216));
        p2.add(punchDAO.find(6280));
        p2.add(punchDAO.find(6360));
        p2.add(punchDAO.find(6407));
        p2.add(punchDAO.find(6887));
        p2.add(punchDAO.find(6888));
 
        /* Export Punch List #2 Contents to StringBuilder */
        
        for (Punch p : p2) {
            s2.append(p.printOriginal());
            s2.append("\n");
        }

        /* Compare Output Strings */
        
        assertEquals(s2.toString(), s1.toString());
    }
    
    @Test
    public void testFindPunchListRangeEdgeCase2() {
        
        BadgeDAO badgeDAO = daoFactory.getBadgeDAO();
        PunchDAO punchDAO = daoFactory.getPunchDAO();

        /* Create StringBuilders for Test Output */
        
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        /* Create Timestamp and Badge Objects for Punch List */
        
        LocalDate ts1 = LocalDate.of(2018, Month.SEPTEMBER, 28);
        LocalDate ts2 = LocalDate.of(2018, Month.OCTOBER, 2);

        Badge b = badgeDAO.find("95497F63");

        /* Retrieve Punch List #1 (created by DAO) */
        
        ArrayList<Punch> p1 = punchDAO.list(b, ts1, ts2);

        /* Export Punch List #1 Contents to StringBuilder */
        
        for (Punch p : p1) {
            s1.append(p.printOriginal());
            s1.append("\n");
        }

        /* Create Punch List #2 (created manually) */
        
        ArrayList<Punch> p2 = new ArrayList<>();

        /* Add Punches */
        p2.add(punchDAO.find(6216));
        p2.add(punchDAO.find(6280));
        p2.add(punchDAO.find(6360));
        p2.add(punchDAO.find(6407));
        p2.add(punchDAO.find(6887));
        p2.add(punchDAO.find(6888));
        p2.add(punchDAO.find(6889));
        p2.add(punchDAO.find(6890));
 
        /* Export Punch List #2 Contents to StringBuilder */
        
        for (Punch p : p2) {
            s2.append(p.printOriginal());
            s2.append("\n");
        }

        /* Compare Output Strings */
        
        assertEquals(s2.toString(), s1.toString());
    }
}
