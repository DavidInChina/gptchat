package Yf;

import Bg.C0213f;
import Bg.k0;
import Bg.m0;
import Bg.p0;
import Mf.AbstractC1003l;
import Pf.AbstractC1145c;
import Uf.EnumC1440b;
import bg.AbstractC2201i;
import cg.C2423n;
import cg.C2425p;
import id.AbstractC3557B;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.C4294f;
import l8.AbstractC4344b;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class J extends AbstractC1145c {

    /* renamed from: p0  reason: collision with root package name */
    public final s3.z f22313p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Sf.E f22314q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(s3.z zVar, Sf.E e10, int i10, AbstractC1003l abstractC1003l) {
        super(zVar.e(), abstractC1003l, new Xf.d(zVar, e10, false), C4294f.e(e10.f16592a.getName()), p0.f2146h0, false, i10, ((Xf.a) zVar.f45394a).f21964m);
        AbstractC3557B.c0("javaTypeParameter", e10);
        AbstractC3557B.c0("containingDeclaration", abstractC1003l);
        this.f22313p0 = zVar;
        this.f22314q0 = e10;
    }

    @Override // Pf.AbstractC1153k
    public final List w0(List list) {
        s3.z zVar = this.f22313p0;
        y7.b bVar = ((Xf.a) zVar.f45394a).f21969r;
        bVar.getClass();
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bg.A a5 = (Bg.A) it.next();
            C2423n c2423n = C2423n.f26645Y;
            AbstractC3557B.c0("<this>", a5);
            if (!m0.d(a5, c2423n, null) && (a5 = bVar.m(new C2425p(this, false, zVar, EnumC1440b.f17807k0, false), a5, kf.v.f37483Y, null, false)) == null) {
                a5 = a5;
            }
            arrayList.add(a5);
        }
        return arrayList;
    }

    @Override // Pf.AbstractC1153k
    public final void x0(Bg.A a5) {
        AbstractC3557B.c0("type", a5);
    }

    @Override // Pf.AbstractC1153k
    public final List y0() {
        Type type;
        Type[] bounds = this.f22314q0.f16592a.getBounds();
        AbstractC3557B.b0("getBounds(...)", bounds);
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type2 : bounds) {
            arrayList.add(new Sf.s(type2));
        }
        Sf.s sVar = (Sf.s) kf.t.D2(arrayList);
        if (sVar != null) {
            type = sVar.f16623a;
        } else {
            type = null;
        }
        List<AbstractC2201i> list = arrayList;
        if (AbstractC3557B.K(type, Object.class)) {
            list = kf.v.f37483Y;
        }
        boolean isEmpty = list.isEmpty();
        s3.z zVar = this.f22313p0;
        if (isEmpty) {
            Bg.D e10 = zVar.d().j().e();
            AbstractC3557B.b0("getAnyType(...)", e10);
            Bg.D o10 = zVar.d().j().o();
            AbstractC3557B.b0("getNullableAnyType(...)", o10);
            return AbstractC4344b.F0(C0213f.f(e10, o10));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
        for (AbstractC2201i abstractC2201i : list) {
            arrayList2.add(((U3.i) zVar.f45398e).L(abstractC2201i, A7.b.N1(k0.f2132Z, false, false, this, 3)));
        }
        return arrayList2;
    }
}
