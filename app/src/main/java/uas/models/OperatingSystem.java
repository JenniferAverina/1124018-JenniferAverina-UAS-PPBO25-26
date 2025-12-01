package uas.models;

public abstract class OperatingSystem{
    private String namaDevice;
    private String version;

    public OperatingSystem(String name, String version) {
        this.namaDevice = name;
        this.version = version;
    }

    public String getNama() {
        return this.namaDevice;
    }

    public String getVersion() {
        return this.version;
    }

    public String getBootInfo() {
        return this.namaDevice + " " + this.version;
    }

    // public abstract String getBootInfo();
}
