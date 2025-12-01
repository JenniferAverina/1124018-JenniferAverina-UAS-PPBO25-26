package uas.models;

public class Ubuntu extends Linux{
    public Ubuntu(String version) {
        super("Ubuntu", version, "Gnome");
    }

    @Override
    public String getNama() {
        return "Ubuntu";
    }

    @Override
    public String getBootInfo() {
        return "ubuntu " + super.getBootInfo();
    }
}
