package pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "skills"
})

public class Skills {

    @JsonProperty("skills")
    private List<InnerSkill> skills;


    public Skills() {
    }


    public Skills(List<InnerSkill> skills) {
        super();
        this.skills = skills;
    }

    @JsonProperty("skills")
    public List<InnerSkill> getSkills() {
        return skills;
    }

    @JsonProperty("skills")
    public void setSkills(List<InnerSkill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Skills.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("skills");
        sb.append('=');
        sb.append(((this.skills == null) ? "<null>" : this.skills));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}