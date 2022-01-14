package quoters;

public class ProfilingController implements ProfilingControllerMBean {
    // is to be changed in  jvisualvm (plugin MBeans)
    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
