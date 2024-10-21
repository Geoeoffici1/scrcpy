package com.genymobile.scrcpy.device;

public final class DeviceApp {

    private final String packageName;
    private final String name;
    private final boolean system;
    private final boolean enabled;

    public DeviceApp(String packageName, String name, boolean system, boolean enabled) {
        this.packageName = packageName;
        this.name = name;
        this.system = system;
        this.enabled = enabled;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getName() {
        return name;
    }

    public boolean isSystem() {
        return system;
    }

    public boolean isEnabled() {
        return enabled;
    }
}