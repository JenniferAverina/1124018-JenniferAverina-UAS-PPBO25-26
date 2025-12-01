package uas.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import uas.models.Device;

class EmptyListException extends Exception {

}

public class DeviceController {
    private List<Device> devices;

    public DeviceController() {
        this.devices = new ArrayList<>();
    }

    public void add(Device d) {
        this.devices.add(d);
    }

    private void validateArrayEmpty() throws EmptyListException {
        if (devices.size() == 0) {
            throw new EmptyListException();
        }
    }

    public List<Device> getAllDevices() throws EmptyListException{
        validateArrayEmpty();
        return this.devices;
    }

    public void sortByDevice() {
        this.devices.sort(new Comparator<Device>() {
            @Override
            public int compare(Device d1, Device d2) {
                return d1.getNama().compareTo(d2.getNama());
            }
        });

    }
}
