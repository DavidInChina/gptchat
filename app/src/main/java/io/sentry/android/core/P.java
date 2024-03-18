package io.sentry.android.core;

import android.telephony.PhoneStateListener;
import io.sentry.C3640e;
import io.sentry.EnumC3642e1;

/* loaded from: classes2.dex */
public final class P extends PhoneStateListener {

    /* renamed from: a  reason: collision with root package name */
    public final io.sentry.G f34014a;

    public P(io.sentry.G g10) {
        this.f34014a = g10;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i10, String str) {
        if (i10 == 1) {
            C3640e c3640e = new C3640e();
            c3640e.f34320h0 = "system";
            c3640e.f34322j0 = "device.event";
            c3640e.a("action", "CALL_STATE_RINGING");
            c3640e.f34319Z = "Device ringing";
            c3640e.f34323k0 = EnumC3642e1.INFO;
            this.f34014a.i(c3640e);
        }
    }
}
