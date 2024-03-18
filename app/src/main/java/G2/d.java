package G2;

import M3.H;
import g3.C3158a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import x8.L;
import x8.N;
import x8.k0;

/* loaded from: classes2.dex */
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5857a;

    public d(int i10) {
        this.f5857a = new ArrayList(i10);
    }

    @Override // G2.a
    public final long a(long j6) {
        ArrayList arrayList = this.f5857a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j6 < ((C3158a) arrayList.get(0)).f31163b) {
            return ((C3158a) arrayList.get(0)).f31163b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            C3158a c3158a = (C3158a) arrayList.get(i10);
            if (j6 < c3158a.f31163b) {
                long j10 = ((C3158a) arrayList.get(i10 - 1)).f31165d;
                int i11 = (j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1));
                long j11 = c3158a.f31163b;
                if (i11 == 0 || j10 <= j6 || j10 >= j11) {
                    return j11;
                }
                return j10;
            }
        }
        long j12 = ((C3158a) H.R(arrayList)).f31165d;
        if (j12 == -9223372036854775807L || j6 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    @Override // G2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(C3158a c3158a, long j6) {
        boolean z10;
        boolean z11;
        int size;
        long j10 = c3158a.f31163b;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        if (j10 <= j6) {
            long j11 = c3158a.f31165d;
            if (j11 == -9223372036854775807L || j6 < j11) {
                z11 = true;
                ArrayList arrayList = this.f5857a;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j10 >= ((C3158a) arrayList.get(size)).f31163b) {
                        arrayList.add(size + 1, c3158a);
                        return z11;
                    }
                    if (((C3158a) arrayList.get(size)).f31163b <= j6) {
                        z11 = false;
                    }
                }
                arrayList.add(0, c3158a);
                return z11;
            }
        }
        z11 = false;
        ArrayList arrayList2 = this.f5857a;
        while (size >= 0) {
        }
        arrayList2.add(0, c3158a);
        return z11;
    }

    @Override // G2.a
    public final N c(long j6) {
        int h10 = h(j6);
        if (h10 == 0) {
            L l10 = N.f49523Z;
            return k0.f49573j0;
        }
        C3158a c3158a = (C3158a) this.f5857a.get(h10 - 1);
        long j10 = c3158a.f31165d;
        if (j10 != -9223372036854775807L && j6 >= j10) {
            L l11 = N.f49523Z;
            return k0.f49573j0;
        }
        return c3158a.f31162a;
    }

    @Override // G2.a
    public final void clear() {
        this.f5857a.clear();
    }

    @Override // G2.a
    public final long d(long j6) {
        ArrayList arrayList = this.f5857a;
        if (arrayList.isEmpty() || j6 < ((C3158a) arrayList.get(0)).f31163b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j10 = ((C3158a) arrayList.get(i10)).f31163b;
            int i11 = (j6 > j10 ? 1 : (j6 == j10 ? 0 : -1));
            if (i11 == 0) {
                return j10;
            }
            if (i11 < 0) {
                C3158a c3158a = (C3158a) arrayList.get(i10 - 1);
                long j11 = c3158a.f31165d;
                if (j11 == -9223372036854775807L || j11 > j6) {
                    return c3158a.f31163b;
                }
                return j11;
            }
        }
        C3158a c3158a2 = (C3158a) H.R(arrayList);
        long j12 = c3158a2.f31165d;
        if (j12 == -9223372036854775807L || j6 < j12) {
            return c3158a2.f31163b;
        }
        return j12;
    }

    @Override // G2.a
    public final void e(long j6) {
        int h10 = h(j6);
        if (h10 > 0) {
            this.f5857a.subList(0, h10).clear();
        }
    }

    public final void f(Object obj) {
        this.f5857a.add(obj);
    }

    public final void g(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z10 = obj instanceof Object[];
        ArrayList arrayList = this.f5857a;
        if (z10) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
            }
        } else if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                arrayList.add(obj2);
            }
        } else if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public final int h(long j6) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5857a;
            if (i10 < arrayList.size()) {
                if (j6 < ((C3158a) arrayList.get(i10)).f31163b) {
                    return i10;
                }
                i10++;
            } else {
                return arrayList.size();
            }
        }
    }

    public d() {
        this.f5857a = new ArrayList();
    }
}
