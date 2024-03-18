package Gf;

import Hf.C0726c;
import Hf.EnumC0724a;
import Hf.EnumC0725b;
import Mf.AbstractC0997f;
import Mf.AbstractC1002k;
import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import id.AbstractC3557B;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kg.C4290b;
import ng.AbstractC4842i;
import wf.AbstractC6216a;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class I extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6343Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ J f6344Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(J j6, int i10) {
        super(0);
        this.f6343Y = i10;
        this.f6344Z = j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Hf.g a() {
        Object obj;
        Hf.g gVar;
        Object obj2;
        Hf.g gVar2;
        int i10 = this.f6343Y;
        J j6 = this.f6344Z;
        switch (i10) {
            case 0:
                C4290b c4290b = y0.f6500a;
                R4.b c10 = y0.c(j6.s());
                boolean z10 = c10 instanceof C0637k;
                H h10 = j6.f6346l0;
                if (z10) {
                    if (j6.u()) {
                        Class f6 = h10.f();
                        List<Df.o> parameters = j6.getParameters();
                        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(parameters, 10));
                        for (Df.o oVar : parameters) {
                            String name = ((Z) oVar).getName();
                            AbstractC3557B.Z(name);
                            arrayList.add(name);
                        }
                        EnumC0724a enumC0724a = EnumC0724a.f7696Z;
                        EnumC0725b enumC0725b = EnumC0725b.f7698Y;
                        return new C0726c(f6, arrayList, enumC0724a);
                    }
                    String str = ((C0637k) c10).f6420j.f36186b;
                    h10.getClass();
                    AbstractC3557B.c0("desc", str);
                    obj = H.w(h10.f(), h10.t(str));
                } else if (c10 instanceof C0638l) {
                    AbstractC1013w s10 = j6.s();
                    AbstractC1003l mo20k = s10.mo20k();
                    AbstractC3557B.b0("getContainingDeclaration(...)", mo20k);
                    if (AbstractC4842i.c(mo20k) && (s10 instanceof AbstractC1002k) && ((AbstractC1002k) s10).v()) {
                        AbstractC1013w s11 = j6.s();
                        String str2 = ((C0638l) c10).f6424j.f36186b;
                        List S = j6.s().S();
                        AbstractC3557B.b0("getValueParameters(...)", S);
                        return new Hf.C(s11, h10, str2, S);
                    }
                    jg.e eVar = ((C0638l) c10).f6424j;
                    obj = h10.h(eVar.f36185a, eVar.f36186b);
                } else if (c10 instanceof C0636j) {
                    obj = ((C0636j) c10).f6419j;
                } else if (c10 instanceof C0635i) {
                    obj = ((C0635i) c10).f6417j;
                } else if (c10 instanceof C0634h) {
                    Class f10 = h10.f();
                    List<Method> list = ((C0634h) c10).f6414j;
                    ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
                    for (Method method : list) {
                        arrayList2.add(method.getName());
                    }
                    return new C0726c(f10, arrayList2, EnumC0724a.f7696Z, EnumC0725b.f7698Y, list);
                } else {
                    throw new RuntimeException();
                }
                if (obj instanceof Constructor) {
                    gVar = J.w(j6, (Constructor) obj, j6.s(), false);
                } else if (obj instanceof Method) {
                    Method method2 = (Method) obj;
                    boolean isStatic = Modifier.isStatic(method2.getModifiers());
                    Object obj3 = j6.f6348n0;
                    if (!isStatic) {
                        if (j6.v()) {
                            gVar = new Hf.r(r.f.l(obj3, j6.s()), method2);
                        } else {
                            gVar = new Hf.v(0, method2);
                        }
                    } else if (((Nf.b) j6.s()).getAnnotations().l(A0.f6330a) != null) {
                        if (j6.v()) {
                            gVar = new Hf.s(method2);
                        } else {
                            gVar = new Hf.v(1, method2);
                        }
                    } else if (j6.v()) {
                        gVar = new Hf.t(r.f.l(obj3, j6.s()), method2);
                    } else {
                        gVar = new Hf.v(2, method2);
                    }
                } else {
                    throw new Lc.l("Could not compute caller for function: " + j6.s() + " (member = " + obj + ')', 3);
                }
                return r.f.s(gVar, j6.s(), false);
            default:
                C4290b c4290b2 = y0.f6500a;
                R4.b c11 = y0.c(j6.s());
                boolean z11 = c11 instanceof C0638l;
                Hf.g gVar3 = null;
                H h11 = j6.f6346l0;
                if (z11) {
                    AbstractC1013w s12 = j6.s();
                    AbstractC1003l mo20k2 = s12.mo20k();
                    AbstractC3557B.b0("getContainingDeclaration(...)", mo20k2);
                    if (AbstractC4842i.c(mo20k2) && (s12 instanceof AbstractC1002k) && ((AbstractC1002k) s12).v()) {
                        throw new Lc.l(j6.s().mo20k() + " cannot have default arguments", 3);
                    }
                    jg.e eVar2 = ((C0638l) c11).f6424j;
                    String str3 = eVar2.f36185a;
                    Member b10 = j6.g().b();
                    AbstractC3557B.Z(b10);
                    boolean z12 = !Modifier.isStatic(b10.getModifiers());
                    h11.getClass();
                    AbstractC3557B.c0("name", str3);
                    String str4 = eVar2.f36186b;
                    AbstractC3557B.c0("desc", str4);
                    if (!AbstractC3557B.K(str3, "<init>")) {
                        ArrayList arrayList3 = new ArrayList();
                        if (z12) {
                            arrayList3.add(h11.f());
                        }
                        h11.g(str4, arrayList3, false);
                        obj2 = H.u(h11.n(), str3.concat("$default"), (Class[]) arrayList3.toArray(new Class[0]), h11.v(Lg.n.k2(str4, ')', 0, false, 6) + 1, str4.length(), str4), z12);
                        if (!(obj2 instanceof Constructor)) {
                            gVar2 = J.w(j6, (Constructor) obj2, j6.s(), true);
                        } else if (obj2 instanceof Method) {
                            if (((Nf.b) j6.s()).getAnnotations().l(A0.f6330a) != null) {
                                AbstractC1003l mo20k3 = j6.s().mo20k();
                                AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", mo20k3);
                                if (!((AbstractC0997f) mo20k3).q()) {
                                    Method method3 = (Method) obj2;
                                    if (j6.v()) {
                                        gVar2 = new Hf.s(method3);
                                    } else {
                                        gVar2 = new Hf.v(1, method3);
                                    }
                                }
                            }
                            Method method4 = (Method) obj2;
                            if (j6.v()) {
                                gVar2 = new Hf.t(r.f.l(j6.f6348n0, j6.s()), method4);
                            } else {
                                gVar2 = new Hf.v(2, method4);
                            }
                        } else {
                            gVar2 = null;
                        }
                        if (gVar2 != null) {
                            gVar3 = r.f.s(gVar2, j6.s(), true);
                        }
                        return gVar3;
                    }
                    obj2 = null;
                    if (!(obj2 instanceof Constructor)) {
                    }
                    if (gVar2 != null) {
                    }
                    return gVar3;
                } else if (c11 instanceof C0637k) {
                    if (j6.u()) {
                        Class f11 = h11.f();
                        List<Df.o> parameters2 = j6.getParameters();
                        ArrayList arrayList4 = new ArrayList(AbstractC6583a.H1(parameters2, 10));
                        for (Df.o oVar2 : parameters2) {
                            String name2 = ((Z) oVar2).getName();
                            AbstractC3557B.Z(name2);
                            arrayList4.add(name2);
                        }
                        EnumC0724a enumC0724a2 = EnumC0724a.f7695Y;
                        EnumC0725b enumC0725b2 = EnumC0725b.f7698Y;
                        return new C0726c(f11, arrayList4, enumC0724a2);
                    }
                    String str5 = ((C0637k) c11).f6420j.f36186b;
                    h11.getClass();
                    AbstractC3557B.c0("desc", str5);
                    Class f12 = h11.f();
                    ArrayList arrayList5 = new ArrayList();
                    h11.g(str5, arrayList5, true);
                    obj2 = H.w(f12, arrayList5);
                    if (!(obj2 instanceof Constructor)) {
                    }
                    if (gVar2 != null) {
                    }
                    return gVar3;
                } else {
                    if (c11 instanceof C0634h) {
                        Class f13 = h11.f();
                        List<Method> list2 = ((C0634h) c11).f6414j;
                        ArrayList arrayList6 = new ArrayList(AbstractC6583a.H1(list2, 10));
                        for (Method method5 : list2) {
                            arrayList6.add(method5.getName());
                        }
                        return new C0726c(f13, arrayList6, EnumC0724a.f7695Y, EnumC0725b.f7698Y, list2);
                    }
                    obj2 = null;
                    if (!(obj2 instanceof Constructor)) {
                    }
                    if (gVar2 != null) {
                    }
                    return gVar3;
                }
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo122invoke() {
        switch (this.f6343Y) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
