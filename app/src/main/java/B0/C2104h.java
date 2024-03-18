package b0;

import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kf.q;
import l8.AbstractC4344b;

/* renamed from: b0.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2104h implements RandomAccess {

    /* renamed from: Y  reason: collision with root package name */
    public Object[] f25567Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2101e f25568Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f25569h0 = 0;

    public C2104h(Object[] objArr) {
        this.f25567Y = objArr;
    }

    public final void a(int i10, Object obj) {
        i(this.f25569h0 + 1);
        Object[] objArr = this.f25567Y;
        int i11 = this.f25569h0;
        if (i10 != i11) {
            q.W2(i10 + 1, i10, i11, objArr, objArr);
        }
        objArr[i10] = obj;
        this.f25569h0++;
    }

    public final void b(Object obj) {
        i(this.f25569h0 + 1);
        Object[] objArr = this.f25567Y;
        int i10 = this.f25569h0;
        objArr[i10] = obj;
        this.f25569h0 = i10 + 1;
    }

    public final void c(int i10, C2104h c2104h) {
        if (c2104h.k()) {
            return;
        }
        i(this.f25569h0 + c2104h.f25569h0);
        Object[] objArr = this.f25567Y;
        int i11 = this.f25569h0;
        if (i10 != i11) {
            q.W2(c2104h.f25569h0 + i10, i10, i11, objArr, objArr);
        }
        q.W2(i10, 0, c2104h.f25569h0, c2104h.f25567Y, objArr);
        this.f25569h0 += c2104h.f25569h0;
    }

    public final boolean d(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        i(collection.size() + this.f25569h0);
        Object[] objArr = this.f25567Y;
        if (i10 != this.f25569h0) {
            q.W2(collection.size() + i10, i10, this.f25569h0, objArr, objArr);
        }
        for (Object obj : collection) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                objArr[i11 + i10] = obj;
                i11 = i12;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
        this.f25569h0 = collection.size() + this.f25569h0;
        return true;
    }

    public final List e() {
        C2101e c2101e = this.f25568Z;
        if (c2101e == null) {
            C2101e c2101e2 = new C2101e(this);
            this.f25568Z = c2101e2;
            return c2101e2;
        }
        return c2101e;
    }

    public final void f() {
        Object[] objArr = this.f25567Y;
        int i10 = this.f25569h0;
        while (true) {
            i10--;
            if (-1 < i10) {
                objArr[i10] = null;
            } else {
                this.f25569h0 = 0;
                return;
            }
        }
    }

    public final boolean g(Object obj) {
        int i10 = this.f25569h0 - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !AbstractC3557B.K(this.f25567Y[i11], obj); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    public final void i(int i10) {
        Object[] objArr = this.f25567Y;
        if (objArr.length < i10) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i10, objArr.length * 2));
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            this.f25567Y = copyOf;
        }
    }

    public final int j(Object obj) {
        int i10 = this.f25569h0;
        if (i10 > 0) {
            Object[] objArr = this.f25567Y;
            int i11 = 0;
            while (!AbstractC3557B.K(obj, objArr[i11])) {
                i11++;
                if (i11 >= i10) {
                    return -1;
                }
            }
            return i11;
        }
        return -1;
    }

    public final boolean k() {
        if (this.f25569h0 == 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (this.f25569h0 != 0) {
            return true;
        }
        return false;
    }

    public final boolean m(Object obj) {
        int j6 = j(obj);
        if (j6 >= 0) {
            n(j6);
            return true;
        }
        return false;
    }

    public final Object n(int i10) {
        Object[] objArr = this.f25567Y;
        Object obj = objArr[i10];
        int i11 = this.f25569h0;
        if (i10 != i11 - 1) {
            q.W2(i10, i10 + 1, i11, objArr, objArr);
        }
        int i12 = this.f25569h0 - 1;
        this.f25569h0 = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void o(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f25569h0;
            if (i11 < i12) {
                Object[] objArr = this.f25567Y;
                q.W2(i10, i11, i12, objArr, objArr);
            }
            int i13 = this.f25569h0;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.f25567Y[i16] = null;
                    if (i16 == i15) {
                        break;
                    }
                    i16++;
                }
            }
            this.f25569h0 = i14;
        }
    }

    public final Object p(int i10, Object obj) {
        Object[] objArr = this.f25567Y;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }
}
