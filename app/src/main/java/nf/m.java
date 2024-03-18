package Nf;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kg.C4291c;
import kg.C4292d;

/* loaded from: classes.dex */
public final class m implements i {

    /* renamed from: Y  reason: collision with root package name */
    public final i f12830Y;

    /* renamed from: Z  reason: collision with root package name */
    public final wf.k f12831Z;

    public m(i iVar, C4292d c4292d) {
        this.f12830Y = iVar;
        this.f12831Z = c4292d;
    }

    @Override // Nf.i
    public final boolean G(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        if (((Boolean) this.f12831Z.invoke(c4291c)).booleanValue()) {
            return this.f12830Y.G(c4291c);
        }
        return false;
    }

    @Override // Nf.i
    public final boolean isEmpty() {
        i<c> iVar = this.f12830Y;
        if ((iVar instanceof Collection) && ((Collection) iVar).isEmpty()) {
            return false;
        }
        for (c cVar : iVar) {
            C4291c a5 = cVar.a();
            if (a5 != null && ((Boolean) this.f12831Z.invoke(a5)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f12830Y) {
            C4291c a5 = ((c) obj).a();
            if (a5 != null && ((Boolean) this.f12831Z.invoke(a5)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // Nf.i
    public final c l(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        if (((Boolean) this.f12831Z.invoke(c4291c)).booleanValue()) {
            return this.f12830Y.l(c4291c);
        }
        return null;
    }
}
