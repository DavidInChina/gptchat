package Hi;

import id.AbstractC3557B;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class l extends AbstractC4344b {

    /* renamed from: l  reason: collision with root package name */
    public final String f7891l;

    /* renamed from: m  reason: collision with root package name */
    public final int f7892m;

    /* renamed from: n  reason: collision with root package name */
    public final long f7893n;

    /* renamed from: o  reason: collision with root package name */
    public final long f7894o;

    /* renamed from: p  reason: collision with root package name */
    public final String f7895p;

    public l(String str, int i10, long j6, long j10, String str2) {
        AbstractC3557B.c0("activityName", str);
        this.f7891l = str;
        this.f7892m = i10;
        this.f7893n = j6;
        this.f7894o = j10;
        this.f7895p = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3557B.K(this.f7891l, lVar.f7891l) && this.f7892m == lVar.f7892m && this.f7893n == lVar.f7893n && this.f7894o == lVar.f7894o && AbstractC3557B.K(this.f7895p, lVar.f7895p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j6 = this.f7893n;
        long j10 = this.f7894o;
        int hashCode = ((((((this.f7891l.hashCode() * 31) + this.f7892m) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str = this.f7895p;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "FrozenFrameOnTouch(activityName='" + this.f7891l + "', repeatTouchDownCount=" + this.f7892m + ", handledElapsed=" + this.f7893n + " ms, frameElapsed=" + this.f7894o + " ms, pressedView='" + ((Object) this.f7895p) + "')";
    }
}
