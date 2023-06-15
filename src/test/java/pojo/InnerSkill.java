
package pojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "experienceYearsId",
        "toolId"
})

public class InnerSkill {

    @JsonProperty("experienceYearsId")
    private Integer experienceYearsId;
    @JsonProperty("toolId")
    private Integer toolId;

    public InnerSkill() {
    }


    public InnerSkill(Integer experienceYearsId, Integer toolId) {
        super();
        this.experienceYearsId = experienceYearsId;
        this.toolId = toolId;
    }

    @JsonProperty("experienceYearsId")
    public Integer getExperienceYearsId() {
        return experienceYearsId;
    }

    @JsonProperty("experienceYearsId")
    public void setExperienceYearsId(Integer experienceYearsId) {
        this.experienceYearsId = experienceYearsId;
    }

    @JsonProperty("toolId")
    public Integer getToolId() {
        return toolId;
    }

    @JsonProperty("toolId")
    public void setToolId(Integer toolId) {
        this.toolId = toolId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InnerSkill.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("experienceYearsId");
        sb.append('=');
        sb.append(((this.experienceYearsId == null)?"<null>":this.experienceYearsId));
        sb.append(',');
        sb.append("toolId");
        sb.append('=');
        sb.append(((this.toolId == null)?"<null>":this.toolId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
