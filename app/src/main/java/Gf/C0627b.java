package Gf;

import Mf.AbstractC1013w;
import Sf.AbstractC1385d;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;

/* renamed from: Gf.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0627b extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C0627b f6384Z = new C0627b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0627b f6385h0 = new C0627b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C0627b f6386i0 = new C0627b(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C0627b f6387j0 = new C0627b(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C0627b f6388k0 = new C0627b(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C0627b f6389l0 = new C0627b(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C0627b f6390m0 = new C0627b(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final C0627b f6391n0 = new C0627b(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final C0627b f6392o0 = new C0627b(8);

    /* renamed from: p0  reason: collision with root package name */
    public static final C0627b f6393p0 = new C0627b(9);

    /* renamed from: q0  reason: collision with root package name */
    public static final C0627b f6394q0 = new C0627b(10);

    /* renamed from: r0  reason: collision with root package name */
    public static final C0627b f6395r0 = new C0627b(11);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6396Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0627b(int i10) {
        super(1);
        this.f6396Y = i10;
    }

    public final CharSequence a(Mf.h0 h0Var) {
        switch (this.f6396Y) {
            case 9:
                mg.m mVar = x0.f6498a;
                Bg.A type = ((Pf.c0) h0Var).getType();
                AbstractC3557B.b0("getType(...)", type);
                return x0.d(type);
            default:
                mg.m mVar2 = x0.f6498a;
                Bg.A type2 = ((Pf.c0) h0Var).getType();
                AbstractC3557B.b0("getType(...)", type2);
                return x0.d(type2);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        kf.v vVar = kf.v.f37483Y;
        int i10 = this.f6396Y;
        switch (i10) {
            case 0:
                Class cls = (Class) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("it", cls);
                        return P4.a.F(AbstractC0629c.a(cls), vVar, false, vVar);
                    default:
                        AbstractC3557B.c0("it", cls);
                        return P4.a.F(AbstractC0629c.a(cls), vVar, true, vVar);
                }
            case 1:
                AbstractC3557B.c0("it", (Class) obj);
                return new ConcurrentHashMap();
            case 2:
                Class cls2 = (Class) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("it", cls2);
                        return P4.a.F(AbstractC0629c.a(cls2), vVar, false, vVar);
                    default:
                        AbstractC3557B.c0("it", cls2);
                        return P4.a.F(AbstractC0629c.a(cls2), vVar, true, vVar);
                }
            case 3:
                Class cls3 = (Class) obj;
                AbstractC3557B.c0("it", cls3);
                return new B(cls3);
            case 4:
                Class cls4 = (Class) obj;
                AbstractC3557B.c0("it", cls4);
                return new W(cls4);
            case 5:
                Class<?> returnType = ((Method) obj).getReturnType();
                AbstractC3557B.b0("getReturnType(...)", returnType);
                return AbstractC1385d.b(returnType);
            case 6:
                Class cls5 = (Class) obj;
                switch (i10) {
                    case 6:
                        AbstractC3557B.Z(cls5);
                        return AbstractC1385d.b(cls5);
                    default:
                        AbstractC3557B.Z(cls5);
                        return AbstractC1385d.b(cls5);
                }
            case 7:
                AbstractC1013w abstractC1013w = (AbstractC1013w) obj;
                AbstractC3557B.c0("descriptor", abstractC1013w);
                return mg.m.f39298e.v(abstractC1013w) + " | " + y0.c(abstractC1013w).F();
            case 8:
                Mf.P p10 = (Mf.P) obj;
                AbstractC3557B.c0("descriptor", p10);
                return mg.m.f39298e.v(p10) + " | " + y0.b(p10).i();
            case 9:
                return a((Mf.h0) obj);
            case 10:
                return a((Mf.h0) obj);
            default:
                Class cls6 = (Class) obj;
                switch (i10) {
                    case 6:
                        AbstractC3557B.Z(cls6);
                        return AbstractC1385d.b(cls6);
                    default:
                        AbstractC3557B.Z(cls6);
                        return AbstractC1385d.b(cls6);
                }
        }
    }
}
