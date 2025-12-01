package uas.models;

public class Device extends OperatingSystem{
    private String namaPengguna;
    private OperatingSystem os;

    public Device(String namaDevice, String version, String namaPengguna) {
        super(namaPengguna, version);
        this.namaPengguna = namaPengguna;
    }

    public String getNamaUser() {
        return this.namaPengguna;
    }

    public OperatingSystem getOperatingSystem() {
        return this.os;
    }

    @Override
    public String getBootInfo() {
        return this.namaPengguna + " booted: Booting " +  super.getBootInfo();
    }
}
