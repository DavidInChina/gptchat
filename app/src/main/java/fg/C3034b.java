package fg;

import androidx.datastore.preferences.protobuf.n0;
import androidx.glance.appwidget.protobuf.AbstractC2041a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lg.AbstractC4456a;
import lg.AbstractC4466k;
import lg.C4461f;
import lg.C4464i;

/* renamed from: fg.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3034b extends AbstractC4466k {

    /* renamed from: Z  reason: collision with root package name */
    public int f30498Z;

    /* renamed from: h0  reason: collision with root package name */
    public EnumC3035c f30499h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f30500i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f30501j0;

    /* renamed from: k0  reason: collision with root package name */
    public double f30502k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f30503l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f30504m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f30505n0;

    /* renamed from: o0  reason: collision with root package name */
    public C3039g f30506o0;

    /* renamed from: p0  reason: collision with root package name */
    public List f30507p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f30508q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f30509r0;

    /* JADX WARN: Type inference failed for: r0v0, types: [lg.k, fg.b] */
    public static C3034b e() {
        ?? abstractC4466k = new AbstractC4466k();
        abstractC4466k.f30499h0 = EnumC3035c.BYTE;
        abstractC4466k.f30506o0 = C3039g.f30590l0;
        abstractC4466k.f30507p0 = Collections.emptyList();
        return abstractC4466k;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        C3036d d10 = d();
        if (d10.isInitialized()) {
            return d10;
        }
        throw new n0();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC2041a b(C4461f c4461f, C4464i c4464i) {
        Throwable th2;
        C3036d c3036d = null;
        try {
            try {
                f((C3036d) C3036d.f30536v0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e10) {
                C3036d c3036d2 = (C3036d) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    c3036d = c3036d2;
                    if (c3036d != null) {
                        f(c3036d);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (c3036d != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        f((C3036d) pVar);
        return this;
    }

    public final Object clone() {
        C3034b e10 = e();
        e10.f(d());
        return e10;
    }

    public final C3036d d() {
        C3036d c3036d = new C3036d(this);
        int i10 = this.f30498Z;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        c3036d.f30539h0 = this.f30499h0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        c3036d.f30540i0 = this.f30500i0;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        c3036d.f30541j0 = this.f30501j0;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        c3036d.f30542k0 = this.f30502k0;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        c3036d.f30543l0 = this.f30503l0;
        if ((i10 & 32) == 32) {
            i11 |= 32;
        }
        c3036d.f30544m0 = this.f30504m0;
        if ((i10 & 64) == 64) {
            i11 |= 64;
        }
        c3036d.f30545n0 = this.f30505n0;
        if ((i10 & 128) == 128) {
            i11 |= 128;
        }
        c3036d.f30546o0 = this.f30506o0;
        if ((i10 & 256) == 256) {
            this.f30507p0 = Collections.unmodifiableList(this.f30507p0);
            this.f30498Z &= -257;
        }
        c3036d.f30547p0 = this.f30507p0;
        if ((i10 & 512) == 512) {
            i11 |= 256;
        }
        c3036d.f30548q0 = this.f30508q0;
        if ((i10 & 1024) == 1024) {
            i11 |= 512;
        }
        c3036d.f30549r0 = this.f30509r0;
        c3036d.f30538Z = i11;
        return c3036d;
    }

    public final void f(C3036d c3036d) {
        C3039g c3039g;
        if (c3036d == C3036d.f30535u0) {
            return;
        }
        if ((c3036d.f30538Z & 1) == 1) {
            EnumC3035c enumC3035c = c3036d.f30539h0;
            enumC3035c.getClass();
            this.f30498Z = 1 | this.f30498Z;
            this.f30499h0 = enumC3035c;
        }
        int i10 = c3036d.f30538Z;
        if ((i10 & 2) == 2) {
            long j6 = c3036d.f30540i0;
            this.f30498Z |= 2;
            this.f30500i0 = j6;
        }
        if ((i10 & 4) == 4) {
            float f6 = c3036d.f30541j0;
            this.f30498Z = 4 | this.f30498Z;
            this.f30501j0 = f6;
        }
        if ((i10 & 8) == 8) {
            double d10 = c3036d.f30542k0;
            this.f30498Z |= 8;
            this.f30502k0 = d10;
        }
        if ((i10 & 16) == 16) {
            int i11 = c3036d.f30543l0;
            this.f30498Z = 16 | this.f30498Z;
            this.f30503l0 = i11;
        }
        if ((i10 & 32) == 32) {
            int i12 = c3036d.f30544m0;
            this.f30498Z = 32 | this.f30498Z;
            this.f30504m0 = i12;
        }
        if ((i10 & 64) == 64) {
            int i13 = c3036d.f30545n0;
            this.f30498Z = 64 | this.f30498Z;
            this.f30505n0 = i13;
        }
        if ((i10 & 128) == 128) {
            C3039g c3039g2 = c3036d.f30546o0;
            if ((this.f30498Z & 128) == 128 && (c3039g = this.f30506o0) != C3039g.f30590l0) {
                C3038f c3038f = new C3038f(0);
                c3038f.h(c3039g);
                c3038f.h(c3039g2);
                this.f30506o0 = c3038f.e();
            } else {
                this.f30506o0 = c3039g2;
            }
            this.f30498Z |= 128;
        }
        if (!c3036d.f30547p0.isEmpty()) {
            if (this.f30507p0.isEmpty()) {
                this.f30507p0 = c3036d.f30547p0;
                this.f30498Z &= -257;
            } else {
                if ((this.f30498Z & 256) != 256) {
                    this.f30507p0 = new ArrayList(this.f30507p0);
                    this.f30498Z |= 256;
                }
                this.f30507p0.addAll(c3036d.f30547p0);
            }
        }
        int i14 = c3036d.f30538Z;
        if ((i14 & 256) == 256) {
            int i15 = c3036d.f30548q0;
            this.f30498Z |= 512;
            this.f30508q0 = i15;
        }
        if ((i14 & 512) == 512) {
            int i16 = c3036d.f30549r0;
            this.f30498Z |= 1024;
            this.f30509r0 = i16;
        }
        this.f38400Y = this.f38400Y.r(c3036d.f30537Y);
    }
}
