package Xg;

import N7.c;
import N7.d;
import N7.m;
import Ng.AbstractC1070k;
import Ng.C1072l;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class b implements N7.b, d, c {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1070k f21993Y;

    public /* synthetic */ b(C1072l c1072l) {
        this.f21993Y = c1072l;
    }

    @Override // N7.d
    public void a(Object obj) {
        this.f21993Y.resumeWith(obj);
    }

    @Override // N7.b
    public void b(m mVar) {
        Exception c10 = mVar.c();
        if (c10 == null) {
            if (mVar.f12738d) {
                this.f21993Y.s(null);
                return;
            } else {
                this.f21993Y.resumeWith(mVar.d());
                return;
            }
        }
        this.f21993Y.resumeWith(N.w(c10));
    }

    @Override // N7.c
    public void g(Exception exc) {
        AbstractC3557B.c0("exception", exc);
        this.f21993Y.resumeWith(N.w(exc));
    }
}
