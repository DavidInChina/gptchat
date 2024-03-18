package d0;

import c0.AbstractC2272b;
import c0.AbstractC2274d;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import kf.q;
import nf.AbstractC4828h;

/* loaded from: classes.dex */
public final class j extends AbstractC2565c implements AbstractC2272b {

    /* renamed from: Z  reason: collision with root package name */
    public static final j f27840Z = new j(new Object[0]);

    /* renamed from: Y  reason: collision with root package name */
    public final Object[] f27841Y;

    public j(Object[] objArr) {
        this.f27841Y = objArr;
    }

    @Override // c0.AbstractC2274d
    public final AbstractC2274d P(C2564b c2564b) {
        Object[] objArr = this.f27841Y;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z10 = false;
        for (int i10 = 0; i10 < length2; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) c2564b.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    AbstractC3557B.b0("copyOf(this, size)", objArr2);
                    z10 = true;
                    length = i10;
                }
            } else if (z10) {
                objArr2[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        if (length == 0) {
            return f27840Z;
        }
        return new j(q.c3(0, length, objArr2));
    }

    @Override // c0.AbstractC2274d
    public final AbstractC2274d Z(int i10) {
        Object[] objArr = this.f27841Y;
        AbstractC4828h.v(i10, objArr.length);
        if (objArr.length == 1) {
            return f27840Z;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
        q.W2(i10, i10 + 1, objArr.length, objArr, copyOf);
        return new j(copyOf);
    }

    @Override // kf.AbstractC4280e, java.util.List, c0.AbstractC2274d
    public final AbstractC2274d add(int i10, Object obj) {
        Object[] objArr = this.f27841Y;
        AbstractC4828h.w(i10, objArr.length);
        if (i10 == objArr.length) {
            return add(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            q.a3(objArr, objArr2, 0, i10, 6);
            q.W2(i10 + 1, i10, objArr.length, objArr, objArr2);
            objArr2[i10] = obj;
            return new j(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3557B.b0("copyOf(this, size)", copyOf);
        q.W2(i10 + 1, i10, objArr.length - 1, objArr, copyOf);
        copyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(objArr.length + 1, 0, copyOf, objArr3);
    }

    @Override // d0.AbstractC2565c, kf.AbstractC4276a, java.util.Collection, java.util.List, c0.AbstractC2274d
    public final AbstractC2274d addAll(Collection collection) {
        Object[] objArr = this.f27841Y;
        if (collection.size() + objArr.length <= 32) {
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            int length = objArr.length;
            for (Object obj : collection) {
                copyOf[length] = obj;
                length++;
            }
            return new j(copyOf);
        }
        f builder = builder();
        builder.addAll(collection);
        return builder.y();
    }

    @Override // c0.AbstractC2274d
    public final f builder() {
        return new f(this, null, this.f27841Y, 0);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC4828h.v(i10, r());
        return this.f27841Y[i10];
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final int indexOf(Object obj) {
        return q.o3(obj, this.f27841Y);
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f27841Y;
        AbstractC3557B.c0("<this>", objArr);
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i10 = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i10 < 0) {
                    return -1;
                }
                length = i10;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i11 = length2 - 1;
                if (AbstractC3557B.K(obj, objArr[length2])) {
                    return length2;
                }
                if (i11 < 0) {
                    return -1;
                }
                length2 = i11;
            }
        }
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final ListIterator listIterator(int i10) {
        AbstractC4828h.w(i10, r());
        return new d(i10, r(), this.f27841Y);
    }

    @Override // kf.AbstractC4276a
    public final int r() {
        return this.f27841Y.length;
    }

    @Override // kf.AbstractC4280e, java.util.List, c0.AbstractC2274d
    public final AbstractC2274d set(int i10, Object obj) {
        AbstractC4828h.v(i10, r());
        Object[] objArr = this.f27841Y;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3557B.b0("copyOf(this, size)", copyOf);
        copyOf[i10] = obj;
        return new j(copyOf);
    }

    @Override // kf.AbstractC4276a, java.util.Collection, java.util.List, c0.AbstractC2274d
    public final AbstractC2274d add(Object obj) {
        Object[] objArr = this.f27841Y;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            copyOf[objArr.length] = obj;
            return new j(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new e(objArr.length + 1, 0, objArr, objArr2);
    }
}
