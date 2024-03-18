package ug;

import Mf.AbstractC0997f;
import Mf.P;
import Pf.T;
import Uf.A;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.List;
import kg.C4294f;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;

/* renamed from: ug.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5926h extends o {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f46790d;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0997f f46791b;

    /* renamed from: c  reason: collision with root package name */
    public final Ag.l f46792c;

    static {
        D d10 = C.f37623a;
        f46790d = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.b(AbstractC5926h.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public AbstractC5926h(Ag.u uVar, AbstractC0997f abstractC0997f) {
        AbstractC3557B.c0("storageManager", uVar);
        AbstractC3557B.c0("containingClass", abstractC0997f);
        this.f46791b = abstractC0997f;
        this.f46792c = new Ag.l((Ag.q) uVar, new A(7, this));
    }

    @Override // ug.o, ug.n
    public final Collection a(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        List list = (List) A7.b.X0(this.f46792c, f46790d[0]);
        if (list.isEmpty()) {
            return kf.v.f37483Y;
        }
        Ig.f fVar = new Ig.f();
        for (Object obj : list) {
            if ((obj instanceof T) && AbstractC3557B.K(((T) obj).getName(), c4294f)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    @Override // ug.o, ug.p
    public final Collection d(C5925g c5925g, wf.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        AbstractC3557B.c0("nameFilter", kVar);
        if (!c5925g.a(C5925g.f46782m.f46789b)) {
            return kf.v.f37483Y;
        }
        return (List) A7.b.X0(this.f46792c, f46790d[0]);
    }

    @Override // ug.o, ug.n
    public final Collection f(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        List list = (List) A7.b.X0(this.f46792c, f46790d[0]);
        if (list.isEmpty()) {
            return kf.v.f37483Y;
        }
        Ig.f fVar = new Ig.f();
        for (Object obj : list) {
            if ((obj instanceof P) && AbstractC3557B.K(((P) obj).getName(), c4294f)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    public abstract List h();
}
