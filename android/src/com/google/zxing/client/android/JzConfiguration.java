package com.google.zxing.client.android;

/**
 * Configuration class which is suppose to replace Preferences activity.
 */
public class JzConfiguration {

    // select codes to be decoded
    public static final boolean DECODE_1D_PRODUCT = true;
    public static final boolean DECODE_1D_INDUSTRIAL = true;
    public static final boolean DECODE_QR = false;
    public static final boolean DECODE_DATA_MATRIX = false;
    public static final boolean DECODE_AZTEC = false;
    public static final boolean DECODE_PDF417 = false;

    // compatibility settings
    public static final boolean DISABLE_CONTINUOUS_FOCUS = true;
    public static final boolean INVERT_SCAN = false;
    public static final boolean DISABLE_BARCODE_SCENE_MODE = true;
    public static final boolean DISABLE_METERING = true;
    public static final boolean DISABLE_EXPOSURE = true;

    // torch mode - always on/off or auto
    public static final String LIGHT_MODE = "OFF"; // on, off, auto

    // to use autofocus or not to use
    public static final boolean USE_AUTOFOCUS = true;

    // show or not fancy box finder with pulsing red line
    public static final boolean SHOW_FINDER = true;

    public static final boolean BULK_MODE = false;

    // what to do after code was recognized
    public static final boolean PLAY_BEEP = true;
    public static final boolean VIBRATE = true;
}
