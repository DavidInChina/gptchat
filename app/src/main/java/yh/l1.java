package yh;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import sh.AbstractC5632d;
import sh.AbstractC5641m;
import th.AbstractC5808p;
import wh.AbstractC6242g;
import wh.AbstractC6256u;

/* loaded from: classes2.dex */
public interface l1 extends AbstractC6632q, AbstractC5632d, AbstractC5641m {

    /* renamed from: b0  reason: collision with root package name */
    public static final l1 f51039b0 = n1.a(Object.class);

    /* renamed from: c0  reason: collision with root package name */
    public static final l1 f51040c0 = n1.a(String.class);

    /* renamed from: d0  reason: collision with root package name */
    public static final l1 f51041d0 = n1.a(Class.class);

    /* renamed from: e0  reason: collision with root package name */
    public static final l1 f51042e0 = n1.a(Throwable.class);

    /* renamed from: f0  reason: collision with root package name */
    public static final l1 f51043f0 = n1.a(Void.TYPE);

    /* renamed from: g0  reason: collision with root package name */
    public static final z1 f51044g0 = new z1(Cloneable.class, Serializable.class);

    /* loaded from: classes.dex */
    public interface a extends AbstractC6632q, AbstractC5808p {

        /* renamed from: N  reason: collision with root package name */
        public static final a f51045N = C6623l0.a(Object.class);
        public static final a P = C6623l0.a(Class.class);

        /* renamed from: W  reason: collision with root package name */
        public static final a f51046W = C6623l0.a(Void.TYPE);

        /* renamed from: a0  reason: collision with root package name */
        public static final a f51047a0 = C6623l0.a(Annotation.class);

        String A0();

        AbstractC5641m B();

        a J0(a aVar);

        @Override // yh.AbstractC6632q
        /* renamed from: g */
        a mo119g();

        G1 getLowerBounds();

        a getOwnerType();

        G1 getUpperBounds();

        @Override // yh.AbstractC6632q
        AbstractC6256u i();

        Object k(k1 k1Var);

        a p0();

        G1 y0();
    }

    AbstractC6624m A();

    l1 C0();

    H1 F();

    boolean K();

    boolean K0(l1 l1Var);

    boolean N(l1 l1Var);

    String R0();

    int S();

    vh.l U0();

    l1 W();

    /* renamed from: a */
    l1 mo118a();

    H1 b1();

    boolean c0();

    boolean c1();

    H1 d0();

    int d1(boolean z10);

    boolean f0(l1 l1Var);

    @Override // yh.AbstractC6632q
    /* renamed from: g */
    l1 mo119g();

    l1 g0();

    boolean h0(Class cls);

    @Override // yh.AbstractC6632q
    AbstractC6256u i();

    boolean j0(l1 l1Var);

    boolean m();

    String o();

    AbstractC6242g s0();

    l1 v();

    boolean x();

    boolean x0();

    AbstractC6597c z();
}
