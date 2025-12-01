package uas.models;

public class Windows extends OperatingSystem{
    public Windows(String nama, String version) {
        super(nama, version);
    }

    @Override
    public String getNama() {
        return "Windows";
    }

    @Override
    public String getBootInfo() {
        return super.getBootInfo();
    }
}
