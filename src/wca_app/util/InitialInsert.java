package wca_app.util;

import java.math.BigInteger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import wca_app.model.Continent;
import wca_app.model.Country;
import wca_app.model.Event;
import wca_app.model.Format;
import wca_app.model.Operator;
import wca_app.model.RoundType;

/**
 * @author Mata
 */
public class InitialInsert {
    
    public static void run() {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            transaction = session.beginTransaction();

            // Operator
            Operator operator = new Operator("matejdurokovic@gmail.com", Autorization.getHash("lozinka"), Boolean.TRUE);
            session.save(operator);
            operator = new Operator("judge@gmail.com", Autorization.getHash("lozinka"), Boolean.FALSE);
            session.save(operator);

            // Continents
            Continent continent = new Continent("Africa", "AfR", new BigInteger("213671"), new BigInteger("16984850"), 3);
            session.save(continent);
            continent = new Continent("Asia", "AsR", new BigInteger("34364439"), new BigInteger("108330700"), 3);
            session.save(continent);
            Continent continent1 = new Continent("Europe", "ER", new BigInteger("58299984"), new BigInteger("23049300"), 3);
            session.save(continent1);
            continent = new Continent("North America", "NAR", new BigInteger("45486546"), new BigInteger("-93449700"), 3);
            session.save(continent);
            continent = new Continent("Oceania", "OcR", new BigInteger("-25274398"), new BigInteger("133775136"), 3);
            session.save(continent);
            continent = new Continent("South America", "SAR", new BigInteger("-21735104"), new BigInteger("-63281250"), 3);
            session.save(continent);
            continent = new Continent("Multiple Continents", "", new BigInteger("0"), new BigInteger("0"), 1);
            session.save(continent);

            //Country
            Country country = new Country(continent1, "Croatia", "cro");
            session.save(country);
            
            // Events
            Event event = new Event("2x2x2 Cube", 20, "time");
            session.save(event);
            event = new Event("3x3x3 Cube", 10, "time");
            session.save(event);
            event = new Event("3x3x3 Blindfolded", 70, "time");
            session.save(event);
            event = new Event("3x3x3 Fewest Moves", 80, "number");
            session.save(event);
            event = new Event("3x3x3 With Feet", 100, "time");
            session.save(event);
            event = new Event("3x3x3 Multi-Blind", 180, "multi");
            session.save(event);
            event = new Event("3x3x3 Multi-Blind Old Style", 999, "multi");
            session.save(event);
            event = new Event("3x3x3 One-Handed", 90, "time");
            session.save(event);
            event = new Event("4x4x4 Cube", 30, "time");
            session.save(event);
            event = new Event("4x4x4 Blindfolded", 160, "time");
            session.save(event);
            event = new Event("5x5x5 Cube", 40, "time");
            session.save(event);
            event = new Event("5x5x5 Blindfolded", 170, "time");
            session.save(event);
            event = new Event("6x6x6 Cube", 50, "time");
            session.save(event);
            event = new Event("7x7x7 Cube", 60, "time");
            session.save(event);
            event = new Event("Clock", 110, "time");
            session.save(event);
            event = new Event("Magic", 997, "time");
            session.save(event);
            event = new Event("Megaminx", 120, "time");
            session.save(event);
            event = new Event("Master Magic", 998, "time");
            session.save(event);
            event = new Event("Pyraminx", 130, "time");
            session.save(event);
            event = new Event("Skewb", 140, "time");
            session.save(event);
            event = new Event("Square-1", 150, "time");
            session.save(event);

            // Formats
            Format format = new Format("Best of 1");
            session.save(format);
            format = new Format("Best of 2");
            session.save(format);
            format = new Format("Best of 3");
            session.save(format);
            format = new Format("Average of 5");
            session.save(format);
            format = new Format("Mean of 3");
            session.save(format);

            // RoundTypes
            RoundType roundType = new RoundType(19, "Qualification round", "Qualification", false);
            session.save(roundType);
            roundType = new RoundType(29, "First round", "First", false);
            session.save(roundType);
            roundType = new RoundType(50, "Second round", "Second", false);
            session.save(roundType);
            roundType = new RoundType(79, "Semi Final", "Semi Final", false);
            session.save(roundType);
            roundType = new RoundType(39, "B Final", "B Final", false);
            session.save(roundType);
            roundType = new RoundType(90, "Combined Final", "Combined Final", true);
            session.save(roundType);
            roundType = new RoundType(20, "Combined First round", "Combined First", false);
            session.save(roundType);
            roundType = new RoundType(59, "Combined Second round", "Combined Second", false);
            session.save(roundType);
            roundType = new RoundType(99, "Final", "Final", true);
            session.save(roundType);
            roundType = new RoundType(70, "Combined Third round", "Combined Third", false);
            session.save(roundType);
            roundType = new RoundType(10, "Combined qualification", "Combined qualification", false);
            session.save(roundType);

            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

}
