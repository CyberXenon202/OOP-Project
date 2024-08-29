package University;

public class Faculty {
    private int facultyId;
    private String facultyName;
    private String facultyPosition;


    //constructor
    public Faculty(){

    }
    public Faculty(int facultyId, String facultyName, String facultyPosition){
        this.facultyId=facultyId;
        this.facultyName=facultyName;
        this.facultyPosition=facultyPosition;
    }


    //To String
    public String toString(){
        return ("Faculty Name: "+this.facultyName+"  Faculty Id: "+this.facultyId+  "  Faculty Position: "+this.facultyPosition );
    }

    //Getter
    public int getFacultyId() {
        return facultyId;
    }
    public String getFacultyName() {
        return facultyName;
    }
    public String getFacultyPosition() {
        return facultyPosition;
    }

    //Setter
    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    public void setFacultyPosition(String facultyPosition) {
        this.facultyPosition = facultyPosition;
    }

    
}
