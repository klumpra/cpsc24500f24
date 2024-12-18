public abstract class Person  {
    private String firstName;
    private String lastName;
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
    public Person() {
        this("","");
    }
    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }
    public abstract String getType(); // leave to subclasses to spell out their specific type

    @Override
    public String toString() {
        return String.format("%s\t%s\t%s",getType(),firstName,lastName);
    }
}
