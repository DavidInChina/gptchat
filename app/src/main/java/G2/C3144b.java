package g2;

import android.os.PowerManager;

/* renamed from: g2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3144b {

    /* renamed from: a  reason: collision with root package name */
    public static final C3144b f31073a = new Object();

    public final boolean a(PowerManager powerManager) {
        if (!powerManager.isLowPowerStandbyEnabled() && !powerManager.isDeviceLightIdleMode()) {
            return false;
        }
        return true;
    }
}
