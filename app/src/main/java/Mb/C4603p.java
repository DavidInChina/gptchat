package mb;

import E2.C0479k;
import E2.C0481m;
import Ng.D0;
import Ng.Q;
import Qg.r0;
import Qg.s0;
import android.app.Application;
import java.util.Map;
import ld.C4428a;
import ld.C4429b;
import v2.AbstractC5968g;
import y2.C6504G;
import y2.C6528o;
import y2.C6529p;
import y2.C6531s;

/* renamed from: mb.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4603p {

    /* renamed from: a  reason: collision with root package name */
    public final C4428a f39079a;

    /* renamed from: b  reason: collision with root package name */
    public final r0 f39080b;

    /* renamed from: c  reason: collision with root package name */
    public final r0 f39081c;

    /* renamed from: d  reason: collision with root package name */
    public final r0 f39082d;

    /* renamed from: e  reason: collision with root package name */
    public final r0 f39083e;

    /* renamed from: f  reason: collision with root package name */
    public D0 f39084f;

    /* renamed from: g  reason: collision with root package name */
    public final C6504G f39085g;

    /* JADX WARN: Type inference failed for: r2v2, types: [L2.o, java.lang.Object, L2.t] */
    public C4603p(Application application, C4428a c4428a, C4429b c4429b, C4607t c4607t) {
        this.f39079a = c4428a;
        r0 b10 = s0.b(0, 0, null, 7);
        this.f39080b = b10;
        this.f39081c = b10;
        r0 b11 = s0.b(0, 0, null, 7);
        this.f39082d = b11;
        this.f39083e = b11;
        C6531s c6531s = new C6531s(application, new C6529p(application, 0), new C6529p(application, 1));
        ?? obj = new Object();
        synchronized (obj) {
            obj.f10634Z = 4;
        }
        obj.c();
        C0481m c0481m = new C0481m(application, obj);
        c0481m.f4379b = c4607t;
        C0479k c0479k = c0481m.f4378a;
        if (c4607t != ((AbstractC5968g) c0479k.f4371e)) {
            c0479k.f4371e = c4607t;
            ((Map) c0479k.f4368b).clear();
            ((Map) c0479k.f4369c).clear();
        }
        Gi.e.n(!c6531s.f50698s);
        c6531s.f50683d = new C6528o(c0481m, 0);
        Gi.e.n(!c6531s.f50698s);
        c6531s.f50698s = true;
        C6504G c6504g = new C6504G(c6531s);
        this.f39085g = c6504g;
        c4429b.a(new C4589b(this, null));
        c6504g.f50373l.a(new C4595h(this));
    }

    public final void a() {
        Tg.e eVar = Q.f12904a;
        Ad.l.O0(this.f39079a, Sg.u.f16684a, null, new C4596i(this, null), 2);
    }
}
