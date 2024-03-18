package x9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import r0.r;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final List f49654a;

    /* renamed from: b  reason: collision with root package name */
    public final float f49655b;

    /* renamed from: c  reason: collision with root package name */
    public final long f49656c;

    /* renamed from: d  reason: collision with root package name */
    public final float f49657d;

    public f(List list, float f6, long j6, float f10) {
        this.f49654a = list;
        this.f49655b = f6;
        this.f49656c = j6;
        this.f49657d = f10;
    }

    public static f a(f fVar, ArrayList arrayList, float f6, int i10) {
        if ((i10 & 2) != 0) {
            f6 = fVar.f49655b;
        }
        return new f(arrayList, f6, fVar.f49656c, fVar.f49657d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3557B.K(this.f49654a, fVar.f49654a) && Float.compare(this.f49655b, fVar.f49655b) == 0 && r.c(this.f49656c, fVar.f49656c) && Float.compare(this.f49657d, fVar.f49657d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int e10 = AbstractC6463a.e(this.f49655b, this.f49654a.hashCode() * 31, 31);
        int i10 = r.f44264l;
        return Float.floatToIntBits(this.f49657d) + R.a.n(this.f49656c, e10, 31);
    }

    public final String toString() {
        String i10 = r.i(this.f49656c);
        return "ImageDrawPath(points=" + this.f49654a + ", strokeWidth=" + this.f49655b + ", strokeColor=" + i10 + ", alpha=" + this.f49657d + Separators.RPAREN;
    }
}
