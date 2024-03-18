package N;

import q0.C5251c;
import y.AbstractC6463a;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final L.Y f12233a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12234b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12235c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f12236d;

    public O(L.Y y10, long j6, int i10, boolean z10) {
        this.f12233a = y10;
        this.f12234b = j6;
        this.f12235c = i10;
        this.f12236d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        if (this.f12233a == o10.f12233a && C5251c.b(this.f12234b, o10.f12234b) && this.f12235c == o10.f12235c && this.f12236d == o10.f12236d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int f6 = C5251c.f(this.f12234b);
        int d10 = AbstractC6708l.d(this.f12235c, (f6 + (this.f12233a.hashCode() * 31)) * 31, 31);
        if (this.f12236d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return d10 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionHandleInfo(handle=");
        sb2.append(this.f12233a);
        sb2.append(", position=");
        sb2.append((Object) C5251c.j(this.f12234b));
        sb2.append(", anchor=");
        sb2.append(E9.f.K(this.f12235c));
        sb2.append(", visible=");
        return AbstractC6463a.l(sb2, this.f12236d, ')');
    }
}
