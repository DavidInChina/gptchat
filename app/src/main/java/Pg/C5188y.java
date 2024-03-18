package pg;

import Bg.A;
import Bg.D;
import Mf.AbstractC0997f;
import Mf.B;
import id.AbstractC3557B;

/* renamed from: pg.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5188y extends AbstractC5178o {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f43159b = 0;

    public C5188y(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // pg.AbstractC5170g
    public final A a(B b10) {
        D d10 = null;
        switch (this.f43159b) {
            case 0:
                AbstractC3557B.c0("module", b10);
                AbstractC0997f s02 = R4.b.s0(b10, Jf.p.f9158R);
                if (s02 != null) {
                    d10 = s02.n();
                }
                if (d10 == null) {
                    return Dg.m.c(Dg.l.f3681E0, "UByte");
                }
                return d10;
            case 1:
                AbstractC3557B.c0("module", b10);
                AbstractC0997f s03 = R4.b.s0(b10, Jf.p.T);
                if (s03 != null) {
                    d10 = s03.n();
                }
                if (d10 == null) {
                    return Dg.m.c(Dg.l.f3681E0, "UInt");
                }
                return d10;
            case 2:
                AbstractC3557B.c0("module", b10);
                AbstractC0997f s04 = R4.b.s0(b10, Jf.p.f9159U);
                if (s04 != null) {
                    d10 = s04.n();
                }
                if (d10 == null) {
                    return Dg.m.c(Dg.l.f3681E0, "ULong");
                }
                return d10;
            default:
                AbstractC3557B.c0("module", b10);
                AbstractC0997f s05 = R4.b.s0(b10, Jf.p.S);
                if (s05 != null) {
                    d10 = s05.n();
                }
                if (d10 == null) {
                    return Dg.m.c(Dg.l.f3681E0, "UShort");
                }
                return d10;
        }
    }

    @Override // pg.AbstractC5170g
    public final String toString() {
        int i10 = this.f43159b;
        Object obj = this.f43144a;
        switch (i10) {
            case 0:
                return ((Number) obj).intValue() + ".toUByte()";
            case 1:
                return ((Number) obj).intValue() + ".toUInt()";
            case 2:
                return ((Number) obj).longValue() + ".toULong()";
            default:
                return ((Number) obj).intValue() + ".toUShort()";
        }
    }

    public C5188y(int i10) {
        super(Integer.valueOf(i10));
    }

    public C5188y(long j6) {
        super(Long.valueOf(j6));
    }

    public C5188y(short s10) {
        super(Short.valueOf(s10));
    }
}
