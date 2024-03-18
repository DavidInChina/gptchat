package io.sentry.android.core;

import android.os.FileObserver;
import id.AbstractC3557B;
import io.sentry.C3695y0;
import io.sentry.EnumC3642e1;
import java.io.File;

/* loaded from: classes2.dex */
public final class H extends FileObserver {

    /* renamed from: a  reason: collision with root package name */
    public final String f33977a;

    /* renamed from: b  reason: collision with root package name */
    public final io.sentry.F f33978b;

    /* renamed from: c  reason: collision with root package name */
    public final io.sentry.H f33979c;

    /* renamed from: d  reason: collision with root package name */
    public final long f33980d;

    public H(String str, C3695y0 c3695y0, io.sentry.H h10, long j6) {
        super(str);
        this.f33977a = str;
        this.f33978b = c3695y0;
        Ad.l.Z0("Logger is required.", h10);
        this.f33979c = h10;
        this.f33980d = j6;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i10, String str) {
        if (str != null && i10 == 8) {
            EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
            Integer valueOf = Integer.valueOf(i10);
            String str2 = this.f33977a;
            io.sentry.H h10 = this.f33979c;
            h10.f(enumC3642e1, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", valueOf, str2, str);
            this.f33978b.a(AbstractC3557B.t0(new G(this.f33980d, h10)), R.a.t(android.gov.nist.core.a.p(str2), File.separator, str));
        }
    }
}
