package kg;

import id.AbstractC3557B;
import io.sentry.protocol.DebugImage;
import java.util.LinkedHashMap;
import java.util.Set;
import kf.AbstractC4273I;
import yf.AbstractC6583a;

/* renamed from: kg.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4297i {

    /* renamed from: a  reason: collision with root package name */
    public static final C4291c f37518a;

    /* renamed from: b  reason: collision with root package name */
    public static final C4291c f37519b;

    /* renamed from: c  reason: collision with root package name */
    public static final C4291c f37520c;

    /* renamed from: d  reason: collision with root package name */
    public static final C4291c f37521d;

    /* renamed from: e  reason: collision with root package name */
    public static final C4291c f37522e;

    /* renamed from: f  reason: collision with root package name */
    public static final C4291c f37523f;

    /* renamed from: g  reason: collision with root package name */
    public static final C4291c f37524g;

    /* renamed from: i  reason: collision with root package name */
    public static final C4290b f37526i;

    /* renamed from: j  reason: collision with root package name */
    public static final C4290b f37527j;

    /* renamed from: k  reason: collision with root package name */
    public static final C4290b f37528k;

    /* renamed from: l  reason: collision with root package name */
    public static final C4290b f37529l;

    /* renamed from: o  reason: collision with root package name */
    public static final Set f37532o;

    /* renamed from: p  reason: collision with root package name */
    public static final Set f37533p;

    /* renamed from: q  reason: collision with root package name */
    public static final C4290b f37534q;

    /* renamed from: r  reason: collision with root package name */
    public static final C4290b f37535r;

    /* renamed from: s  reason: collision with root package name */
    public static final C4290b f37536s;

    /* renamed from: t  reason: collision with root package name */
    public static final C4290b f37537t;

    /* renamed from: h  reason: collision with root package name */
    public static final C4290b f37525h = AbstractC4298j.a("Array");

    /* renamed from: m  reason: collision with root package name */
    public static final C4290b f37530m = AbstractC4298j.a("String");

    /* renamed from: n  reason: collision with root package name */
    public static final C4290b f37531n = AbstractC4298j.e("KFunction");

    static {
        C4291c c4291c = new C4291c("kotlin");
        f37518a = c4291c;
        C4291c c10 = c4291c.c(C4294f.e("reflect"));
        f37519b = c10;
        C4291c c11 = c4291c.c(C4294f.e("collections"));
        f37520c = c11;
        C4291c c12 = c4291c.c(C4294f.e("ranges"));
        f37521d = c12;
        c4291c.c(C4294f.e(DebugImage.JVM)).c(C4294f.e("internal"));
        C4291c c13 = c4291c.c(C4294f.e("annotation"));
        f37522e = c13;
        C4291c c14 = c4291c.c(C4294f.e("internal"));
        c14.c(C4294f.e("ir"));
        C4291c c15 = c4291c.c(C4294f.e("coroutines"));
        f37523f = c15;
        f37524g = c4291c.c(C4294f.e("enums"));
        c4291c.c(C4294f.e("contracts"));
        c4291c.c(C4294f.e("concurrent"));
        c4291c.c(C4294f.e("test"));
        R4.b.X1(c4291c, c11, c12, c13, c10, c14, c15);
        AbstractC4298j.a("Nothing");
        AbstractC4298j.a("Unit");
        AbstractC4298j.a("Any");
        AbstractC4298j.a("Enum");
        AbstractC4298j.a("Annotation");
        C4290b a5 = AbstractC4298j.a("Boolean");
        C4290b a10 = AbstractC4298j.a("Char");
        C4290b a11 = AbstractC4298j.a("Byte");
        C4290b a12 = AbstractC4298j.a("Short");
        C4290b a13 = AbstractC4298j.a("Int");
        C4290b a14 = AbstractC4298j.a("Long");
        C4290b a15 = AbstractC4298j.a("Float");
        C4290b a16 = AbstractC4298j.a("Double");
        f37526i = AbstractC4298j.f(a11);
        f37527j = AbstractC4298j.f(a12);
        f37528k = AbstractC4298j.f(a13);
        f37529l = AbstractC4298j.f(a14);
        AbstractC4298j.a("CharSequence");
        AbstractC4298j.a("Throwable");
        AbstractC4298j.a("Cloneable");
        AbstractC4298j.e("KProperty");
        AbstractC4298j.e("KMutableProperty");
        AbstractC4298j.e("KProperty0");
        AbstractC4298j.e("KMutableProperty0");
        AbstractC4298j.e("KProperty1");
        AbstractC4298j.e("KMutableProperty1");
        AbstractC4298j.e("KProperty2");
        AbstractC4298j.e("KMutableProperty2");
        AbstractC4298j.e("KClass");
        AbstractC4298j.e("KCallable");
        AbstractC4298j.e("KType");
        AbstractC4298j.a("Comparable");
        AbstractC4298j.a("Number");
        AbstractC4298j.a("Function");
        Set X12 = R4.b.X1(a5, a10, a11, a12, a13, a14, a15, a16);
        f37532o = X12;
        Set set = X12;
        int n02 = P4.a.n0(AbstractC6583a.H1(set, 10));
        int i10 = 16;
        if (n02 < 16) {
            n02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
        for (Object obj : set) {
            C4294f i11 = ((C4290b) obj).i();
            AbstractC3557B.b0("getShortClassName(...)", i11);
            linkedHashMap.put(obj, AbstractC4298j.d(i11));
        }
        AbstractC4298j.c(linkedHashMap);
        Set X13 = R4.b.X1(f37526i, f37527j, f37528k, f37529l);
        f37533p = X13;
        Set set2 = X13;
        int n03 = P4.a.n0(AbstractC6583a.H1(set2, 10));
        if (n03 >= 16) {
            i10 = n03;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i10);
        for (Object obj2 : set2) {
            C4294f i12 = ((C4290b) obj2).i();
            AbstractC3557B.b0("getShortClassName(...)", i12);
            linkedHashMap2.put(obj2, AbstractC4298j.d(i12));
        }
        AbstractC4298j.c(linkedHashMap2);
        AbstractC4273I.v2(AbstractC4273I.u2(f37532o, f37533p), f37530m);
        C4291c c4291c2 = f37523f;
        C4294f e10 = C4294f.e("Continuation");
        if (c4291c2 != null) {
            C4291c.j(e10);
            AbstractC4298j.b("Iterator");
            AbstractC4298j.b("Iterable");
            AbstractC4298j.b("Collection");
            AbstractC4298j.b("List");
            AbstractC4298j.b("ListIterator");
            AbstractC4298j.b("Set");
            C4290b b10 = AbstractC4298j.b("Map");
            AbstractC4298j.b("MutableIterator");
            AbstractC4298j.b("CharIterator");
            AbstractC4298j.b("MutableIterable");
            AbstractC4298j.b("MutableCollection");
            f37534q = AbstractC4298j.b("MutableList");
            AbstractC4298j.b("MutableListIterator");
            f37535r = AbstractC4298j.b("MutableSet");
            C4290b b11 = AbstractC4298j.b("MutableMap");
            f37536s = b11;
            b10.d(C4294f.e("Entry"));
            b11.d(C4294f.e("MutableEntry"));
            AbstractC4298j.a("Result");
            C4291c c4291c3 = f37521d;
            C4294f e11 = C4294f.e("IntRange");
            if (c4291c3 != null) {
                C4291c.j(e11);
                C4294f e12 = C4294f.e("LongRange");
                if (c4291c3 != null) {
                    C4291c.j(e12);
                    C4294f e13 = C4294f.e("CharRange");
                    if (c4291c3 != null) {
                        C4291c.j(e13);
                        C4291c c4291c4 = f37522e;
                        C4294f e14 = C4294f.e("AnnotationRetention");
                        if (c4291c4 != null) {
                            C4291c.j(e14);
                            C4294f e15 = C4294f.e("AnnotationTarget");
                            if (c4291c4 != null) {
                                C4291c.j(e15);
                                AbstractC4298j.a("DeprecationLevel");
                                f37537t = new C4290b(f37524g, C4294f.e("EnumEntries"));
                                return;
                            }
                            C4290b.a(3);
                            throw null;
                        }
                        C4290b.a(3);
                        throw null;
                    }
                    C4290b.a(3);
                    throw null;
                }
                C4290b.a(3);
                throw null;
            }
            C4290b.a(3);
            throw null;
        }
        C4290b.a(3);
        throw null;
    }
}
