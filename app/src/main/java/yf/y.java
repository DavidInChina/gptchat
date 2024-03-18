package Yf;

import Bg.k0;
import Bg.m0;
import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.EnumC0998g;
import Mf.P;
import Mf.i0;
import Pf.O;
import Pf.T;
import id.AbstractC3557B;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kg.C4294f;
import ng.AbstractC4838e;
import rg.AbstractC5493d;
import sg.C5624a;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22401Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B f22402Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(B b10, int i10) {
        super(1);
        this.f22401Y = i10;
        this.f22402Z = b10;
    }

    public final Collection a(C4294f c4294f) {
        int i10 = this.f22401Y;
        B b10 = this.f22402Z;
        switch (i10) {
            case 1:
                AbstractC3557B.c0("name", c4294f);
                B b11 = b10.f22293c;
                if (b11 != null) {
                    return (Collection) b11.f22296f.invoke(c4294f);
                }
                ArrayList arrayList = new ArrayList();
                for (Sf.z zVar : ((AbstractC1691c) b10.f22295e.mo122invoke()).b(c4294f)) {
                    Wf.f t10 = b10.t(zVar);
                    if (b10.r(t10)) {
                        ((Cf.h) ((Xf.a) b10.f22292b.f45394a).f21958g).getClass();
                        arrayList.add(t10);
                    }
                }
                b10.j(arrayList, c4294f);
                return arrayList;
            default:
                AbstractC3557B.c0("name", c4294f);
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) b10.f22296f.invoke(c4294f));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : linkedHashSet) {
                    String e02 = L4.a.e0((T) obj, 2);
                    Object obj2 = linkedHashMap.get(e02);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(e02, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        Collection E12 = Bi.c.E1(list, A.f22290Y);
                        linkedHashSet.removeAll(list);
                        linkedHashSet.addAll(E12);
                    }
                }
                b10.m(linkedHashSet, c4294f);
                s3.z zVar2 = b10.f22292b;
                return kf.t.K2(((Xf.a) zVar2.f45394a).f21969r.n(zVar2, linkedHashSet));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b3, code lost:
        if (Jf.u.a(r2) == false) goto L59;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z10;
        AbstractC0997f abstractC0997f;
        int i10 = this.f22401Y;
        B b10 = this.f22402Z;
        switch (i10) {
            case 0:
                C4294f c4294f = (C4294f) obj;
                AbstractC3557B.c0("name", c4294f);
                B b11 = b10.f22293c;
                if (b11 != null) {
                    return (P) b11.f22297g.invoke(c4294f);
                }
                Sf.w c10 = ((AbstractC1691c) b10.f22295e.mo122invoke()).c(c4294f);
                if (c10 != null) {
                    Field field = c10.f16627a;
                    if (!field.isEnumConstant()) {
                        ?? obj2 = new Object();
                        boolean z11 = !Modifier.isFinal(((Field) c10.a()).getModifiers());
                        s3.z zVar = b10.f22292b;
                        Xf.d B12 = Bi.c.B1(zVar, c10);
                        AbstractC1003l q10 = b10.q();
                        Cf.k kVar = Mf.A.f12050Y;
                        AbstractC1007p h22 = R4.b.h2(c10.d());
                        C4294f b12 = c10.b();
                        Rf.h a5 = ((Rf.f) ((Xf.a) zVar.f45394a).f21961j).a(c10);
                        if (Modifier.isFinal(((Field) c10.a()).getModifiers()) && Modifier.isStatic(((Field) c10.a()).getModifiers())) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Wf.g F02 = Wf.g.F0(q10, B12, h22, z11, b12, a5, z10);
                        obj2.f37622Y = F02;
                        F02.B0(null, null, null, null);
                        Type genericType = field.getGenericType();
                        AbstractC3557B.b0("getGenericType(...)", genericType);
                        Bg.A L10 = ((U3.i) zVar.f45398e).L(Cf.h.g(genericType), A7.b.N1(k0.f2132Z, false, false, null, 7));
                        if ((Jf.l.F(L10) || Jf.l.D(L10, Jf.p.f9173f)) && Modifier.isFinal(((Field) c10.a()).getModifiers())) {
                            Modifier.isStatic(((Field) c10.a()).getModifiers());
                        }
                        kf.v vVar = kf.v.f37483Y;
                        ((O) obj2.f37622Y).E0(L10, vVar, b10.p(), null, vVar);
                        AbstractC1003l q11 = b10.q();
                        if (q11 instanceof AbstractC0997f) {
                            abstractC0997f = (AbstractC0997f) q11;
                        } else {
                            abstractC0997f = null;
                        }
                        if (abstractC0997f != null) {
                            obj2.f37622Y = ((C5624a) ((Xf.a) zVar.f45394a).f21975x).h(zVar, abstractC0997f, (O) obj2.f37622Y);
                        }
                        Object obj3 = obj2.f37622Y;
                        i0 i0Var = (i0) obj3;
                        Bg.A type = ((O) obj3).getType();
                        if (i0Var != null) {
                            if (type != null) {
                                int i11 = AbstractC4838e.f40339a;
                                if (!i0Var.Y() && !Bi.c.g1(type)) {
                                    if (!m0.b(type)) {
                                        Jf.l e10 = AbstractC5493d.e(i0Var);
                                        if (!Jf.l.F(type)) {
                                            Cg.o oVar = Cg.d.f3125a;
                                            if (!oVar.a(e10.u(), type)) {
                                                if (!oVar.a(e10.j("Number").n(), type)) {
                                                    if (!oVar.a(e10.e(), type)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    ((O) obj2.f37622Y).C0(null, new z(b10, c10, obj2, 1));
                                }
                                Vf.j jVar = ((Xf.a) zVar.f45394a).f21958g;
                                P p10 = (P) obj2.f37622Y;
                                ((Cf.h) jVar).getClass();
                                if (p10 != null) {
                                    return (P) obj2.f37622Y;
                                }
                                Cf.h.e(6);
                                throw null;
                            }
                            AbstractC4838e.a(67);
                            throw null;
                        }
                        AbstractC4838e.a(66);
                        throw null;
                    }
                }
                return null;
            case 1:
                return a((C4294f) obj);
            case 2:
                return a((C4294f) obj);
            default:
                C4294f c4294f2 = (C4294f) obj;
                AbstractC3557B.c0("name", c4294f2);
                ArrayList arrayList = new ArrayList();
                Ig.i.b(b10.f22297g.invoke(c4294f2), arrayList);
                b10.n(arrayList, c4294f2);
                AbstractC1003l q12 = b10.q();
                int i12 = AbstractC4838e.f40339a;
                if (AbstractC4838e.n(q12, EnumC0998g.f12088j0)) {
                    return kf.t.K2(arrayList);
                }
                s3.z zVar2 = b10.f22292b;
                return kf.t.K2(((Xf.a) zVar2.f45394a).f21969r.n(zVar2, arrayList));
        }
    }
}
