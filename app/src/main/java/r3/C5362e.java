package r3;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* renamed from: r3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5362e {

    /* renamed from: a  reason: collision with root package name */
    public final List f44394a;

    /* renamed from: b  reason: collision with root package name */
    public long f44395b = 0;

    /* renamed from: c  reason: collision with root package name */
    public long f44396c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f44397d = false;

    public C5362e(ArrayList arrayList) {
        AbstractC3557B.c0("states", arrayList);
        this.f44394a = arrayList;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(cls2, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.metrics.performance.FrameData", obj);
        C5362e c5362e = (C5362e) obj;
        if (this.f44395b == c5362e.f44395b && this.f44396c == c5362e.f44396c && this.f44397d == c5362e.f44397d && AbstractC3557B.K(this.f44394a, c5362e.f44394a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        long j6 = this.f44395b;
        long j10 = this.f44396c;
        int i11 = ((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31;
        if (this.f44397d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return this.f44394a.hashCode() + ((i11 + i10) * 31);
    }

    public String toString() {
        return "FrameData(frameStartNanos=" + this.f44395b + ", frameDurationUiNanos=" + this.f44396c + ", isJank=" + this.f44397d + ", states=" + this.f44394a + ')';
    }
}
