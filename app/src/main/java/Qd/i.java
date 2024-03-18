package Qd;

import Z8.k1;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.segment.analytics.kotlin.core.TrackEvent;
import eh.AbstractC2904d;
import eh.C2903c;
import id.AbstractC3557B;
import java.util.UUID;
import jf.C3963m;
import jh.L1;

/* loaded from: classes2.dex */
public final class i implements Li.r, m {

    /* renamed from: l0  reason: collision with root package name */
    public static boolean f14608l0;

    /* renamed from: Y  reason: collision with root package name */
    public final k f14610Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ m f14611Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C3963m f14612h0 = R4.b.D1(new C1189h(this, 1));

    /* renamed from: i0  reason: collision with root package name */
    public final C3963m f14613i0 = R4.b.D1(new C1189h(this, 0));

    /* renamed from: j0  reason: collision with root package name */
    public final H f14614j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f14615k0;
    public static final C1183b Companion = new Object();

    /* renamed from: m0  reason: collision with root package name */
    public static Td.b f14609m0 = new L1(1);

    public i(k kVar) {
        C1182a c1182a = new C1182a();
        this.f14610Y = kVar;
        this.f14611Z = c1182a;
        F f6 = H.Companion;
        A h10 = h();
        f6.getClass();
        AbstractC3557B.c0("storage", h10);
        String b10 = h10.b(1);
        C2903c c2903c = AbstractC2904d.f29415d;
        String b11 = h10.b(2);
        b11 = b11 == null ? "{}" : b11;
        c2903c.getClass();
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) c2903c.b(A7.b.U0(kotlinx.serialization.json.c.Companion.serializer()), b11);
        String b12 = h10.b(3);
        if (b12 == null) {
            b12 = UUID.randomUUID().toString();
            AbstractC3557B.b0("randomUUID().toString()", b12);
        }
        this.f14614j0 = new H(b12, b10, cVar);
        this.f14615k0 = true;
        if ((!Lg.n.n2(kVar.f14620a)) && kVar.f14621b != null) {
            f(new Sd.g());
            f(new Sd.b());
            f(new k1(1));
            Ad.l.O0(c1182a.f14586Z, c1182a.f14587h0, null, new C1184c(this, null), 2);
            return;
        }
        throw new IllegalArgumentException("invalid configuration".toString());
    }

    @Override // Qd.m
    public final Ng.B a() {
        return this.f14611Z.a();
    }

    @Override // Qd.m
    public final Ng.F b() {
        return this.f14611Z.b();
    }

    @Override // Qd.m
    public final Ng.B c() {
        return this.f14611Z.c();
    }

    @Override // Qd.m
    public final Ng.B d() {
        return this.f14611Z.d();
    }

    @Override // Qd.m
    public final Li.q e() {
        return this.f14611Z.e();
    }

    public final void f(Rd.j jVar) {
        i().a(jVar);
    }

    public final void g(wf.k kVar) {
        i().b(kVar);
    }

    public final A h() {
        return (A) this.f14613i0.getValue();
    }

    public final Rd.l i() {
        return (Rd.l) this.f14612h0.getValue();
    }

    public final void j(com.segment.analytics.kotlin.core.a aVar) {
        if (!this.f14615k0) {
            return;
        }
        Vd.k.Companion.getClass();
        aVar.o(Vd.j.a());
        aVar.l(p.f14647a);
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("randomUUID().toString()", uuid);
        aVar.n(uuid);
        r.f.M(this, "applying base attributes on " + Thread.currentThread().getName());
        m mVar = this.f14611Z;
        Ad.l.O0(mVar.b(), mVar.d(), null, new C1188g(aVar, this, null), 2);
    }

    public final void k(String str, kotlinx.serialization.json.c cVar) {
        AbstractC3557B.c0(DiagnosticsEntry.Event.PROPERTIES_KEY, cVar);
        j(new TrackEvent(str, cVar));
    }
}
