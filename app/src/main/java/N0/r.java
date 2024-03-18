package N0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final long f12560a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12561b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12562c;

    public r(long j6, long j10, int i10) {
        this.f12560a = j6;
        this.f12561b = j10;
        this.f12562c = i10;
        if (!M3.H.a0(j6)) {
            if (!M3.H.a0(j10)) {
                return;
            }
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
        }
        throw new IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (Z0.n.a(this.f12560a, rVar.f12560a) && Z0.n.a(this.f12561b, rVar.f12561b) && r.f.v(this.f12562c, rVar.f12562c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Z0.n.d(this.f12561b) + (Z0.n.d(this.f12560a) * 31)) * 31) + this.f12562c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Placeholder(width=");
        sb2.append((Object) Z0.n.e(this.f12560a));
        sb2.append(", height=");
        sb2.append((Object) Z0.n.e(this.f12561b));
        sb2.append(", placeholderVerticalAlign=");
        int i10 = this.f12562c;
        if (r.f.v(i10, 1)) {
            str = "AboveBaseline";
        } else if (r.f.v(i10, 2)) {
            str = "Top";
        } else if (r.f.v(i10, 3)) {
            str = "Bottom";
        } else if (r.f.v(i10, 4)) {
            str = "Center";
        } else if (r.f.v(i10, 5)) {
            str = "TextTop";
        } else if (r.f.v(i10, 6)) {
            str = "TextBottom";
        } else if (r.f.v(i10, 7)) {
            str = "TextCenter";
        } else {
            str = "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
