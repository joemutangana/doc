package lms;
public class Member{

    private int memberId;
    private String intmemberName;
    private String memberEmail;
    private int memberAge;
    private String membershipType;


    public Member(int memberId, String intmemberName, String memberEmail, int memberAge, String membershipType) {
        this.memberId = memberId;
        this.intmemberName = intmemberName;
        this.memberEmail = memberEmail;
        this.memberAge = memberAge;
        this.membershipType = membershipType;
    }


    public int getMemberId() {
        return memberId;
    }


    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }


    public String getIntmemberName() {
        return intmemberName;
    }


    public void setIntmemberName(String intmemberName) {
        this.intmemberName = intmemberName;
    }


    public String getMemberEmail() {
        return memberEmail;
    }


    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }


    public int getMemberAge() {
        return memberAge;
    }


    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }


    public String getMembershipType() {
        return membershipType;
    }


    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }


    @Override
    public String toString() {
        return "\nmemberId: " + memberId + "\nintmemberName: " + intmemberName + "\nMemberEmail: " + memberEmail
                + "\nMemberAge: " + memberAge + "\nMembershipType: " + membershipType + "\n";
    }




    

    

}