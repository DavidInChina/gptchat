package Q1;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f14298a;

    /* renamed from: b  reason: collision with root package name */
    public D f14299b;

    public A(int i10) {
        this.f14298a = new SparseArray(i10);
    }

    public final void a(D d10, int i10, int i11) {
        A a5;
        int a10 = d10.a(i10);
        SparseArray sparseArray = this.f14298a;
        if (sparseArray == null) {
            a5 = null;
        } else {
            a5 = (A) sparseArray.get(a10);
        }
        if (a5 == null) {
            a5 = new A(1);
            sparseArray.put(d10.a(i10), a5);
        }
        if (i11 > i10) {
            a5.a(d10, i10 + 1, i11);
        } else {
            a5.f14299b = d10;
        }
    }
}
