package Z8;

import com.segment.analytics.kotlin.core.IdentifyEvent;
import com.segment.analytics.kotlin.core.Settings;
import dh.C2701g;
import eh.AbstractC2904d;
import id.AbstractC3557B;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class k1 implements Rd.j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23362Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Rd.h f23363Z;

    /* renamed from: h0  reason: collision with root package name */
    public Qd.i f23364h0;

    public k1(int i10) {
        this.f23362Y = i10;
        if (i10 != 1) {
            this.f23363Z = Rd.h.f15444Z;
        } else {
            this.f23363Z = Rd.h.f15443Y;
        }
    }

    @Override // Rd.j
    public final com.segment.analytics.kotlin.core.a a(com.segment.analytics.kotlin.core.a aVar) {
        switch (this.f23362Y) {
            case 0:
                if (!aVar.e().containsKey("Segment.io")) {
                    AbstractC2904d.f29415d.getClass();
                    C2701g c2701g = C2701g.f28450a;
                    AbstractC4344b.S0(aVar);
                } else {
                    Boolean a5 = Vd.h.a("Segment.io", aVar.e());
                    if (a5 != null && !a5.booleanValue()) {
                        AbstractC2904d.f29415d.getClass();
                        C2701g c2701g2 = C2701g.f28450a;
                        AbstractC4344b.S0(aVar);
                    }
                }
                return aVar;
            default:
                if (aVar.h() == Qd.o.f14644j0) {
                    b().f14614j0.f14583b = aVar.i();
                    Qd.i b10 = b();
                    String c10 = aVar.c();
                    Qd.H h10 = b10.f14614j0;
                    h10.getClass();
                    h10.f14582a = c10;
                    b().f14614j0.f14584c = ((IdentifyEvent) aVar).f27777b;
                } else if (aVar.h() == Qd.o.f14643i0) {
                    Qd.i b11 = b();
                    String c11 = aVar.c();
                    Qd.H h11 = b11.f14614j0;
                    h11.getClass();
                    h11.f14582a = c11;
                } else {
                    if (b().f14614j0.f14583b != null) {
                        aVar.p(String.valueOf(b().f14614j0.f14583b));
                    }
                    if (b().f14614j0.f14582a != null) {
                        aVar.k(b().f14614j0.f14582a.toString());
                    }
                }
                return aVar;
        }
    }

    public final Qd.i b() {
        Qd.i iVar = this.f23364h0;
        if (iVar != null) {
            return iVar;
        }
        AbstractC3557B.C2("analytics");
        throw null;
    }

    @Override // Rd.j
    public final void c(Settings settings, Rd.i iVar) {
        switch (this.f23362Y) {
            case 0:
                AbstractC3557B.J2(settings, iVar);
                return;
            default:
                AbstractC3557B.J2(settings, iVar);
                return;
        }
    }

    @Override // Rd.j
    public final void d(Qd.i iVar) {
        switch (this.f23362Y) {
            case 0:
                AbstractC3557B.t2(this, iVar);
                return;
            default:
                AbstractC3557B.t2(this, iVar);
                return;
        }
    }

    @Override // Rd.j
    public final void e(Qd.i iVar) {
        switch (this.f23362Y) {
            case 0:
                AbstractC3557B.c0("<set-?>", iVar);
                this.f23364h0 = iVar;
                return;
            default:
                AbstractC3557B.c0("<set-?>", iVar);
                this.f23364h0 = iVar;
                return;
        }
    }

    @Override // Rd.j
    public final Rd.h getType() {
        return this.f23363Z;
    }
}
