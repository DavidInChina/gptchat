package xg;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kg.C4291c;
import l8.AbstractC4344b;
import yg.C6587d;

/* renamed from: xg.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6446a implements Mf.L {

    /* renamed from: a  reason: collision with root package name */
    public final Ag.u f49987a;

    /* renamed from: b  reason: collision with root package name */
    public final dg.x f49988b;

    /* renamed from: c  reason: collision with root package name */
    public final Mf.B f49989c;

    /* renamed from: d  reason: collision with root package name */
    public m f49990d;

    /* renamed from: e  reason: collision with root package name */
    public final Ag.m f49991e;

    public AbstractC6446a(Ag.q qVar, Rf.d dVar, Pf.G g10) {
        this.f49987a = qVar;
        this.f49988b = dVar;
        this.f49989c = g10;
        this.f49991e = qVar.c(new Xf.f(9, this));
    }

    @Override // Mf.L
    public final void a(C4291c c4291c, ArrayList arrayList) {
        AbstractC3557B.c0("fqName", c4291c);
        Ig.i.b(this.f49991e.invoke(c4291c), arrayList);
    }

    @Override // Mf.L
    public final boolean b(C4291c c4291c) {
        Object obj;
        AbstractC3557B.c0("fqName", c4291c);
        Ag.m mVar = this.f49991e;
        Object obj2 = mVar.f861Z.get(c4291c);
        if (obj2 != null && obj2 != Ag.o.f864Z) {
            obj = (Mf.G) mVar.invoke(c4291c);
        } else {
            obj = d(c4291c);
        }
        if (obj == null) {
            return true;
        }
        return false;
    }

    @Override // Mf.H
    public final List c(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        return AbstractC4344b.H0(this.f49991e.invoke(c4291c));
    }

    public abstract C6587d d(C4291c c4291c);

    @Override // Mf.H
    public final Collection l(C4291c c4291c, wf.k kVar) {
        AbstractC3557B.c0("fqName", c4291c);
        AbstractC3557B.c0("nameFilter", kVar);
        return kf.x.f37485Y;
    }
}
