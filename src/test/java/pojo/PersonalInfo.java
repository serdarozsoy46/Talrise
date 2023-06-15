package pojo;

public class PersonalInfo {
    /*
    {
        "talriseUserId": 3540,
                "candidateId": 1703,
                "firstName": "serdar",
                "lastName": "ozsoy",
                "linkedIn": "linkedin.com/in/ozsoyserdar",
                "email": "serdar_ozsoy@msn.com",
                "countryPhoneCode": "+44",
                "mobile": "07877801727",
                "countryId": 3,
                "cityId": 11
    }
*/
    public int talriseUserId;
    public int candidateId;
    public String firstName;
    public String lastName;
    public String linkedIn;
    public String email;
    public String countryPhoneCode;
    public String mobile;
    public int countryId;
    public int cityId;

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "talriseUserId=" + talriseUserId +
                ", candidateId=" + candidateId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", linkedIn='" + linkedIn + '\'' +
                ", email='" + email + '\'' +
                ", countryPhoneCode='" + countryPhoneCode + '\'' +
                ", mobile='" + mobile + '\'' +
                ", countryId=" + countryId +
                ", cityId=" + cityId +
                '}';
    }

    public PersonalInfo() {
    }

    public PersonalInfo(int talriseUserId, int candidateId, String firstName, String lastName, String linkedIn, String email, String countryPhoneCode, String mobile, int countryId, int cityId) {

        this.talriseUserId = talriseUserId;
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.linkedIn = linkedIn;
        this.email = email;
        this.countryPhoneCode = countryPhoneCode;
        this.mobile = mobile;
        this.countryId = countryId;
        this.cityId = cityId;
    }

    public int getTalriseUserId() {
        return talriseUserId;
    }

    public void setTalriseUserId(int talriseUserId) {
        this.talriseUserId = talriseUserId;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountryPhoneCode() {
        return countryPhoneCode;
    }

    public void setCountryPhoneCode(String countryPhoneCode) {
        this.countryPhoneCode = countryPhoneCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
