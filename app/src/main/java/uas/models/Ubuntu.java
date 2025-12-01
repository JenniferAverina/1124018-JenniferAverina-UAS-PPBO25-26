package uas.models;

public class Ubuntu extends Linux{
    public Ubuntu(String namaDevice, String version) {
        super(namaDevice, version, "Gnome");
    }

    @Override
    public String getNama() {
        return "Ubuntu";
    }

    @Override
    public String getBootInfo() {
        return getNama() + super.getBootInfo();
    }
}
