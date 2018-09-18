
package wca_app.tablemodel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import wca_app.model.Competition;
import wca_app.model.Continent;
import wca_app.model.Scramble;

/**
 * @author Mata
 */
public class ScrambleTableModel extends AbstractTableModel{
    
    public static final int OBJECT_COL = -1;
    public static final int ID_COL = 0;
    public static final int COMPETITION_COL = 1;
    public static final int EVENT_COL = 2;
    public static final int ROUND_TYPE_COL = 3;
    public static final int GROUP_COL = 4;
    public static final int IS_EXTRA_COL = 5;
    public static final int SCRAMBLE_NUM_COL = 6;
    public static final int SCRAMBLE_COL = 7;
    
    //  Setting column names in view table
    private static final String[] columnNames = 
        {"id", "Competition", "Event", "Round Type", "Group", "Extra",
            "Scramble number", "Scramble"};
    
    private List<Scramble> scrambles;
    
    //  CONSTRUCTOR
    public ScrambleTableModel(List<Scramble> theScrambles) {
        scrambles = theScrambles;
    }
    
    //  IMPLEMENTED ABSTRACT METHODS
    @Override
    public String getColumnName(int col){
        return columnNames[col];
    }

    @Override
    public int getRowCount() {
        return scrambles.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Scramble tempScramble = scrambles.get(row);
        
        switch (col) {
            case ID_COL:
                return tempScramble.getId();
            case COMPETITION_COL:
                return tempScramble.getCompetition_id().getName();
            case EVENT_COL:
                return tempScramble.getEvent_id().getName();
            case ROUND_TYPE_COL:
                return tempScramble.getRoundType_id().getName();
            case GROUP_COL:
                return tempScramble.getGroup();
            case IS_EXTRA_COL:
                return tempScramble.getIsExtra() ? "Yes" : "No";
            case SCRAMBLE_NUM_COL:
                return tempScramble.getScrambleNum();
            case SCRAMBLE_COL:
                return tempScramble.getScramble();
            case OBJECT_COL:
                return tempScramble;
            default:
                return tempScramble.toString();    
        }
    }
    
    @Override
    public Class getColumnClass(int col){
        return getValueAt(0, col).getClass();
    }
    //  END IMPLEMENTED ABSTRACT METHODS
}
