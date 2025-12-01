package uas.models;

public class Fedora extends Linux {
    public Fedora(String namaDevice, String version) {
        super(namaDevice, version, "KDE Plasma");
    }

    @Override
    public String getBootInfo() {
        return super.getBootInfo();
    }

}
