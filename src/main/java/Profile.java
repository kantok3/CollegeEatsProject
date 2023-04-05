public class Profile{
    private String full_name;
    private String email;
    private String password;


    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password) {
        if (password.length() < 8 || !password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long and contain at least one digit");
        }
        this.password = password;
    }
    public String getEmail(){
        return this.password;
    }
    public void setEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (!email.matches(emailRegex)) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_Name(String fullName) {
        if (!fullName.matches("^[A-Za-z]+\\s[A-Za-z]+$")) {
            throw new IllegalArgumentException("Invalid full name");
        }
        this.full_name = fullName;
    }
    
    
    







}