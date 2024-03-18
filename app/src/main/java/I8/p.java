package I8;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p extends r implements Iterable {

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayList f8131Y;

    public p() {
        this.f8131Y = new ArrayList();
    }

    @Override // I8.r
    public final long I() {
        return i0().I();
    }

    @Override // I8.r
    public final Number M() {
        return i0().M();
    }

    @Override // I8.r
    public final String T() {
        return i0().T();
    }

    public final void U(r rVar) {
        if (rVar == null) {
            rVar = t.f8132Y;
        }
        this.f8131Y.add(rVar);
    }

    public final void V(String str) {
        Object obj;
        ArrayList arrayList = this.f8131Y;
        if (str == null) {
            obj = t.f8132Y;
        } else {
            obj = new w(str);
        }
        arrayList.add(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof p) || !((p) obj).f8131Y.equals(this.f8131Y))) {
            return false;
        }
        return true;
    }

    @Override // I8.r
    public final boolean f() {
        return i0().f();
    }

    public final int hashCode() {
        return this.f8131Y.hashCode();
    }

    public final r i0() {
        ArrayList arrayList = this.f8131Y;
        int size = arrayList.size();
        if (size == 1) {
            return (r) arrayList.get(0);
        }
        throw new IllegalStateException(android.gov.nist.core.a.e("Array must have size 1, but has size ", size));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f8131Y.iterator();
    }

    @Override // I8.r
    public final int r() {
        return i0().r();
    }

    public p(int i10) {
        this.f8131Y = new ArrayList(i10);
    }
}
