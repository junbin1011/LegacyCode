package com.legacy;

import java.net.DatagramPacket;
import java.util.InvalidPropertiesFormatException;

public class RSCWorkflow {
    private static final int MAX_LENGTH = 100;

    public void validate(DatagramPacket packet) throws InvalidPropertiesFormatException {
        if (packet.getData().equals("MIA")
                || packet.getLength() > MAX_LENGTH
                || packet.getOffset() > 0) {
            throw new InvalidPropertiesFormatException("");
        }
    }
}
