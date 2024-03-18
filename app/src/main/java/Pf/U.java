package Pf;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kg.C4291c;
import kg.C4294f;
import ug.C5922d;
import ug.C5925g;

/* loaded from: classes2.dex */
public final class U extends ug.o {

    /* renamed from: b  reason: collision with root package name */
    public final Mf.B f14063b;

    /* renamed from: c  reason: collision with root package name */
    public final C4291c f14064c;

    public U(G g10, C4291c c4291c) {
        AbstractC3557B.c0("moduleDescriptor", g10);
        AbstractC3557B.c0("fqName", c4291c);
        this.f14063b = g10;
        this.f14064c = c4291c;
    }

    @Override // ug.o, ug.n
    public final Set c() {
        return kf.x.f37485Y;
    }

    @Override // ug.o, ug.p
    public final Collection d(C5925g c5925g, wf.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        AbstractC3557B.c0("nameFilter", kVar);
        boolean a5 = c5925g.a(C5925g.f46776g);
        kf.v vVar = kf.v.f37483Y;
        if (!a5) {
            return vVar;
        }
        C4291c c4291c = this.f14064c;
        if (c4291c.d()) {
            if (c5925g.f46788a.contains(C5922d.f46769a)) {
                return vVar;
            }
        }
        Mf.B b10 = this.f14063b;
        Collection<C4291c> l10 = b10.l(c4291c, kVar);
        ArrayList arrayList = new ArrayList(l10.size());
        for (C4291c c4291c2 : l10) {
            C4294f f6 = c4291c2.f();
            AbstractC3557B.b0("shortName(...)", f6);
            if (((Boolean) kVar.invoke(f6)).booleanValue()) {
                A a10 = null;
                if (!f6.f37508Z) {
                    A a11 = (A) b10.r(c4291c.c(f6));
                    if (!((Boolean) A7.b.X0(a11.f13978k0, A.f13974m0[1])).booleanValue()) {
                        a10 = a11;
                    }
                }
                Ig.i.b(a10, arrayList);
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "subpackages of " + this.f14064c + " from " + this.f14063b;
    }
}
