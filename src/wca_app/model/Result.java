
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
@Table(name = "Results")
public class Result extends Entity implements Serializable{
    @ManyToOne
    @JoinColumn(name="competition_id", nullable=false)
    private Competition competition_id;
    @ManyToOne
    @JoinColumn(name="event_id", nullable=false)
    private Event event_id;
    @ManyToOne
    @JoinColumn(name="roundType_id", nullable=false)
    private RoundType roundType_id;
    @ManyToOne
    @JoinColumn(name="competitor_id", nullable=false)
    private Competitor competitor_id;
    @ManyToOne
    @JoinColumn(name="format_id", nullable=false)
    private Format format_id;
    private int position;
    private int value1;
    private int value2;
    private int value3;
    private int value4;
    private int value5;
    

    public Result() {
    }

    public Result(Competition competition_id, Event event_id,
            RoundType roundType_id, Competitor competitor_id,
            Format format_id, int position, int value1, int value2,
            int value3, int value4, int value5) {
        this.competition_id = competition_id;
        this.event_id = event_id;
        this.roundType_id = roundType_id;
        this.competitor_id = competitor_id;
        this.format_id = format_id;
        this.position = position;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
        this.value5 = value5;
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
 
    public Competitor getCompetitor_id() {
        return competitor_id;
    }

    public void setCompetitor_id(Competitor competitor_id) {
        this.competitor_id = competitor_id;
    }

    public Format getFormat_id() {
        return format_id;
    }

    public void setFormat_id(Format format_id) {
        this.format_id = format_id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int getValue3() {
        return value3;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
    }

    public int getValue4() {
        return value4;
    }

    public void setValue4(int value4) {
        this.value4 = value4;
    }

    public int getValue5() {
        return value5;
    }

    public void setValue5(int value5) {
        this.value5 = value5;
    }
    
    
    
    
}
