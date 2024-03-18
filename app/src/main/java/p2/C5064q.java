package p2;

import android.util.SparseBooleanArray;
import s2.AbstractC5530A;

/* renamed from: p2.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5064q {

    /* renamed from: a  reason: collision with root package name */
    public final SparseBooleanArray f42219a;

    public C5064q(SparseBooleanArray sparseBooleanArray) {
        this.f42219a = sparseBooleanArray;
    }

    public final int a(int i10) {
        SparseBooleanArray sparseBooleanArray = this.f42219a;
        Gi.e.m(i10, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5064q)) {
            return false;
        }
        C5064q c5064q = (C5064q) obj;
        int i10 = AbstractC5530A.f45131a;
        SparseBooleanArray sparseBooleanArray = this.f42219a;
        if (i10 < 24) {
            if (sparseBooleanArray.size() != c5064q.f42219a.size()) {
                return false;
            }
            for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
                if (a(i11) != c5064q.a(i11)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray.equals(c5064q.f42219a);
    }

    public final int hashCode() {
        int i10 = AbstractC5530A.f45131a;
        SparseBooleanArray sparseBooleanArray = this.f42219a;
        if (i10 < 24) {
            int size = sparseBooleanArray.size();
            for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
                size = (size * 31) + a(i11);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
