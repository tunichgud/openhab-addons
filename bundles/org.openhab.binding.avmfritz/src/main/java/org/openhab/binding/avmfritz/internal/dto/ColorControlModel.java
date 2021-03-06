/**
 * Copyright (c) 2010-2021 Contributors to the openHAB project
 * <p>
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.avmfritz.internal.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * See {@link DeviceListModel}.
 *
 * @author Joshua Bacher - Initial contribution
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "colorcontrol")
public class ColorControlModel {

    @XmlAttribute(name = "supported_modes")
    public int supportedModes;
    @XmlAttribute(name = "current_mode")
    public int currentMode;
    public int hue;
    public int saturation;
    public int temperature;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ColorControlModel{");
        sb.append("supportedModes=").append(supportedModes);
        sb.append(", currentMode=").append(currentMode);
        sb.append(", hue=").append(hue);
        sb.append(", saturation=").append(saturation);
        sb.append(", temperature=").append(temperature);
        sb.append('}');
        return sb.toString();
    }

    public Integer getHue() {
        return hue;
    }

    public int getSaturation() {
        return saturation;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getSupportedModes() {
        return supportedModes;
    }

    public int getCurrentMode() {
        return currentMode;
    }
}
