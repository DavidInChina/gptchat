package E2;

import N.C1025i;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import p2.AbstractC5069w;
import p2.C5047B;
import p2.C5065s;
import p2.C5068v;
import p2.C5071y;
import p2.C5072z;
import v2.AbstractC5968g;

/* loaded from: classes2.dex */
public final class f0 extends AbstractC0469a {

    /* renamed from: h  reason: collision with root package name */
    public final v2.l f4337h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC5968g f4338i;

    /* renamed from: j  reason: collision with root package name */
    public final C5065s f4339j;

    /* renamed from: k  reason: collision with root package name */
    public final long f4340k = -9223372036854775807L;

    /* renamed from: l  reason: collision with root package name */
    public final R4.a f4341l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f4342m;

    /* renamed from: n  reason: collision with root package name */
    public final b0 f4343n;

    /* renamed from: o  reason: collision with root package name */
    public final p2.H f4344o;

    /* renamed from: p  reason: collision with root package name */
    public v2.F f4345p;

    /* JADX WARN: Type inference failed for: r14v0, types: [p2.w, p2.x] */
    public f0(String str, p2.G g10, AbstractC5968g abstractC5968g, R4.a aVar, boolean z10, Object obj) {
        boolean z11;
        p2.C c10;
        this.f4338i = abstractC5968g;
        this.f4341l = aVar;
        this.f4342m = z10;
        C5068v c5068v = new C5068v();
        C5071y c5071y = new C5071y();
        List emptyList = Collections.emptyList();
        x8.k0 k0Var = x8.k0.f49573j0;
        p2.D d10 = p2.D.f41769i0;
        Uri uri = Uri.EMPTY;
        String uri2 = g10.f41792Y.toString();
        uri2.getClass();
        x8.N V10 = x8.N.V(x8.N.u0(g10));
        if (((Uri) c5071y.f42360e) != null && ((UUID) c5071y.f42359d) == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        Gi.e.n(z11);
        C5072z c5072z = null;
        if (uri != null) {
            c10 = new p2.C(uri, null, ((UUID) c5071y.f42359d) != null ? new C5072z(c5071y) : c5072z, null, emptyList, null, V10, obj, -9223372036854775807L);
        } else {
            c10 = null;
        }
        p2.H h10 = new p2.H(uri2, new AbstractC5069w(c5068v), c10, new C5047B(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), p2.K.f41848N0, d10);
        this.f4344o = h10;
        p2.r rVar = new p2.r();
        String str2 = g10.f41793Z;
        rVar.f42237k = str2 == null ? "text/x-unknown" : str2;
        rVar.f42229c = g10.f41794h0;
        rVar.f42230d = g10.f41795i0;
        rVar.f42231e = g10.f41796j0;
        rVar.f42228b = g10.f41797k0;
        String str3 = g10.f41798l0;
        rVar.f42227a = str3 == null ? str : str3;
        this.f4339j = new C5065s(rVar);
        Map emptyMap = Collections.emptyMap();
        Uri uri3 = g10.f41792Y;
        Gi.e.p(uri3, "The uri must be set.");
        this.f4337h = new v2.l(uri3, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        this.f4343n = new b0(-9223372036854775807L, true, false, h10);
    }

    @Override // E2.AbstractC0469a
    public final AbstractC0490w a(C0492y c0492y, I2.d dVar, long j6) {
        v2.F f6 = this.f4345p;
        C1025i c1025i = new C1025i((CopyOnWriteArrayList) this.f4277c.f12352i0, 0, c0492y);
        return new e0(this.f4337h, this.f4338i, f6, this.f4339j, this.f4340k, this.f4341l, c1025i, this.f4342m);
    }

    @Override // E2.AbstractC0469a
    public final p2.H g() {
        return this.f4344o;
    }

    @Override // E2.AbstractC0469a
    public final void k(v2.F f6) {
        this.f4345p = f6;
        l(this.f4343n);
    }

    @Override // E2.AbstractC0469a
    public final void m(AbstractC0490w abstractC0490w) {
        I2.n nVar = ((e0) abstractC0490w).f4320n0;
        I2.j jVar = nVar.f8009b;
        if (jVar != null) {
            jVar.a(true);
        }
        nVar.f8008a.shutdown();
    }

    @Override // E2.AbstractC0469a
    public final void i() {
    }

    @Override // E2.AbstractC0469a
    public final void o() {
    }
}
