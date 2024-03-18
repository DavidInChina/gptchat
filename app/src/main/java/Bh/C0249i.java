package Bh;

import Eh.C0524x;
import Eh.C0525y;
import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import java.lang.annotation.ElementType;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sh.AbstractC5634f;
import sh.AbstractC5641m;
import th.AbstractC5793a;
import th.AbstractC5802j;
import th.AbstractC5806n;
import th.C5805m;
import wh.AbstractC6236a;
import wh.AbstractC6242g;
import wh.AbstractC6256u;
import wh.AbstractC6258w;
import wh.C6247l;
import wh.C6254s;
import yh.AbstractC6597c;
import yh.AbstractC6621k0;
import yh.AbstractC6624m;
import yh.AbstractC6632q;
import yh.C6594b;
import yh.C6619j0;
import yh.C6622l;
import yh.EnumC6617i1;
import yh.G1;
import yh.H1;
import yh.j1;
import yh.l1;
import yh.q1;
import yh.v1;
import yh.w1;
import yh.x1;

/* renamed from: Bh.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0249i extends yh.r implements AbstractC0263p {

    /* renamed from: E0  reason: collision with root package name */
    public static final HashSet f2332E0 = new HashSet(Arrays.asList("abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"));

    /* renamed from: A0  reason: collision with root package name */
    public final boolean f2333A0;

    /* renamed from: B0  reason: collision with root package name */
    public final boolean f2334B0;

    /* renamed from: C0  reason: collision with root package name */
    public final l1 f2335C0;

    /* renamed from: D0  reason: collision with root package name */
    public final List f2336D0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f2337i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f2338j0;

    /* renamed from: k0  reason: collision with root package name */
    public final l1.a f2339k0;

    /* renamed from: l0  reason: collision with root package name */
    public final List f2340l0;

    /* renamed from: m0  reason: collision with root package name */
    public final List f2341m0;

    /* renamed from: n0  reason: collision with root package name */
    public final List f2342n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Map f2343o0;

    /* renamed from: p0  reason: collision with root package name */
    public final List f2344p0;

    /* renamed from: q0  reason: collision with root package name */
    public final List f2345q0;

    /* renamed from: r0  reason: collision with root package name */
    public final List f2346r0;

    /* renamed from: s0  reason: collision with root package name */
    public final AbstractC0252j0 f2347s0;

    /* renamed from: t0  reason: collision with root package name */
    public final Eh.A f2348t0;

    /* renamed from: u0  reason: collision with root package name */
    public final l1 f2349u0;

    /* renamed from: v0  reason: collision with root package name */
    public final AbstractC6242g f2350v0;

    /* renamed from: w0  reason: collision with root package name */
    public final l1 f2351w0;

    /* renamed from: x0  reason: collision with root package name */
    public final List f2352x0;

    /* renamed from: y0  reason: collision with root package name */
    public final List f2353y0;

    /* renamed from: z0  reason: collision with root package name */
    public final boolean f2354z0;

    public C0249i(String str, int i10, l1.a aVar, List list, List list2, List list3, Map map, List list4, List list5, List list6, AbstractC0252j0 abstractC0252j0, Eh.A a5, l1 l1Var, AbstractC6242g abstractC6242g, l1 l1Var2, List list7, List list8, boolean z10, boolean z11, boolean z12, l1 l1Var3, List list9) {
        this.f2337i0 = str;
        this.f2338j0 = i10;
        this.f2340l0 = list;
        this.f2339k0 = aVar;
        this.f2341m0 = list2;
        this.f2342n0 = list3;
        this.f2343o0 = map;
        this.f2344p0 = list4;
        this.f2345q0 = list5;
        this.f2346r0 = list6;
        this.f2347s0 = abstractC0252j0;
        this.f2348t0 = a5;
        this.f2349u0 = l1Var;
        this.f2350v0 = abstractC6242g;
        this.f2351w0 = l1Var2;
        this.f2352x0 = list7;
        this.f2353y0 = list8;
        this.f2354z0 = z10;
        this.f2333A0 = z11;
        this.f2334B0 = z12;
        this.f2335C0 = l1Var3;
        this.f2336D0 = list9;
    }

    public static boolean l1(String str) {
        if (f2332E0.contains(str) || str.length() == 0 || !Character.isJavaIdentifierStart(str.charAt(0))) {
            return false;
        }
        if (str.equals("package-info")) {
            return true;
        }
        for (int i10 = 1; i10 < str.length(); i10++) {
            if (!Character.isJavaIdentifierPart(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean m1(String[] strArr) {
        if (strArr.length == 0) {
            return false;
        }
        for (String str : strArr) {
            if (!l1(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // yh.l1
    public final AbstractC6624m A() {
        return new C6622l(this, this.f2345q0);
    }

    @Override // yh.l1
    public final H1 F() {
        return new q1(0, this.f2352x0);
    }

    @Override // yh.l1
    public final boolean K() {
        return this.f2354z0;
    }

    @Override // yh.AbstractC6632q
    public final l1.a L() {
        l1.a aVar = this.f2339k0;
        if (aVar == null) {
            l1.a aVar2 = l1.a.f51045N;
            return null;
        }
        return new C6619j0(aVar, new yh.X0((l1) this, (AbstractC5641m) this), aVar);
    }

    @Override // Bh.AbstractC0265q
    public final AbstractC0265q P0(vh.f fVar, Object obj) {
        HashMap hashMap = new HashMap(this.f2343o0);
        String str = fVar.f47544a;
        Object put = hashMap.put(str, obj);
        if (put != null) {
            if (put == obj) {
                return this;
            }
            throw new IllegalStateException("Field " + str + " for " + this + " already mapped to " + put + " and not " + obj);
        }
        return new C0249i(this.f2337i0, this.f2338j0, this.f2339k0, this.f2340l0, this.f2341m0, A7.b.m1(this.f2342n0, new vh.f(str, fVar.f47545b, (l1.a) fVar.f47546c.k(new yh.Y0(AbstractC1235m.a(this))), fVar.f47547d)), hashMap, this.f2344p0, this.f2345q0, this.f2346r0, this.f2347s0, new C0524x(this.f2348t0, new C0525y(str, obj)), this.f2349u0, this.f2350v0, this.f2351w0, this.f2352x0, this.f2353y0, this.f2354z0, this.f2333A0, this.f2334B0, this.f2335C0, this.f2336D0);
    }

    @Override // Bh.AbstractC0263p
    public final AbstractC0263p Q0(l1 l1Var) {
        l1 l1Var2 = l1Var;
        if (l1Var2.equals(this)) {
            l1Var2 = zh.H.f52110a;
        }
        l1 l1Var3 = l1Var2;
        List emptyList = Collections.emptyList();
        return new C0249i(this.f2337i0, this.f2338j0, this.f2339k0, this.f2340l0, this.f2341m0, this.f2342n0, this.f2343o0, this.f2344p0, this.f2345q0, this.f2346r0, this.f2347s0, this.f2348t0, this.f2349u0, this.f2350v0, this.f2351w0, this.f2352x0, this.f2353y0, this.f2354z0, this.f2333A0, this.f2334B0, l1Var3, emptyList);
    }

    @Override // yh.l1
    public final vh.l U0() {
        return new vh.k(this, this.f2342n0);
    }

    @Override // yh.l1
    public final l1 W() {
        return this.f2351w0;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x04ca  */
    @Override // Bh.AbstractC0265q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l1 X0() {
        HashSet hashSet;
        AbstractC6632q abstractC6632q;
        ElementType elementType;
        AbstractC5793a abstractC5793a;
        l1.a aVar;
        String str = this.f2337i0;
        if (m1(str.split("\\."))) {
            int i10 = this.f2338j0;
            String str2 = "Illegal modifiers ";
            if (((-161312) & i10) == 0) {
                if (k1() && i10 != 5632) {
                    throw new IllegalStateException(str2 + i10 + " for package " + this);
                }
                l1.a L10 = L();
                EnumC6617i1 enumC6617i1 = EnumC6617i1.f51014Y;
                if (L10 != null) {
                    AbstractC6621k0 abstractC6621k0 = (AbstractC6621k0) L10;
                    if (((Boolean) abstractC6621k0.k(j1.SUPER_CLASS)).booleanValue()) {
                        if (((Boolean) abstractC6621k0.k(enumC6617i1)).booleanValue()) {
                            if (!((C6619j0) L10).f51016Z.l0().m0(this)) {
                                throw new IllegalStateException("Invisible super type " + L10 + " for " + this);
                            }
                        } else {
                            throw new IllegalStateException("Illegal type annotations on super class " + L10 + " for " + this);
                        }
                    } else {
                        throw new IllegalStateException("Illegal super class " + L10 + " for " + this);
                    }
                }
                HashSet hashSet2 = new HashSet();
                Iterator it = ((AbstractList) o0()).iterator();
                while (it.hasNext()) {
                    l1.a aVar2 = (l1.a) it.next();
                    if (((Boolean) aVar2.k(j1.INTERFACE)).booleanValue()) {
                        if (((Boolean) aVar2.k(enumC6617i1)).booleanValue()) {
                            if (hashSet2.add(aVar2.l0())) {
                                if (!aVar2.l0().m0(this)) {
                                    throw new IllegalStateException("Invisible interface type " + aVar2 + " for " + this);
                                }
                            } else {
                                throw new IllegalStateException("Already implemented interface " + aVar2 + " for " + this);
                            }
                        } else {
                            throw new IllegalStateException("Illegal type annotations on interface " + aVar2 + " for " + this);
                        }
                    } else {
                        throw new IllegalStateException("Illegal interface " + aVar2 + " for " + this);
                    }
                }
                G1 r02 = r0();
                if (!((AbstractCollection) r02).isEmpty() && h0(Throwable.class)) {
                    throw new IllegalStateException("Cannot define throwable " + this + " to be generic");
                }
                HashSet hashSet3 = new HashSet();
                Iterator it2 = ((AbstractList) r02).iterator();
                loop1: while (true) {
                    boolean hasNext = it2.hasNext();
                    j1 j1Var = j1.TYPE_VARIABLE;
                    String str3 = " does not define at least one bound";
                    String str4 = "Illegal type annotation on '";
                    String str5 = str2;
                    String str6 = "' for ";
                    if (hasNext) {
                        aVar = (l1.a) it2.next();
                        Iterator it3 = it2;
                        String A02 = aVar.A0();
                        if (hashSet3.add(A02)) {
                            if (l1(A02)) {
                                if (EnumC6617i1.g(aVar)) {
                                    HashSet hashSet4 = new HashSet();
                                    boolean z10 = false;
                                    for (l1.a aVar3 : aVar.getUpperBounds()) {
                                        if (((Boolean) aVar3.k(j1Var)).booleanValue()) {
                                            if (((Boolean) aVar3.k(enumC6617i1)).booleanValue()) {
                                                if (hashSet4.add(aVar3)) {
                                                    if (!z10 || (!aVar3.c().c() && aVar3.E0())) {
                                                        z10 = true;
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Duplicate bound " + aVar3 + " of " + aVar + " for " + this);
                                                }
                                            } else {
                                                throw new IllegalStateException("Illegal type annotations on type variable " + aVar3 + " for " + this);
                                            }
                                        } else {
                                            throw new IllegalStateException("Illegal type variable bound " + aVar3 + " of " + aVar + " for " + this);
                                        }
                                    }
                                    if (z10) {
                                        str2 = str5;
                                        it2 = it3;
                                    } else {
                                        throw new IllegalStateException("Type variable " + aVar + " for " + this + str3);
                                    }
                                } else {
                                    throw new IllegalStateException(str4 + aVar + str6 + this);
                                }
                            } else {
                                throw new IllegalStateException("Illegal type variable name '" + aVar + str6 + this);
                            }
                        } else {
                            throw new IllegalStateException("Duplicate type variable symbol '" + aVar + str6 + this);
                        }
                    } else {
                        AbstractC6632q abstractC6632q2 = this.f2351w0;
                        if (abstractC6632q2 != null && (abstractC6632q2.T0() || abstractC6632q2.a1())) {
                            throw new IllegalStateException("Cannot define array type or primitive type " + abstractC6632q2 + " + as enclosing type for " + this);
                        }
                        AbstractC6242g abstractC6242g = this.f2350v0;
                        if (abstractC6242g == null || !abstractC6242g.U()) {
                            String str7 = "Illegal type variable name '";
                            l1 l1Var = this.f2349u0;
                            if (l1Var != null) {
                                if (l1Var.a1() || l1Var.T0()) {
                                    throw new IllegalStateException("Cannot define array type or primitive type " + l1Var + " as declaring type for " + this);
                                }
                            } else if (abstractC6632q2 == null && abstractC6242g == null && (this.f2333A0 || this.f2354z0)) {
                                throw new IllegalStateException("Cannot define an anonymous or local class without a declaring type for " + this);
                            }
                            HashSet hashSet5 = new HashSet();
                            Iterator it4 = ((AbstractList) F()).iterator();
                            while (it4.hasNext()) {
                                Iterator it5 = it4;
                                l1 l1Var2 = (l1) it4.next();
                                if (!l1Var2.T0() && !l1Var2.a1()) {
                                    if (hashSet5.add(l1Var2)) {
                                        it4 = it5;
                                    } else {
                                        throw new IllegalStateException("Duplicate definition of declared type " + l1Var2);
                                    }
                                } else {
                                    throw new IllegalStateException("Cannot define array type or primitive type " + l1Var2 + " + as declared type for " + this);
                                }
                            }
                            l1 v10 = v();
                            if (v10.equals(this)) {
                                HashSet hashSet6 = new HashSet();
                                Iterator it6 = d0().iterator();
                                while (it6.hasNext()) {
                                    Iterator it7 = it6;
                                    l1 l1Var3 = (l1) it6.next();
                                    if (!l1Var3.T0() && !l1Var3.a1()) {
                                        if (l1Var3.j0(this)) {
                                            if (hashSet6.add(l1Var3)) {
                                                it6 = it7;
                                            } else {
                                                throw new IllegalStateException("Duplicate definition of nest member " + l1Var3);
                                            }
                                        } else {
                                            throw new IllegalStateException("Cannot define nest member " + l1Var3 + " + within different package then " + this);
                                        }
                                    } else {
                                        throw new IllegalStateException("Cannot define array type or primitive type " + l1Var3 + " + as nest member of " + this);
                                    }
                                }
                            } else if (!v10.T0() && !v10.a1()) {
                                if (!v10.j0(this)) {
                                    throw new IllegalStateException("Cannot define nest host " + v10 + " + within different package then " + this);
                                }
                            } else {
                                throw new IllegalStateException("Cannot define array type or primitive type " + v10 + " + as nest host for " + this);
                            }
                            for (l1 l1Var4 : b1()) {
                                if (!l1Var4.K0(this) || l1Var4.equals(this)) {
                                    throw new IllegalStateException("Cannot assign permitted subclass " + l1Var4 + " to " + this);
                                }
                                while (r1.hasNext()) {
                                }
                            }
                            HashSet hashSet7 = new HashSet();
                            Iterator it8 = ((AbstractList) getDeclaredAnnotations()).iterator();
                            while (true) {
                                String str8 = str6;
                                String str9 = str4;
                                if (it8.hasNext()) {
                                    Iterator it9 = it8;
                                    abstractC5793a = (AbstractC5793a) ((AbstractC5802j) it8.next());
                                    if (abstractC5793a.g(ElementType.TYPE) || ((h1(8192) && abstractC5793a.g(ElementType.ANNOTATION_TYPE)) || (k1() && abstractC5793a.g(ElementType.PACKAGE)))) {
                                        if (hashSet7.add(abstractC5793a.d())) {
                                            str6 = str8;
                                            str4 = str9;
                                            it8 = it9;
                                        } else {
                                            throw new IllegalStateException("Duplicate annotation " + abstractC5793a + " for " + this);
                                        }
                                    }
                                } else {
                                    HashSet hashSet8 = new HashSet();
                                    Iterator it10 = ((AbstractList) U0()).iterator();
                                    while (true) {
                                        String str10 = str3;
                                        String str11 = "Illegal type annotations on ";
                                        if (it10.hasNext()) {
                                            vh.c cVar = (vh.c) it10.next();
                                            String name = cVar.getName();
                                            Iterator it11 = it10;
                                            if (hashSet8.add(cVar.i1())) {
                                                if (l1(name)) {
                                                    if ((cVar.u0() & (-151776)) == 0) {
                                                        l1.a type = cVar.getType();
                                                        HashSet hashSet9 = hashSet8;
                                                        if (((Boolean) type.k(j1.FIELD)).booleanValue()) {
                                                            if (((Boolean) type.k(enumC6617i1)).booleanValue()) {
                                                                if (!cVar.M() && !type.l0().m0(this)) {
                                                                    throw new IllegalStateException("Invisible field type " + cVar.getType() + " for " + cVar);
                                                                }
                                                                HashSet hashSet10 = new HashSet();
                                                                Iterator it12 = cVar.getDeclaredAnnotations().iterator();
                                                                while (it12.hasNext()) {
                                                                    Iterator it13 = it12;
                                                                    AbstractC5793a abstractC5793a2 = (AbstractC5793a) ((AbstractC5802j) it12.next());
                                                                    if (abstractC5793a2.g(ElementType.FIELD)) {
                                                                        if (hashSet10.add(abstractC5793a2.d())) {
                                                                            it12 = it13;
                                                                        } else {
                                                                            throw new IllegalStateException("Duplicate annotation " + abstractC5793a2 + " for " + cVar);
                                                                        }
                                                                    } else {
                                                                        throw new IllegalStateException("Cannot add " + abstractC5793a2 + " on " + cVar);
                                                                    }
                                                                }
                                                                str3 = str10;
                                                                hashSet8 = hashSet9;
                                                                it10 = it11;
                                                            } else {
                                                                throw new IllegalStateException(str11 + type + " for " + this);
                                                            }
                                                        } else {
                                                            throw new IllegalStateException("Illegal field type " + type + " for " + cVar);
                                                        }
                                                    } else {
                                                        throw new IllegalStateException("Illegal field modifiers " + cVar.u0() + " for " + cVar);
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Illegal field name for " + cVar);
                                                }
                                            } else {
                                                throw new IllegalStateException("Duplicate field definition for " + cVar);
                                            }
                                        } else {
                                            HashSet hashSet11 = new HashSet();
                                            Iterator it14 = ((AbstractList) i()).iterator();
                                            while (it14.hasNext()) {
                                                AbstractC6242g abstractC6242g2 = (AbstractC6242g) it14.next();
                                                Iterator it15 = it14;
                                                if (hashSet11.add(((AbstractC6236a) abstractC6242g2).j1())) {
                                                    if ((abstractC6242g2.u0() & (-7680)) == 0) {
                                                        if (h1(512)) {
                                                            AbstractC5634f abstractC5634f = (AbstractC5634f) abstractC6242g2;
                                                            hashSet = hashSet11;
                                                            if (!abstractC5634f.h1(1) && !abstractC5634f.h1(2)) {
                                                                throw new IllegalStateException("Methods declared by an interface must be public or private " + abstractC6242g2);
                                                            }
                                                        } else {
                                                            hashSet = hashSet11;
                                                        }
                                                        HashSet hashSet12 = new HashSet();
                                                        Iterator it16 = abstractC6242g2.r0().iterator();
                                                        while (it16.hasNext()) {
                                                            Iterator it17 = it16;
                                                            l1.a aVar4 = (l1.a) it16.next();
                                                            String str12 = str11;
                                                            String A03 = aVar4.A0();
                                                            if (hashSet12.add(A03)) {
                                                                if (l1(A03)) {
                                                                    if (EnumC6617i1.g(aVar4)) {
                                                                        HashSet hashSet13 = new HashSet();
                                                                        boolean z11 = false;
                                                                        for (l1.a aVar5 : aVar4.getUpperBounds()) {
                                                                            HashSet hashSet14 = hashSet12;
                                                                            if (((Boolean) aVar5.k(j1Var)).booleanValue()) {
                                                                                if (((Boolean) aVar5.k(enumC6617i1)).booleanValue()) {
                                                                                    if (hashSet13.add(aVar5)) {
                                                                                        if (z11 && (aVar5.c().c() || !aVar5.E0())) {
                                                                                            throw new IllegalStateException("Illegal interface bound " + aVar5 + " of " + aVar4 + " for " + abstractC6242g2);
                                                                                        }
                                                                                        hashSet12 = hashSet14;
                                                                                        z11 = true;
                                                                                    } else {
                                                                                        throw new IllegalStateException("Duplicate bound " + aVar5 + " of " + aVar4 + " for " + abstractC6242g2);
                                                                                    }
                                                                                } else {
                                                                                    throw new IllegalStateException("Illegal type annotations on bound " + aVar5 + " of " + aVar4 + " for " + this);
                                                                                }
                                                                            } else {
                                                                                throw new IllegalStateException("Illegal type variable bound " + aVar5 + " of " + aVar4 + " for " + abstractC6242g2);
                                                                            }
                                                                        }
                                                                        HashSet hashSet15 = hashSet12;
                                                                        if (z11) {
                                                                            str11 = str12;
                                                                            it16 = it17;
                                                                            hashSet12 = hashSet15;
                                                                        } else {
                                                                            throw new IllegalStateException("Type variable " + aVar4 + " for " + abstractC6242g2 + str10);
                                                                        }
                                                                    } else {
                                                                        throw new IllegalStateException(str9 + aVar4 + str8 + abstractC6242g2);
                                                                    }
                                                                } else {
                                                                    throw new IllegalStateException(str7 + aVar4 + str8 + abstractC6242g2);
                                                                }
                                                            } else {
                                                                throw new IllegalStateException("Duplicate type variable symbol '" + aVar4 + str8 + abstractC6242g2);
                                                            }
                                                        }
                                                        String str13 = str11;
                                                        String str14 = str9;
                                                        String str15 = str10;
                                                        String str16 = str8;
                                                        String str17 = str7;
                                                        l1.a returnType = abstractC6242g2.getReturnType();
                                                        if (!abstractC6242g2.U()) {
                                                            if (abstractC6242g2.W0()) {
                                                                str10 = str15;
                                                                if (returnType.H(Void.TYPE)) {
                                                                    if (!returnType.getDeclaredAnnotations().isEmpty()) {
                                                                        throw new IllegalStateException("The void non-type must not be annotated for " + abstractC6242g2);
                                                                    }
                                                                } else {
                                                                    throw new IllegalStateException("A constructor must return void " + abstractC6242g2);
                                                                }
                                                            } else {
                                                                str10 = str15;
                                                                if (l1(abstractC6242g2.D0())) {
                                                                    if (((Boolean) returnType.k(j1.METHOD_RETURN)).booleanValue()) {
                                                                        if (((Boolean) returnType.k(enumC6617i1)).booleanValue()) {
                                                                            if (!abstractC6242g2.M() && !abstractC6242g2.getReturnType().l0().m0(this)) {
                                                                                throw new IllegalStateException("Invisible return type " + abstractC6242g2.getReturnType() + " for " + abstractC6242g2);
                                                                            }
                                                                        } else {
                                                                            throw new IllegalStateException("Illegal type annotations on return type " + returnType + " for " + abstractC6242g2);
                                                                        }
                                                                    } else {
                                                                        throw new IllegalStateException("Illegal return type " + returnType + " for " + abstractC6242g2);
                                                                    }
                                                                } else {
                                                                    throw new IllegalStateException("Illegal method name " + returnType + " for " + abstractC6242g2);
                                                                }
                                                            }
                                                            HashSet hashSet16 = new HashSet();
                                                            Iterator it18 = abstractC6242g2.getParameters().iterator();
                                                            while (it18.hasNext()) {
                                                                Iterator it19 = it18;
                                                                AbstractC6258w abstractC6258w = (AbstractC6258w) it18.next();
                                                                j1 j1Var2 = j1Var;
                                                                l1.a type2 = abstractC6258w.getType();
                                                                String str18 = str14;
                                                                if (((Boolean) type2.k(j1.METHOD_PARAMETER)).booleanValue()) {
                                                                    if (((Boolean) type2.k(enumC6617i1)).booleanValue()) {
                                                                        if (!abstractC6242g2.M() && !type2.l0().m0(this)) {
                                                                            throw new IllegalStateException("Invisible parameter type of " + abstractC6258w + " for " + abstractC6242g2);
                                                                        }
                                                                        if (abstractC6258w.v0()) {
                                                                            String name2 = abstractC6258w.getName();
                                                                            if (hashSet16.add(name2)) {
                                                                                if (!l1(name2)) {
                                                                                    throw new IllegalStateException("Illegal parameter name of " + abstractC6258w + " for " + abstractC6242g2);
                                                                                }
                                                                            } else {
                                                                                throw new IllegalStateException("Duplicate parameter name of " + abstractC6258w + " for " + abstractC6242g2);
                                                                            }
                                                                        }
                                                                        if (abstractC6258w.L0() && (abstractC6258w.u0() & (-36881)) != 0) {
                                                                            throw new IllegalStateException("Illegal modifiers of " + abstractC6258w + " for " + abstractC6242g2);
                                                                        }
                                                                        HashSet hashSet17 = new HashSet();
                                                                        Iterator it20 = abstractC6258w.getDeclaredAnnotations().iterator();
                                                                        while (it20.hasNext()) {
                                                                            HashSet hashSet18 = hashSet16;
                                                                            Iterator it21 = it20;
                                                                            AbstractC5793a abstractC5793a3 = (AbstractC5793a) ((AbstractC5802j) it20.next());
                                                                            if (abstractC5793a3.g(ElementType.PARAMETER)) {
                                                                                if (hashSet17.add(abstractC5793a3.d())) {
                                                                                    hashSet16 = hashSet18;
                                                                                    it20 = it21;
                                                                                } else {
                                                                                    throw new IllegalStateException("Duplicate annotation " + abstractC5793a3 + " of " + abstractC6258w + " for " + abstractC6242g2);
                                                                                }
                                                                            } else {
                                                                                throw new IllegalStateException("Cannot add " + abstractC5793a3 + " on " + abstractC6258w);
                                                                            }
                                                                        }
                                                                        j1Var = j1Var2;
                                                                        it18 = it19;
                                                                        str14 = str18;
                                                                    } else {
                                                                        throw new IllegalStateException("Illegal type annotations on parameter " + abstractC6258w + " for " + abstractC6242g2);
                                                                    }
                                                                } else {
                                                                    throw new IllegalStateException("Illegal parameter type of " + abstractC6258w + " for " + abstractC6242g2);
                                                                }
                                                            }
                                                            j1 j1Var3 = j1Var;
                                                            String str19 = str14;
                                                            for (l1.a aVar6 : abstractC6242g2.V()) {
                                                                if (((Boolean) aVar6.k(j1.EXCEPTION)).booleanValue()) {
                                                                    if (((Boolean) aVar6.k(enumC6617i1)).booleanValue()) {
                                                                        if (!abstractC6242g2.M() && !aVar6.l0().m0(this)) {
                                                                            throw new IllegalStateException("Invisible exception type " + aVar6 + " for " + abstractC6242g2);
                                                                        }
                                                                    } else {
                                                                        throw new IllegalStateException(str13 + aVar6 + " for " + abstractC6242g2);
                                                                    }
                                                                } else {
                                                                    throw new IllegalStateException("Illegal exception type " + aVar6 + " for " + abstractC6242g2);
                                                                }
                                                            }
                                                            HashSet hashSet19 = new HashSet();
                                                            for (AbstractC5802j abstractC5802j : abstractC6242g2.getDeclaredAnnotations()) {
                                                                if (((AbstractC6236a) abstractC6242g2).F0()) {
                                                                    elementType = ElementType.METHOD;
                                                                } else {
                                                                    elementType = ElementType.CONSTRUCTOR;
                                                                }
                                                                EnumC6617i1 enumC6617i12 = enumC6617i1;
                                                                AbstractC5793a abstractC5793a4 = (AbstractC5793a) abstractC5802j;
                                                                if (abstractC5793a4.g(elementType)) {
                                                                    if (hashSet19.add(abstractC5793a4.d())) {
                                                                        enumC6617i1 = enumC6617i12;
                                                                    } else {
                                                                        throw new IllegalStateException("Duplicate annotation " + abstractC5793a4 + " for " + abstractC6242g2);
                                                                    }
                                                                } else {
                                                                    throw new IllegalStateException("Cannot add " + abstractC5793a4 + " on " + abstractC6242g2);
                                                                }
                                                            }
                                                            EnumC6617i1 enumC6617i13 = enumC6617i1;
                                                            th.h0 f6 = abstractC6242g2.f();
                                                            if (f6 != null && !((AbstractC6236a) abstractC6242g2).n1(f6)) {
                                                                throw new IllegalStateException("Illegal default value " + f6 + "for " + abstractC6242g2);
                                                            }
                                                            l1.a T = abstractC6242g2.T();
                                                            if (T != null && !((Boolean) T.k(j1.RECEIVER)).booleanValue()) {
                                                                throw new IllegalStateException("Illegal receiver type " + T + " for " + abstractC6242g2);
                                                            }
                                                            if (((AbstractC5634f) abstractC6242g2).h1(8)) {
                                                                if (T != null) {
                                                                    throw new IllegalStateException("Static method " + abstractC6242g2 + " defines a non-null receiver " + T);
                                                                }
                                                            } else if (abstractC6242g2.W0()) {
                                                                if (T != null) {
                                                                    l1 l02 = T.l0();
                                                                    if (abstractC6632q2 == null) {
                                                                        abstractC6632q = this;
                                                                    } else {
                                                                        abstractC6632q = abstractC6632q2;
                                                                    }
                                                                    if (l02.equals(abstractC6632q)) {
                                                                    }
                                                                }
                                                                throw new IllegalStateException("Constructor " + abstractC6242g2 + " defines an illegal receiver " + T);
                                                            } else if (T == null || !equals(T.l0())) {
                                                                throw new IllegalStateException("Method " + abstractC6242g2 + " defines an illegal receiver " + T);
                                                            }
                                                            str11 = str13;
                                                            j1Var = j1Var3;
                                                            hashSet11 = hashSet;
                                                            it14 = it15;
                                                            enumC6617i1 = enumC6617i13;
                                                            str9 = str19;
                                                            str8 = str16;
                                                            str7 = str17;
                                                        } else {
                                                            throw new IllegalStateException("Illegal explicit declaration of a type initializer by " + this);
                                                        }
                                                    } else {
                                                        throw new IllegalStateException(str5 + abstractC6242g2.u0() + " for " + abstractC6242g2);
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Duplicate method signature for " + abstractC6242g2);
                                                }
                                            }
                                            return this;
                                        }
                                    }
                                }
                            }
                            throw new IllegalStateException("Cannot add " + abstractC5793a + " on " + this);
                        }
                        throw new IllegalStateException("Cannot enclose type declaration in class initializer " + abstractC6242g);
                    }
                }
                throw new IllegalStateException("Illegal interface bound " + aVar3 + " of " + aVar + " for " + this);
            }
            throw new IllegalStateException(str2 + i10 + " for " + this);
        }
        throw new IllegalStateException("Illegal type name: " + str + " for " + this);
    }

    @Override // yh.AbstractC6632q
    public final boolean Y() {
        if (this.f2334B0 && this.f2339k0 != null && ((C6619j0) L()).f51016Z.l0().equals(Sh.G.RECORD.f16697Y)) {
            return true;
        }
        return false;
    }

    @Override // yh.AbstractC6635s, yh.l1, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a  reason: collision with other method in class */
    public final AbstractC6632q mo118a() {
        return this.f2349u0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [yh.H1, Qh.q] */
    @Override // yh.l1
    public final H1 b1() {
        List list = this.f2353y0;
        if (list == null) {
            return new AbstractC1239q(1);
        }
        return new q1(0, list);
    }

    @Override // yh.l1
    public final H1 d0() {
        List list;
        l1 l1Var = this.f2335C0;
        if (l1Var.H(zh.H.class)) {
            List list2 = this.f2336D0;
            if (list2.isEmpty()) {
                list = Collections.singletonList(this);
            } else {
                ArrayList arrayList = new ArrayList(list2.size() + 1);
                arrayList.add(this);
                arrayList.addAll(list2);
                list = arrayList;
            }
            return new q1(0, list);
        }
        return l1Var.d0();
    }

    @Override // Bh.AbstractC0265q
    public final Eh.A e0() {
        return this.f2348t0;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return new C5805m(0, this.f2346r0);
    }

    @Override // sh.AbstractC5637i.b
    public final String getName() {
        return this.f2337i0;
    }

    @Override // yh.l1, yh.AbstractC6632q
    public final AbstractC6256u i() {
        return new C6254s(this, this.f2344p0, 1);
    }

    @Override // yh.l1
    public final boolean m() {
        return this.f2333A0;
    }

    @Override // Bh.AbstractC0263p, Bh.AbstractC0265q
    public final AbstractC0263p n(C6247l c6247l) {
        return new C0249i(this.f2337i0, this.f2338j0, this.f2339k0, this.f2340l0, this.f2341m0, this.f2342n0, this.f2343o0, A7.b.m1(this.f2344p0, c6247l.a(new yh.Y0(AbstractC1235m.a(this)))), this.f2345q0, this.f2346r0, this.f2347s0, this.f2348t0, this.f2349u0, this.f2350v0, this.f2351w0, this.f2352x0, this.f2353y0, this.f2354z0, this.f2333A0, this.f2334B0, this.f2335C0, this.f2336D0);
    }

    @Override // Bh.AbstractC0263p
    public final AbstractC0263p n0(String str) {
        return new C0249i(str, this.f2338j0, this.f2339k0, this.f2340l0, this.f2341m0, this.f2342n0, this.f2343o0, this.f2344p0, this.f2345q0, this.f2346r0, this.f2347s0, this.f2348t0, this.f2349u0, this.f2350v0, this.f2351w0, this.f2352x0, this.f2353y0, this.f2354z0, this.f2333A0, this.f2334B0, this.f2335C0, this.f2336D0);
    }

    @Override // yh.AbstractC6632q
    public final G1 o0() {
        return new w1(this.f2341m0, new yh.X0((l1) this, (AbstractC5641m) this));
    }

    @Override // sh.AbstractC5641m
    public final G1 r0() {
        int i10 = x1.f51105i0;
        return new v1(this, this.f2340l0, new yh.X0((l1) this, (AbstractC5641m) this));
    }

    @Override // yh.l1
    public final AbstractC6242g s0() {
        return this.f2350v0;
    }

    @Override // Bh.AbstractC0265q
    public final AbstractC0252j0 t0() {
        return this.f2347s0;
    }

    @Override // sh.AbstractC5636h
    public final int u0() {
        return this.f2338j0;
    }

    @Override // yh.l1
    public final l1 v() {
        l1 l1Var = this.f2335C0;
        if (l1Var.H(zh.H.class)) {
            return this;
        }
        return l1Var;
    }

    @Override // yh.AbstractC6635s, yh.l1
    public final boolean x0() {
        if (this.f2353y0 != null) {
            return true;
        }
        return false;
    }

    @Override // yh.l1
    public final AbstractC6597c z() {
        String str = this.f2337i0;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return AbstractC6597c.f50995J;
        }
        return new C6594b(1, str.substring(0, lastIndexOf));
    }

    @Override // yh.AbstractC6635s, yh.l1, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final l1 mo118a() {
        return this.f2349u0;
    }
}
