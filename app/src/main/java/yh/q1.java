package yh;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class q1 extends o1 {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f51071Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f51072h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(int i10, List list) {
        super(0);
        this.f51071Z = i10;
        this.f51072h0 = list;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        List list = this.f51072h0;
        int i11 = this.f51071Z;
        switch (i11) {
            case 0:
                switch (i11) {
                    case 0:
                        return (l1) list.get(i10);
                    default:
                        return C6641v.l1((Class) list.get(i10));
                }
            default:
                switch (i11) {
                    case 0:
                        return (l1) list.get(i10);
                    default:
                        return C6641v.l1((Class) list.get(i10));
                }
        }
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10 = this.f51071Z;
        List list = this.f51072h0;
        switch (i10) {
            case 0:
                return list.size();
            default:
                return list.size();
        }
    }

    @Override // yh.H1
    public final String[] z0() {
        int i10 = 0;
        switch (this.f51071Z) {
            case 1:
                List<Class> list = this.f51072h0;
                int size = list.size();
                String[] strArr = new String[size];
                for (Class cls : list) {
                    strArr[i10] = Nh.r.k(cls);
                    i10++;
                }
                if (size == 0) {
                    return null;
                }
                return strArr;
            default:
                int size2 = size();
                String[] strArr2 = new String[size2];
                Iterator<E> it = iterator();
                while (it.hasNext()) {
                    strArr2[i10] = ((l1) it.next()).D0();
                    i10++;
                }
                if (size2 == 0) {
                    return null;
                }
                return strArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q1(Class[] clsArr) {
        this(1, Arrays.asList(clsArr));
        this.f51071Z = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q1(l1[] l1VarArr) {
        this(0, Arrays.asList(l1VarArr));
        this.f51071Z = 0;
    }
}
