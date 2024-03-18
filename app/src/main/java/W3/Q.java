package w3;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a  reason: collision with root package name */
    public SparseArray f47775a;

    /* renamed from: b  reason: collision with root package name */
    public int f47776b;

    public final P a(int i10) {
        SparseArray sparseArray = this.f47775a;
        P p10 = (P) sparseArray.get(i10);
        if (p10 == null) {
            P p11 = new P();
            sparseArray.put(i10, p11);
            return p11;
        }
        return p10;
    }
}
