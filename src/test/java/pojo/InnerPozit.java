package pojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.swing.text.Position;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "positionId"
})

public class InnerPozit {

    @JsonProperty("positionId")
    private Integer positionId;


    public InnerPozit() {
    }


    public InnerPozit(Integer positionId) {
        super();
        this.positionId = positionId;
    }

    @JsonProperty("positionId")
    public Integer getPositionId() {
        return positionId;
    }

    @JsonProperty("positionId")
    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InnerPozit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("positionId");
        sb.append('=');
        sb.append(((this.positionId == null)?"<null>":this.positionId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
