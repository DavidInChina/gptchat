package x8;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: x8.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6378w extends AbstractSet {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f49622Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6356A f49623Z;

    public /* synthetic */ C6378w(C6356A c6356a, int i10) {
        this.f49622Y = i10;
        this.f49623Z = c6356a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f49622Y;
        C6356A c6356a = this.f49623Z;
        switch (i10) {
            case 0:
                c6356a.clear();
                return;
            default:
                c6356a.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10 = this.f49622Y;
        C6356A c6356a = this.f49623Z;
        switch (i10) {
            case 0:
                Map b10 = c6356a.b();
                if (b10 != null) {
                    return b10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int d10 = c6356a.d(entry.getKey());
                    if (d10 != -1 && M3.H.O(c6356a.k()[d10], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return c6356a.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i10 = this.f49622Y;
        C6356A c6356a = this.f49623Z;
        switch (i10) {
            case 0:
                Map b10 = c6356a.b();
                if (b10 != null) {
                    return b10.entrySet().iterator();
                }
                return new C6377v(c6356a, 1);
            default:
                Map b11 = c6356a.b();
                if (b11 != null) {
                    return b11.keySet().iterator();
                }
                return new C6377v(c6356a, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i10 = this.f49622Y;
        C6356A c6356a = this.f49623Z;
        switch (i10) {
            case 0:
                Map b10 = c6356a.b();
                if (b10 != null) {
                    return b10.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (c6356a.g()) {
                    return false;
                }
                int c10 = c6356a.c();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = c6356a.f49498Y;
                Objects.requireNonNull(obj2);
                int p02 = Df.H.p0(key, value, c10, obj2, c6356a.i(), c6356a.j(), c6356a.k());
                if (p02 == -1) {
                    return false;
                }
                c6356a.e(p02, c10);
                c6356a.f49503k0--;
                c6356a.f49502j0 += 32;
                return true;
            default:
                Map b11 = c6356a.b();
                if (b11 != null) {
                    return b11.keySet().remove(obj);
                }
                if (c6356a.h(obj) == C6356A.f49497o0) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i10 = this.f49622Y;
        C6356A c6356a = this.f49623Z;
        switch (i10) {
            case 0:
                return c6356a.size();
            default:
                return c6356a.size();
        }
    }
}
