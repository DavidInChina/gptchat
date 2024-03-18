package ug;

import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1001j;
import Mf.a0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kg.C4294f;

/* renamed from: ug.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5927i extends o {

    /* renamed from: b  reason: collision with root package name */
    public final n f46793b;

    public C5927i(n nVar) {
        AbstractC3557B.c0("workerScope", nVar);
        this.f46793b = nVar;
    }

    @Override // ug.o, ug.n
    public final Set b() {
        return this.f46793b.b();
    }

    @Override // ug.o, ug.n
    public final Set c() {
        return this.f46793b.c();
    }

    @Override // ug.o, ug.p
    public final Collection d(C5925g c5925g, wf.k kVar) {
        C5925g c5925g2;
        AbstractC3557B.c0("kindFilter", c5925g);
        AbstractC3557B.c0("nameFilter", kVar);
        int i10 = C5925g.f46780k & c5925g.f46789b;
        if (i10 == 0) {
            c5925g2 = null;
        } else {
            c5925g2 = new C5925g(i10, c5925g.f46788a);
        }
        if (c5925g2 == null) {
            return kf.v.f37483Y;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f46793b.d(c5925g2, kVar)) {
            if (obj instanceof AbstractC1001j) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // ug.o, ug.p
    public final AbstractC1000i e(C4294f c4294f, Tf.d dVar) {
        AbstractC0997f abstractC0997f;
        AbstractC3557B.c0("name", c4294f);
        AbstractC1000i e10 = this.f46793b.e(c4294f, dVar);
        if (e10 == null) {
            return null;
        }
        if (e10 instanceof AbstractC0997f) {
            abstractC0997f = (AbstractC0997f) e10;
        } else {
            abstractC0997f = null;
        }
        if (abstractC0997f != null) {
            return abstractC0997f;
        }
        if (!(e10 instanceof a0)) {
            return null;
        }
        return (a0) e10;
    }

    @Override // ug.o, ug.n
    public final Set g() {
        return this.f46793b.g();
    }

    public final String toString() {
        return "Classes from " + this.f46793b;
    }
}
