package B0;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;
import q0.C5251c;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final long f1688a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1689b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1690c;

    /* renamed from: d  reason: collision with root package name */
    public final long f1691d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1692e;

    /* renamed from: f  reason: collision with root package name */
    public final float f1693f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1694g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1695h;

    /* renamed from: i  reason: collision with root package name */
    public final List f1696i;

    /* renamed from: j  reason: collision with root package name */
    public final long f1697j;

    /* renamed from: k  reason: collision with root package name */
    public final long f1698k;

    public x(long j6, long j10, long j11, long j12, boolean z10, float f6, int i10, boolean z11, ArrayList arrayList, long j13, long j14) {
        this.f1688a = j6;
        this.f1689b = j10;
        this.f1690c = j11;
        this.f1691d = j12;
        this.f1692e = z10;
        this.f1693f = f6;
        this.f1694g = i10;
        this.f1695h = z11;
        this.f1696i = arrayList;
        this.f1697j = j13;
        this.f1698k = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (t.a(this.f1688a, xVar.f1688a) && this.f1689b == xVar.f1689b && C5251c.b(this.f1690c, xVar.f1690c) && C5251c.b(this.f1691d, xVar.f1691d) && this.f1692e == xVar.f1692e && Float.compare(this.f1693f, xVar.f1693f) == 0 && s.b(this.f1694g, xVar.f1694g) && this.f1695h == xVar.f1695h && AbstractC3557B.K(this.f1696i, xVar.f1696i) && C5251c.b(this.f1697j, xVar.f1697j) && C5251c.b(this.f1698k, xVar.f1698k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j6 = this.f1688a;
        long j10 = this.f1689b;
        int f6 = (C5251c.f(this.f1691d) + ((C5251c.f(this.f1690c) + (((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31)) * 31;
        int i11 = 1237;
        if (this.f1692e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int e10 = (AbstractC6463a.e(this.f1693f, (f6 + i10) * 31, 31) + this.f1694g) * 31;
        if (this.f1695h) {
            i11 = 1231;
        }
        return C5251c.f(this.f1698k) + ((C5251c.f(this.f1697j) + AbstractC4194d.s(this.f1696i, (e10 + i11) * 31, 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PointerInputEventData(id=");
        sb2.append((Object) t.b(this.f1688a));
        sb2.append(", uptime=");
        sb2.append(this.f1689b);
        sb2.append(", positionOnScreen=");
        sb2.append((Object) C5251c.j(this.f1690c));
        sb2.append(", position=");
        sb2.append((Object) C5251c.j(this.f1691d));
        sb2.append(", down=");
        sb2.append(this.f1692e);
        sb2.append(", pressure=");
        sb2.append(this.f1693f);
        sb2.append(", type=");
        int i10 = this.f1694g;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        str = "Unknown";
                    } else {
                        str = "Eraser";
                    }
                } else {
                    str = "Stylus";
                }
            } else {
                str = "Mouse";
            }
        } else {
            str = "Touch";
        }
        sb2.append((Object) str);
        sb2.append(", issuesEnterExit=");
        sb2.append(this.f1695h);
        sb2.append(", historical=");
        sb2.append(this.f1696i);
        sb2.append(", scrollDelta=");
        sb2.append((Object) C5251c.j(this.f1697j));
        sb2.append(", originalEventPosition=");
        sb2.append((Object) C5251c.j(this.f1698k));
        sb2.append(')');
        return sb2.toString();
    }
}
