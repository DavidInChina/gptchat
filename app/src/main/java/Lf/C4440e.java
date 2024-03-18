package lf;

import id.AbstractC3557B;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kf.AbstractC4285j;

/* renamed from: lf.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4440e extends AbstractC4285j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38325Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C4439d f38326Z;

    public C4440e(C4439d c4439d, int i10) {
        this.f38325Y = i10;
        if (i10 != 1) {
            AbstractC3557B.c0("backing", c4439d);
            this.f38326Z = c4439d;
            return;
        }
        AbstractC3557B.c0("backing", c4439d);
        this.f38326Z = c4439d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f38325Y) {
            case 0:
                AbstractC3557B.c0("element", (Map.Entry) obj);
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f38325Y) {
            case 0:
                AbstractC3557B.c0("elements", collection);
                throw new UnsupportedOperationException();
            default:
                AbstractC3557B.c0("elements", collection);
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f38325Y;
        C4439d c4439d = this.f38326Z;
        switch (i10) {
            case 0:
                c4439d.clear();
                return;
            default:
                c4439d.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f38325Y) {
            case 0:
                return s(obj);
            default:
                return this.f38326Z.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        switch (this.f38325Y) {
            case 0:
                AbstractC3557B.c0("elements", collection);
                return this.f38326Z.c(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i10 = this.f38325Y;
        C4439d c4439d = this.f38326Z;
        switch (i10) {
            case 0:
                return c4439d.isEmpty();
            default:
                return c4439d.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i10 = this.f38325Y;
        C4439d c4439d = this.f38326Z;
        switch (i10) {
            case 0:
                c4439d.getClass();
                return new C4437b(c4439d, 0);
            default:
                c4439d.getClass();
                return new C4437b(c4439d, 1);
        }
    }

    @Override // kf.AbstractC4285j
    public final int r() {
        int i10 = this.f38325Y;
        C4439d c4439d = this.f38326Z;
        switch (i10) {
            case 0:
                return c4439d.f38320n0;
            default:
                return c4439d.f38320n0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f38325Y) {
            case 0:
                return y(obj);
            default:
                C4439d c4439d = this.f38326Z;
                c4439d.b();
                int g10 = c4439d.g(obj);
                if (g10 >= 0) {
                    c4439d.k(g10);
                    if (g10 >= 0) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i10 = this.f38325Y;
        C4439d c4439d = this.f38326Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("elements", collection);
                c4439d.b();
                return super.removeAll(collection);
            default:
                AbstractC3557B.c0("elements", collection);
                c4439d.b();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i10 = this.f38325Y;
        C4439d c4439d = this.f38326Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("elements", collection);
                c4439d.b();
                return super.retainAll(collection);
            default:
                AbstractC3557B.c0("elements", collection);
                c4439d.b();
                return super.retainAll(collection);
        }
    }

    public final boolean s(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        AbstractC3557B.c0("element", entry);
        return this.f38326Z.d(entry);
    }

    public final boolean y(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        AbstractC3557B.c0("element", entry);
        C4439d c4439d = this.f38326Z;
        c4439d.getClass();
        c4439d.b();
        int g10 = c4439d.g(entry.getKey());
        if (g10 < 0) {
            return false;
        }
        Object[] objArr = c4439d.f38313Z;
        AbstractC3557B.Z(objArr);
        if (!AbstractC3557B.K(objArr[g10], entry.getValue())) {
            return false;
        }
        c4439d.k(g10);
        return true;
    }
}
