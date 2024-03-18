package B0;

import java.util.List;
import q0.C5251c;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final long f1670a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1671b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1672c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1673d;

    /* renamed from: e  reason: collision with root package name */
    public final float f1674e;

    /* renamed from: f  reason: collision with root package name */
    public final long f1675f;

    /* renamed from: g  reason: collision with root package name */
    public final long f1676g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1677h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1678i;

    /* renamed from: j  reason: collision with root package name */
    public final long f1679j;

    /* renamed from: k  reason: collision with root package name */
    public final List f1680k;

    /* renamed from: l  reason: collision with root package name */
    public final long f1681l;

    /* renamed from: m  reason: collision with root package name */
    public C0186c f1682m;

    public u(long j6, long j10, long j11, boolean z10, float f6, long j12, long j13, boolean z11, int i10, List list, long j14, long j15) {
        this(j6, j10, j11, z10, f6, j12, j13, z11, false, i10, j14);
        this.f1680k = list;
        this.f1681l = j15;
    }

    public final void a() {
        C0186c c0186c = this.f1682m;
        c0186c.f1627b = true;
        c0186c.f1626a = true;
    }

    public final boolean b() {
        C0186c c0186c = this.f1682m;
        if (!c0186c.f1627b && !c0186c.f1626a) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) t.b(this.f1670a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f1671b);
        sb2.append(", position=");
        sb2.append((Object) C5251c.j(this.f1672c));
        sb2.append(", pressed=");
        sb2.append(this.f1673d);
        sb2.append(", pressure=");
        sb2.append(this.f1674e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f1675f);
        sb2.append(", previousPosition=");
        sb2.append((Object) C5251c.j(this.f1676g));
        sb2.append(", previousPressed=");
        sb2.append(this.f1677h);
        sb2.append(", isConsumed=");
        sb2.append(b());
        sb2.append(", type=");
        int i10 = this.f1678i;
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
        sb2.append(", historical=");
        Object obj = this.f1680k;
        if (obj == null) {
            obj = kf.v.f37483Y;
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append((Object) C5251c.j(this.f1679j));
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, B0.c] */
    public u(long j6, long j10, long j11, boolean z10, float f6, long j12, long j13, boolean z11, boolean z12, int i10, long j14) {
        this.f1670a = j6;
        this.f1671b = j10;
        this.f1672c = j11;
        this.f1673d = z10;
        this.f1674e = f6;
        this.f1675f = j12;
        this.f1676g = j13;
        this.f1677h = z11;
        this.f1678i = i10;
        this.f1679j = j14;
        this.f1681l = C5251c.f43619b;
        ?? obj = new Object();
        obj.f1626a = z12;
        obj.f1627b = z12;
        this.f1682m = obj;
    }
}
