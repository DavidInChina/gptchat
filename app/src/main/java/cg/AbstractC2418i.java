package cg;

import Z1.t0;
import bb.B0;
import java.util.AbstractMap;

/* renamed from: cg.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2418i {

    /* renamed from: a  reason: collision with root package name */
    public static final C2412c f26636a = new C2412c(EnumC2415f.f26629Z, false);

    /* renamed from: b  reason: collision with root package name */
    public static final C2412c f26637b;

    /* renamed from: c  reason: collision with root package name */
    public static final C2412c f26638c;

    /* renamed from: d  reason: collision with root package name */
    public static final AbstractMap f26639d;

    static {
        EnumC2415f enumC2415f = EnumC2415f.f26630h0;
        f26637b = new C2412c(enumC2415f, false);
        f26638c = new C2412c(enumC2415f, true);
        dg.q qVar = dg.q.f28355d;
        String concat = "java/lang/".concat("Object");
        String concat2 = "java/util/function/".concat("Predicate");
        String concat3 = "java/util/function/".concat("Function");
        String concat4 = "java/util/function/".concat("Consumer");
        String concat5 = "java/util/function/".concat("BiFunction");
        String concat6 = "java/util/function/".concat("BiConsumer");
        String concat7 = "java/util/function/".concat("UnaryOperator");
        String concat8 = "java/util/".concat("stream/Stream");
        String concat9 = "java/util/".concat("Optional");
        t0 t0Var = new t0(1);
        new U3.e(t0Var, "java/util/".concat("Iterator")).v("forEachRemaining", new B0(concat4, 13));
        new U3.e(t0Var, "java/lang/".concat("Iterable")).v("spliterator", new Xf.f(3, qVar));
        U3.e eVar = new U3.e(t0Var, "java/util/".concat("Collection"));
        eVar.v("removeIf", new B0(concat2, 19));
        eVar.v("stream", new B0(concat8, 20));
        eVar.v("parallelStream", new B0(concat8, 21));
        new U3.e(t0Var, "java/util/".concat("List")).v("replaceAll", new B0(concat7, 22));
        U3.e eVar2 = new U3.e(t0Var, "java/util/".concat("Map"));
        eVar2.v("forEach", new B0(concat6, 23));
        eVar2.v("putIfAbsent", new B0(concat, 24));
        eVar2.v("replace", new B0(concat, 25));
        eVar2.v("replace", new B0(concat, 26));
        eVar2.v("replaceAll", new B0(concat5, 27));
        eVar2.v("compute", new d9.p(1, concat, concat5));
        eVar2.v("computeIfAbsent", new d9.p(2, concat, concat3));
        eVar2.v("computeIfPresent", new d9.p(3, concat, concat5));
        eVar2.v("merge", new d9.p(4, concat, concat5));
        U3.e eVar3 = new U3.e(t0Var, concat9);
        eVar3.v("empty", new B0(concat9, 28));
        eVar3.v("of", new d9.p(5, concat, concat9));
        eVar3.v("ofNullable", new d9.p(6, concat, concat9));
        eVar3.v("get", new B0(concat, 29));
        eVar3.v("ifPresent", new C2417h(concat4, 0));
        new U3.e(t0Var, "java/lang/".concat("ref/Reference")).v("get", new C2417h(concat, 1));
        new U3.e(t0Var, concat2).v("test", new C2417h(concat, 2));
        new U3.e(t0Var, "java/util/function/".concat("BiPredicate")).v("test", new C2417h(concat, 3));
        new U3.e(t0Var, concat4).v("accept", new B0(concat, 14));
        new U3.e(t0Var, concat6).v("accept", new B0(concat, 15));
        new U3.e(t0Var, concat3).v("apply", new B0(concat, 16));
        new U3.e(t0Var, concat5).v("apply", new B0(concat, 17));
        new U3.e(t0Var, "java/util/function/".concat("Supplier")).v("get", new B0(concat, 18));
        f26639d = t0Var.f23111a;
    }
}
