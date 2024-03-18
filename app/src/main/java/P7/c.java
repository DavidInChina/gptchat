package P7;

import android.animation.TimeInterpolator;
import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f13844a;

    /* renamed from: b  reason: collision with root package name */
    public long f13845b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f13846c;

    /* renamed from: d  reason: collision with root package name */
    public int f13847d;

    /* renamed from: e  reason: collision with root package name */
    public int f13848e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f13846c;
        if (timeInterpolator == null) {
            return a.f13839b;
        }
        return timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f13844a != cVar.f13844a || this.f13845b != cVar.f13845b || this.f13847d != cVar.f13847d || this.f13848e != cVar.f13848e) {
            return false;
        }
        return a().getClass().equals(cVar.a().getClass());
    }

    public final int hashCode() {
        long j6 = this.f13844a;
        long j10 = this.f13845b;
        return ((((a().getClass().hashCode() + (((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.f13847d) * 31) + this.f13848e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Separators.RETURN);
        sb2.append(c.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f13844a);
        sb2.append(" duration: ");
        sb2.append(this.f13845b);
        sb2.append(" interpolator: ");
        sb2.append(a().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f13847d);
        sb2.append(" repeatMode: ");
        return android.gov.nist.core.a.l(sb2, this.f13848e, "}\n");
    }
}
