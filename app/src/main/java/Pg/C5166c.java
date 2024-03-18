package pg;

import Bg.A;
import Bg.D;
import Mf.B;
import id.AbstractC3557B;

/* renamed from: pg.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5166c extends AbstractC5170g {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f43141b = 1;

    public C5166c(double d10) {
        super(Double.valueOf(d10));
    }

    @Override // pg.AbstractC5170g
    public final /* bridge */ /* synthetic */ A a(B b10) {
        switch (this.f43141b) {
            case 0:
                return c(b10);
            case 1:
                return c(b10);
            default:
                return c(b10);
        }
    }

    public final D c(B b10) {
        switch (this.f43141b) {
            case 0:
                AbstractC3557B.c0("module", b10);
                Jf.l j6 = b10.j();
                j6.getClass();
                D s10 = j6.s(Jf.n.f9125k0);
                if (s10 != null) {
                    return s10;
                }
                Jf.l.a(64);
                throw null;
            case 1:
                AbstractC3557B.c0("module", b10);
                Jf.l j10 = b10.j();
                j10.getClass();
                D s11 = j10.s(Jf.n.f9132r0);
                if (s11 != null) {
                    return s11;
                }
                Jf.l.a(62);
                throw null;
            default:
                AbstractC3557B.c0("module", b10);
                Jf.l j11 = b10.j();
                j11.getClass();
                D s12 = j11.s(Jf.n.f9130p0);
                if (s12 != null) {
                    return s12;
                }
                Jf.l.a(61);
                throw null;
        }
    }

    @Override // pg.AbstractC5170g
    public final String toString() {
        int i10 = this.f43141b;
        Object obj = this.f43144a;
        switch (i10) {
            case 1:
                return ((Number) obj).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) obj).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public C5166c(float f6) {
        super(Float.valueOf(f6));
    }

    public C5166c(boolean z10) {
        super(Boolean.valueOf(z10));
    }
}
