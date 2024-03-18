package C2;

import K4.C0822j;
import android.net.Uri;
import id.AbstractC3557B;
import io.sentry.D0;
import io.sentry.E0;
import io.sentry.N;
import java.util.List;
import java.util.Map;
import z2.AbstractC6758c;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements s, L2.t, K4.t, io.sentry.util.a, E0, s2.m {
    public /* synthetic */ r(int i10) {
    }

    @Override // L2.t
    public L2.q[] a(Uri uri, Map map) {
        return b();
    }

    public L2.q[] b() {
        return new f3.e[]{new Object()};
    }

    @Override // io.sentry.E0
    public void f(N n10) {
        D0 d02 = (D0) n10;
        synchronized (d02.f33776o) {
            ((D0) n10).f33779r = new s3.z(7);
            Object obj = d02.f33779r.f45394a;
        }
    }

    @Override // s2.m
    public void invoke(Object obj) {
        ((AbstractC6758c) obj).getClass();
    }

    @Override // K4.t
    public void onPurchasesUpdated(C0822j c0822j, List list) {
        AbstractC3557B.c0("<anonymous parameter 0>", c0822j);
    }

    @Override // io.sentry.util.a
    public void accept(Object obj) {
    }
}
