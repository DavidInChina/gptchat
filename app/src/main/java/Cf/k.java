package Cf;

import Bg.D;
import Bg.p0;
import Jf.p;
import Lg.n;
import Mf.A;
import Mf.AbstractC0993b;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import Mf.V;
import Mf.W;
import Mf.b0;
import Mf.h0;
import Pf.AbstractC1146d;
import Pf.AbstractC1158p;
import Pf.c0;
import Sf.AbstractC1385d;
import Sf.AbstractC1387f;
import Sf.C1388g;
import Sf.x;
import Uf.C1446h;
import Uf.M;
import Vf.m;
import android.gov.nist.javax.sip.parser.TokenNames;
import dg.AbstractC2653B;
import dg.C2655D;
import dg.C2656E;
import dg.u;
import eg.C2896d;
import eg.C2898f;
import eg.EnumC2893a;
import fg.EnumC3041i;
import fg.EnumC3049q;
import fg.EnumC3057z;
import fg.I;
import gg.C3270a;
import hg.AbstractC3428g;
import id.AbstractC3557B;
import ig.C3577c;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jf.C3959i;
import jg.AbstractC3972a;
import kf.o;
import kf.t;
import kf.v;
import kf.y;
import kg.C4290b;
import kg.C4291c;
import kg.C4294f;
import l8.AbstractC4344b;
import lg.q;
import lg.r;
import o1.C4885I;
import rg.AbstractC5493d;
import sg.C5625b;
import sg.EnumC5626c;
import xg.C;
import xg.C6445B;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class k implements W, m, r {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3122Y;

    public /* synthetic */ k(int i10) {
        this.f3122Y = i10;
    }

    public static /* synthetic */ void b(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        if (i10 != 5 && i10 != 6) {
            objArr[2] = "resolvePropagatedSignature";
        } else {
            objArr[2] = "reportSignatureErrors";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final M c(k kVar, String str, String str2, String str3, String str4) {
        kVar.getClass();
        return new M(str, C4294f.e(str2), str3, str4);
    }

    public static A d(boolean z10, boolean z11, boolean z12) {
        if (z10) {
            return A.f12052h0;
        }
        if (z11) {
            return A.f12054j0;
        }
        if (z12) {
            return A.f12053i0;
        }
        return A.f12051Z;
    }

    public static Kf.f e(Kf.c cVar, boolean z10) {
        String str;
        AbstractC3557B.c0("functionClass", cVar);
        Kf.f fVar = new Kf.f(cVar, null, 1, z10);
        AbstractC1146d v02 = cVar.v0();
        v vVar = v.f37483Y;
        ArrayList arrayList = new ArrayList();
        List list = cVar.f9798p0;
        for (Object obj : list) {
            if (((b0) obj).J() != p0.f2147i0) {
                break;
            }
            arrayList.add(obj);
        }
        o R22 = t.R2(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(R22, 10));
        Iterator it = R22.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            int i10 = yVar.f37486a;
            b0 b0Var = (b0) yVar.f37487b;
            String b10 = b0Var.getName().b();
            AbstractC3557B.b0("asString(...)", b10);
            if (AbstractC3557B.K(b10, TokenNames.T)) {
                str = "instance";
            } else if (AbstractC3557B.K(b10, TokenNames.f24311E)) {
                str = "receiver";
            } else {
                str = b10.toLowerCase(Locale.ROOT);
                AbstractC3557B.b0("toLowerCase(...)", str);
            }
            Nf.g gVar = Nf.h.f12822a;
            C4294f e10 = C4294f.e(str);
            D n10 = b0Var.n();
            AbstractC3557B.b0("getDefaultType(...)", n10);
            AbstractC1146d abstractC1146d = v02;
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(new Pf.b0(fVar, null, i10, gVar, e10, n10, false, false, false, null, V.f12075a));
            arrayList2 = arrayList3;
            v02 = abstractC1146d;
        }
        fVar.B0(null, v02, vVar, vVar, arrayList2, ((b0) t.o2(list)).n(), A.f12054j0, Mf.r.f12105e);
        fVar.f14162C0 = true;
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
        if (r3 != eg.EnumC2893a.f29384n0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
        if (r1.f29400e != null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Type inference failed for: r1v1, types: [eg.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Rf.c f(Class cls) {
        C4885I c4885i;
        byte[] bArr;
        C2896d c2896d;
        EnumC2893a enumC2893a;
        AbstractC3557B.c0("klass", cls);
        ?? obj = new Object();
        obj.f29396a = null;
        obj.f29397b = null;
        boolean z10 = false;
        obj.f29398c = 0;
        obj.f29399d = null;
        obj.f29400e = null;
        obj.f29401f = null;
        obj.f29402g = null;
        obj.f29403h = null;
        obj.f29404i = null;
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        AbstractC3557B.b0("getDeclaredAnnotations(...)", declaredAnnotations);
        for (Annotation annotation : declaredAnnotations) {
            AbstractC3557B.Z(annotation);
            Class k12 = R4.b.k1(R4.b.d1(annotation));
            C4290b a5 = AbstractC1385d.a(k12);
            C4291c b10 = a5.b();
            if (b10.equals(Uf.D.f17726a)) {
                c2896d = new C2896d(obj, 0, 0);
            } else if (b10.equals(Uf.D.f17740o)) {
                c2896d = new C2896d(obj, 1, 0);
            } else if (C2898f.f29394j || obj.f29403h != null || (enumC2893a = (EnumC2893a) C2898f.f29395k.get(a5)) == null) {
                c2896d = null;
            } else {
                obj.f29403h = enumC2893a;
                c2896d = new C2896d(obj, 2, 0);
            }
            if (c2896d != null) {
                AbstractC4344b.R0(c2896d, annotation, k12);
            }
        }
        jg.g gVar = jg.g.f36187g;
        if (obj.f29403h != null && obj.f29396a != null) {
            int[] iArr = obj.f29396a;
            if ((obj.f29398c & 8) != 0) {
                z10 = true;
            }
            jg.g gVar2 = new jg.g(iArr, z10);
            if (!gVar2.b(gVar)) {
                obj.f29402g = obj.f29400e;
                obj.f29400e = null;
            } else {
                EnumC2893a enumC2893a2 = obj.f29403h;
                if (enumC2893a2 != EnumC2893a.f29380j0) {
                    if (enumC2893a2 != EnumC2893a.f29381k0) {
                    }
                }
            }
            String[] strArr = obj.f29404i;
            if (strArr != null) {
                bArr = AbstractC3972a.b(strArr);
            } else {
                bArr = null;
            }
            c4885i = new C4885I(obj.f29403h, gVar2, obj.f29400e, obj.f29402g, obj.f29401f, obj.f29397b, obj.f29398c, obj.f29399d, bArr);
            if (c4885i != null) {
                return null;
            }
            return new Rf.c(cls, c4885i);
        }
        c4885i = null;
        if (c4885i != null) {
        }
    }

    public static AbstractC1387f g(Object obj, C4294f c4294f) {
        Class<?> cls = obj.getClass();
        List list = AbstractC1385d.f16603a;
        if (Enum.class.isAssignableFrom(cls)) {
            return new Sf.v(c4294f, (Enum) obj);
        }
        if (obj instanceof Annotation) {
            return new C1388g(c4294f, (Annotation) obj);
        }
        if (obj instanceof Object[]) {
            return new Sf.h(c4294f, (Object[]) obj);
        }
        if (obj instanceof Class) {
            return new Sf.r(c4294f, (Class) obj);
        }
        return new x(obj, c4294f);
    }

    public static boolean h(AbstractC0993b abstractC0993b, AbstractC0993b abstractC0993b2) {
        AbstractC3557B.c0("superDescriptor", abstractC0993b);
        AbstractC3557B.c0("subDescriptor", abstractC0993b2);
        if ((abstractC0993b2 instanceof Wf.f) && (abstractC0993b instanceof AbstractC1013w)) {
            Wf.f fVar = (Wf.f) abstractC0993b2;
            fVar.S().size();
            AbstractC1013w abstractC1013w = (AbstractC1013w) abstractC0993b;
            abstractC1013w.S().size();
            List S = fVar.p0().S();
            AbstractC3557B.b0("getValueParameters(...)", S);
            List S10 = abstractC1013w.mo24a().S();
            AbstractC3557B.b0("getValueParameters(...)", S10);
            Iterator it = t.S2(S, S10).iterator();
            while (it.hasNext()) {
                C3959i c3959i = (C3959i) it.next();
                h0 h0Var = (h0) c3959i.f36155Y;
                h0 h0Var2 = (h0) c3959i.f36156Z;
                AbstractC3557B.Z(h0Var);
                boolean z10 = o((AbstractC1013w) abstractC0993b2, h0Var) instanceof u;
                AbstractC3557B.Z(h0Var2);
                if (z10 != (o(abstractC1013w, h0Var2) instanceof u)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static C2656E i(String str, String str2) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("desc", str2);
        return new C2656E(str + '#' + str2);
    }

    public static C2656E j(jg.f fVar) {
        if (fVar instanceof jg.e) {
            return l(fVar.c(), fVar.b());
        }
        if (fVar instanceof jg.d) {
            return i(fVar.c(), fVar.b());
        }
        throw new RuntimeException();
    }

    public static C2656E k(AbstractC3428g abstractC3428g, C3577c c3577c) {
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        return l(abstractC3428g.b(c3577c.f33174h0), abstractC3428g.b(c3577c.f33175i0));
    }

    public static C2656E l(String str, String str2) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("desc", str2);
        return new C2656E(str.concat(str2));
    }

    public static C2656E m(C2656E c2656e, int i10) {
        AbstractC3557B.c0("signature", c2656e);
        return new C2656E(c2656e.f28291a + '@' + i10);
    }

    public static AbstractC2653B n(xg.D d10, boolean z10, boolean z11, Boolean bool, boolean z12, dg.x xVar, jg.g gVar) {
        C6445B c6445b;
        C2655D c2655d;
        dg.r rVar;
        C5625b c5625b;
        AbstractC3557B.c0("container", d10);
        AbstractC3557B.c0("kotlinClassFinder", xVar);
        AbstractC3557B.c0("jvmMetadataVersion", gVar);
        EnumC3041i enumC3041i = EnumC3041i.INTERFACE;
        V v10 = d10.f49969c;
        if (z10) {
            if (bool != null) {
                if (d10 instanceof C6445B) {
                    C6445B c6445b2 = (C6445B) d10;
                    if (c6445b2.f49964g == enumC3041i) {
                        return P4.a.L(xVar, c6445b2.f49963f.d(C4294f.e("DefaultImpls")), gVar);
                    }
                }
                if (bool.booleanValue() && (d10 instanceof C)) {
                    if (v10 instanceof dg.r) {
                        rVar = (dg.r) v10;
                    } else {
                        rVar = null;
                    }
                    if (rVar != null) {
                        c5625b = rVar.f28358c;
                    } else {
                        c5625b = null;
                    }
                    if (c5625b != null) {
                        String e10 = c5625b.e();
                        AbstractC3557B.b0("getInternalName(...)", e10);
                        return P4.a.L(xVar, C4290b.j(new C4291c(n.z2(e10, '/', '.'))), gVar);
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + d10 + ')').toString());
            }
        }
        if (z11 && (d10 instanceof C6445B)) {
            C6445B c6445b3 = (C6445B) d10;
            if (c6445b3.f49964g == EnumC3041i.COMPANION_OBJECT && (c6445b = c6445b3.f49962e) != null) {
                EnumC3041i enumC3041i2 = EnumC3041i.CLASS;
                EnumC3041i enumC3041i3 = c6445b.f49964g;
                if (enumC3041i3 == enumC3041i2 || enumC3041i3 == EnumC3041i.ENUM_CLASS || (z12 && (enumC3041i3 == enumC3041i || enumC3041i3 == EnumC3041i.ANNOTATION_CLASS))) {
                    V v11 = c6445b.f49969c;
                    if (v11 instanceof C2655D) {
                        c2655d = (C2655D) v11;
                    } else {
                        c2655d = null;
                    }
                    if (c2655d == null) {
                        return null;
                    }
                    return c2655d.f28290b;
                }
            }
        }
        if (!(d10 instanceof C) || !(v10 instanceof dg.r)) {
            return null;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource", v10);
        dg.r rVar2 = (dg.r) v10;
        AbstractC2653B abstractC2653B = rVar2.f28359d;
        if (abstractC2653B == null) {
            return P4.a.L(xVar, rVar2.b(), gVar);
        }
        return abstractC2653B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
        if (id.AbstractC3557B.K(((dg.t) r5).f28361i, "java/lang/Object") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010d, code lost:
        if (id.AbstractC3557B.K(rg.AbstractC5493d.g(r0), rg.AbstractC5493d.g(r1)) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010f, code lost:
        r7 = ((Pf.c0) r8).getType();
        id.AbstractC3557B.b0("getType(...)", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return L4.a.G0(Bi.c.j1(r7));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static dg.v o(AbstractC1013w abstractC1013w, h0 h0Var) {
        AbstractC0997f abstractC0997f;
        u uVar;
        EnumC5626c enumC5626c;
        AbstractC1013w a5;
        AbstractC3557B.c0("f", abstractC1013w);
        AbstractC0997f abstractC0997f2 = null;
        if (AbstractC3557B.K(((AbstractC1158p) abstractC1013w).getName().b(), "remove") && abstractC1013w.S().size() == 1 && !(AbstractC5493d.k(abstractC1013w).mo20k() instanceof Wf.c) && !Jf.l.z(abstractC1013w)) {
            List S = abstractC1013w.mo24a().S();
            AbstractC3557B.b0("getValueParameters(...)", S);
            Bg.A type = ((c0) ((h0) t.B2(S))).getType();
            AbstractC3557B.b0("getType(...)", type);
            dg.v G02 = L4.a.G0(type);
            if (G02 instanceof u) {
                uVar = (u) G02;
            } else {
                uVar = null;
            }
            if (uVar != null) {
                enumC5626c = uVar.f28362i;
            } else {
                enumC5626c = null;
            }
            if (enumC5626c == EnumC5626c.INT && (a5 = C1446h.a(abstractC1013w)) != null) {
                List S10 = a5.mo24a().S();
                AbstractC3557B.b0("getValueParameters(...)", S10);
                Bg.A type2 = ((c0) ((h0) t.B2(S10))).getType();
                AbstractC3557B.b0("getType(...)", type2);
                dg.v G03 = L4.a.G0(type2);
                AbstractC1003l mo20k = a5.mo20k();
                AbstractC3557B.b0("getContainingDeclaration(...)", mo20k);
                if (AbstractC3557B.K(AbstractC5493d.h(mo20k), p.f9152J.i())) {
                    if (G03 instanceof dg.t) {
                    }
                }
            }
        }
        if (abstractC1013w.S().size() == 1) {
            AbstractC1003l mo20k2 = abstractC1013w.mo20k();
            if (mo20k2 instanceof AbstractC0997f) {
                abstractC0997f = (AbstractC0997f) mo20k2;
            } else {
                abstractC0997f = null;
            }
            if (abstractC0997f != null) {
                List S11 = abstractC1013w.S();
                AbstractC3557B.b0("getValueParameters(...)", S11);
                AbstractC1000i k10 = ((c0) ((h0) t.B2(S11))).getType().y0().k();
                if (k10 instanceof AbstractC0997f) {
                    abstractC0997f2 = (AbstractC0997f) k10;
                }
                if (abstractC0997f2 != null) {
                    if (Jf.l.t(abstractC0997f) != null) {
                    }
                }
            }
        }
        Bg.A type3 = ((c0) h0Var).getType();
        AbstractC3557B.b0("getType(...)", type3);
        return L4.a.G0(type3);
    }

    public static C3270a p(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        e eVar = new e(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(eVar, 10));
        f it = eVar.iterator();
        while (it.f3111h0) {
            it.a();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] J22 = t.J2(arrayList);
        return new C3270a(Arrays.copyOf(J22, J22.length));
    }

    @Override // lg.r
    /* renamed from: a */
    public final q mo76a(int i10) {
        switch (this.f3122Y) {
            case 23:
                switch (i10) {
                    case 0:
                        return EnumC3041i.CLASS;
                    case 1:
                        return EnumC3041i.INTERFACE;
                    case 2:
                        return EnumC3041i.ENUM_CLASS;
                    case 3:
                        return EnumC3041i.ENUM_ENTRY;
                    case 4:
                        return EnumC3041i.ANNOTATION_CLASS;
                    case 5:
                        return EnumC3041i.OBJECT;
                    case 6:
                        return EnumC3041i.COMPANION_OBJECT;
                    default:
                        return null;
                }
            case 24:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return null;
                        }
                        return EnumC3049q.AT_LEAST_ONCE;
                    }
                    return EnumC3049q.EXACTLY_ONCE;
                }
                return EnumC3049q.AT_MOST_ONCE;
            case 25:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                return null;
                            }
                            return EnumC3057z.SYNTHESIZED;
                        }
                        return EnumC3057z.DELEGATION;
                    }
                    return EnumC3057z.FAKE_OVERRIDE;
                }
                return EnumC3057z.DECLARATION;
            case 26:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return null;
                        }
                        return I.LOCAL;
                    }
                    return I.PACKAGE;
                }
                return I.CLASS;
            case 27:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return null;
                        }
                        return fg.V.INV;
                    }
                    return fg.V.OUT;
                }
                return fg.V.IN;
            default:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return null;
                        }
                        return fg.c0.API_VERSION;
                    }
                    return fg.c0.COMPILER_VERSION;
                }
                return fg.c0.LANGUAGE_VERSION;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11) {
        this(0);
        this.f3122Y = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
            case 17:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            default:
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 29:
                this(29);
                return;
        }
    }
}
