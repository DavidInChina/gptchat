package Gf;

import G0.C0588q;
import Mf.AbstractC0994c;
import Mf.AbstractC1000i;
import N.C1040y;
import Pf.AbstractC1146d;
import id.AbstractC3557B;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.C4291c;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import ng.AbstractC4842i;
import wf.AbstractC6216a;
import yf.AbstractC6583a;

/* renamed from: Gf.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0643q extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6454Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC0644s f6455Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0643q(AbstractC0644s abstractC0644s, int i10) {
        super(0);
        this.f6454Y = i10;
        this.f6455Z = abstractC0644s;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10;
        int i11;
        Type[] lowerBounds;
        int i12 = this.f6454Y;
        Type type = null;
        int i13 = 0;
        r2 = false;
        boolean z10 = false;
        AbstractC0644s abstractC0644s = this.f6455Z;
        switch (i12) {
            case 0:
                List<Df.o> parameters = abstractC0644s.getParameters();
                int size = (abstractC0644s.isSuspend() ? 1 : 0) + parameters.size();
                if (((Boolean) abstractC0644s.f6469k0.getValue()).booleanValue()) {
                    i10 = 0;
                    for (Df.o oVar : parameters) {
                        i10 += ((Z) oVar).f6380h0 == Df.n.f3645h0 ? abstractC0644s.t(oVar) : 0;
                    }
                } else if (parameters.isEmpty()) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    for (Df.o oVar2 : parameters) {
                        if (((Z) oVar2).f6380h0 == Df.n.f3645h0 && (i10 = i10 + 1) < 0) {
                            AbstractC4344b.c1();
                            throw null;
                        }
                    }
                }
                int i14 = (i10 + 31) / 32;
                Object[] objArr = new Object[size + i14 + 1];
                for (Df.o oVar3 : parameters) {
                    Z z11 = (Z) oVar3;
                    boolean j6 = z11.j();
                    int i15 = z11.f6379Z;
                    if (j6) {
                        r0 h10 = z11.h();
                        C4291c c4291c = A0.f6330a;
                        Bg.A a5 = h10.f6460Y;
                        if (a5 != null) {
                            int i16 = AbstractC4842i.f40348a;
                            AbstractC1000i k10 = a5.y0().k();
                            if (k10 != null && AbstractC4842i.b(k10)) {
                            }
                        }
                        r0 h11 = z11.h();
                        v0 v0Var = h11.f6461Z;
                        Type type2 = v0Var != null ? (Type) v0Var.mo122invoke() : null;
                        if (type2 == null) {
                            type2 = Df.H.O(h11);
                        }
                        objArr[i15] = A0.e(type2);
                    }
                    if (z11.k()) {
                        objArr[i15] = AbstractC0644s.f(z11.h());
                    }
                }
                for (int i17 = 0; i17 < i14; i17++) {
                    objArr[size + i17] = 0;
                }
                return objArr;
            case 1:
                return mo122invoke();
            case 2:
                AbstractC0994c s10 = abstractC0644s.s();
                ArrayList arrayList = new ArrayList();
                if (!abstractC0644s.v()) {
                    AbstractC1146d g10 = A0.g(s10);
                    if (g10 != null) {
                        arrayList.add(new Z(abstractC0644s, 0, Df.n.f3643Y, new r(g10, 0)));
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    AbstractC1146d Z10 = s10.Z();
                    if (Z10 != null) {
                        arrayList.add(new Z(abstractC0644s, i11, Df.n.f3644Z, new r(Z10, 1)));
                        i11++;
                    }
                } else {
                    i11 = 0;
                }
                int size2 = s10.S().size();
                while (i13 < size2) {
                    arrayList.add(new Z(abstractC0644s, i11, Df.n.f3645h0, new C1040y(s10, i13, 6)));
                    i13++;
                    i11++;
                }
                if (abstractC0644s.u() && (s10 instanceof Wf.a) && arrayList.size() > 1) {
                    kf.r.K1(arrayList, new C0588q(22));
                }
                arrayList.trimToSize();
                return arrayList;
            case 3:
                if (abstractC0644s.isSuspend()) {
                    Object p22 = kf.t.p2(abstractC0644s.g().a());
                    ParameterizedType parameterizedType = p22 instanceof ParameterizedType ? (ParameterizedType) p22 : null;
                    if (AbstractC3557B.K(parameterizedType != null ? parameterizedType.getRawType() : null, AbstractC4825e.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        AbstractC3557B.b0("getActualTypeArguments(...)", actualTypeArguments);
                        Object v32 = kf.q.v3(actualTypeArguments);
                        WildcardType wildcardType = v32 instanceof WildcardType ? (WildcardType) v32 : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) kf.q.i3(lowerBounds);
                        }
                    }
                }
                return type == null ? abstractC0644s.g().getReturnType() : type;
            case 4:
                Bg.A returnType = abstractC0644s.s().getReturnType();
                AbstractC3557B.Z(returnType);
                return new r0(returnType, new C0643q(abstractC0644s, 3));
            case 5:
                return mo122invoke();
            default:
                List parameters2 = abstractC0644s.getParameters();
                if (!parameters2.isEmpty()) {
                    Iterator it = parameters2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (A0.h(((Z) ((Df.o) it.next())).h())) {
                                z10 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z10);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final List mo122invoke() {
        int i10 = this.f6454Y;
        AbstractC0644s abstractC0644s = this.f6455Z;
        switch (i10) {
            case 1:
                return A0.d(abstractC0644s.s());
            default:
                List<Mf.b0> typeParameters = abstractC0644s.s().getTypeParameters();
                AbstractC3557B.b0("getTypeParameters(...)", typeParameters);
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(typeParameters, 10));
                for (Mf.b0 b0Var : typeParameters) {
                    AbstractC3557B.Z(b0Var);
                    arrayList.add(new s0(abstractC0644s, b0Var));
                }
                return arrayList;
        }
    }
}
