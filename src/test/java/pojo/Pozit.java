package pojo;

import java.util.*;
import javax.swing.text.Position;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "positions"
})

public class Pozit {

    @JsonProperty("positions")
    private List<InnerPozit> positions;


    public Pozit() {
    }


    public Pozit(List<InnerPozit> positions) {
        super();
        this.positions = positions;
    }

    @JsonProperty("positions")
    public List<InnerPozit> getPositions() {
        return positions;
    }

    @JsonProperty("positions")
    public void setPositions(List<InnerPozit> positions) {
        this.positions = positions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pozit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("positions");
        sb.append('=');
        sb.append(((this.positions == null)?"<null>":this.positions));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}