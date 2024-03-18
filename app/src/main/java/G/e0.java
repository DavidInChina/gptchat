package G;

import id.AbstractC3557B;
import w.AbstractC6075v;
import w.C6072s;
import y.C6479q;

/* loaded from: classes.dex */
public final class e0 implements H {

    /* renamed from: a  reason: collision with root package name */
    public final C6072s f5499a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f5500b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5501c;

    public e0(Cf.g gVar, K4.J j6) {
        d0 B10 = j6.B();
        int i10 = gVar.f3106Y;
        if (i10 >= 0) {
            int min = Math.min(gVar.f3107Z, B10.f5494b - 1);
            if (min < i10) {
                C6072s c6072s = AbstractC6075v.f47638a;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>", c6072s);
                this.f5499a = c6072s;
                this.f5500b = new Object[0];
                this.f5501c = 0;
                return;
            }
            int i11 = (min - i10) + 1;
            this.f5500b = new Object[i11];
            this.f5501c = i10;
            C6072s c6072s2 = new C6072s(i11);
            B10.c(i10, min, new C6479q(i10, min, c6072s2, this));
            this.f5499a = c6072s2;
            return;
        }
        throw new IllegalStateException("negative nearestRange.first".toString());
    }

    @Override // G.H
    public final Object b(int i10) {
        int i11 = i10 - this.f5501c;
        if (i11 >= 0) {
            Object[] objArr = this.f5500b;
            if (i11 <= kf.q.l3(objArr)) {
                return objArr[i11];
            }
        }
        return null;
    }

    @Override // G.H
    public final int c(Object obj) {
        C6072s c6072s = this.f5499a;
        int d10 = c6072s.d(obj);
        if (d10 >= 0) {
            return c6072s.f47627c[d10];
        }
        return -1;
    }
}
