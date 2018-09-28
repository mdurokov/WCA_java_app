
package wca_app.tablemodel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import wca_app.model.Competition;
import wca_app.model.Continent;
import wca_app.model.Result;

/**
 * @author Mata
 */
public class ResultTableModel extends AbstractTableModel{
    
    public static final int OBJECT_COL = -1;
    public static final int ID_COL = 0;
    public static final int COMPETITION_COL = 1;
    public static final int COMPETITOR_COL = 2;
    public static final int EVENT_COL = 3;
    public static final int FORMAT_COL = 4;
    public static final int ROUND_TYPE_COL = 5;
    public static final int POSITION_COL = 6;
    public static final int VALUE1_COL = 7;
    public static final int VALUE2_COL = 8;
    public static final int VALUE3_COL = 9;
    public static final int VALUE4_COL = 10;
    public static final int VALUE5_COL = 11;
    
    
    //  Setting column names in view table
    private static final String[] columnNames = 
        {"id", "Competition", "Competitor", "Event", "Format", "Round Type",
            "Position", "1. solve", "2. solve", "3. solve", "4. solve",
            "5. solve"};
    
    private List<Result> results;
    
    //  CONSTRUCTOR
    public ResultTableModel(List<Result> theResults) {
        results = theResults;
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
            case ID_COL:
                return tempResults.getId();
            case COMPETITION_COL:
                return tempResults.getCompetition_id().getName();
            case COMPETITOR_COL:
                String fullName = tempResults.getCompetitor_id().getFirstName();
                fullName += tempResults.getCompetitor_id().getLastName();
                return fullName;
            case EVENT_COL:
                return tempResults.getEvent_id().getName();
            case FORMAT_COL:
                return tempResults.getFormat_id().getName();
            case ROUND_TYPE_COL:
                return tempResults.getRoundType_id().getName();
            case POSITION_COL:
                return tempResults.getPosition();
            case VALUE1_COL:
                return tempResults.getValue1();
            case VALUE2_COL:
                return tempResults.getValue2();
            case VALUE3_COL:
                return tempResults.getValue3();
            case VALUE4_COL:
                return tempResults.getValue4();
            case VALUE5_COL:
                return tempResults.getValue5();
            case OBJECT_COL:
                return tempResults;
            default:
                return tempResults.toString();    
        }
    }
    //  END IMPLEMENTED ABSTRACT METHODS
}
