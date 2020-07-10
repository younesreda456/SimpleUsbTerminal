package de.kai_morich.simple_usb_terminal;

import com.hoho.android.usbserial.driver.CdcAcmSerialDriver;
import com.hoho.android.usbserial.driver.ProbeTable;
import com.hoho.android.usbserial.driver.UsbSerialProber;

/**
 * add devices here, that are not known to DefaultProber
 *
 * if the App should auto start for these devices, also
 * add IDs to app/src/main/res/xml/usb_device_filter.xml
 */
class CustomProber {

    static UsbSerialProber getCustomProber() {
        ProbeTable customTable = new ProbeTable();
	// Add VID and PID of your device here. Also specify desired driver
        customTable.addProduct(0x0483, 0x5740, CdcAcmSerialDriver.class); // Register STM32H757 Eval Board
        return new UsbSerialProber(customTable);
    }

}
