package Ya;

import Df.H;
import Vc.w;
import Vc.x;
import Za.N0;
import Za.Q0;
import Za.R0;
import Za.T0;
import Za.z0;
import cb.C2334C;
import cb.C2350T;
import cb.C2356Z;
import cb.C2362c0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jf.C3959i;
import jf.y;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wd.O;
import wd.p0;
import wd.u0;
import wd.v0;
import x8.W;
import x9.C6383b;

/* loaded from: classes2.dex */
public final class r implements Va.e {

    /* renamed from: a  reason: collision with root package name */
    public final T0 f22202a;

    /* renamed from: b  reason: collision with root package name */
    public final t f22203b;

    /* renamed from: c  reason: collision with root package name */
    public final Ia.j f22204c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f22205d = new LinkedHashSet();

    public r(T0 t02, t tVar) {
        this.f22202a = t02;
        this.f22203b = tVar;
        this.f22204c = tVar.f44961e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, AbstractC4825e abstractC4825e, boolean z10) {
        a aVar;
        int i10;
        Vc.r rVar;
        C2334C c2334c;
        C2334C c2334c2;
        r rVar2;
        x xVar;
        if (abstractC4825e instanceof a) {
            aVar = (a) abstractC4825e;
            int i11 = aVar.f22146j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f22146j0 = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f22144h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = aVar.f22146j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            c2334c2 = (C2334C) aVar.f22142Y;
                            N.B0(obj);
                            c2334c = c2334c2;
                            rVar = new w(c2334c);
                            if (rVar instanceof w) {
                                return new u0(rVar.f18565a);
                            }
                            if (rVar instanceof Vc.q) {
                                return p0.f48449a;
                            }
                            if (rVar instanceof Vc.r) {
                                rVar.getClass();
                                return x.a((Vc.r) rVar);
                            }
                            throw new RuntimeException();
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = aVar.f22143Z;
                    rVar2 = (r) aVar.f22142Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    aVar.f22142Y = this;
                    aVar.f22143Z = z10;
                    aVar.f22146j0 = 1;
                    obj = this.f22202a.a(str, aVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    rVar2 = this;
                }
                xVar = (x) obj;
                if (!(xVar instanceof w)) {
                    c2334c = (C2334C) ((w) xVar).f18565a;
                    if (z10) {
                        rVar2.f22205d.add(new O(c2334c.f26438a));
                        b bVar = new b(c2334c, 0);
                        aVar.f22142Y = c2334c;
                        aVar.f22146j0 = 2;
                        if (rVar2.f22203b.b(bVar, aVar) == enumC5000a) {
                            return enumC5000a;
                        }
                        c2334c2 = c2334c;
                        c2334c = c2334c2;
                    }
                    rVar = new w(c2334c);
                    if (rVar instanceof w) {
                    }
                } else {
                    boolean z11 = xVar instanceof Vc.q;
                    rVar = xVar;
                    if (!z11) {
                        if (xVar instanceof Vc.r) {
                            Vc.r rVar3 = (Vc.r) xVar;
                            W.W(Pc.e.a(), "Error fetching gizmo", rVar3.f18561a, null, 4);
                            rVar = rVar3;
                        } else {
                            throw new RuntimeException();
                        }
                    }
                    if (rVar instanceof w) {
                    }
                }
            }
        }
        aVar = new a(this, abstractC4825e);
        Object obj2 = aVar.f22144h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = aVar.f22146j0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, AbstractC4825e abstractC4825e, boolean z10) {
        c cVar;
        int i10;
        r rVar;
        Iterator it;
        Object obj;
        C2334C c2334c;
        Object obj2;
        O o10;
        if (abstractC4825e instanceof c) {
            cVar = (c) abstractC4825e;
            int i11 = cVar.f22154k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f22154k0 = i11 - Integer.MIN_VALUE;
                Object obj3 = cVar.f22152i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = cVar.f22154k0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj3);
                            return (v0) obj3;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = cVar.f22151h0;
                    str = cVar.f22150Z;
                    rVar = cVar.f22149Y;
                    N.B0(obj3);
                } else {
                    N.B0(obj3);
                    if (str == null) {
                        return new u0(null);
                    }
                    cVar.f22149Y = this;
                    cVar.f22150Z = str;
                    cVar.f22151h0 = z10;
                    cVar.f22154k0 = 1;
                    obj3 = L4.a.m0(this.f22204c, cVar);
                    if (obj3 == enumC5000a) {
                        return enumC5000a;
                    }
                    rVar = this;
                }
                C2362c0 c2362c0 = (C2362c0) obj3;
                it = c2362c0.f26510a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = it.next();
                        String str2 = ((C2334C) obj).f26438a;
                        if (str != null && AbstractC3557B.K(str2, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                c2334c = (C2334C) obj;
                if (c2334c == null) {
                    return new u0(c2334c);
                }
                Iterator it2 = c2362c0.f26511b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        String str3 = ((C2334C) obj2).f26438a;
                        if (str != null && AbstractC3557B.K(str3, str)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                C2334C c2334c2 = (C2334C) obj2;
                if (c2334c2 != null) {
                    LinkedHashSet linkedHashSet = rVar.f22205d;
                    if (str != null) {
                        o10 = new O(str);
                    } else {
                        o10 = null;
                    }
                    if (linkedHashSet.contains(o10)) {
                        return new u0(c2334c2);
                    }
                }
                cVar.f22149Y = null;
                cVar.f22150Z = null;
                cVar.f22154k0 = 2;
                obj3 = rVar.a(str, cVar, z10);
                if (obj3 == enumC5000a) {
                    return enumC5000a;
                }
                return (v0) obj3;
            }
        }
        cVar = new c(this, abstractC4825e);
        Object obj32 = cVar.f22152i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = cVar.f22154k0;
        if (i10 == 0) {
        }
        C2362c0 c2362c02 = (C2362c0) obj32;
        it = c2362c02.f26510a.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        c2334c = (C2334C) obj;
        if (c2334c == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC4825e abstractC4825e) {
        d dVar;
        int i10;
        x xVar;
        C2362c0 c2362c0;
        r rVar;
        if (abstractC4825e instanceof d) {
            dVar = (d) abstractC4825e;
            int i11 = dVar.f22158i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f22158i0 = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f22156Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = dVar.f22158i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            c2362c0 = (C2362c0) dVar.f22155Y;
                            N.B0(obj);
                            xVar = new w(c2362c0);
                            return xVar.b();
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (r) dVar.f22155Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    dVar.f22155Y = this;
                    dVar.f22158i0 = 1;
                    obj = this.f22202a.e(dVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    rVar = this;
                }
                xVar = (x) obj;
                if (!(xVar instanceof w)) {
                    C2362c0 c2362c02 = (C2362c0) ((w) xVar).f18565a;
                    t tVar = rVar.f22203b;
                    C6383b c6383b = new C6383b(24, c2362c02);
                    dVar.f22155Y = c2362c02;
                    dVar.f22158i0 = 2;
                    if (tVar.b(c6383b, dVar) == enumC5000a) {
                        return enumC5000a;
                    }
                    c2362c0 = c2362c02;
                    xVar = new w(c2362c0);
                    return xVar.b();
                }
                if (!(xVar instanceof Vc.q) && !(xVar instanceof Vc.r)) {
                    throw new RuntimeException();
                }
                return xVar.b();
            }
        }
        dVar = new d(this, abstractC4825e);
        Object obj2 = dVar.f22156Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = dVar.f22158i0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, AbstractC4825e abstractC4825e) {
        e eVar;
        int i10;
        x xVar;
        if (abstractC4825e instanceof e) {
            eVar = (e) abstractC4825e;
            int i11 = eVar.f22161h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f22161h0 = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f22159Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = eVar.f22161h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    eVar.f22161h0 = 1;
                    obj = this.f22202a.b(str, eVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof w)) {
                    return new u0(((w) xVar).f18565a);
                }
                if (xVar instanceof Vc.q) {
                    return p0.f48449a;
                }
                if (xVar instanceof Vc.r) {
                    xVar.getClass();
                    return x.a((Vc.r) xVar);
                }
                throw new RuntimeException();
            }
        }
        eVar = new e(this, abstractC4825e);
        Object obj2 = eVar.f22159Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = eVar.f22161h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, AbstractC4825e abstractC4825e) {
        f fVar;
        int i10;
        x xVar;
        if (abstractC4825e instanceof f) {
            fVar = (f) abstractC4825e;
            int i11 = fVar.f22164h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f22164h0 = i11 - Integer.MIN_VALUE;
                Object obj = fVar.f22162Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = fVar.f22164h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    fVar.f22164h0 = 1;
                    T0 t02 = this.f22202a;
                    t02.getClass();
                    z0 z0Var = new z0(str, null);
                    Df.w a5 = C.a(Wa.j.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(Wa.j.class), a5);
                    Yc.a aVar = t02.f23519a;
                    aVar.getClass();
                    obj = W.S(aVar, n22, z0Var, fVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof w)) {
                    return new u0(((w) xVar).f18565a);
                }
                if (xVar instanceof Vc.q) {
                    return p0.f48449a;
                }
                if (xVar instanceof Vc.r) {
                    xVar.getClass();
                    return x.a((Vc.r) xVar);
                }
                throw new RuntimeException();
            }
        }
        fVar = new f(this, abstractC4825e);
        Object obj2 = fVar.f22162Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = fVar.f22164h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, AbstractC4825e abstractC4825e) {
        g gVar;
        int i10;
        x xVar;
        if (abstractC4825e instanceof g) {
            gVar = (g) abstractC4825e;
            int i11 = gVar.f22167h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f22167h0 = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f22165Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = gVar.f22167h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    gVar.f22167h0 = 1;
                    T0 t02 = this.f22202a;
                    t02.getClass();
                    N0 n02 = new N0(str, null);
                    Df.w a5 = C.a(C2356Z.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(C2356Z.class), a5);
                    Yc.a aVar = t02.f23519a;
                    aVar.getClass();
                    obj = W.S(aVar, n22, n02, gVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof w)) {
                    return new u0(((w) xVar).f18565a);
                }
                if (xVar instanceof Vc.q) {
                    return p0.f48449a;
                }
                if (xVar instanceof Vc.r) {
                    xVar.getClass();
                    return x.a((Vc.r) xVar);
                }
                throw new RuntimeException();
            }
        }
        gVar = new g(this, abstractC4825e);
        Object obj2 = gVar.f22165Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = gVar.f22167h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(AbstractC4825e abstractC4825e) {
        h hVar;
        int i10;
        x xVar;
        if (abstractC4825e instanceof h) {
            hVar = (h) abstractC4825e;
            int i11 = hVar.f22170h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f22170h0 = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f22168Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = hVar.f22170h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    hVar.f22170h0 = 1;
                    obj = this.f22202a.d(hVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof w)) {
                    return new u0(((w) xVar).f18565a);
                }
                if (xVar instanceof Vc.q) {
                    return p0.f48449a;
                }
                if (xVar instanceof Vc.r) {
                    xVar.getClass();
                    return x.a((Vc.r) xVar);
                }
                throw new RuntimeException();
            }
        }
        hVar = new h(this, abstractC4825e);
        Object obj2 = hVar.f22168Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = hVar.f22170h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(AbstractC4825e abstractC4825e) {
        i iVar;
        int i10;
        x xVar;
        if (abstractC4825e instanceof i) {
            iVar = (i) abstractC4825e;
            int i11 = iVar.f22173h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f22173h0 = i11 - Integer.MIN_VALUE;
                Object obj = iVar.f22171Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = iVar.f22173h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    iVar.f22173h0 = 1;
                    obj = this.f22202a.f(iVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof w)) {
                    return new u0(((w) xVar).f18565a);
                }
                if (xVar instanceof Vc.q) {
                    return p0.f48449a;
                }
                if (xVar instanceof Vc.r) {
                    xVar.getClass();
                    return x.a((Vc.r) xVar);
                }
                throw new RuntimeException();
            }
        }
        iVar = new i(this, abstractC4825e);
        Object obj2 = iVar.f22171Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = iVar.f22173h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(AbstractC4825e abstractC4825e) {
        j jVar;
        int i10;
        x xVar;
        if (abstractC4825e instanceof j) {
            jVar = (j) abstractC4825e;
            int i11 = jVar.f22176h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f22176h0 = i11 - Integer.MIN_VALUE;
                Object obj = jVar.f22174Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = jVar.f22176h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    jVar.f22176h0 = 1;
                    obj = this.f22202a.g(jVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof w)) {
                    return new u0(((w) xVar).f18565a);
                }
                if (xVar instanceof Vc.q) {
                    return p0.f48449a;
                }
                if (xVar instanceof Vc.r) {
                    xVar.getClass();
                    return x.a((Vc.r) xVar);
                }
                throw new RuntimeException();
            }
        }
        jVar = new j(this, abstractC4825e);
        Object obj2 = jVar.f22174Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = jVar.f22176h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(C2350T c2350t, AbstractC4825e abstractC4825e) {
        k kVar;
        int i10;
        x xVar;
        if (abstractC4825e instanceof k) {
            kVar = (k) abstractC4825e;
            int i11 = kVar.f22179h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f22179h0 = i11 - Integer.MIN_VALUE;
                Object obj = kVar.f22177Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = kVar.f22179h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    String str = c2350t.f26486a.f26493a;
                    kVar.f22179h0 = 1;
                    obj = this.f22202a.c(str, c2350t.f26488c, kVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof w)) {
                    return new u0(((w) xVar).f18565a);
                }
                if (xVar instanceof Vc.q) {
                    return p0.f48449a;
                }
                if (xVar instanceof Vc.r) {
                    xVar.getClass();
                    return x.a((Vc.r) xVar);
                }
                throw new RuntimeException();
            }
        }
        kVar = new k(this, abstractC4825e);
        Object obj2 = kVar.f22177Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = kVar.f22179h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(C2334C c2334c, AbstractC4825e abstractC4825e) {
        l lVar;
        int i10;
        r rVar;
        x xVar;
        if (abstractC4825e instanceof l) {
            lVar = (l) abstractC4825e;
            int i11 = lVar.f22184j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f22184j0 = i11 - Integer.MIN_VALUE;
                Object obj = lVar.f22182h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = lVar.f22184j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return new u0(y.f36177a);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2334c = lVar.f22181Z;
                    rVar = lVar.f22180Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    String str = c2334c.f26438a;
                    lVar.f22180Y = this;
                    lVar.f22181Z = c2334c;
                    lVar.f22184j0 = 1;
                    obj = this.f22202a.i(str, lVar, true);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    rVar = this;
                }
                xVar = (x) obj;
                if (!(xVar instanceof w)) {
                    w wVar = (w) xVar;
                    C2334C a5 = C2334C.a(c2334c, true);
                    t tVar = rVar.f22203b;
                    m mVar = new m(a5, c2334c, 0);
                    lVar.f22180Y = null;
                    lVar.f22181Z = null;
                    lVar.f22184j0 = 2;
                    if (tVar.b(mVar, lVar) == enumC5000a) {
                        return enumC5000a;
                    }
                    return new u0(y.f36177a);
                } else if (xVar instanceof Vc.q) {
                    return p0.f48449a;
                } else {
                    if (xVar instanceof Vc.r) {
                        xVar.getClass();
                        return x.a((Vc.r) xVar);
                    }
                    throw new RuntimeException();
                }
            }
        }
        lVar = new l(this, abstractC4825e);
        Object obj2 = lVar.f22182h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = lVar.f22184j0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(C2356Z c2356z, String str, AbstractC4825e abstractC4825e) {
        n nVar;
        int i10;
        if (abstractC4825e instanceof n) {
            nVar = (n) abstractC4825e;
            int i11 = nVar.f22190h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f22190h0 = i11 - Integer.MIN_VALUE;
                Object obj = nVar.f22188Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = nVar.f22190h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    nVar.f22190h0 = 1;
                    T0 t02 = this.f22202a;
                    t02.getClass();
                    Q0 q02 = new Q0(c2356z, str, null);
                    Df.w a5 = C.a(y.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(y.class), a5);
                    Yc.a aVar = t02.f23519a;
                    aVar.getClass();
                    obj = W.S(aVar, n22, q02, nVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return ((x) obj).b();
            }
        }
        nVar = new n(this, abstractC4825e);
        Object obj2 = nVar.f22188Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = nVar.f22190h0;
        if (i10 == 0) {
        }
        return ((x) obj2).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, C2350T c2350t, AbstractC4825e abstractC4825e) {
        o oVar;
        int i10;
        x xVar;
        String str2;
        if (abstractC4825e instanceof o) {
            oVar = (o) abstractC4825e;
            int i11 = oVar.f22193h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f22193h0 = i11 - Integer.MIN_VALUE;
                Object obj = oVar.f22191Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = oVar.f22193h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    if (c2350t != null) {
                        str2 = c2350t.f26488c;
                    } else {
                        str2 = null;
                    }
                    oVar.f22193h0 = 1;
                    obj = this.f22202a.h(str, str2, oVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof w)) {
                    return new u0(((w) xVar).f18565a);
                }
                if (xVar instanceof Vc.q) {
                    return p0.f48449a;
                }
                if (xVar instanceof Vc.r) {
                    xVar.getClass();
                    return x.a((Vc.r) xVar);
                }
                throw new RuntimeException();
            }
        }
        oVar = new o(this, abstractC4825e);
        Object obj2 = oVar.f22191Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = oVar.f22193h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(C2334C c2334c, AbstractC4825e abstractC4825e) {
        p pVar;
        int i10;
        r rVar;
        x xVar;
        if (abstractC4825e instanceof p) {
            pVar = (p) abstractC4825e;
            int i11 = pVar.f22198j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pVar.f22198j0 = i11 - Integer.MIN_VALUE;
                Object obj = pVar.f22196h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = pVar.f22198j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return new u0(y.f36177a);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2334c = pVar.f22195Z;
                    rVar = pVar.f22194Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    String str = c2334c.f26438a;
                    pVar.f22194Y = this;
                    pVar.f22195Z = c2334c;
                    pVar.f22198j0 = 1;
                    obj = this.f22202a.i(str, pVar, false);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    rVar = this;
                }
                xVar = (x) obj;
                if (!(xVar instanceof w)) {
                    w wVar = (w) xVar;
                    C2334C a5 = C2334C.a(c2334c, false);
                    t tVar = rVar.f22203b;
                    m mVar = new m(c2334c, a5, 1);
                    pVar.f22194Y = null;
                    pVar.f22195Z = null;
                    pVar.f22198j0 = 2;
                    if (tVar.b(mVar, pVar) == enumC5000a) {
                        return enumC5000a;
                    }
                    return new u0(y.f36177a);
                } else if (xVar instanceof Vc.q) {
                    return p0.f48449a;
                } else {
                    if (xVar instanceof Vc.r) {
                        xVar.getClass();
                        return x.a((Vc.r) xVar);
                    }
                    throw new RuntimeException();
                }
            }
        }
        pVar = new p(this, abstractC4825e);
        Object obj2 = pVar.f22196h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = pVar.f22198j0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(String str, String str2, String str3, Wa.n nVar, AbstractC4825e abstractC4825e) {
        q qVar;
        int i10;
        if (abstractC4825e instanceof q) {
            qVar = (q) abstractC4825e;
            int i11 = qVar.f22201h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                qVar.f22201h0 = i11 - Integer.MIN_VALUE;
                Object obj = qVar.f22199Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = qVar.f22201h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    Wa.g gVar = new Wa.g(str, str2, P4.a.o0(new C3959i(str3, nVar)));
                    qVar.f22201h0 = 1;
                    T0 t02 = this.f22202a;
                    t02.getClass();
                    R0 r02 = new R0(gVar, null);
                    Df.w a5 = C.a(Wa.g.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(Wa.g.class), a5);
                    Yc.a aVar = t02.f23519a;
                    aVar.getClass();
                    obj = W.S(aVar, n22, r02, qVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return ((x) obj).b();
            }
        }
        qVar = new q(this, abstractC4825e);
        Object obj2 = qVar.f22199Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = qVar.f22201h0;
        if (i10 == 0) {
        }
        return ((x) obj2).b();
    }
}
