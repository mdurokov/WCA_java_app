
package wca_app.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Mata
 */
@javax.persistence.Entity
@Table(name="Scrambles")
public class Scramble extends Entity implements Serializable{
    @ManyToOne
    @JoinColumn(name="competition_id", nullable=false)    
    private Competition competition_id;
    @ManyToOne
    @JoinColumn(name="event_id", nullable=false) 
    private Event event_id;
    @ManyToOne
    @JoinColumn(name="roundType_id", nullable=false) 
    private RoundType roundType_id;
    @Column(name = "group", nullable=false)
    private String group;
    @Column(nullable=false)
    private boolean isExtra;
    @Column(nullable=false)
    private int scrambleNum;
    @Column(nullable=false)
    private String scramble;

    public Scramble() {
    }

    public Scramble(Competition competition_id, Event event_id, RoundType roundType_id, String group, boolean isExtra, int scrambleNum, String scramble) {
        this.competition_id = competition_id;
        this.event_id = event_id;
        this.roundType_id = roundType_id;
        this.group = group;
        this.isExtra = isExtra;
        this.scrambleNum = scrambleNum;
        this.scramble = scramble;
    }

    public Competition getCompetition_id() {
        return competition_id;
    }

    public void setCompetition_id(Competition competition_id) {
        this.competition_id = competition_id;
    }

    public Event getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Event event_id) {
        this.event_id = event_id;
    }

    public RoundType getRoundType_id() {
        return roundType_id;
    }

    public void setRoundType_id(RoundType roundType_id) {
        this.roundType_id = roundType_id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean getIsExtra() {
        return isExtra;
    }

    public void setIsExtra(boolean isExtra) {
        this.isExtra = isExtra;
    }

    public int getScrambleNum() {
        return scrambleNum;
    }

    public void setScrambleNum(int scrambleNum) {
        this.scrambleNum = scrambleNum;
    }

    public String getScramble() {
        return scramble;
    }

    public void setScramble(String scramble) {
        this.scramble = scramble;
    }
    
    
}
