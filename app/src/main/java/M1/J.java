package M1;

import G0.C0571a;
import Ng.AbstractC1073l0;
import Ng.C1071k0;
import Ng.C1084s;
import Qg.AbstractC1206i;
import Qg.C1209l;
import Qg.F0;
import Qg.s0;
import com.google.android.gms.internal.play_billing.N;
import h.C3281g;
import id.AbstractC3557B;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import jf.C3961k;
import jf.C3963m;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class J implements AbstractC0928i {

    /* renamed from: j  reason: collision with root package name */
    public static final LinkedHashSet f11415j = new LinkedHashSet();

    /* renamed from: k  reason: collision with root package name */
    public static final Object f11416k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6216a f11417a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0931l f11418b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC0921b f11419c;

    /* renamed from: d  reason: collision with root package name */
    public final C1209l f11420d = new C1209l(new x(this, null));

    /* renamed from: e  reason: collision with root package name */
    public final String f11421e = ".tmp";

    /* renamed from: f  reason: collision with root package name */
    public final C3963m f11422f = R4.b.D1(new X0.b(2, this));

    /* renamed from: g  reason: collision with root package name */
    public final F0 f11423g = s0.c(L.f11426a);

    /* renamed from: h  reason: collision with root package name */
    public List f11424h;

    /* renamed from: i  reason: collision with root package name */
    public final U3.n f11425i;

    /* JADX WARN: Type inference failed for: r2v8, types: [U3.n, java.lang.Object] */
    public J(AbstractC6216a abstractC6216a, AbstractC0931l abstractC0931l, List list, R4.a aVar, Ng.F f6) {
        AbstractC3557B.c0("scope", f6);
        this.f11417a = abstractC6216a;
        this.f11418b = abstractC0931l;
        this.f11419c = aVar;
        this.f11424h = kf.t.K2(list);
        C0571a c0571a = new C0571a(9, this);
        r rVar = r.f11456Y;
        s sVar = new s(this, null);
        ?? obj = new Object();
        obj.f17426Y = f6;
        obj.f17427Z = sVar;
        obj.f17428h0 = Bi.c.d(Integer.MAX_VALUE, null, 6);
        obj.f17429i0 = new AtomicInteger(0);
        AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) ((Ng.F) obj.f17426Y).i().get(C1071k0.f12951Y);
        if (abstractC1073l0 != null) {
            abstractC1073l0.V(new C3281g(c0571a, obj, rVar, 24));
        }
        this.f11425i = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(J j6, o oVar, AbstractC4825e abstractC4825e) {
        y yVar;
        EnumC5000a enumC5000a;
        int i10;
        Ng.r rVar;
        Ng.r rVar2;
        Ng.r rVar3;
        Throwable a5;
        Object j10;
        K k10;
        j6.getClass();
        if (abstractC4825e instanceof y) {
            yVar = (y) abstractC4825e;
            int i11 = yVar.f11477k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                yVar.f11477k0 = i11 - Integer.MIN_VALUE;
                Object obj = yVar.f11475i0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = yVar.f11477k0;
                if (i10 == 0) {
                    try {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    rVar = (Ng.r) yVar.f11472Y;
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                Ng.r rVar4 = yVar.f11474h0;
                                J j11 = yVar.f11473Z;
                                o oVar2 = (o) yVar.f11472Y;
                                N.B0(obj);
                                rVar2 = rVar4;
                                j6 = j11;
                                oVar = oVar2;
                            }
                        } else {
                            rVar = (Ng.r) yVar.f11472Y;
                        }
                        N.B0(obj);
                        rVar3 = rVar;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = N.w(th);
                        rVar3 = j6;
                        a5 = C3961k.a(obj);
                        C1084s c1084s = (C1084s) rVar3;
                        if (a5 != null) {
                        }
                        return jf.y.f36177a;
                    }
                    a5 = C3961k.a(obj);
                    C1084s c1084s2 = (C1084s) rVar3;
                    if (a5 != null) {
                        c1084s2.b0(obj);
                    } else {
                        c1084s2.q0(a5);
                    }
                    return jf.y.f36177a;
                }
                N.B0(obj);
                rVar2 = oVar.f11452b;
                try {
                    k10 = (K) j6.f11423g.getValue();
                } catch (Throwable th3) {
                    th = th3;
                    j6 = rVar2;
                    obj = N.w(th);
                    rVar3 = j6;
                    a5 = C3961k.a(obj);
                    C1084s c1084s22 = (C1084s) rVar3;
                    if (a5 != null) {
                    }
                    return jf.y.f36177a;
                }
                if (k10 instanceof C0922c) {
                    wf.n nVar = oVar.f11451a;
                    AbstractC4831k abstractC4831k = oVar.f11454d;
                    yVar.f11472Y = rVar2;
                    yVar.f11477k0 = 1;
                    j10 = j6.j(yVar, abstractC4831k, nVar);
                    if (j10 == enumC5000a) {
                        return enumC5000a;
                    }
                    Ng.r rVar5 = rVar2;
                    obj = j10;
                    rVar3 = rVar5;
                    a5 = C3961k.a(obj);
                    C1084s c1084s222 = (C1084s) rVar3;
                    if (a5 != null) {
                    }
                    return jf.y.f36177a;
                }
                if (!(k10 instanceof C0930k) && !(k10 instanceof L)) {
                    if (k10 instanceof C0929j) {
                        throw ((C0929j) k10).f11445a;
                    }
                    throw new RuntimeException();
                }
                if (k10 == oVar.f11453c) {
                    yVar.f11472Y = oVar;
                    yVar.f11473Z = j6;
                    yVar.f11474h0 = rVar2;
                    yVar.f11477k0 = 2;
                    if (j6.f(yVar) == enumC5000a) {
                        return enumC5000a;
                    }
                } else {
                    throw ((C0930k) k10).f11446a;
                }
                wf.n nVar2 = oVar.f11451a;
                AbstractC4831k abstractC4831k2 = oVar.f11454d;
                yVar.f11472Y = rVar2;
                yVar.f11473Z = null;
                yVar.f11474h0 = null;
                yVar.f11477k0 = 3;
                j10 = j6.j(yVar, abstractC4831k2, nVar2);
                if (j10 == enumC5000a) {
                    return enumC5000a;
                }
                Ng.r rVar52 = rVar2;
                obj = j10;
                rVar3 = rVar52;
                a5 = C3961k.a(obj);
                C1084s c1084s2222 = (C1084s) rVar3;
                if (a5 != null) {
                }
                return jf.y.f36177a;
            }
        }
        yVar = new y(j6, abstractC4825e);
        Object obj2 = yVar.f11475i0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = yVar.f11477k0;
        if (i10 == 0) {
        }
        wf.n nVar22 = oVar.f11451a;
        AbstractC4831k abstractC4831k22 = oVar.f11454d;
        yVar.f11472Y = rVar2;
        yVar.f11473Z = null;
        yVar.f11474h0 = null;
        yVar.f11477k0 = 3;
        j10 = j6.j(yVar, abstractC4831k22, nVar22);
        if (j10 == enumC5000a) {
        }
        Ng.r rVar522 = rVar2;
        obj2 = j10;
        rVar3 = rVar522;
        a5 = C3961k.a(obj2);
        C1084s c1084s22222 = (C1084s) rVar3;
        if (a5 != null) {
        }
        return jf.y.f36177a;
    }

    @Override // M1.AbstractC0928i
    public final AbstractC1206i a() {
        return this.f11420d;
    }

    @Override // M1.AbstractC0928i
    public final Object b(wf.n nVar, AbstractC4825e abstractC4825e) {
        C1084s j6 = A7.b.j();
        this.f11425i.l(new o(nVar, j6, (K) this.f11423g.getValue(), abstractC4825e.getContext()));
        Object z10 = j6.z(abstractC4825e);
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        return z10;
    }

    public final File d() {
        return (File) this.f11422f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object, kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(AbstractC4825e abstractC4825e) {
        z zVar;
        int i10;
        J j6;
        Wg.a aVar;
        kotlin.jvm.internal.B b10;
        kotlin.jvm.internal.x xVar;
        B b11;
        Iterator it;
        z zVar2;
        kotlin.jvm.internal.x xVar2;
        kotlin.jvm.internal.B b12;
        Wg.a aVar2;
        J j10;
        kotlin.jvm.internal.B b13;
        Wg.a aVar3;
        Object obj;
        int i11;
        Wg.d dVar;
        J j11;
        kotlin.jvm.internal.B b14;
        List list;
        if (abstractC4825e instanceof z) {
            zVar = (z) abstractC4825e;
            int i12 = zVar.f11486n0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                zVar.f11486n0 = i12 - Integer.MIN_VALUE;
                Object obj2 = zVar.f11484l0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = zVar.f11486n0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                aVar3 = (Wg.a) zVar.f11481i0;
                                xVar2 = (kotlin.jvm.internal.x) zVar.f11480h0;
                                b13 = (kotlin.jvm.internal.B) zVar.f11479Z;
                                j10 = zVar.f11478Y;
                                N.B0(obj2);
                                try {
                                    xVar2.f37645Y = true;
                                    ((Wg.d) aVar3).g(null);
                                    F0 f02 = j10.f11423g;
                                    obj = b13.f37622Y;
                                    if (obj == null) {
                                        i11 = obj.hashCode();
                                    } else {
                                        i11 = 0;
                                    }
                                    f02.setValue(new C0922c(i11, obj));
                                    return jf.y.f36177a;
                                } catch (Throwable th2) {
                                    ((Wg.d) aVar3).g(null);
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = zVar.f11483k0;
                        b11 = zVar.f11482j0;
                        xVar = (kotlin.jvm.internal.x) zVar.f11481i0;
                        b10 = (kotlin.jvm.internal.B) zVar.f11480h0;
                        aVar = (Wg.a) zVar.f11479Z;
                        j6 = zVar.f11478Y;
                        N.B0(obj2);
                        while (it.hasNext()) {
                            zVar.f11478Y = j6;
                            zVar.f11479Z = aVar;
                            zVar.f11480h0 = b10;
                            zVar.f11481i0 = xVar;
                            zVar.f11482j0 = b11;
                            zVar.f11483k0 = it;
                            zVar.f11486n0 = 2;
                            if (((wf.n) it.next()).invoke(b11, zVar) == enumC5000a) {
                                return enumC5000a;
                            }
                        }
                        zVar2 = zVar;
                        xVar2 = xVar;
                        b12 = b10;
                        aVar2 = aVar;
                        j10 = j6;
                        j10.f11424h = null;
                        zVar2.f11478Y = j10;
                        zVar2.f11479Z = b12;
                        zVar2.f11480h0 = xVar2;
                        zVar2.f11481i0 = aVar2;
                        zVar2.f11482j0 = null;
                        zVar2.f11483k0 = null;
                        zVar2.f11486n0 = 3;
                        dVar = (Wg.d) aVar2;
                        if (dVar.e(null, zVar2) == enumC5000a) {
                            return enumC5000a;
                        }
                        aVar3 = dVar;
                        b13 = b12;
                        xVar2.f37645Y = true;
                        ((Wg.d) aVar3).g(null);
                        F0 f022 = j10.f11423g;
                        obj = b13.f37622Y;
                        if (obj == null) {
                        }
                        f022.setValue(new C0922c(i11, obj));
                        return jf.y.f36177a;
                    }
                    b12 = (kotlin.jvm.internal.B) zVar.f11480h0;
                    aVar2 = (Wg.a) zVar.f11479Z;
                    j11 = zVar.f11478Y;
                    N.B0(obj2);
                    b14 = (kotlin.jvm.internal.B) zVar.f11481i0;
                } else {
                    N.B0(obj2);
                    F0 f03 = this.f11423g;
                    if (!AbstractC3557B.K(f03.getValue(), L.f11426a) && !(f03.getValue() instanceof C0930k)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    aVar2 = Wg.e.a();
                    ?? obj3 = new Object();
                    zVar.f11478Y = this;
                    zVar.f11479Z = aVar2;
                    zVar.f11480h0 = obj3;
                    zVar.f11481i0 = obj3;
                    zVar.f11486n0 = 1;
                    obj2 = i(zVar);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    j11 = this;
                    b12 = obj3;
                    b14 = obj3;
                }
                b14.f37622Y = obj2;
                ?? obj4 = new Object();
                B b15 = new B(aVar2, obj4, b12, j11);
                list = j11.f11424h;
                if (list != null) {
                    xVar2 = obj4;
                    zVar2 = zVar;
                    j10 = j11;
                    j10.f11424h = null;
                    zVar2.f11478Y = j10;
                    zVar2.f11479Z = b12;
                    zVar2.f11480h0 = xVar2;
                    zVar2.f11481i0 = aVar2;
                    zVar2.f11482j0 = null;
                    zVar2.f11483k0 = null;
                    zVar2.f11486n0 = 3;
                    dVar = (Wg.d) aVar2;
                    if (dVar.e(null, zVar2) == enumC5000a) {
                    }
                } else {
                    j6 = j11;
                    b10 = b12;
                    b11 = b15;
                    it = list.iterator();
                    aVar = aVar2;
                    xVar = obj4;
                    while (it.hasNext()) {
                    }
                    zVar2 = zVar;
                    xVar2 = xVar;
                    b12 = b10;
                    aVar2 = aVar;
                    j10 = j6;
                    j10.f11424h = null;
                    zVar2.f11478Y = j10;
                    zVar2.f11479Z = b12;
                    zVar2.f11480h0 = xVar2;
                    zVar2.f11481i0 = aVar2;
                    zVar2.f11482j0 = null;
                    zVar2.f11483k0 = null;
                    zVar2.f11486n0 = 3;
                    dVar = (Wg.d) aVar2;
                    if (dVar.e(null, zVar2) == enumC5000a) {
                    }
                }
            }
        }
        zVar = new z(this, abstractC4825e);
        Object obj22 = zVar.f11484l0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = zVar.f11486n0;
        if (i10 == 0) {
        }
        b14.f37622Y = obj22;
        ?? obj42 = new Object();
        B b152 = new B(aVar2, obj42, b12, j11);
        list = j11.f11424h;
        if (list != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(AbstractC4825e abstractC4825e) {
        C c10;
        int i10;
        Throwable th2;
        J j6;
        if (abstractC4825e instanceof C) {
            c10 = (C) abstractC4825e;
            int i11 = c10.f11384i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c10.f11384i0 = i11 - Integer.MIN_VALUE;
                Object obj = c10.f11382Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c10.f11384i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        j6 = c10.f11381Y;
                        try {
                            N.B0(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            j6.f11423g.setValue(new C0930k(th2));
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    try {
                        c10.f11381Y = this;
                        c10.f11384i0 = 1;
                        if (e(c10) == enumC5000a) {
                            return enumC5000a;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        j6 = this;
                        j6.f11423g.setValue(new C0930k(th2));
                        throw th2;
                    }
                }
                return jf.y.f36177a;
            }
        }
        c10 = new C(this, abstractC4825e);
        Object obj2 = c10.f11382Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c10.f11384i0;
        if (i10 == 0) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(AbstractC4825e abstractC4825e) {
        D d10;
        int i10;
        Throwable th2;
        J j6;
        if (abstractC4825e instanceof D) {
            d10 = (D) abstractC4825e;
            int i11 = d10.f11388i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                d10.f11388i0 = i11 - Integer.MIN_VALUE;
                Object obj = d10.f11386Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = d10.f11388i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        j6 = d10.f11385Y;
                        try {
                            N.B0(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            j6.f11423g.setValue(new C0930k(th2));
                            return jf.y.f36177a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    try {
                        d10.f11385Y = this;
                        d10.f11388i0 = 1;
                        if (e(d10) == enumC5000a) {
                            return enumC5000a;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        j6 = this;
                        j6.f11423g.setValue(new C0930k(th2));
                        return jf.y.f36177a;
                    }
                }
                return jf.y.f36177a;
            }
        }
        d10 = new D(this, abstractC4825e);
        Object obj2 = d10.f11386Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = d10.f11388i0;
        if (i10 == 0) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Type inference failed for: r0v1, types: [M1.E] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(AbstractC4825e abstractC4825e) {
        J j6;
        int i10;
        FileNotFoundException e10;
        Throwable th2;
        io.sentry.instrumentation.file.d dVar;
        try {
            if (abstractC4825e instanceof E) {
                E e11 = (E) abstractC4825e;
                int i11 = e11.f11393j0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    e11.f11393j0 = i11 - Integer.MIN_VALUE;
                    j6 = e11;
                    Object obj = j6.f11391h0;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = j6.f11393j0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            dVar = j6.f11390Z;
                            J j10 = j6.f11389Y;
                            try {
                                N.B0(obj);
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        try {
                            File d10 = d();
                            io.sentry.instrumentation.file.d t10 = N.t(new FileInputStream(d10), d10);
                            try {
                                AbstractC0931l abstractC0931l = this.f11418b;
                                j6.f11389Y = this;
                                j6.f11390Z = t10;
                                j6.f11393j0 = 1;
                                Object g10 = abstractC0931l.g(t10);
                                if (g10 == enumC5000a) {
                                    return enumC5000a;
                                }
                                dVar = t10;
                                obj = g10;
                            } catch (Throwable th4) {
                                th2 = th4;
                                throw th2;
                            }
                        } catch (FileNotFoundException e12) {
                            e10 = e12;
                            j6 = this;
                            if (!j6.d().exists()) {
                                return j6.f11418b.f();
                            }
                            throw e10;
                        }
                    }
                    Ad.l.S(dVar, null);
                    return obj;
                }
            }
            if (i10 == 0) {
            }
            Ad.l.S(dVar, null);
            return obj;
        } catch (FileNotFoundException e13) {
            e10 = e13;
        }
        j6 = new E(this, abstractC4825e);
        Object obj2 = j6.f11391h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = j6.f11393j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(AbstractC4825e abstractC4825e) {
        F f6;
        int i10;
        C0920a e10;
        J j6;
        IOException e11;
        C0920a c0920a;
        if (abstractC4825e instanceof F) {
            f6 = (F) abstractC4825e;
            int i11 = f6.f11398j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f6.f11398j0 = i11 - Integer.MIN_VALUE;
                Object obj = f6.f11396h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = f6.f11398j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                Object obj2 = f6.f11395Z;
                                c0920a = (C0920a) f6.f11394Y;
                                try {
                                    N.B0(obj);
                                    return obj2;
                                } catch (IOException e12) {
                                    e11 = e12;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            C0920a c0920a2 = (C0920a) f6.f11395Z;
                            J j10 = (J) f6.f11394Y;
                            N.B0(obj);
                            try {
                                f6.f11394Y = c0920a2;
                                f6.f11395Z = obj;
                                f6.f11398j0 = 3;
                                if (j10.k(obj, f6) == enumC5000a) {
                                    return enumC5000a;
                                }
                                return obj;
                            } catch (IOException e13) {
                                e11 = e13;
                                c0920a = c0920a2;
                            }
                        }
                        P4.a.m(c0920a, e11);
                        throw c0920a;
                    }
                    j6 = (J) f6.f11394Y;
                    try {
                        N.B0(obj);
                    } catch (C0920a e14) {
                        e10 = e14;
                        AbstractC0921b abstractC0921b = j6.f11419c;
                        f6.f11394Y = j6;
                        f6.f11395Z = e10;
                        f6.f11398j0 = 2;
                        ((R4.a) abstractC0921b).getClass();
                        throw e10;
                    }
                } else {
                    N.B0(obj);
                    try {
                        f6.f11394Y = this;
                        f6.f11398j0 = 1;
                        obj = h(f6);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    } catch (C0920a e15) {
                        e10 = e15;
                        j6 = this;
                        AbstractC0921b abstractC0921b2 = j6.f11419c;
                        f6.f11394Y = j6;
                        f6.f11395Z = e10;
                        f6.f11398j0 = 2;
                        ((R4.a) abstractC0921b2).getClass();
                        throw e10;
                    }
                }
                return obj;
            }
        }
        f6 = new F(this, abstractC4825e);
        Object obj3 = f6.f11396h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = f6.f11398j0;
        if (i10 == 0) {
        }
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(AbstractC4825e abstractC4825e, AbstractC4831k abstractC4831k, wf.n nVar) {
        G g10;
        Object obj;
        int i10;
        Object obj2;
        J j6;
        int i11;
        C0922c c0922c;
        J j10;
        if (abstractC4825e instanceof G) {
            g10 = (G) abstractC4825e;
            int i12 = g10.f11404k0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                g10.f11404k0 = i12 - Integer.MIN_VALUE;
                obj = g10.f11402i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = g10.f11404k0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            obj2 = g10.f11400Z;
                            j6 = g10.f11399Y;
                            N.B0(obj);
                            F0 f02 = j6.f11423g;
                            if (obj2 == null) {
                                i11 = obj2.hashCode();
                            } else {
                                i11 = 0;
                            }
                            f02.setValue(new C0922c(i11, obj2));
                            return obj2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = g10.f11401h0;
                    c0922c = (C0922c) g10.f11400Z;
                    j10 = g10.f11399Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    C0922c c0922c2 = (C0922c) this.f11423g.getValue();
                    c0922c2.a();
                    Object obj3 = c0922c2.f11427a;
                    H h10 = new H(obj3, null, nVar);
                    g10.f11399Y = this;
                    g10.f11400Z = c0922c2;
                    g10.f11401h0 = obj3;
                    g10.f11404k0 = 1;
                    Object n12 = Ad.l.n1(g10, abstractC4831k, h10);
                    if (n12 == enumC5000a) {
                        return enumC5000a;
                    }
                    j10 = this;
                    c0922c = c0922c2;
                    obj = n12;
                    obj2 = obj3;
                }
                c0922c.a();
                if (!AbstractC3557B.K(obj2, obj)) {
                    g10.f11399Y = j10;
                    g10.f11400Z = obj;
                    g10.f11401h0 = null;
                    g10.f11404k0 = 2;
                    if (j10.k(obj, g10) == enumC5000a) {
                        return enumC5000a;
                    }
                    obj2 = obj;
                    j6 = j10;
                    F0 f022 = j6.f11423g;
                    if (obj2 == null) {
                    }
                    f022.setValue(new C0922c(i11, obj2));
                }
                return obj2;
            }
        }
        g10 = new G(this, abstractC4825e);
        obj = g10.f11402i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = g10.f11404k0;
        if (i10 == 0) {
        }
        c0922c.a();
        if (!AbstractC3557B.K(obj2, obj)) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5 A[Catch: IOException -> 0x00bc, TryCatch #3 {IOException -> 0x00bc, blocks: (B:21:0x006c, B:28:0x0097, B:31:0x00a5, B:32:0x00bb, B:36:0x00c2), top: B:47:0x006c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, AbstractC4825e abstractC4825e) {
        I i10;
        int i11;
        Throwable th2;
        io.sentry.instrumentation.file.e eVar;
        File file;
        io.sentry.instrumentation.file.e eVar2;
        J j6;
        if (abstractC4825e instanceof I) {
            i10 = (I) abstractC4825e;
            int i12 = i10.f11414l0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                i10.f11414l0 = i12 - Integer.MIN_VALUE;
                Object obj2 = i10.f11412j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = i10.f11414l0;
                jf.y yVar = jf.y.f36177a;
                if (i11 == 0) {
                    if (i11 == 1) {
                        eVar = i10.f11411i0;
                        eVar2 = i10.f11410h0;
                        file = i10.f11409Z;
                        j6 = i10.f11408Y;
                        try {
                            N.B0(obj2);
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj2);
                    File d10 = d();
                    File parentFile = d10.getCanonicalFile().getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                        if (!parentFile.isDirectory()) {
                            throw new IOException(AbstractC3557B.v2("Unable to create parent directories of ", d10));
                        }
                    }
                    file = new File(AbstractC3557B.v2(d().getAbsolutePath(), this.f11421e));
                    try {
                        io.sentry.instrumentation.file.e p10 = r.f.p(new FileOutputStream(file), file);
                        try {
                            AbstractC0931l abstractC0931l = this.f11418b;
                            q qVar = new q(p10);
                            i10.f11408Y = this;
                            i10.f11409Z = file;
                            i10.f11410h0 = p10;
                            i10.f11411i0 = p10;
                            i10.f11414l0 = 1;
                            abstractC0931l.h(obj, qVar);
                            if (yVar == enumC5000a) {
                                return enumC5000a;
                            }
                            j6 = this;
                            eVar = p10;
                            eVar2 = eVar;
                        } catch (Throwable th4) {
                            th2 = th4;
                            throw th2;
                        }
                    } catch (IOException e10) {
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e10;
                    }
                }
                eVar.getFD().sync();
                Ad.l.S(eVar2, null);
                if (!file.renameTo(j6.d())) {
                    return yVar;
                }
                throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
            }
        }
        i10 = new I(this, abstractC4825e);
        Object obj22 = i10.f11412j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = i10.f11414l0;
        jf.y yVar2 = jf.y.f36177a;
        if (i11 == 0) {
        }
        eVar.getFD().sync();
        Ad.l.S(eVar2, null);
        if (!file.renameTo(j6.d())) {
        }
    }
}
