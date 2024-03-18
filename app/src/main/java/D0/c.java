package D0;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final float f3199a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3200b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3201c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3202d;

    public c(float f6, float f10, long j6, int i10) {
        this.f3199a = f6;
        this.f3200b = f10;
        this.f3201c = j6;
        this.f3202d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f3199a == this.f3199a && cVar.f3200b == this.f3200b && cVar.f3201c == this.f3201c && cVar.f3202d == this.f3202d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int e10 = AbstractC6463a.e(this.f3200b, Float.floatToIntBits(this.f3199a) * 31, 31);
        long j6 = this.f3201c;
        return ((e10 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f3202d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb2.append(this.f3199a);
        sb2.append(",horizontalScrollPixels=");
        sb2.append(this.f3200b);
        sb2.append(",uptimeMillis=");
        sb2.append(this.f3201c);
        sb2.append(",deviceId=");
        return AbstractC2469q0.j(sb2, this.f3202d, ')');
    }
}
