
package wca_app.tablemodel;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import wca_app.model.Competition;
import wca_app.model.Continent;
import wca_app.model.Result;

/**
 * @author Mata
 */
public class CompetitorsFromCompetitonTableModel extends AbstractTableModel{
    
    public static final int OBJECT_COL = -1;
    public static final int COMPETITION_COL = 0;
    public static final int COMPETITOR_COL = 1;
    public static final int POSITION_COL = 2;
    
    
    //  Setting column names in view table
    private static final String[] columnNames = 
        {"Competition", "Competitor", "Position"};
    
    private List<Result> results;
    
    //  CONSTRUCTOR
    public CompetitorsFromCompetitonTableModel(List<Result> results) {
        this.results = results;
    }
    
    
    //  IMPLEMENTED ABSTRACT METHODS
    @Override
    public String getColumnName(int col){
        return columnNames[col];
    }

    @Override
    public int getRowCount() {
        return results.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Result tempResults = results.get(row);
        
        switch (col) {
            case COMPETITION_COL:
                return tempResults.getCompetition_id().getName();
            case COMPETITOR_COL:
                String fullName = tempResults.getCompetitor_id().getFirstName();
                fullName += tempResults.getCompetitor_id().getLastName();
                return fullName;
            case POSITION_COL:
                return tempResults.getPosition();
            case OBJECT_COL:
                return tempResults;
            default:
                return tempResults.toString();    
        }
    }
    
    //  END IMPLEMENTED ABSTRACT METHODS
}
