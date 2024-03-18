package Kd;

import E2.C0481m;
import Ng.Q;
import Sg.C1394f;
import android.content.Context;
import id.AbstractC3557B;
import p2.C5052e;
import y2.C6504G;
import y2.C6528o;
import y2.C6530q;
import y2.C6531s;

/* renamed from: Kd.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0830f {

    /* renamed from: a  reason: collision with root package name */
    public final C1394f f9733a;

    /* renamed from: b  reason: collision with root package name */
    public final C6504G f9734b;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, L2.t] */
    public C0830f(Context context, Ng.F f6, wf.k kVar, boolean z10, int i10) {
        kVar = (i10 & 4) != 0 ? C0825a.f9724Z : kVar;
        z10 = (i10 & 8) != 0 ? false : z10;
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("parentScope", f6);
        AbstractC3557B.c0("onAudioData", kVar);
        Tg.e eVar = Q.f12904a;
        C1394f c1394f = new C1394f(f6.i().plus(Sg.u.f16684a));
        this.f9733a = c1394f;
        C6531s c6531s = new C6531s(context, new C6530q(0, new n(context, new C0832h(c1394f, kVar))), new C6528o(new C0481m(context, new Object()), 1));
        if (z10) {
            C5052e c5052e = new C5052e(1, 0, 2, 1, 0);
            Gi.e.n(!c6531s.f50698s);
            c6531s.f50689j = c5052e;
            c6531s.f50690k = false;
        }
        Gi.e.n(!c6531s.f50698s);
        c6531s.f50698s = true;
        this.f9734b = new C6504G(c6531s);
    }
}
