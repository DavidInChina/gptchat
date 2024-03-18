package Xf;

import Ag.q;
import Mf.L;
import Sf.A;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jf.C3954d;
import kf.v;
import kg.C4291c;
import l8.AbstractC4344b;
import s3.z;
import ud.C5902a;
import wf.k;

/* loaded from: classes2.dex */
public final class e implements L {

    /* renamed from: a  reason: collision with root package name */
    public final z f21982a;

    /* renamed from: b  reason: collision with root package name */
    public final Ag.f f21983b;

    /* JADX WARN: Type inference failed for: r0v1, types: [Ag.g, Ag.f] */
    public e(a aVar) {
        z zVar = new z(aVar, b.f21977b, new C3954d());
        this.f21982a = zVar;
        q qVar = (q) zVar.e();
        qVar.getClass();
        this.f21983b = new Ag.g(qVar, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // Mf.L
    public final void a(C4291c c4291c, ArrayList arrayList) {
        AbstractC3557B.c0("fqName", c4291c);
        Ig.i.b(d(c4291c), arrayList);
    }

    @Override // Mf.L
    public final boolean b(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        ((a) this.f21982a.f45394a).f21953b.getClass();
        return false;
    }

    @Override // Mf.H
    public final List c(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        return AbstractC4344b.H0(d(c4291c));
    }

    public final Yf.q d(C4291c c4291c) {
        ((a) this.f21982a.f45394a).f21953b.getClass();
        AbstractC3557B.c0("fqName", c4291c);
        C5902a c5902a = new C5902a(this, 20, new A(c4291c));
        Ag.f fVar = this.f21983b;
        fVar.getClass();
        Object invoke = fVar.invoke(new Ag.i(c4291c, c5902a));
        if (invoke != null) {
            return (Yf.q) invoke;
        }
        Ag.f.a(3);
        throw null;
    }

    @Override // Mf.H
    public final Collection l(C4291c c4291c, k kVar) {
        AbstractC3557B.c0("fqName", c4291c);
        AbstractC3557B.c0("nameFilter", kVar);
        List list = (List) d(c4291c).f22382p0.mo122invoke();
        if (list == null) {
            return v.f37483Y;
        }
        return list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((a) this.f21982a.f45394a).f21966o;
    }
}
