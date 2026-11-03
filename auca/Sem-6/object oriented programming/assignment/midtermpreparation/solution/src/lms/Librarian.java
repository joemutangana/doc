package lms;

public class Librarian{

    
    private int librarianId;
    private String librarianName;
    private String librarianEmail;
    private int yearsOfExperience;
    private String librarySection;

    public Librarian(int librarianId, String librarianName, String librarianEmail, int yearsOfExperience,
            String librarySection) {
        this.librarianId = librarianId;
        this.librarianName = librarianName;
        this.librarianEmail = librarianEmail;
        this.yearsOfExperience = yearsOfExperience;
        this.librarySection = librarySection;
    }

    public int getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(int librarianId) {
        this.librarianId = librarianId;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    public String getLibrarianEmail() {
        return librarianEmail;
    }

    public void setLibrarianEmail(String librarianEmail) {
        this.librarianEmail = librarianEmail;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getLibrarySection() {
        return librarySection;
    }

    public void setLibrarySection(String librarySection) {
        this.librarySection = librarySection;
    }
    

    @Override
    public String toString() {
        return "\nLibrarianId: " + librarianId + "\nLibrarianName: " + librarianName + "\nLibrarianEmail: "
                + librarianEmail + "\nYearsOfExperience=" + yearsOfExperience + "\nLibrarySection=" + librarySection
                + "\n";
    }

    

    

    
}