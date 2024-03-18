package L0;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static final f f10376d = new f(0.0f, new Cf.d(0.0f, 0.0f));

    /* renamed from: a  reason: collision with root package name */
    public final float f10377a;

    /* renamed from: b  reason: collision with root package name */
    public final Cf.d f10378b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10379c = 0;

    public f(float f6, Cf.d dVar) {
        this.f10377a = f6;
        this.f10378b = dVar;
        if (!Float.isNaN(f6)) {
            return;
        }
        throw new IllegalArgumentException("current must not be NaN".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f10377a == fVar.f10377a && AbstractC3557B.K(this.f10378b, fVar.f10378b) && this.f10379c == fVar.f10379c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10378b.hashCode() + (Float.floatToIntBits(this.f10377a) * 31)) * 31) + this.f10379c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarRangeInfo(current=");
        sb2.append(this.f10377a);
        sb2.append(", range=");
        sb2.append(this.f10378b);
        sb2.append(", steps=");
        return AbstractC2469q0.j(sb2, this.f10379c, ')');
    }
}
