package Qh;

import A.AbstractC0044t0;
import android.gov.nist.core.Separators;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: Qh.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1239q extends AbstractList implements r {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f15001Y;

    public /* synthetic */ AbstractC1239q(int i10) {
        this.f15001Y = i10;
    }

    public final r f(AbstractC1230h abstractC1230h) {
        switch (this.f15001Y) {
            case 0:
                ArrayList arrayList = new ArrayList(size());
                Iterator it = iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (abstractC1230h.a(next)) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.size() == size()) {
                    return this;
                }
                return y(arrayList);
            default:
                return this;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        throw new IndexOutOfBoundsException(android.gov.nist.core.a.e("index = ", i10));
    }

    public final Object r() {
        switch (this.f15001Y) {
            case 0:
                if (size() == 1) {
                    return get(0);
                }
                throw new IllegalStateException("size = " + size());
            default:
                throw new IllegalStateException("size = 0");
        }
    }

    public final r s(int i10, int i11) {
        switch (this.f15001Y) {
            case 0:
                return y(super.subList(i10, i11));
            default:
                if (i10 == i11 && i11 == 0) {
                    return this;
                }
                if (i10 > i11) {
                    throw new IllegalArgumentException(AbstractC0044t0.y("fromIndex(", i10, ") > toIndex(", i11, Separators.RPAREN));
                }
                throw new IndexOutOfBoundsException(android.gov.nist.core.a.e("fromIndex = ", i10));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        switch (this.f15001Y) {
            case 0:
                return s(i10, i11);
            default:
                return s(i10, i11);
        }
    }

    public abstract r y(List list);
}
