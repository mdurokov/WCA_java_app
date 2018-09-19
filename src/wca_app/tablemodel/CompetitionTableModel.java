
package wca_app.tablemodel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import wca_app.model.Competition;
import wca_app.model.Continent;

/**
 * @author Mata
 */
public class CompetitionTableModel extends AbstractTableModel{
    
    public static final int OBJECT_COL = -1;
    public static final int ID_COL = 6;
    public static final int NAME_COL = 0;
    public static final int CITY_COL = 1;
    public static final int COUNTRY_COL = 2;
    public static final int START_DATE_COL = 3;
    public static final int END_DATE_COL = 4;
    public static final int VENUE_ADDRESS_COL = 5;
    
    //  Setting column names in view table
    private static final String[] columnNames = 
        {"Name", "City", "Country", "Start date", "End date", "Address"};
    
    private List<Competition> competitions;
    
    //  CONSTRUCTOR
    public CompetitionTableModel(List<Competition> theCompetitions) {
        competitions = theCompetitions;
    }
    
    //  IMPLEMENTED ABSTRACT METHODS
    @Override
    public String getColumnName(int col){
        return columnNames[col];
    }

    @Override
    public int getRowCount() {
        return competitions.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Competition tempCompetition = competitions.get(row);
        
        switch (col) {
            case ID_COL:
                return tempCompetition.getId();
            case NAME_COL:
                return tempCompetition.getName();
            case CITY_COL:
                return tempCompetition.getCity();
            case COUNTRY_COL:
                return tempCompetition.getCountry_id();
            case START_DATE_COL:
                return tempCompetition.getStartDate();
            case END_DATE_COL:
                return tempCompetition.getEndDate();
            case VENUE_ADDRESS_COL:
                return tempCompetition.getVenueAddress();
            case OBJECT_COL:
                return tempCompetition;
            default:
                return tempCompetition.getName();    
        }
    }
    
    //  END IMPLEMENTED ABSTRACT METHODS
}
