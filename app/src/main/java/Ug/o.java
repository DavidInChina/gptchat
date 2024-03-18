package ug;

import Mf.AbstractC1000i;
import Pf.T;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kg.C4294f;

/* loaded from: classes.dex */
public abstract class o implements n {
    @Override // ug.n
    public Collection a(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        return kf.v.f37483Y;
    }

    @Override // ug.n
    public Set b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : d(C5925g.f46784o, Ig.b.f8594Y)) {
            if (obj instanceof T) {
                C4294f name = ((T) obj).getName();
                AbstractC3557B.b0("getName(...)", name);
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // ug.n
    public Set c() {
        return null;
    }

    @Override // ug.p
    public Collection d(C5925g c5925g, wf.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        AbstractC3557B.c0("nameFilter", kVar);
        return kf.v.f37483Y;
    }

    @Override // ug.p
    public AbstractC1000i e(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        return null;
    }

    @Override // ug.n
    public Collection f(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        return kf.v.f37483Y;
    }

    @Override // ug.n
    public Set g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : d(C5925g.f46785p, Ig.b.f8594Y)) {
            if (obj instanceof T) {
                C4294f name = ((T) obj).getName();
                AbstractC3557B.b0("getName(...)", name);
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }
}
