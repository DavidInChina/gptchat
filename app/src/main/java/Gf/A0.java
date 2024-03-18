package Gf;

import Df.AbstractC0404c;
import Mf.AbstractC0993b;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Pf.AbstractC1146d;
import Sf.AbstractC1385d;
import Sf.C1386e;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import dg.AbstractC2653B;
import dg.C2655D;
import fg.C3056y;
import hg.AbstractC3423b;
import hg.AbstractC3428g;
import hg.C3430i;
import hg.C3432k;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.C3959i;
import kf.AbstractC4268D;
import kg.C4290b;
import kg.C4291c;
import kg.C4293e;
import kg.C4294f;
import l8.AbstractC4344b;
import lg.AbstractC4468m;
import ng.AbstractC4842i;
import pg.AbstractC5170g;
import pg.AbstractC5181r;
import pg.C5164a;
import pg.C5165b;
import pg.C5169f;
import pg.C5172i;
import pg.C5173j;
import pg.C5179p;
import pg.C5180q;
import pg.C5182s;
import pg.C5184u;
import pg.C5187x;
import rg.AbstractC5493d;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public abstract class A0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C4291c f6330a = new C4291c("kotlin.jvm.JvmStatic");

    public static final AbstractC0644s a(Object obj) {
        AbstractC0644s abstractC0644s;
        if (obj instanceof AbstractC0644s) {
            abstractC0644s = (AbstractC0644s) obj;
        } else {
            abstractC0644s = null;
        }
        if (abstractC0644s == null) {
            J b10 = b(obj);
            if (b10 == null) {
                return c(obj);
            }
            return b10;
        }
        return abstractC0644s;
    }

    public static final J b(Object obj) {
        J j6;
        kotlin.jvm.internal.j jVar;
        AbstractC0404c abstractC0404c;
        if (obj instanceof J) {
            j6 = (J) obj;
        } else {
            j6 = null;
        }
        if (j6 == null) {
            if (obj instanceof kotlin.jvm.internal.j) {
                jVar = (kotlin.jvm.internal.j) obj;
            } else {
                jVar = null;
            }
            if (jVar != null) {
                abstractC0404c = jVar.compute();
            } else {
                abstractC0404c = null;
            }
            if (!(abstractC0404c instanceof J)) {
                return null;
            }
            return (J) abstractC0404c;
        }
        return j6;
    }

    public static final p0 c(Object obj) {
        p0 p0Var;
        kotlin.jvm.internal.w wVar;
        AbstractC0404c abstractC0404c;
        if (obj instanceof p0) {
            p0Var = (p0) obj;
        } else {
            p0Var = null;
        }
        if (p0Var == null) {
            if (obj instanceof kotlin.jvm.internal.w) {
                wVar = (kotlin.jvm.internal.w) obj;
            } else {
                wVar = null;
            }
            if (wVar != null) {
                abstractC0404c = wVar.compute();
            } else {
                abstractC0404c = null;
            }
            if (!(abstractC0404c instanceof p0)) {
                return null;
            }
            return (p0) abstractC0404c;
        }
        return p0Var;
    }

    public static final ArrayList d(Nf.a aVar) {
        List list;
        Annotation annotation;
        C1386e c1386e;
        AbstractC3557B.c0("<this>", aVar);
        Nf.i<Nf.c> annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (Nf.c cVar : annotations) {
            Mf.V g10 = cVar.g();
            if (g10 instanceof Rf.a) {
                annotation = ((Rf.a) g10).f15497b;
            } else if (g10 instanceof Rf.h) {
                Sf.u uVar = ((Rf.h) g10).f15508b;
                if (uVar instanceof C1386e) {
                    c1386e = (C1386e) uVar;
                } else {
                    c1386e = null;
                }
                if (c1386e != null) {
                    annotation = c1386e.f16607a;
                } else {
                    annotation = null;
                }
            } else {
                annotation = j(cVar);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (AbstractC3557B.K(R4.b.k1(R4.b.d1((Annotation) it.next())).getSimpleName(), "Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Annotation annotation2 = (Annotation) it2.next();
                        Class k12 = R4.b.k1(R4.b.d1(annotation2));
                        if (AbstractC3557B.K(k12.getSimpleName(), "Container") && k12.getAnnotation(kotlin.jvm.internal.E.class) != null) {
                            Object invoke = k12.getDeclaredMethod("value", new Class[0]).invoke(annotation2, new Object[0]);
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>", invoke);
                            list = kf.q.Q2((Annotation[]) invoke);
                        } else {
                            list = AbstractC4344b.F0(annotation2);
                        }
                        kf.s.N1(list, arrayList2);
                    }
                    return arrayList2;
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            if (AbstractC3557B.K(type, Boolean.TYPE)) {
                return Boolean.FALSE;
            }
            if (AbstractC3557B.K(type, Character.TYPE)) {
                return (char) 0;
            }
            if (AbstractC3557B.K(type, Byte.TYPE)) {
                return (byte) 0;
            }
            if (AbstractC3557B.K(type, Short.TYPE)) {
                return (short) 0;
            }
            if (AbstractC3557B.K(type, Integer.TYPE)) {
                return 0;
            }
            if (AbstractC3557B.K(type, Float.TYPE)) {
                return Float.valueOf(0.0f);
            }
            if (AbstractC3557B.K(type, Long.TYPE)) {
                return 0L;
            }
            if (AbstractC3557B.K(type, Double.TYPE)) {
                return Double.valueOf(0.0d);
            }
            if (AbstractC3557B.K(type, Void.TYPE)) {
                throw new IllegalStateException("Parameter with void type is illegal");
            }
            throw new UnsupportedOperationException("Unknown primitive: " + type);
        }
        return null;
    }

    public static final AbstractC0993b f(Class cls, AbstractC4468m abstractC4468m, AbstractC3428g abstractC3428g, C3430i c3430i, AbstractC3423b abstractC3423b, wf.n nVar) {
        List list;
        AbstractC3557B.c0("moduleAnchor", cls);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("typeTable", c3430i);
        AbstractC3557B.c0("metadataVersion", abstractC3423b);
        Rf.g a5 = u0.a(cls);
        if (abstractC4468m instanceof C3056y) {
            list = ((C3056y) abstractC4468m).f30774n0;
        } else if (abstractC4468m instanceof fg.G) {
            list = ((fg.G) abstractC4468m).f30317n0;
        } else {
            throw new IllegalStateException(("Unsupported message: " + abstractC4468m).toString());
        }
        List list2 = list;
        xg.m mVar = a5.f15506a;
        Mf.B b10 = mVar.f50011b;
        C3432k c3432k = C3432k.f32342a;
        AbstractC3557B.Z(list2);
        return (AbstractC0993b) nVar.invoke(new xg.z(new M3.I(mVar, abstractC3428g, b10, c3430i, c3432k, abstractC3423b, null, null, list2)), abstractC4468m);
    }

    public static final AbstractC1146d g(AbstractC0993b abstractC0993b) {
        AbstractC3557B.c0("<this>", abstractC0993b);
        if (abstractC0993b.W() != null) {
            AbstractC1003l mo20k = abstractC0993b.mo20k();
            AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", mo20k);
            return ((AbstractC0997f) mo20k).v0();
        }
        return null;
    }

    public static final boolean h(r0 r0Var) {
        Bg.A a5 = r0Var.f6460Y;
        if (a5 == null || !AbstractC4842i.g(a5)) {
            return false;
        }
        return true;
    }

    public static final Class i(ClassLoader classLoader, C4290b c4290b, int i10) {
        String str = Lf.d.f11067a;
        C4293e i11 = c4290b.b().i();
        AbstractC3557B.b0("toUnsafe(...)", i11);
        C4290b f6 = Lf.d.f(i11);
        if (f6 != null) {
            c4290b = f6;
        }
        String b10 = c4290b.g().b();
        String b11 = c4290b.h().b();
        if (AbstractC3557B.K(b10, "kotlin")) {
            switch (b11.hashCode()) {
                case -901856463:
                    if (b11.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (b11.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (b11.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (b11.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (b11.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (b11.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (b11.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (b11.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (b11.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append("[");
            }
            sb2.append(TokenNames.f24315L);
        }
        if (b10.length() > 0) {
            sb2.append(b10.concat(Separators.DOT));
        }
        sb2.append(Lg.n.z2(b11, '.', '$'));
        if (i10 > 0) {
            sb2.append(Separators.SEMICOLON);
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return R4.b.l2(classLoader, sb3);
    }

    public static final Annotation j(Nf.c cVar) {
        Class cls;
        C3959i c3959i;
        AbstractC0997f d10 = AbstractC5493d.d(cVar);
        if (d10 != null) {
            cls = k(d10);
        } else {
            cls = null;
        }
        if (!(cls instanceof Class)) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : cVar.b().entrySet()) {
            C4294f c4294f = (C4294f) entry.getKey();
            ClassLoader classLoader = cls.getClassLoader();
            AbstractC3557B.b0("getClassLoader(...)", classLoader);
            Object l10 = l((AbstractC5170g) entry.getValue(), classLoader);
            if (l10 != null) {
                c3959i = new C3959i(c4294f.b(), l10);
            } else {
                c3959i = null;
            }
            if (c3959i != null) {
                arrayList.add(c3959i);
            }
        }
        Map k12 = AbstractC4268D.k1(arrayList);
        Set<String> keySet = k12.keySet();
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(keySet, 10));
        for (String str : keySet) {
            arrayList2.add(cls.getDeclaredMethod(str, new Class[0]));
        }
        return (Annotation) R4.b.a0(cls, k12, arrayList2);
    }

    public static final Class k(AbstractC0997f abstractC0997f) {
        AbstractC3557B.c0("<this>", abstractC0997f);
        Mf.V g10 = abstractC0997f.g();
        AbstractC3557B.b0("getSource(...)", g10);
        if (g10 instanceof C2655D) {
            AbstractC2653B abstractC2653B = ((C2655D) g10).f28290b;
            AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass", abstractC2653B);
            return ((Rf.c) abstractC2653B).f15499a;
        } else if (g10 instanceof Rf.h) {
            Sf.u uVar = ((Rf.h) g10).f15508b;
            AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass", uVar);
            return ((Sf.q) uVar).f16621a;
        } else {
            C4290b f6 = AbstractC5493d.f(abstractC0997f);
            if (f6 == null) {
                return null;
            }
            return i(AbstractC1385d.d(abstractC0997f.getClass()), f6, 0);
        }
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v18, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v20, types: [byte[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=char[], code=short[], for r7v19, types: [char[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v22, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v23, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v25, types: [double[]] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(AbstractC5170g abstractC5170g, ClassLoader classLoader) {
        AbstractC0997f abstractC0997f;
        C5187x c5187x;
        Bg.A a5;
        Jf.n nVar;
        int i10;
        short[] sArr;
        AbstractC0997f abstractC0997f2;
        Class i11;
        if (abstractC5170g instanceof C5164a) {
            return j((Nf.c) ((C5164a) abstractC5170g).f43144a);
        }
        int i12 = 0;
        if (abstractC5170g instanceof C5165b) {
            C5165b c5165b = (C5165b) abstractC5170g;
            if (c5165b instanceof C5187x) {
                c5187x = (C5187x) c5165b;
            } else {
                c5187x = null;
            }
            if (c5187x != null && (a5 = c5187x.f43158c) != null) {
                Iterable<AbstractC5170g> iterable = (Iterable) c5165b.f43144a;
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(iterable, 10));
                for (AbstractC5170g abstractC5170g2 : iterable) {
                    arrayList.add(l(abstractC5170g2, classLoader));
                }
                C4294f c4294f = Jf.l.f9117e;
                AbstractC1000i k10 = a5.y0().k();
                if (k10 == null) {
                    nVar = null;
                } else {
                    nVar = Jf.l.r(k10);
                }
                if (nVar == null) {
                    i10 = -1;
                } else {
                    i10 = z0.f6501a[nVar.ordinal()];
                }
                Object obj = c5165b.f43144a;
                switch (i10) {
                    case -1:
                        if (Jf.l.y(a5)) {
                            Bg.A type = ((Bg.d0) kf.t.B2(a5.w0())).getType();
                            AbstractC3557B.b0("getType(...)", type);
                            AbstractC1000i k11 = type.y0().k();
                            if (k11 instanceof AbstractC0997f) {
                                abstractC0997f2 = (AbstractC0997f) k11;
                            } else {
                                abstractC0997f2 = null;
                            }
                            if (abstractC0997f2 != null) {
                                if (Jf.l.D(type, Jf.p.f9173f)) {
                                    int size = ((List) obj).size();
                                    sArr = new String[size];
                                    while (i12 < size) {
                                        Object obj2 = arrayList.get(i12);
                                        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.String", obj2);
                                        sArr[i12] = obj2;
                                        i12++;
                                    }
                                    break;
                                } else if (Jf.l.b(abstractC0997f2, Jf.p.P)) {
                                    int size2 = ((List) obj).size();
                                    sArr = new Class[size2];
                                    while (i12 < size2) {
                                        Object obj3 = arrayList.get(i12);
                                        AbstractC3557B.a0("null cannot be cast to non-null type java.lang.Class<*>", obj3);
                                        sArr[i12] = obj3;
                                        i12++;
                                    }
                                    break;
                                } else {
                                    C4290b f6 = AbstractC5493d.f(abstractC0997f2);
                                    if (f6 != null && (i11 = i(classLoader, f6, 0)) != null) {
                                        Object newInstance = Array.newInstance(i11, ((List) obj).size());
                                        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>", newInstance);
                                        sArr = (Object[]) newInstance;
                                        int size3 = arrayList.size();
                                        while (i12 < size3) {
                                            sArr[i12] = arrayList.get(i12);
                                            i12++;
                                        }
                                        break;
                                    }
                                }
                            } else {
                                throw new IllegalStateException(("Not a class type: " + type).toString());
                            }
                        } else {
                            throw new IllegalStateException(("Not an array type: " + a5).toString());
                        }
                        break;
                    case 0:
                    default:
                        throw new RuntimeException();
                    case 1:
                        int size4 = ((List) obj).size();
                        sArr = new boolean[size4];
                        while (i12 < size4) {
                            Object obj4 = arrayList.get(i12);
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Boolean", obj4);
                            sArr[i12] = ((Boolean) obj4).booleanValue();
                            i12++;
                        }
                        break;
                    case 2:
                        int size5 = ((List) obj).size();
                        sArr = new char[size5];
                        while (i12 < size5) {
                            Object obj5 = arrayList.get(i12);
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Char", obj5);
                            sArr[i12] = ((Character) obj5).charValue();
                            i12++;
                        }
                        break;
                    case 3:
                        int size6 = ((List) obj).size();
                        sArr = new byte[size6];
                        while (i12 < size6) {
                            Object obj6 = arrayList.get(i12);
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Byte", obj6);
                            sArr[i12] = ((Byte) obj6).byteValue();
                            i12++;
                        }
                        break;
                    case 4:
                        int size7 = ((List) obj).size();
                        sArr = new short[size7];
                        while (i12 < size7) {
                            Object obj7 = arrayList.get(i12);
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Short", obj7);
                            sArr[i12] = ((Short) obj7).shortValue();
                            i12++;
                        }
                        break;
                    case 5:
                        int size8 = ((List) obj).size();
                        sArr = new int[size8];
                        while (i12 < size8) {
                            Object obj8 = arrayList.get(i12);
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", obj8);
                            sArr[i12] = ((Integer) obj8).intValue();
                            i12++;
                        }
                        break;
                    case 6:
                        int size9 = ((List) obj).size();
                        sArr = new float[size9];
                        while (i12 < size9) {
                            Object obj9 = arrayList.get(i12);
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Float", obj9);
                            sArr[i12] = ((Float) obj9).floatValue();
                            i12++;
                        }
                        break;
                    case 7:
                        int size10 = ((List) obj).size();
                        sArr = new long[size10];
                        while (i12 < size10) {
                            Object obj10 = arrayList.get(i12);
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Long", obj10);
                            sArr[i12] = ((Long) obj10).longValue();
                            i12++;
                        }
                        break;
                    case 8:
                        int size11 = ((List) obj).size();
                        sArr = new double[size11];
                        while (i12 < size11) {
                            Object obj11 = arrayList.get(i12);
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Double", obj11);
                            sArr[i12] = ((Double) obj11).doubleValue();
                            i12++;
                        }
                        break;
                }
                return sArr;
            }
        } else if (abstractC5170g instanceof C5172i) {
            C3959i c3959i = (C3959i) ((C5172i) abstractC5170g).f43144a;
            C4294f c4294f2 = (C4294f) c3959i.f36156Z;
            Class i13 = i(classLoader, (C4290b) c3959i.f36155Y, 0);
            if (i13 != null) {
                return Enum.valueOf(i13, c4294f2.b());
            }
        } else if (abstractC5170g instanceof C5182s) {
            AbstractC5181r abstractC5181r = (AbstractC5181r) ((C5182s) abstractC5170g).f43144a;
            if (abstractC5181r instanceof C5180q) {
                C5169f c5169f = ((C5180q) abstractC5181r).f43157a;
                return i(classLoader, c5169f.f43142a, c5169f.f43143b);
            } else if (abstractC5181r instanceof C5179p) {
                AbstractC1000i k12 = ((C5179p) abstractC5181r).f43156a.y0().k();
                if (k12 instanceof AbstractC0997f) {
                    abstractC0997f = (AbstractC0997f) k12;
                } else {
                    abstractC0997f = null;
                }
                if (abstractC0997f != null) {
                    return k(abstractC0997f);
                }
            } else {
                throw new RuntimeException();
            }
        } else if (!(abstractC5170g instanceof C5173j) && !(abstractC5170g instanceof C5184u)) {
            return abstractC5170g.b();
        }
        return null;
    }
}
