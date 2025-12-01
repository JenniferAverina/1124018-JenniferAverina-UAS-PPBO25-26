package uas.models;

public abstract class Linux extends OperatingSystem{
    private String desktopEnvironmentName;

    public Linux(String namaDevice, String version, String desktopEnvironmentName) {
        super(namaDevice, version);
        this.desktopEnvironmentName = desktopEnvironmentName;
    }

    public String getDesktopEnvironmentName() {
        return this.desktopEnvironmentName;
    }
}
