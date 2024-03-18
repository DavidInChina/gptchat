package K8;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j extends AbstractSet {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9553Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ m f9554Z;

    public /* synthetic */ j(m mVar, int i10) {
        this.f9553Y = i10;
        this.f9554Z = mVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f9553Y;
        m mVar = this.f9554Z;
        switch (i10) {
            case 0:
                mVar.clear();
                return;
            default:
                mVar.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        l a5;
        int i10 = this.f9553Y;
        m mVar = this.f9554Z;
        switch (i10) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                mVar.getClass();
                Object key = entry.getKey();
                l lVar = null;
                if (key != null) {
                    try {
                        a5 = mVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a5 != null && Objects.equals(a5.f9566m0, entry.getValue())) {
                        lVar = a5;
                    }
                    if (lVar != null) {
                        return false;
                    }
                    return true;
                }
                a5 = null;
                if (a5 != null) {
                    lVar = a5;
                }
                if (lVar != null) {
                }
            default:
                return mVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f9553Y) {
            case 0:
                return new i(this);
            default:
                return new i(this, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        l a5;
        l lVar = null;
        int i10 = this.f9553Y;
        m mVar = this.f9554Z;
        switch (i10) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                mVar.getClass();
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        a5 = mVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a5 != null && Objects.equals(a5.f9566m0, entry.getValue())) {
                        lVar = a5;
                    }
                    if (lVar != null) {
                        return false;
                    }
                    mVar.c(lVar, true);
                    return true;
                }
                a5 = null;
                if (a5 != null) {
                    lVar = a5;
                }
                if (lVar != null) {
                }
            default:
                mVar.getClass();
                if (obj != null) {
                    try {
                        lVar = mVar.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (lVar != null) {
                    mVar.c(lVar, true);
                }
                if (lVar == null) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i10 = this.f9553Y;
        m mVar = this.f9554Z;
        switch (i10) {
            case 0:
                return mVar.f9572i0;
            default:
                return mVar.f9572i0;
        }
    }
}
