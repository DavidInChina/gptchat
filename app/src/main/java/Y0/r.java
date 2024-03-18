package Y0;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c  reason: collision with root package name */
    public static final r f22045c = new r(false, 2);

    /* renamed from: d  reason: collision with root package name */
    public static final r f22046d = new r(true, 1);

    /* renamed from: a  reason: collision with root package name */
    public final int f22047a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22048b;

    public r(boolean z10, int i10) {
        this.f22047a = i10;
        this.f22048b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f22047a == rVar.f22047a && this.f22048b == rVar.f22048b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f22047a * 31;
        if (this.f22048b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return i11 + i10;
    }

    public final String toString() {
        if (AbstractC3557B.K(this, f22045c)) {
            return "TextMotion.Static";
        }
        if (AbstractC3557B.K(this, f22046d)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }
}
