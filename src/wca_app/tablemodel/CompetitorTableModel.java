
package wca_app.tablemodel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import wca_app.model.Competition;
import wca_app.model.Competitor;

/**
 * @author Mata
 */
public class CompetitorTableModel extends AbstractTableModel{
    
    public static final int OBJECT_COL = -1;
    public static final int ID_COL = 0;
    public static final int FIRST_NAME_COL = 1;
    public static final int LAST_NAME_COL = 2;
    public static final int GENDER_COL = 3;
    public static final int TAG_COL = 4;
    public static final int COUNTRY_ID_COL = 5;
    
    //  Setting column names in view table
    private static final String[] columnNames = 
        {"id", "First name", "Last name", "Gender", "Tag", "Country"};
    
    private List<Competitor> competitors;
    
    //  CONSTRUCTOR
    public CompetitorTableModel(List<Competitor> theCompetitor) {
        competitors = theCompetitor;
    }
    
    //  IMPLEMENTED ABSTRACT METHODS
    @Override
    public String getColumnName(int col){
        return columnNames[col];
    }

    @Override
    public int getRowCount() {
        return competitors.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Competitor tempCompetitor = competitors.get(row);
        
        switch (col) {
            case ID_COL:
                return tempCompetitor.getId();
            case FIRST_NAME_COL:
                return tempCompetitor.getFirstName();
            case LAST_NAME_COL:
                return tempCompetitor.getLastName();
            case GENDER_COL:
                if(tempCompetitor.getGender() == 'M'){
                    return "Male";
                }else{
                    return "Female";
                }
            case TAG_COL:
                return tempCompetitor.getTag();
            case COUNTRY_ID_COL:
                return tempCompetitor.getCountry_id().getName();
            case OBJECT_COL:
                return tempCompetitor;
            default:
                return tempCompetitor.getTag();    
        }
    }
    
    @Override
    public Class getColumnClass(int col){
        return getValueAt(0, col).getClass();
    }
    //  END IMPLEMENTED ABSTRACT METHODS
}
