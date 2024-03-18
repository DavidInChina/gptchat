package Y0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final g f22024c = new g(f.f22022b, 17);

    /* renamed from: a  reason: collision with root package name */
    public final float f22025a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22026b;

    public g(float f6, int i10) {
        this.f22025a = f6;
        this.f22026b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        float f6 = gVar.f22025a;
        float f10 = f.f22021a;
        if (Float.compare(this.f22025a, f6) == 0 && this.f22026b == gVar.f22026b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        float f6 = f.f22021a;
        return (Float.floatToIntBits(this.f22025a) * 31) + this.f22026b;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        float f6 = this.f22025a;
        if (f6 == 0.0f) {
            float f10 = f.f22021a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f6 == f.f22021a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f6 == f.f22022b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f6 == f.f22023c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f6 + ')';
        }
        sb2.append((Object) str);
        sb2.append(", trim=");
        int i10 = this.f22026b;
        if (i10 == 1) {
            str2 = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i10 == 16) {
            str2 = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i10 == 17) {
            str2 = "LineHeightStyle.Trim.Both";
        } else if (i10 == 0) {
            str2 = "LineHeightStyle.Trim.None";
        } else {
            str2 = "Invalid";
        }
        sb2.append((Object) str2);
        sb2.append(')');
        return sb2.toString();
    }
}
