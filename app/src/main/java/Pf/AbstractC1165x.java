package Pf;

import Bg.j0;
import Bg.p0;
import Gf.C0631e;
import Mf.AbstractC0992a;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.AbstractC1012v;
import Mf.AbstractC1013w;
import Mf.C1008q;
import Mf.h0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.C4294f;
import q1.AbstractC5260f;
import wf.AbstractC6216a;

/* renamed from: Pf.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1165x extends AbstractC1159q implements AbstractC1013w {

    /* renamed from: A0  reason: collision with root package name */
    public boolean f14160A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f14161B0;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f14162C0;

    /* renamed from: D0  reason: collision with root package name */
    public Collection f14163D0;

    /* renamed from: E0  reason: collision with root package name */
    public volatile AbstractC6216a f14164E0;

    /* renamed from: F0  reason: collision with root package name */
    public final AbstractC1013w f14165F0;

    /* renamed from: G0  reason: collision with root package name */
    public final int f14166G0;

    /* renamed from: H0  reason: collision with root package name */
    public AbstractC1013w f14167H0;

    /* renamed from: I0  reason: collision with root package name */
    public Map f14168I0;

    /* renamed from: j0  reason: collision with root package name */
    public List f14169j0;

    /* renamed from: k0  reason: collision with root package name */
    public List f14170k0;

    /* renamed from: l0  reason: collision with root package name */
    public Bg.A f14171l0;

    /* renamed from: m0  reason: collision with root package name */
    public List f14172m0;

    /* renamed from: n0  reason: collision with root package name */
    public AbstractC1146d f14173n0;

    /* renamed from: o0  reason: collision with root package name */
    public AbstractC1146d f14174o0;

    /* renamed from: p0  reason: collision with root package name */
    public Mf.A f14175p0;

    /* renamed from: q0  reason: collision with root package name */
    public AbstractC1007p f14176q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f14177r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f14178s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f14179t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f14180u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f14181v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f14182w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f14183x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f14184y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f14185z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1165x(int i10, AbstractC1003l abstractC1003l, AbstractC1013w abstractC1013w, Mf.V v10, Nf.i iVar, C4294f c4294f) {
        super(abstractC1003l, iVar, c4294f, v10);
        if (abstractC1003l != null) {
            if (iVar != null) {
                if (c4294f != null) {
                    if (i10 != 0) {
                        if (v10 != null) {
                            this.f14176q0 = Mf.r.f12109i;
                            this.f14177r0 = false;
                            this.f14178s0 = false;
                            this.f14179t0 = false;
                            this.f14180u0 = false;
                            this.f14181v0 = false;
                            this.f14182w0 = false;
                            this.f14183x0 = false;
                            this.f14184y0 = false;
                            this.f14185z0 = false;
                            this.f14160A0 = false;
                            this.f14161B0 = true;
                            this.f14162C0 = false;
                            this.f14163D0 = null;
                            this.f14164E0 = null;
                            this.f14167H0 = null;
                            this.f14168I0 = null;
                            this.f14165F0 = abstractC1013w == null ? this : abstractC1013w;
                            this.f14166G0 = i10;
                            return;
                        }
                        C(4);
                        throw null;
                    }
                    C(3);
                    throw null;
                }
                C(2);
                throw null;
            }
            C(1);
            throw null;
        }
        C(0);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v1, types: [Pf.b0] */
    public static ArrayList A0(AbstractC1013w abstractC1013w, List list, j0 j0Var, boolean z10, boolean z11, boolean[] zArr) {
        Bg.A a5;
        C1151i c1151i;
        h0 h0Var;
        Mf.V v10;
        a0 a0Var;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                h0 h0Var2 = (h0) it.next();
                c0 c0Var = (c0) h0Var2;
                Bg.A type = c0Var.getType();
                p0 p0Var = p0.f2147i0;
                Bg.A j6 = j0Var.j(type, p0Var);
                b0 b0Var = (b0) h0Var2;
                Bg.A a10 = b0Var.f14085o0;
                if (a10 == null) {
                    a5 = null;
                } else {
                    a5 = j0Var.j(a10, p0Var);
                }
                if (j6 == null) {
                    return null;
                }
                if ((j6 != c0Var.getType() || a10 != a5) && zArr != null) {
                    zArr[0] = true;
                }
                if (h0Var2 instanceof a0) {
                    c1151i = new C1151i(1, (List) ((a0) h0Var2).f14076q0.getValue());
                } else {
                    c1151i = null;
                }
                if (z10) {
                    h0Var = null;
                } else {
                    h0Var = h0Var2;
                }
                Nf.i annotations = ((Nf.b) h0Var2).getAnnotations();
                C4294f name = ((AbstractC1158p) h0Var2).getName();
                boolean w02 = b0Var.w0();
                if (z11) {
                    v10 = ((AbstractC1159q) h0Var2).g();
                } else {
                    v10 = Mf.V.f12075a;
                }
                AbstractC3557B.c0("annotations", annotations);
                AbstractC3557B.c0("name", name);
                AbstractC3557B.c0("source", v10);
                int i10 = b0Var.f14081k0;
                boolean z12 = b0Var.f14083m0;
                boolean z13 = b0Var.f14084n0;
                if (c1151i == null) {
                    a0Var = new b0(abstractC1013w, h0Var, i10, annotations, name, j6, w02, z12, z13, a5, v10);
                } else {
                    a0Var = new a0(abstractC1013w, h0Var, i10, annotations, name, j6, w02, z12, z13, a5, v10, c1151i);
                }
                arrayList.add(a0Var);
            }
            return arrayList;
        }
        C(30);
        throw null;
    }

    public static /* synthetic */ void C(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i11 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // Mf.AbstractC0993b
    public boolean B() {
        return this.f14162C0;
    }

    public void B0(S s10, AbstractC1146d abstractC1146d, List list, List list2, List list3, Bg.A a5, Mf.A a10, AbstractC1007p abstractC1007p) {
        b0 b0Var;
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (abstractC1007p != null) {
                        this.f14169j0 = kf.t.K2(list2);
                        this.f14170k0 = kf.t.K2(list3);
                        this.f14171l0 = a5;
                        this.f14175p0 = a10;
                        this.f14176q0 = abstractC1007p;
                        this.f14173n0 = s10;
                        this.f14174o0 = abstractC1146d;
                        this.f14172m0 = list;
                        for (int i10 = 0; i10 < list2.size(); i10++) {
                            Mf.b0 b0Var2 = (Mf.b0) list2.get(i10);
                            if (b0Var2.getIndex() != i10) {
                                throw new IllegalStateException(b0Var2 + " index is " + b0Var2.getIndex() + " but position is " + i10);
                            }
                        }
                        for (int i11 = 0; i11 < list3.size(); i11++) {
                            h0 h0Var = (h0) list3.get(i11);
                            if (((b0) h0Var).f14081k0 != i11) {
                                throw new IllegalStateException(h0Var + "index is " + b0Var.f14081k0 + " but position is " + i11);
                            }
                        }
                        return;
                    }
                    C(8);
                    throw null;
                }
                C(7);
                throw null;
            }
            C(6);
            throw null;
        }
        C(5);
        throw null;
    }

    public final C1164w C0(j0 j0Var) {
        if (j0Var != null) {
            return new C1164w(this, j0Var.g(), mo20k(), h(), getVisibility(), e(), S(), d0(), this.f14173n0, getReturnType());
        }
        C(24);
        throw null;
    }

    public final void D0(AbstractC0992a abstractC0992a, Object obj) {
        if (this.f14168I0 == null) {
            this.f14168I0 = new LinkedHashMap();
        }
        this.f14168I0.put(abstractC0992a, obj);
    }

    public void E0(boolean z10) {
        this.f14161B0 = z10;
    }

    public void F0(boolean z10) {
        this.f14162C0 = z10;
    }

    public final void G0(Bg.D d10) {
        if (d10 != null) {
            this.f14171l0 = d10;
        } else {
            C(11);
            throw null;
        }
    }

    @Override // Mf.AbstractC1016z
    public final boolean H() {
        return this.f14182w0;
    }

    public boolean L() {
        return this.f14181v0;
    }

    @Override // Mf.AbstractC0993b
    public final List S() {
        List list = this.f14170k0;
        if (list != null) {
            return list;
        }
        C(19);
        throw null;
    }

    @Override // Mf.AbstractC1013w
    public final AbstractC1013w V() {
        return this.f14167H0;
    }

    @Override // Mf.AbstractC0993b
    public final AbstractC1146d W() {
        return this.f14174o0;
    }

    @Override // Mf.AbstractC0993b
    public final AbstractC1146d Z() {
        return this.f14173n0;
    }

    @Override // Pf.AbstractC1159q, Pf.AbstractC1158p, Mf.AbstractC1003l
    /* renamed from: a */
    public AbstractC1013w mo24a() {
        AbstractC1013w abstractC1013w;
        AbstractC1013w abstractC1013w2 = this.f14165F0;
        if (abstractC1013w2 == this) {
            abstractC1013w = this;
        } else {
            abstractC1013w = abstractC1013w2.mo24a();
        }
        if (abstractC1013w != null) {
            return abstractC1013w;
        }
        C(20);
        throw null;
    }

    @Override // Mf.AbstractC1013w, Mf.X
    public AbstractC1013w c(j0 j0Var) {
        if (j0Var != null) {
            if (j0Var.f2128a.e()) {
                return this;
            }
            C1164w C02 = C0(j0Var);
            C02.f14140e = mo24a();
            C02.f14150o = true;
            C02.f14158w = true;
            return C02.f14159x.z0(C02);
        }
        C(22);
        throw null;
    }

    @Override // Mf.AbstractC0993b
    public final List d0() {
        List list = this.f14172m0;
        if (list != null) {
            return list;
        }
        C(13);
        throw null;
    }

    @Override // Mf.AbstractC0994c
    public final int e() {
        int i10 = this.f14166G0;
        if (i10 != 0) {
            return i10;
        }
        C(21);
        throw null;
    }

    @Override // Mf.AbstractC1013w
    public final boolean g0() {
        return this.f14184y0;
    }

    public Bg.A getReturnType() {
        return this.f14171l0;
    }

    @Override // Mf.AbstractC0993b
    public final List getTypeParameters() {
        List list = this.f14169j0;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // Mf.AbstractC1006o, Mf.AbstractC1016z
    public final AbstractC1007p getVisibility() {
        AbstractC1007p abstractC1007p = this.f14176q0;
        if (abstractC1007p != null) {
            return abstractC1007p;
        }
        C(16);
        throw null;
    }

    @Override // Mf.AbstractC1016z
    public final Mf.A h() {
        Mf.A a5 = this.f14175p0;
        if (a5 != null) {
            return a5;
        }
        C(15);
        throw null;
    }

    public void h0(Collection collection) {
        if (collection != null) {
            this.f14163D0 = collection;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((AbstractC1013w) it.next()).l0()) {
                    this.f14185z0 = true;
                    return;
                }
            }
            return;
        }
        C(17);
        throw null;
    }

    public boolean isExternal() {
        return this.f14179t0;
    }

    @Override // Mf.AbstractC1013w
    public final boolean isInfix() {
        if (this.f14178s0) {
            return true;
        }
        for (AbstractC1013w abstractC1013w : mo24a().m()) {
            if (abstractC1013w.isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f14180u0;
    }

    @Override // Mf.AbstractC1013w
    public final boolean isOperator() {
        if (this.f14177r0) {
            return true;
        }
        for (AbstractC1013w abstractC1013w : mo24a().m()) {
            if (abstractC1013w.isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f14160A0;
    }

    @Override // Mf.AbstractC1013w
    public final boolean l0() {
        return this.f14185z0;
    }

    public Collection m() {
        AbstractC6216a abstractC6216a = this.f14164E0;
        if (abstractC6216a != null) {
            this.f14163D0 = (Collection) abstractC6216a.mo122invoke();
            this.f14164E0 = null;
        }
        Collection collection = this.f14163D0;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        C(14);
        throw null;
    }

    public AbstractC1012v m0() {
        return C0(j0.f2127b);
    }

    @Override // Mf.AbstractC1016z
    public final boolean o0() {
        return this.f14183x0;
    }

    public Object q0(Wf.e eVar) {
        Map map = this.f14168I0;
        if (map == null) {
            return null;
        }
        return map.get(eVar);
    }

    public Object u0(C0631e c0631e, Object obj) {
        return c0631e.c(this, obj);
    }

    public final AbstractC1013w w0(AbstractC1003l abstractC1003l, Mf.A a5, C1008q c1008q) {
        AbstractC1013w f6 = m0().b(abstractC1003l).o(a5).d(c1008q).e(2).k().f();
        if (f6 != null) {
            return f6;
        }
        C(26);
        throw null;
    }

    /* renamed from: x0 */
    public T D(AbstractC1003l abstractC1003l, Mf.A a5, C1008q c1008q) {
        return (T) w0(abstractC1003l, a5, c1008q);
    }

    public abstract AbstractC1165x y0(int i10, AbstractC1003l abstractC1003l, AbstractC1013w abstractC1013w, Mf.V v10, Nf.i iVar, C4294f c4294f);

    public AbstractC1165x z0(C1164w c1164w) {
        Nf.i annotations;
        Mf.V v10;
        S s10;
        AbstractC1146d abstractC1146d;
        Bg.A j6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        AbstractC1013w abstractC1013w;
        if (c1164w != null) {
            boolean[] zArr = new boolean[1];
            if (c1164w.f14154s != null) {
                annotations = AbstractC5260f.j(getAnnotations(), c1164w.f14154s);
            } else {
                annotations = getAnnotations();
            }
            Nf.i iVar = annotations;
            AbstractC1003l abstractC1003l = c1164w.f14137b;
            AbstractC1013w abstractC1013w2 = c1164w.f14140e;
            int i10 = c1164w.f14141f;
            C4294f c4294f = c1164w.f14147l;
            if (c1164w.f14150o) {
                if (abstractC1013w2 != null) {
                    abstractC1013w = abstractC1013w2;
                } else {
                    abstractC1013w = mo24a();
                }
                v10 = ((AbstractC1159q) abstractC1013w).g();
            } else {
                v10 = Mf.V.f12075a;
            }
            Mf.V v11 = v10;
            if (v11 != null) {
                AbstractC1165x y02 = y0(i10, abstractC1003l, abstractC1013w2, v11, iVar, c4294f);
                List list = c1164w.f14153r;
                if (list == null) {
                    list = getTypeParameters();
                }
                zArr[0] = zArr[0] | (!list.isEmpty());
                ArrayList arrayList = new ArrayList(list.size());
                j0 K02 = P4.a.K0(list, c1164w.f14136a, y02, arrayList, zArr);
                if (K02 == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                if (!c1164w.f14143h.isEmpty()) {
                    int i11 = 0;
                    for (AbstractC1146d abstractC1146d2 : c1164w.f14143h) {
                        Bg.A j10 = K02.j(abstractC1146d2.getType(), p0.f2147i0);
                        if (j10 == null) {
                            return null;
                        }
                        vg.b bVar = (vg.b) ((vg.e) abstractC1146d2.p0());
                        int i12 = bVar.f47528Z;
                        int i13 = i11 + 1;
                        arrayList2.add(R4.b.b0(y02, j10, bVar.f47529h0, abstractC1146d2.getAnnotations(), i11));
                        boolean z15 = zArr[0];
                        if (j10 != abstractC1146d2.getType()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zArr[0] = z15 | z14;
                        i11 = i13;
                    }
                }
                AbstractC1146d abstractC1146d3 = c1164w.f14144i;
                if (abstractC1146d3 != null) {
                    Bg.A j11 = K02.j(abstractC1146d3.getType(), p0.f2147i0);
                    if (j11 == null) {
                        return null;
                    }
                    c1164w.f14144i.p0();
                    S s11 = new S(y02, new vg.c(y02, j11), c1164w.f14144i.getAnnotations());
                    boolean z16 = zArr[0];
                    if (j11 != c1164w.f14144i.getType()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zArr[0] = z13 | z16;
                    s10 = s11;
                } else {
                    s10 = null;
                }
                AbstractC1146d abstractC1146d4 = c1164w.f14145j;
                if (abstractC1146d4 != null) {
                    AbstractC1146d c10 = abstractC1146d4.c(K02);
                    if (c10 == null) {
                        return null;
                    }
                    boolean z17 = zArr[0];
                    if (c10 != c1164w.f14145j) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zArr[0] = z17 | z12;
                    abstractC1146d = c10;
                } else {
                    abstractC1146d = null;
                }
                ArrayList A02 = A0(y02, c1164w.f14142g, K02, c1164w.f14151p, c1164w.f14150o, zArr);
                if (A02 == null || (j6 = K02.j(c1164w.f14146k, p0.f2148j0)) == null) {
                    return null;
                }
                boolean z18 = zArr[0];
                if (j6 != c1164w.f14146k) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z19 = z18 | z10;
                zArr[0] = z19;
                if (!z19 && c1164w.f14158w) {
                    return this;
                }
                y02.B0(s10, abstractC1146d, arrayList2, arrayList, A02, j6, c1164w.f14138c, c1164w.f14139d);
                y02.f14177r0 = this.f14177r0;
                y02.f14178s0 = this.f14178s0;
                y02.f14179t0 = this.f14179t0;
                y02.f14180u0 = this.f14180u0;
                y02.f14181v0 = this.f14181v0;
                y02.f14160A0 = this.f14160A0;
                y02.f14182w0 = this.f14182w0;
                y02.f14183x0 = this.f14183x0;
                y02.E0(this.f14161B0);
                y02.f14184y0 = c1164w.f14152q;
                y02.f14185z0 = c1164w.f14155t;
                Boolean bool = c1164w.f14157v;
                if (bool != null) {
                    z11 = bool.booleanValue();
                } else {
                    z11 = this.f14162C0;
                }
                y02.F0(z11);
                if (!c1164w.f14156u.isEmpty() || this.f14168I0 != null) {
                    LinkedHashMap linkedHashMap = c1164w.f14156u;
                    Map map = this.f14168I0;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            if (!linkedHashMap.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    if (linkedHashMap.size() == 1) {
                        y02.f14168I0 = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                    } else {
                        y02.f14168I0 = linkedHashMap;
                    }
                }
                if (c1164w.f14149n || this.f14167H0 != null) {
                    AbstractC1013w abstractC1013w3 = this.f14167H0;
                    if (abstractC1013w3 == null) {
                        abstractC1013w3 = this;
                    }
                    y02.f14167H0 = abstractC1013w3.c(K02);
                }
                if (c1164w.f14148m && !mo24a().m().isEmpty()) {
                    if (c1164w.f14136a.e()) {
                        AbstractC6216a abstractC6216a = this.f14164E0;
                        if (abstractC6216a != null) {
                            y02.f14164E0 = abstractC6216a;
                        } else {
                            y02.h0(m());
                        }
                    } else {
                        y02.f14164E0 = new Jf.j(this, 3, K02);
                    }
                }
                return y02;
            }
            C(27);
            throw null;
        }
        C(25);
        throw null;
    }
}
