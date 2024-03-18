package ug;

import Mf.AbstractC1000i;
import Mf.AbstractC1001j;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kf.x;
import kg.C4294f;

/* renamed from: ug.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5920b implements n {

    /* renamed from: b  reason: collision with root package name */
    public final String f46765b;

    /* renamed from: c  reason: collision with root package name */
    public final n[] f46766c;

    public C5920b(String str, n[] nVarArr) {
        this.f46765b = str;
        this.f46766c = nVarArr;
    }

    @Override // ug.n
    public final Collection a(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        n[] nVarArr = this.f46766c;
        int length = nVarArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection collection = null;
                for (n nVar : nVarArr) {
                    collection = A7.b.p0(collection, nVar.a(c4294f, dVar));
                }
                if (collection == null) {
                    return x.f37485Y;
                }
                return collection;
            }
            return nVarArr[0].a(c4294f, dVar);
        }
        return kf.v.f37483Y;
    }

    @Override // ug.n
    public final Set b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : this.f46766c) {
            kf.s.N1(nVar.b(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // ug.n
    public final Set c() {
        return Ad.l.m0(kf.q.P2(this.f46766c));
    }

    @Override // ug.p
    public final Collection d(C5925g c5925g, wf.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        AbstractC3557B.c0("nameFilter", kVar);
        n[] nVarArr = this.f46766c;
        int length = nVarArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection collection = null;
                for (n nVar : nVarArr) {
                    collection = A7.b.p0(collection, nVar.d(c5925g, kVar));
                }
                if (collection == null) {
                    return x.f37485Y;
                }
                return collection;
            }
            return nVarArr[0].d(c5925g, kVar);
        }
        return kf.v.f37483Y;
    }

    @Override // ug.p
    public final AbstractC1000i e(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        AbstractC1000i abstractC1000i = null;
        for (n nVar : this.f46766c) {
            AbstractC1000i e10 = nVar.e(c4294f, dVar);
            if (e10 != null) {
                if ((e10 instanceof AbstractC1001j) && ((AbstractC1001j) e10).H()) {
                    if (abstractC1000i == null) {
                        abstractC1000i = e10;
                    }
                } else {
                    return e10;
                }
            }
        }
        return abstractC1000i;
    }

    @Override // ug.n
    public final Collection f(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        n[] nVarArr = this.f46766c;
        int length = nVarArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection collection = null;
                for (n nVar : nVarArr) {
                    collection = A7.b.p0(collection, nVar.f(c4294f, dVar));
                }
                if (collection == null) {
                    return x.f37485Y;
                }
                return collection;
            }
            return nVarArr[0].f(c4294f, dVar);
        }
        return kf.v.f37483Y;
    }

    @Override // ug.n
    public final Set g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : this.f46766c) {
            kf.s.N1(nVar.g(), linkedHashSet);
        }
        return linkedHashSet;
    }

    public final String toString() {
        return this.f46765b;
    }
}
