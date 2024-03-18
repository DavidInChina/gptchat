package Pf;

import Bg.C0213f;
import Bg.C0219l;
import Bg.C0221n;
import Bg.h0;
import Bg.j0;
import Bg.m0;
import Bg.p0;
import Gf.C0631e;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import Mf.AbstractC1004m;
import Mf.AbstractC1007p;
import Mf.C1014x;
import Mf.EnumC0998g;
import Mf.f0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import jf.C3959i;
import kg.C4294f;
import l8.AbstractC4344b;
import ng.AbstractC4838e;
import rg.AbstractC5493d;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class C extends D {

    /* renamed from: Y  reason: collision with root package name */
    public final D f13982Y;

    /* renamed from: Z  reason: collision with root package name */
    public final j0 f13983Z;

    /* renamed from: h0  reason: collision with root package name */
    public j0 f13984h0;

    /* renamed from: i0  reason: collision with root package name */
    public ArrayList f13985i0;

    /* renamed from: j0  reason: collision with root package name */
    public ArrayList f13986j0;

    /* renamed from: k0  reason: collision with root package name */
    public C0221n f13987k0;

    public C(D d10, j0 j0Var) {
        this.f13982Y = d10;
        this.f13983Z = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void p0(int i10) {
        String str;
        int i11;
        String format;
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 8 && i10 != 10 && i10 != 13 && i10 != 23) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 8 && i10 != 10 && i10 != 13 && i10 != 23) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 5) {
                    if (i10 != 6) {
                        if (i10 != 8) {
                            if (i10 != 10) {
                                if (i10 != 13) {
                                    if (i10 != 23) {
                                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                    } else {
                                        objArr[0] = "substitutor";
                                    }
                                    switch (i10) {
                                        case 2:
                                        case 3:
                                        case 5:
                                        case 6:
                                        case 8:
                                        case 10:
                                        case 13:
                                        case 23:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                            break;
                                        case 4:
                                        case 7:
                                        case 9:
                                        case 11:
                                            objArr[1] = "getMemberScope";
                                            break;
                                        case 12:
                                        case 14:
                                            objArr[1] = "getUnsubstitutedMemberScope";
                                            break;
                                        case 15:
                                            objArr[1] = "getStaticScope";
                                            break;
                                        case 16:
                                            objArr[1] = "getDefaultType";
                                            break;
                                        case 17:
                                            objArr[1] = "getContextReceivers";
                                            break;
                                        case 18:
                                            objArr[1] = "getConstructors";
                                            break;
                                        case 19:
                                            objArr[1] = "getAnnotations";
                                            break;
                                        case 20:
                                            objArr[1] = "getName";
                                            break;
                                        case 21:
                                            objArr[1] = "getOriginal";
                                            break;
                                        case 22:
                                            objArr[1] = "getContainingDeclaration";
                                            break;
                                        case 24:
                                            objArr[1] = "substitute";
                                            break;
                                        case 25:
                                            objArr[1] = "getKind";
                                            break;
                                        case 26:
                                            objArr[1] = "getModality";
                                            break;
                                        case 27:
                                            objArr[1] = "getVisibility";
                                            break;
                                        case 28:
                                            objArr[1] = "getUnsubstitutedInnerClassesScope";
                                            break;
                                        case 29:
                                            objArr[1] = "getSource";
                                            break;
                                        case 30:
                                            objArr[1] = "getDeclaredTypeParameters";
                                            break;
                                        case 31:
                                            objArr[1] = "getSealedSubclasses";
                                            break;
                                        default:
                                            objArr[1] = "getTypeConstructor";
                                            break;
                                    }
                                    if (i10 == 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 8 && i10 != 10) {
                                        if (i10 != 13) {
                                            if (i10 == 23) {
                                                objArr[2] = "substitute";
                                            }
                                        } else {
                                            objArr[2] = "getUnsubstitutedMemberScope";
                                        }
                                    } else {
                                        objArr[2] = "getMemberScope";
                                    }
                                    format = String.format(str, objArr);
                                    if (i10 != 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) {
                                        throw new IllegalArgumentException(format);
                                    }
                                    throw new IllegalStateException(format);
                                }
                            }
                        }
                    }
                }
                objArr[0] = "typeSubstitution";
                switch (i10) {
                }
                if (i10 == 2) {
                }
                objArr[2] = "getMemberScope";
                format = String.format(str, objArr);
                if (i10 != 2) {
                }
                throw new IllegalArgumentException(format);
            }
            objArr[0] = "kotlinTypeRefiner";
            switch (i10) {
            }
            if (i10 == 2) {
            }
            objArr[2] = "getMemberScope";
            format = String.format(str, objArr);
            if (i10 != 2) {
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "typeArguments";
        switch (i10) {
        }
        if (i10 == 2) {
        }
        objArr[2] = "getMemberScope";
        format = String.format(str, objArr);
        if (i10 != 2) {
        }
        throw new IllegalArgumentException(format);
    }

    @Override // Pf.D
    public final ug.n C(h0 h0Var, Cg.i iVar) {
        if (h0Var != null) {
            ug.n C10 = this.f13982Y.C(h0Var, iVar);
            if (this.f13983Z.f2128a.e()) {
                if (C10 != null) {
                    return C10;
                }
                p0(7);
                throw null;
            }
            return new ug.s(C10, w0());
        }
        p0(5);
        throw null;
    }

    @Override // Mf.AbstractC0997f
    public final ug.n E(h0 h0Var) {
        if (h0Var != null) {
            AbstractC5493d.i(AbstractC4838e.d(this));
            return C(h0Var, Cg.h.f3127a);
        }
        p0(10);
        throw null;
    }

    @Override // Mf.AbstractC0997f
    public final boolean F() {
        return this.f13982Y.F();
    }

    @Override // Mf.AbstractC1016z
    public final boolean H() {
        return this.f13982Y.H();
    }

    @Override // Mf.AbstractC1001j
    public final boolean I() {
        return this.f13982Y.I();
    }

    @Override // Mf.AbstractC0997f
    public final AbstractC0996e M() {
        return this.f13982Y.M();
    }

    @Override // Mf.AbstractC0997f
    public final ug.n N() {
        ug.n N10 = this.f13982Y.N();
        if (N10 != null) {
            return N10;
        }
        p0(15);
        throw null;
    }

    @Override // Mf.AbstractC0997f
    public final AbstractC0997f P() {
        return this.f13982Y.P();
    }

    @Override // Pf.D, Mf.AbstractC0997f, Mf.AbstractC1003l
    /* renamed from: a */
    public final AbstractC0997f mo24a() {
        AbstractC0997f mo24a = this.f13982Y.mo24a();
        if (mo24a != null) {
            return mo24a;
        }
        p0(21);
        throw null;
    }

    @Override // Mf.X
    public final AbstractC1004m c(j0 j0Var) {
        if (j0Var != null) {
            if (j0Var.f2128a.e()) {
                return this;
            }
            return new C(this, j0.f(j0Var.g(), w0().g()));
        }
        p0(23);
        throw null;
    }

    @Override // Mf.AbstractC0997f
    public final EnumC0998g e() {
        EnumC0998g e10 = this.f13982Y.e();
        if (e10 != null) {
            return e10;
        }
        p0(25);
        throw null;
    }

    @Override // Mf.AbstractC1000i
    public final Bg.Y f() {
        Bg.Y f6 = this.f13982Y.f();
        if (this.f13983Z.f2128a.e()) {
            if (f6 != null) {
                return f6;
            }
            p0(0);
            throw null;
        }
        if (this.f13987k0 == null) {
            j0 w02 = w0();
            Collection<Bg.A> l10 = f6.l();
            ArrayList arrayList = new ArrayList(l10.size());
            for (Bg.A a5 : l10) {
                arrayList.add(w02.j(a5, p0.f2146h0));
            }
            this.f13987k0 = new C0221n(this, this.f13985i0, arrayList, Ag.q.f870e);
        }
        C0221n c0221n = this.f13987k0;
        if (c0221n != null) {
            return c0221n;
        }
        p0(1);
        throw null;
    }

    @Override // Mf.AbstractC1004m
    public final Mf.V g() {
        return Mf.V.f12075a;
    }

    @Override // Nf.a
    public final Nf.i getAnnotations() {
        Nf.i annotations = this.f13982Y.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        p0(19);
        throw null;
    }

    @Override // Mf.AbstractC1003l
    public final C4294f getName() {
        C4294f name = this.f13982Y.getName();
        if (name != null) {
            return name;
        }
        p0(20);
        throw null;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1006o, Mf.AbstractC1016z
    public final AbstractC1007p getVisibility() {
        AbstractC1007p visibility = this.f13982Y.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        p0(27);
        throw null;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1016z
    public final Mf.A h() {
        Mf.A h10 = this.f13982Y.h();
        if (h10 != null) {
            return h10;
        }
        p0(26);
        throw null;
    }

    @Override // Mf.AbstractC0997f
    public final Collection i() {
        Collection i10 = this.f13982Y.i();
        if (i10 != null) {
            return i10;
        }
        p0(31);
        throw null;
    }

    @Override // Mf.AbstractC0997f
    public final ug.n i0() {
        ug.n i02 = this.f13982Y.i0();
        if (i02 != null) {
            return i02;
        }
        p0(28);
        throw null;
    }

    @Override // Mf.AbstractC1016z
    public final boolean isExternal() {
        return this.f13982Y.isExternal();
    }

    @Override // Mf.AbstractC0997f
    public final boolean isInline() {
        return this.f13982Y.isInline();
    }

    @Override // Mf.AbstractC0997f
    public final f0 j0() {
        f0 j02 = this.f13982Y.j0();
        if (j02 == null) {
            return null;
        }
        B b10 = new B(this, 1);
        if (j02 instanceof C1014x) {
            C1014x c1014x = (C1014x) j02;
            return new C1014x(c1014x.f12124a, (Eg.g) b10.invoke(c1014x.f12125b));
        } else if (j02 instanceof Mf.C) {
            List<C3959i> b11 = j02.b();
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(b11, 10));
            for (C3959i c3959i : b11) {
                arrayList.add(new C3959i((C4294f) c3959i.f36155Y, b10.invoke((Eg.g) c3959i.f36156Z)));
            }
            return new Mf.C(arrayList);
        } else {
            throw new RuntimeException();
        }
    }

    @Override // Mf.AbstractC1003l
    /* renamed from: k */
    public final AbstractC1003l mo20k() {
        AbstractC1003l mo20k = this.f13982Y.mo20k();
        if (mo20k != null) {
            return mo20k;
        }
        p0(22);
        throw null;
    }

    @Override // Pf.D
    public final ug.n k0(Cg.i iVar) {
        ug.n k02 = this.f13982Y.k0(iVar);
        if (this.f13983Z.f2128a.e()) {
            if (k02 != null) {
                return k02;
            }
            p0(14);
            throw null;
        }
        return new ug.s(k02, w0());
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1000i
    public final Bg.D n() {
        Bg.Q q10;
        List e10 = m0.e(f().getParameters());
        Nf.i annotations = getAnnotations();
        AbstractC3557B.c0("annotations", annotations);
        if (annotations.isEmpty()) {
            Bg.Q.f2084Z.getClass();
            q10 = Bg.Q.f2085h0;
        } else {
            Bg.P p10 = Bg.Q.f2084Z;
            List F02 = AbstractC4344b.F0(new C0219l(annotations));
            p10.getClass();
            q10 = Bg.P.a(F02);
        }
        return C0213f.n(q10, f(), e10, false, n0());
    }

    @Override // Mf.AbstractC0997f
    public final ug.n n0() {
        AbstractC5493d.i(AbstractC4838e.d(this.f13982Y));
        return k0(Cg.h.f3127a);
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1001j
    public final List o() {
        w0();
        ArrayList arrayList = this.f13986j0;
        if (arrayList != null) {
            return arrayList;
        }
        p0(30);
        throw null;
    }

    @Override // Mf.AbstractC1016z
    public final boolean o0() {
        return this.f13982Y.o0();
    }

    @Override // Mf.AbstractC0997f
    public final boolean q() {
        return this.f13982Y.q();
    }

    @Override // Mf.AbstractC0997f
    public final List r0() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        p0(17);
        throw null;
    }

    @Override // Mf.AbstractC0997f
    public final boolean t0() {
        return this.f13982Y.t0();
    }

    @Override // Mf.AbstractC0997f
    public final Collection u() {
        Collection<AbstractC0996e> u10 = this.f13982Y.u();
        ArrayList arrayList = new ArrayList(u10.size());
        for (AbstractC0996e abstractC0996e : u10) {
            AbstractC1165x abstractC1165x = (AbstractC1165x) abstractC0996e;
            abstractC1165x.getClass();
            C1164w C02 = abstractC1165x.C0(j0.f2127b);
            C02.f14140e = ((C1154l) abstractC0996e).p0();
            C02.o(abstractC1165x.h());
            C02.d(abstractC1165x.getVisibility());
            C02.e(abstractC1165x.e());
            C02.f14148m = false;
            arrayList.add(((C1154l) ((AbstractC0996e) C02.f14159x.z0(C02))).c(w0()));
        }
        return arrayList;
    }

    @Override // Mf.AbstractC1003l
    public final Object u0(C0631e c0631e, Object obj) {
        return c0631e.b(this, obj);
    }

    @Override // Mf.AbstractC0997f
    public final AbstractC1146d v0() {
        throw new UnsupportedOperationException();
    }

    public final j0 w0() {
        if (this.f13984h0 == null) {
            j0 j0Var = this.f13983Z;
            if (j0Var.f2128a.e()) {
                this.f13984h0 = j0Var;
            } else {
                List parameters = this.f13982Y.f().getParameters();
                this.f13985i0 = new ArrayList(parameters.size());
                this.f13984h0 = P4.a.J0(parameters, j0Var.g(), this, this.f13985i0);
                this.f13986j0 = kf.t.b2(this.f13985i0, new B(this, 0));
            }
        }
        return this.f13984h0;
    }

    @Override // Mf.AbstractC0997f
    public final boolean y() {
        return this.f13982Y.y();
    }
}
