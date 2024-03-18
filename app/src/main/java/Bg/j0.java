package Bg;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kg.C4292d;
import og.AbstractC5006b;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: b */
    public static final j0 f2127b = e(h0.f2123a);

    /* renamed from: a */
    public final h0 f2128a;

    public j0(h0 h0Var) {
        if (h0Var != null) {
            this.f2128a = h0Var;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    break;
            }
            if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
                switch (i10) {
                    default:
                        switch (i10) {
                            default:
                                switch (i10) {
                                    default:
                                        switch (i10) {
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                i11 = 3;
                                                break;
                                        }
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        i11 = 2;
                                        break;
                                }
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                break;
                        }
                    case 11:
                    case 12:
                    case 13:
                        break;
                }
                Object[] objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case 2:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 34:
                    case 37:
                    case 40:
                    case 41:
                    case 42:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                        break;
                    case 3:
                        objArr[0] = "first";
                        break;
                    case 4:
                        objArr[0] = "second";
                        break;
                    case 5:
                        objArr[0] = "substitutionContext";
                        break;
                    case 6:
                        objArr[0] = "context";
                        break;
                    case 7:
                    default:
                        objArr[0] = "substitution";
                        break;
                    case 9:
                    case 14:
                        objArr[0] = "type";
                        break;
                    case 10:
                    case 15:
                        objArr[0] = "howThisTypeIsUsed";
                        break;
                    case 16:
                    case 17:
                    case 36:
                        objArr[0] = "typeProjection";
                        break;
                    case 18:
                    case 28:
                        objArr[0] = "originalProjection";
                        break;
                    case 26:
                        objArr[0] = "originalType";
                        break;
                    case 27:
                        objArr[0] = "substituted";
                        break;
                    case 33:
                        objArr[0] = "annotations";
                        break;
                    case 35:
                    case 38:
                        objArr[0] = "typeParameterVariance";
                        break;
                    case 39:
                        objArr[0] = "projectionKind";
                        break;
                }
                if (i10 == 1) {
                    if (i10 != 2) {
                        if (i10 != 8) {
                            if (i10 != 34) {
                                if (i10 != 37) {
                                    switch (i10) {
                                        case 11:
                                        case 12:
                                        case 13:
                                            objArr[1] = "safeSubstitute";
                                            break;
                                        default:
                                            switch (i10) {
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                    objArr[1] = "unsafeSubstitute";
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 29:
                                                        case 30:
                                                        case 31:
                                                        case 32:
                                                            objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                                            break;
                                                        default:
                                                            switch (i10) {
                                                                case 40:
                                                                case 41:
                                                                case 42:
                                                                    break;
                                                                default:
                                                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                                }
                                objArr[1] = "combine";
                            } else {
                                objArr[1] = "filterOutUnsafeVariance";
                            }
                        } else {
                            objArr[1] = "getSubstitution";
                        }
                    } else {
                        objArr[1] = "replaceWithContravariantApproximatingSubstitution";
                    }
                } else {
                    objArr[1] = "replaceWithNonApproximatingSubstitution";
                }
                switch (i10) {
                    case 1:
                    case 2:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 34:
                    case 37:
                    case 40:
                    case 41:
                    case 42:
                        break;
                    case 3:
                    case 4:
                        objArr[2] = "createChainedSubstitutor";
                        break;
                    case 5:
                    case 6:
                    default:
                        objArr[2] = "create";
                        break;
                    case 7:
                        objArr[2] = "<init>";
                        break;
                    case 9:
                    case 10:
                        objArr[2] = "safeSubstitute";
                        break;
                    case 14:
                    case 15:
                    case 16:
                        objArr[2] = "substitute";
                        break;
                    case 17:
                        objArr[2] = "substituteWithoutApproximation";
                        break;
                    case 18:
                        objArr[2] = "unsafeSubstitute";
                        break;
                    case 26:
                    case 27:
                    case 28:
                        objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                        break;
                    case 33:
                        objArr[2] = "filterOutUnsafeVariance";
                        break;
                    case 35:
                    case 36:
                    case 38:
                    case 39:
                        objArr[2] = "combine";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
                    switch (i10) {
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            switch (i10) {
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                    break;
                                default:
                                    switch (i10) {
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                            break;
                                        default:
                                            switch (i10) {
                                                case 40:
                                                case 41:
                                                case 42:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(format);
                                            }
                                    }
                            }
                    }
                }
                throw new IllegalStateException(format);
            }
            i11 = 2;
            Object[] objArr2 = new Object[i11];
            switch (i10) {
            }
            if (i10 == 1) {
            }
            switch (i10) {
            }
            String format2 = String.format(str, objArr2);
            if (i10 != 1) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 1) {
            switch (i10) {
            }
            Object[] objArr22 = new Object[i11];
            switch (i10) {
            }
            if (i10 == 1) {
            }
            switch (i10) {
            }
            String format22 = String.format(str, objArr22);
            if (i10 != 1) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        Object[] objArr222 = new Object[i11];
        switch (i10) {
        }
        if (i10 == 1) {
        }
        switch (i10) {
        }
        String format222 = String.format(str, objArr222);
        if (i10 != 1) {
        }
        throw new IllegalStateException(format222);
    }

    public static p0 b(p0 p0Var, p0 p0Var2) {
        if (p0Var != null) {
            if (p0Var2 != null) {
                p0 p0Var3 = p0.f2146h0;
                if (p0Var == p0Var3) {
                    if (p0Var2 != null) {
                        return p0Var2;
                    }
                    a(40);
                    throw null;
                } else if (p0Var2 == p0Var3) {
                    if (p0Var != null) {
                        return p0Var;
                    }
                    a(41);
                    throw null;
                } else if (p0Var == p0Var2) {
                    if (p0Var2 != null) {
                        return p0Var2;
                    }
                    a(42);
                    throw null;
                } else {
                    throw new AssertionError("Variance conflict: type parameter variance '" + p0Var + "' and projection kind '" + p0Var2 + "' cannot be combined");
                }
            }
            a(39);
            throw null;
        }
        a(38);
        throw null;
    }

    public static int c(p0 p0Var, p0 p0Var2) {
        p0 p0Var3 = p0.f2147i0;
        if (p0Var == p0Var3 && p0Var2 == p0.f2148j0) {
            return 3;
        }
        if (p0Var == p0.f2148j0 && p0Var2 == p0Var3) {
            return 2;
        }
        return 1;
    }

    public static j0 d(A a5) {
        if (a5 != null) {
            return e(a0.f2103b.b(a5.y0(), a5.w0()));
        }
        a(6);
        throw null;
    }

    public static j0 e(h0 h0Var) {
        if (h0Var != null) {
            return new j0(h0Var);
        }
        a(0);
        throw null;
    }

    public static j0 f(h0 h0Var, h0 h0Var2) {
        if (h0Var != null) {
            if (h0Var2 != null) {
                if (h0Var.e()) {
                    h0Var = h0Var2;
                } else if (!h0Var2.e()) {
                    h0Var = new C0226t(h0Var, h0Var2);
                }
                return e(h0Var);
            }
            a(4);
            throw null;
        }
        a(3);
        throw null;
    }

    public static String i(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (!Ig.i.i(th2)) {
                return "[Exception while computing toString(): " + th2 + "]";
            }
            throw th2;
        }
    }

    public final h0 g() {
        h0 h0Var = this.f2128a;
        if (h0Var != null) {
            return h0Var;
        }
        a(8);
        throw null;
    }

    public final A h(A a5, p0 p0Var) {
        if (a5 != null) {
            if (this.f2128a.e()) {
                return a5;
            }
            try {
                A type = k(new I(a5, p0Var), null, 0).getType();
                if (type != null) {
                    return type;
                }
                a(12);
                throw null;
            } catch (i0 e10) {
                return Dg.m.c(Dg.l.f3696p0, e10.getMessage());
            }
        }
        a(9);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [Bg.h0, java.lang.Object] */
    public final A j(A a5, p0 p0Var) {
        if (a5 != null) {
            if (p0Var != null) {
                d0 i10 = new I(g().f(a5, p0Var), p0Var);
                h0 h0Var = this.f2128a;
                if (!h0Var.e()) {
                    try {
                        i10 = k(i10, null, 0);
                    } catch (i0 unused) {
                        i10 = null;
                    }
                }
                if (h0Var.a() || h0Var.b()) {
                    boolean b10 = h0Var.b();
                    if (i10 != null) {
                        if (!i10.c()) {
                            A type = i10.getType();
                            AbstractC3557B.b0("getType(...)", type);
                            if (m0.d(type, Gg.b.f6504Y, null)) {
                                p0 b11 = i10.b();
                                if (b11 == p0.f2148j0) {
                                    i10 = new I((A) R4.b.E(type).f6503b, b11);
                                } else if (b10) {
                                    i10 = new I((A) R4.b.E(type).f6502a, b11);
                                } else {
                                    j0 e10 = e(new Object());
                                    if (!e10.f2128a.e()) {
                                        try {
                                            i10 = e10.k(i10, null, 0);
                                        } catch (i0 unused2) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i10 = null;
                }
                if (i10 == null) {
                    return null;
                }
                return i10.getType();
            }
            a(15);
            throw null;
        }
        a(14);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x028c, code lost:
        if (r4 != 2) goto L128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d0 k(d0 d0Var, Mf.b0 b0Var, int i10) {
        C0208a c0208a;
        D d10;
        char c10;
        j0 j0Var;
        AbstractC0222o abstractC0222o;
        A a5;
        AbstractC0222o abstractC0222o2;
        A a10 = null;
        if (d0Var != null) {
            h0 h0Var = this.f2128a;
            if (i10 <= 100) {
                if (d0Var.c()) {
                    return d0Var;
                }
                A type = d0Var.getType();
                if (type instanceof n0) {
                    n0 n0Var = (n0) type;
                    o0 origin = n0Var.getOrigin();
                    A C10 = n0Var.C();
                    d0 k10 = k(new I(origin, d0Var.b()), b0Var, i10 + 1);
                    if (k10.c()) {
                        return k10;
                    }
                    return new I(L4.a.Z0(k10.getType().B0(), j(C10, d0Var.b())), k10.b());
                }
                AbstractC3557B.c0("<this>", type);
                type.B0();
                if (type.B0() instanceof Zf.f) {
                    return d0Var;
                }
                d0 d11 = h0Var.d(type);
                if (d11 != null) {
                    if (type.getAnnotations().G(Jf.p.f9192y)) {
                        Y y02 = d11.getType().y0();
                        if (y02 instanceof Cg.l) {
                            d0 d0Var2 = ((Cg.l) y02).f3135a;
                            p0 b10 = d0Var2.b();
                            if (c(d0Var.b(), b10) == 3) {
                                d11 = new I(d0Var2.getType());
                            } else if (b0Var != null && c(b0Var.J(), b10) == 3) {
                                d11 = new I(d0Var2.getType());
                            }
                        }
                    }
                } else {
                    d11 = null;
                }
                p0 b11 = d0Var.b();
                if (d11 == null && Ad.l.I0(type)) {
                    o0 B02 = type.B0();
                    if (B02 instanceof AbstractC0222o) {
                        abstractC0222o2 = (AbstractC0222o) B02;
                    } else {
                        abstractC0222o2 = null;
                    }
                    if (abstractC0222o2 == null || !abstractC0222o2.k0()) {
                        AbstractC0227u abstractC0227u = (AbstractC0227u) type.B0();
                        D d12 = abstractC0227u.f2158Z;
                        int i11 = i10 + 1;
                        d0 k11 = k(new I(d12, b11), b0Var, i11);
                        D d13 = abstractC0227u.f2159h0;
                        d0 k12 = k(new I(d13, b11), b0Var, i11);
                        p0 b12 = k11.b();
                        if (k11.getType() == d12 && k12.getType() == d13) {
                            return d0Var;
                        }
                        return new I(C0213f.f(K4.J.i(k11.getType()), K4.J.i(k12.getType())), b12);
                    }
                }
                if (!Jf.l.E(type) && !Bi.c.g1(type)) {
                    if (d11 != null) {
                        int c11 = c(b11, d11.b());
                        if (!(type.y0() instanceof AbstractC5006b)) {
                            int f6 = AbstractC6708l.f(c11);
                            if (f6 != 1) {
                                if (f6 == 2) {
                                    throw new Exception("Out-projection in in-position");
                                }
                            } else {
                                return new I(type.y0().j().o(), p0.f2148j0);
                            }
                        }
                        o0 B03 = type.B0();
                        if (B03 instanceof AbstractC0222o) {
                            abstractC0222o = (AbstractC0222o) B03;
                        } else {
                            abstractC0222o = null;
                        }
                        if (abstractC0222o == null || !abstractC0222o.k0()) {
                            abstractC0222o = null;
                        }
                        if (d11.c()) {
                            return d11;
                        }
                        if (abstractC0222o != null) {
                            a5 = abstractC0222o.p0(d11.getType());
                        } else {
                            a5 = m0.i(d11.getType(), type.z0());
                        }
                        if (!type.getAnnotations().isEmpty()) {
                            Nf.i c12 = h0Var.c(type.getAnnotations());
                            if (c12 != null) {
                                if (c12.G(Jf.p.f9192y)) {
                                    c12 = new Nf.m(c12, new C4292d(4));
                                }
                                a5 = Bi.c.y1(a5, new Nf.j(new Nf.i[]{a5.getAnnotations(), c12}));
                            } else {
                                a(33);
                                throw null;
                            }
                        }
                        if (c11 == 1) {
                            b11 = b(b11, d11.b());
                        }
                        return new I(a5, b11);
                    }
                    A type2 = d0Var.getType();
                    p0 b13 = d0Var.b();
                    if (type2.y0().k() instanceof Mf.b0) {
                        return d0Var;
                    }
                    o0 B04 = type2.B0();
                    if (B04 instanceof C0208a) {
                        c0208a = (C0208a) B04;
                    } else {
                        c0208a = null;
                    }
                    if (c0208a != null) {
                        d10 = c0208a.f2102h0;
                    } else {
                        d10 = null;
                    }
                    if (d10 != null) {
                        if ((h0Var instanceof C0230x) && h0Var.b()) {
                            C0230x c0230x = (C0230x) h0Var;
                            j0Var = new j0(new C0230x(c0230x.f2162b, c0230x.f2163c, false));
                        } else {
                            j0Var = this;
                        }
                        a10 = j0Var.j(d10, p0.f2146h0);
                    }
                    List parameters = type2.y0().getParameters();
                    List w02 = type2.w0();
                    ArrayList arrayList = new ArrayList(parameters.size());
                    boolean z10 = false;
                    for (int i12 = 0; i12 < parameters.size(); i12++) {
                        Mf.b0 b0Var2 = (Mf.b0) parameters.get(i12);
                        d0 d0Var3 = (d0) w02.get(i12);
                        d0 k13 = k(d0Var3, b0Var2, i10 + 1);
                        int f10 = AbstractC6708l.f(c(b0Var2.J(), k13.b()));
                        if (f10 != 0) {
                            if (f10 != 1) {
                                c10 = 2;
                            } else {
                                c10 = 2;
                            }
                            k13 = m0.k(b0Var2);
                        } else {
                            c10 = 2;
                            p0 J10 = b0Var2.J();
                            p0 p0Var = p0.f2146h0;
                            if (J10 != p0Var && !k13.c()) {
                                k13 = new I(k13.getType(), p0Var);
                            }
                        }
                        if (k13 != d0Var3) {
                            z10 = true;
                        }
                        arrayList.add(k13);
                    }
                    if (z10) {
                        w02 = arrayList;
                    }
                    Nf.i c13 = h0Var.c(type2.getAnnotations());
                    AbstractC3557B.c0("newArguments", w02);
                    AbstractC3557B.c0("newAnnotations", c13);
                    A T = K4.J.T(type2, w02, c13, 4);
                    if ((T instanceof D) && (a10 instanceof D)) {
                        T = R4.b.o2((D) T, (D) a10);
                    }
                    return new I(T, b13);
                }
                return d0Var;
            }
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + i(d0Var) + "; substitution: " + i(h0Var));
        }
        a(18);
        throw null;
    }
}
