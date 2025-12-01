package uas.views;

import java.util.ArrayList;
import java.util.List;

import uas.controller.DeviceController;
import uas.models.Device;
import uas.models.Fedora;
import uas.models.OperatingSystem;
import uas.models.Ubuntu;
import uas.models.Windows;
import uas.utils.CLIUtils;

class InvalidMenuException extends Exception {
    public InvalidMenuException(String massage) {
        super(massage);
    }
}

class EmptyListException extends Exception {

}

class InvalidOSException extends Exception {
    public InvalidOSException(String massage) {
        super(massage);
    }
}

public class DeviceView {
    private DeviceController deviceController;

    public DeviceView() {
        this.deviceController = new DeviceController();
    }

    public void render() {
        int menu = -1;
        while (menu != 0) {
            System.out.println("MENU");
            System.out.println("1. Tambah Device");
            System.out.println("2. Tampilkan Semua Device");
            System.out.println("3. Tampilkan semua device terurut berdasarkan OS");
            System.out.println("0. Keluar");
            System.out.print("Pilihanmu: ");

            menu = CLIUtils.getInt();
            try {
                if (menu < 1 || menu > 3) {
                    throw new InvalidMenuException("Salah pilihan operating system:" + menu);
                }
                switch (menu) {
                    case 0:
                        break;
                    case 1:
                        handleAdd();
                        break;
                    case 2:
                        try {
                            handlePrintDevice();
                        } catch (EmptyListException e) {
                            System.out.println("List is Empty");
                        }
                        break;
                    case 3:
                        handleSortOS();
                    default:
                        break;
                }
            } catch (InvalidMenuException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void handleAdd() {
        List<Device> devices = new ArrayList<>();

        System.out.println("\nPilih OS");
        System.out.println("1. Windows");
        System.out.println("2. Ubuntu");
        System.out.println("3. Fedora");
        System.out.println("0. Kembali");
        System.out.print("Pilih device: ");
        int device = CLIUtils.getInt();
        CLIUtils.getString();

        System.out.println("masukkan nama pengguna:  ");
        String name = CLIUtils.getString();
        System.out.println("masukkan vesion device: ");
        String vers = CLIUtils.getString();
        switch (device) {
            case 0:
                break;
            case 1:
                // Windows windowNew = new Windows(vers);
                deviceController.add(new Device("Windows", vers, name));
                break;
            case 2:
                // Ubuntu ubuntuNew = new Ubuntu(vers);
                deviceController.add(new Device("Ubuntu", vers, name));
                break;
            case 3:
                // Fedora fedoraNew = new Fedora(vers);
                deviceController.add(new Device("Fedora", vers, name));
                break;
            default:
                break;
        }

    }

    private void handlePrintDevice() throws EmptyListException {
        try {
            List<Device> devices = this.deviceController.getAllDevices();
            for (int i = 0; i < devices.size(); i++) {
                Device device = devices.get(i);
                System.out.println(device.getBootInfo());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void handleSortOS() {
        this.deviceController.sortByDevice();
        System.out.println("os telah diurutkan");
    }
}
