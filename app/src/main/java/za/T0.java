package Za;

import cb.C2334C;
import cb.C2337F;
import cb.C2350T;
import cb.C2353W;
import cb.C2362c0;
import java.util.ArrayList;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;
import pf.AbstractC5163j;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class T0 {

    /* renamed from: a  reason: collision with root package name */
    public final Yc.a f23519a;

    /* renamed from: b  reason: collision with root package name */
    public final Vc.y f23520b;

    public T0(Yc.a aVar, Vc.y yVar) {
        this.f23519a = aVar;
        this.f23520b = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, AbstractC4825e abstractC4825e) {
        v0 v0Var;
        int i10;
        Vc.x xVar;
        if (abstractC4825e instanceof v0) {
            v0Var = (v0) abstractC4825e;
            int i11 = v0Var.f23622h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                v0Var.f23622h0 = i11 - Integer.MIN_VALUE;
                Object obj = v0Var.f23620Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = v0Var.f23622h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    w0 w0Var = new w0(str, null);
                    Df.w a5 = kotlin.jvm.internal.C.a(Z.class);
                    Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(Z.class), a5);
                    v0Var.f23622h0 = 1;
                    Yc.a aVar = this.f23519a;
                    aVar.getClass();
                    obj = x8.W.S(aVar, n22, w0Var, v0Var);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (Vc.x) obj;
                if (!(xVar instanceof Vc.w)) {
                    return new Vc.w(((Z) ((Vc.w) xVar).f18565a).a());
                }
                if ((xVar instanceof Vc.q) || (xVar instanceof Vc.r)) {
                    return xVar;
                }
                throw new RuntimeException();
            }
        }
        v0Var = new v0(this, abstractC4825e);
        Object obj2 = v0Var.f23620Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = v0Var.f23622h0;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, AbstractC4825e abstractC4825e) {
        x0 x0Var;
        int i10;
        Vc.x xVar;
        ArrayList arrayList;
        if (abstractC4825e instanceof x0) {
            x0Var = (x0) abstractC4825e;
            int i11 = x0Var.f23630h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                x0Var.f23630h0 = i11 - Integer.MIN_VALUE;
                Object obj = x0Var.f23628Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = x0Var.f23630h0;
                List list = null;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    y0 y0Var = new y0(str, null);
                    Df.w a5 = kotlin.jvm.internal.C.a(r.class);
                    Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(r.class), a5);
                    x0Var.f23630h0 = 1;
                    Yc.a aVar = this.f23519a;
                    aVar.getClass();
                    obj = x8.W.S(aVar, n22, y0Var, x0Var);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (Vc.x) obj;
                if (!(xVar instanceof Vc.w)) {
                    r rVar = (r) ((Vc.w) xVar).f18565a;
                    rVar.getClass();
                    C1849h c1849h = C1863o.Companion;
                    C2334C a10 = rVar.f23601a.a(kf.v.f37483Y, null);
                    List<C1846f0> list2 = rVar.f23602b;
                    ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list2, 10));
                    for (C1846f0 c1846f0 : list2) {
                        arrayList2.add(A7.b.V1(c1846f0.f23554b));
                    }
                    List<C> list3 = rVar.f23603c;
                    if (list3 != null) {
                        arrayList = new ArrayList(AbstractC6583a.H1(list3, 10));
                        for (C c10 : list3) {
                            arrayList.add(c10.a());
                        }
                    } else {
                        arrayList = null;
                    }
                    G g10 = rVar.f23604d;
                    if (g10 != null) {
                        list = g10.f23461d;
                    }
                    return new Vc.w(new C2337F(a10, arrayList2, arrayList, list));
                } else if ((xVar instanceof Vc.q) || (xVar instanceof Vc.r)) {
                    return xVar;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        x0Var = new x0(this, abstractC4825e);
        Object obj2 = x0Var.f23628Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = x0Var.f23630h0;
        List list4 = null;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, AbstractC4825e abstractC4825e) {
        A0 a02;
        int i10;
        Vc.x xVar;
        if (abstractC4825e instanceof A0) {
            a02 = (A0) abstractC4825e;
            int i11 = a02.f23433h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a02.f23433h0 = i11 - Integer.MIN_VALUE;
                Object obj = a02.f23431Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = a02.f23433h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    B0 b02 = new B0(this, str, str2, null);
                    Df.w a5 = kotlin.jvm.internal.C.a(P.class);
                    Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(P.class), a5);
                    a02.f23433h0 = 1;
                    Yc.a aVar = this.f23519a;
                    aVar.getClass();
                    obj = x8.W.S(aVar, n22, b02, a02);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (Vc.x) obj;
                if (!(xVar instanceof Vc.w)) {
                    return new Vc.w(((P) ((Vc.w) xVar).f18565a).a());
                }
                if ((xVar instanceof Vc.q) || (xVar instanceof Vc.r)) {
                    return xVar;
                }
                throw new RuntimeException();
            }
        }
        a02 = new A0(this, abstractC4825e);
        Object obj2 = a02.f23431Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = a02.f23433h0;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC4825e abstractC4825e) {
        C0 c02;
        int i10;
        Vc.x xVar;
        if (abstractC4825e instanceof C0) {
            c02 = (C0) abstractC4825e;
            int i11 = c02.f23444h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c02.f23444h0 = i11 - Integer.MIN_VALUE;
                Object obj = c02.f23442Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c02.f23444h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    E0 e02 = new E0(this, null);
                    Df.w a5 = kotlin.jvm.internal.C.a(J.class);
                    Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(J.class), a5);
                    c02.f23444h0 = 1;
                    Yc.a aVar = this.f23519a;
                    aVar.getClass();
                    obj = x8.W.S(aVar, n22, e02, c02);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (Vc.x) obj;
                if (!(xVar instanceof Vc.w)) {
                    List<P> list = ((J) ((Vc.w) xVar).f18565a).f23474a;
                    ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                    for (P p10 : list) {
                        arrayList.add(p10.a());
                    }
                    return new Vc.w(arrayList);
                } else if ((xVar instanceof Vc.q) || (xVar instanceof Vc.r)) {
                    return xVar;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        c02 = new C0(this, abstractC4825e);
        Object obj2 = c02.f23442Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c02.f23444h0;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Type inference failed for: r9v12, types: [pf.j, wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(AbstractC4825e abstractC4825e) {
        F0 f02;
        int i10;
        Vc.x xVar;
        if (abstractC4825e instanceof F0) {
            f02 = (F0) abstractC4825e;
            int i11 = f02.f23456h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f02.f23456h0 = i11 - Integer.MIN_VALUE;
                Object obj = f02.f23454Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = f02.f23456h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    ?? abstractC5163j = new AbstractC5163j(2, null);
                    Df.w a5 = kotlin.jvm.internal.C.a(C1875u0.class);
                    Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(C1875u0.class), a5);
                    f02.f23456h0 = 1;
                    Yc.a aVar = this.f23519a;
                    aVar.getClass();
                    obj = x8.W.S(aVar, n22, abstractC5163j, f02);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (Vc.x) obj;
                if (!(xVar instanceof Vc.w)) {
                    C1875u0 c1875u0 = (C1875u0) ((Vc.w) xVar).f18565a;
                    c1875u0.getClass();
                    List<M> list = c1875u0.f23618a;
                    ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                    for (M m10 : list) {
                        arrayList.add(m10.f23484a.a());
                    }
                    return new Vc.w(new C2362c0(arrayList, 2));
                } else if ((xVar instanceof Vc.q) || (xVar instanceof Vc.r)) {
                    return xVar;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        f02 = new F0(this, abstractC4825e);
        Object obj2 = f02.f23454Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = f02.f23456h0;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Type inference failed for: r8v11, types: [pf.j, wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(AbstractC4825e abstractC4825e) {
        H0 h02;
        int i10;
        Vc.x xVar;
        if (abstractC4825e instanceof H0) {
            h02 = (H0) abstractC4825e;
            int i11 = h02.f23468h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                h02.f23468h0 = i11 - Integer.MIN_VALUE;
                Object obj = h02.f23466Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = h02.f23468h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    ?? abstractC5163j = new AbstractC5163j(2, null);
                    Df.w a5 = kotlin.jvm.internal.C.a(C1840c0.class);
                    Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(C1840c0.class), a5);
                    h02.f23468h0 = 1;
                    Yc.a aVar = this.f23519a;
                    aVar.getClass();
                    obj = x8.W.S(aVar, n22, abstractC5163j, h02);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (Vc.x) obj;
                if (!(xVar instanceof Vc.w)) {
                    List<Z> list = ((C1840c0) ((Vc.w) xVar).f18565a).f23545a;
                    ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                    for (Z z10 : list) {
                        arrayList.add(z10.a());
                    }
                    return new Vc.w(arrayList);
                } else if ((xVar instanceof Vc.q) || (xVar instanceof Vc.r)) {
                    return xVar;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        h02 = new H0(this, abstractC4825e);
        Object obj2 = h02.f23466Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = h02.f23468h0;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Type inference failed for: r9v15, types: [pf.j, wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(AbstractC4825e abstractC4825e) {
        K0 k02;
        int i10;
        Vc.x xVar;
        C2350T c2350t;
        if (abstractC4825e instanceof K0) {
            k02 = (K0) abstractC4825e;
            int i11 = k02.f23481h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                k02.f23481h0 = i11 - Integer.MIN_VALUE;
                Object obj = k02.f23479Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = k02.f23481h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    ?? abstractC5163j = new AbstractC5163j(2, null);
                    Df.w a5 = kotlin.jvm.internal.C.a(J.class);
                    Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(J.class), a5);
                    k02.f23481h0 = 1;
                    Yc.a aVar = this.f23519a;
                    aVar.getClass();
                    obj = x8.W.S(aVar, n22, abstractC5163j, k02);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (Vc.x) obj;
                if (!(xVar instanceof Vc.w)) {
                    P p10 = (P) kf.t.h2(((J) ((Vc.w) xVar).f18565a).f23474a);
                    if (p10 != null) {
                        c2350t = p10.a();
                    } else {
                        c2350t = new C2350T(new C2353W(), kf.v.f37483Y, null);
                    }
                    return new Vc.w(c2350t);
                } else if ((xVar instanceof Vc.q) || (xVar instanceof Vc.r)) {
                    return xVar;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        k02 = new K0(this, abstractC4825e);
        Object obj2 = k02.f23479Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = k02.f23481h0;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, String str2, AbstractC4825e abstractC4825e) {
        O0 o02;
        int i10;
        Vc.x xVar;
        if (abstractC4825e instanceof O0) {
            o02 = (O0) abstractC4825e;
            int i11 = o02.f23495h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                o02.f23495h0 = i11 - Integer.MIN_VALUE;
                Object obj = o02.f23493Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = o02.f23495h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    P0 p02 = new P0(str, str2, null);
                    Df.w a5 = kotlin.jvm.internal.C.a(C1840c0.class);
                    Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(C1840c0.class), a5);
                    o02.f23495h0 = 1;
                    Yc.a aVar = this.f23519a;
                    aVar.getClass();
                    obj = x8.W.S(aVar, n22, p02, o02);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (Vc.x) obj;
                if (!(xVar instanceof Vc.w)) {
                    C1840c0 c1840c0 = (C1840c0) ((Vc.w) xVar).f18565a;
                    C2353W c2353w = new C2353W();
                    List<Z> list = c1840c0.f23545a;
                    ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                    for (Z z10 : list) {
                        arrayList.add(z10.a());
                    }
                    return new Vc.w(new C2350T(c2353w, arrayList, c1840c0.f23546b));
                } else if ((xVar instanceof Vc.q) || (xVar instanceof Vc.r)) {
                    return xVar;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        o02 = new O0(this, abstractC4825e);
        Object obj2 = o02.f23493Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = o02.f23495h0;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    public final Object i(String str, AbstractC5156c abstractC5156c, boolean z10) {
        Wa.z zVar;
        if (z10) {
            zVar = Wa.z.f20879Z;
        } else {
            zVar = Wa.z.f20880h0;
        }
        S0 s02 = new S0(new Wa.w(zVar), str, null);
        Df.w a5 = kotlin.jvm.internal.C.a(jf.y.class);
        Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(jf.y.class), a5);
        Yc.a aVar = this.f23519a;
        aVar.getClass();
        return x8.W.S(aVar, n22, s02, abstractC5156c);
    }
}
