package s2;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes2.dex */
public final class r extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a  reason: collision with root package name */
    public final s f45179a;

    public r(s sVar) {
        this.f45179a = sVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z10;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i10 = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        s sVar = this.f45179a;
        if (z10) {
            i10 = 10;
        }
        s.a(i10, sVar);
    }
}
