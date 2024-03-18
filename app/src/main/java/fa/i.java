package Fa;

import Df.H;
import Df.w;
import Ga.A;
import Ga.E;
import Ga.l;
import Ga.o;
import Ga.t;
import Ga.u;
import Ga.v;
import L9.AbstractC0904j;
import L9.C0900f;
import L9.O;
import L9.S;
import L9.V;
import L9.a0;
import L9.d0;
import L9.g0;
import Vc.q;
import Vc.r;
import Vc.x;
import ca.C2311c;
import ca.C2319k;
import com.google.android.gms.internal.play_billing.N;
import java.util.ArrayList;
import java.util.List;
import jf.y;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wd.p0;
import wd.s0;
import wd.u0;
import x8.W;

/* loaded from: classes.dex */
public final class i implements AbstractC0904j {

    /* renamed from: a  reason: collision with root package name */
    public final E f5137a;

    public i(E e10) {
        this.f5137a = e10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C2311c c2311c, boolean z10, AbstractC4825e abstractC4825e) {
        a aVar;
        int i10;
        if (abstractC4825e instanceof a) {
            aVar = (a) abstractC4825e;
            int i11 = aVar.f5113h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f5113h0 = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f5111Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = aVar.f5113h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    String str = c2311c.f26375b;
                    if (str == null) {
                        return new u0(y.f36177a);
                    }
                    aVar.f5113h0 = 1;
                    E e10 = this.f5137a;
                    e10.getClass();
                    obj = e10.c(new V(z10), str, aVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return ((x) obj).b();
            }
        }
        aVar = new a(this, abstractC4825e);
        Object obj2 = aVar.f5111Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = aVar.f5113h0;
        if (i10 == 0) {
        }
        return ((x) obj2).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        b bVar;
        int i10;
        if (abstractC4825e instanceof b) {
            bVar = (b) abstractC4825e;
            int i11 = bVar.f5116h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f5116h0 = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f5114Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = bVar.f5116h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    bVar.f5116h0 = 1;
                    E e10 = this.f5137a;
                    e10.getClass();
                    t tVar = new t(new V(true), null);
                    w a5 = C.a(a0.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(a0.class), a5);
                    Yc.a aVar = e10.f6196b;
                    aVar.getClass();
                    obj = W.S(aVar, n22, tVar, bVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return ((x) obj).b();
            }
        }
        bVar = new b(this, abstractC4825e);
        Object obj2 = bVar.f5114Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = bVar.f5116h0;
        if (i10 == 0) {
        }
        return ((x) obj2).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(C2311c c2311c, AbstractC4825e abstractC4825e) {
        c cVar;
        int i10;
        if (abstractC4825e instanceof c) {
            cVar = (c) abstractC4825e;
            int i11 = cVar.f5119h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f5119h0 = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f5117Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = cVar.f5119h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    String str = c2311c.f26375b;
                    if (str == null) {
                        return new u0(y.f36177a);
                    }
                    cVar.f5119h0 = 1;
                    E e10 = this.f5137a;
                    e10.getClass();
                    obj = e10.c(new g0(), str, cVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return ((x) obj).b();
            }
        }
        cVar = new c(this, abstractC4825e);
        Object obj2 = cVar.f5117Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = cVar.f5119h0;
        if (i10 == 0) {
        }
        return ((x) obj2).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC4825e abstractC4825e) {
        d dVar;
        int i10;
        if (abstractC4825e instanceof d) {
            dVar = (d) abstractC4825e;
            int i11 = dVar.f5122h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f5122h0 = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f5120Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = dVar.f5122h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    dVar.f5122h0 = 1;
                    E e10 = this.f5137a;
                    e10.getClass();
                    u uVar = new u(new g0(), null);
                    w a5 = C.a(a0.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(a0.class), a5);
                    Yc.a aVar = e10.f6196b;
                    aVar.getClass();
                    obj = W.S(aVar, n22, uVar, dVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return ((x) obj).b();
            }
        }
        dVar = new d(this, abstractC4825e);
        Object obj2 = dVar.f5120Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = dVar.f5122h0;
        if (i10 == 0) {
        }
        return ((x) obj2).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[Catch: d -> 0x002b, TryCatch #0 {d -> 0x002b, blocks: (B:12:0x0027, B:17:0x0038, B:20:0x0069, B:22:0x006f, B:23:0x007f, B:25:0x0083, B:26:0x0086, B:28:0x008a, B:29:0x0095, B:30:0x009a), top: B:33:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f A[Catch: d -> 0x002b, TryCatch #0 {d -> 0x002b, blocks: (B:12:0x0027, B:17:0x0038, B:20:0x0069, B:22:0x006f, B:23:0x007f, B:25:0x0083, B:26:0x0086, B:28:0x008a, B:29:0x0095, B:30:0x009a), top: B:33:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, AbstractC4825e abstractC4825e) {
        e eVar;
        int i10;
        x xVar;
        try {
            if (abstractC4825e instanceof e) {
                eVar = (e) abstractC4825e;
                int i11 = eVar.f5127j0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    eVar.f5127j0 = i11 - Integer.MIN_VALUE;
                    Object obj = eVar.f5125h0;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = eVar.f5127j0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            str2 = eVar.f5124Z;
                            str = eVar.f5123Y;
                            N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        E e10 = this.f5137a;
                        eVar.f5123Y = str;
                        eVar.f5124Z = str2;
                        eVar.f5127j0 = 1;
                        e10.getClass();
                        Ga.w wVar = new Ga.w(str2, null);
                        w a5 = C.a(C0900f.class);
                        Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(C0900f.class), a5);
                        Yc.a aVar = e10.f6196b;
                        aVar.getClass();
                        obj = W.S(aVar, n22, wVar, eVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    xVar = (x) obj;
                    if (!(xVar instanceof Vc.w)) {
                        return new u0(W.U((C0900f) ((Vc.w) xVar).f18565a, str, str2));
                    }
                    if (xVar instanceof q) {
                        return p0.f48449a;
                    }
                    if (xVar instanceof r) {
                        xVar.getClass();
                        return x.a((r) xVar);
                    }
                    throw new RuntimeException();
                }
            }
            if (i10 == 0) {
            }
            xVar = (x) obj;
            if (!(xVar instanceof Vc.w)) {
            }
        } catch (Qa.d e11) {
            return new s0(0, e11);
        }
        eVar = new e(this, abstractC4825e);
        Object obj2 = eVar.f5125h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = eVar.f5127j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[Catch: d -> 0x0027, TryCatch #0 {d -> 0x0027, blocks: (B:11:0x0023, B:16:0x003c, B:19:0x0069, B:21:0x006f, B:22:0x0080, B:24:0x0086, B:26:0x0092, B:27:0x0096, B:28:0x00a7, B:30:0x00ab, B:31:0x00ae, B:33:0x00b2, B:34:0x00bd, B:35:0x00c2), top: B:38:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7 A[Catch: d -> 0x0027, TryCatch #0 {d -> 0x0027, blocks: (B:11:0x0023, B:16:0x003c, B:19:0x0069, B:21:0x006f, B:22:0x0080, B:24:0x0086, B:26:0x0092, B:27:0x0096, B:28:0x00a7, B:30:0x00ab, B:31:0x00ae, B:33:0x00b2, B:34:0x00bd, B:35:0x00c2), top: B:38:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i10, int i11, boolean z10, AbstractC4825e abstractC4825e) {
        f fVar;
        int i12;
        x xVar;
        try {
            if (abstractC4825e instanceof f) {
                fVar = (f) abstractC4825e;
                int i13 = fVar.f5130h0;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    fVar.f5130h0 = i13 - Integer.MIN_VALUE;
                    Object obj = fVar.f5128Y;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i12 = fVar.f5130h0;
                    if (i12 == 0) {
                        if (i12 == 1) {
                            N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        Ga.q qVar = Ga.r.Companion;
                        Ga.i iVar = new Ga.i(i10, i11, z10);
                        E e10 = this.f5137a;
                        fVar.f5130h0 = 1;
                        e10.getClass();
                        A a5 = new A(iVar, null);
                        w a10 = C.a(l.class);
                        Je.a n22 = R4.b.n2(H.O(a10), C.f37623a.b(l.class), a10);
                        Yc.a aVar = e10.f6196b;
                        aVar.getClass();
                        obj = W.S(aVar, n22, a5, fVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    xVar = (x) obj;
                    if (!(xVar instanceof Vc.w)) {
                        Vc.w wVar = (Vc.w) xVar;
                        List<o> list = ((l) wVar.f18565a).f6220a;
                        ArrayList arrayList = new ArrayList();
                        for (o oVar : list) {
                            C2311c T = W.T(oVar);
                            if (T != null) {
                                arrayList.add(T);
                            }
                        }
                        return new u0(new C2319k(((l) wVar.f18565a).f6221b, arrayList));
                    } else if (xVar instanceof q) {
                        return p0.f48449a;
                    } else {
                        if (xVar instanceof r) {
                            xVar.getClass();
                            return x.a((r) xVar);
                        }
                        throw new RuntimeException();
                    }
                }
            }
            if (i12 == 0) {
            }
            xVar = (x) obj;
            if (!(xVar instanceof Vc.w)) {
            }
        } catch (Qa.d e11) {
            return new s0(0, e11);
        }
        fVar = new f(this, abstractC4825e);
        Object obj2 = fVar.f5128Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i12 = fVar.f5130h0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, String str2, AbstractC4825e abstractC4825e) {
        g gVar;
        int i10;
        x xVar;
        if (abstractC4825e instanceof g) {
            gVar = (g) abstractC4825e;
            int i11 = gVar.f5133h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f5133h0 = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f5131Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = gVar.f5133h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    gVar.f5133h0 = 1;
                    E e10 = this.f5137a;
                    e10.getClass();
                    v vVar = new v(new O(str2), str, null);
                    w a5 = C.a(S.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(S.class), a5);
                    Yc.a aVar = e10.f6196b;
                    aVar.getClass();
                    obj = W.S(aVar, n22, vVar, gVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    return new u0(((Vc.w) xVar).f18565a);
                }
                if (xVar instanceof q) {
                    return p0.f48449a;
                }
                if (xVar instanceof r) {
                    xVar.getClass();
                    return x.a((r) xVar);
                }
                throw new RuntimeException();
            }
        }
        gVar = new g(this, abstractC4825e);
        Object obj2 = gVar.f5131Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = gVar.f5133h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(C2311c c2311c, String str, AbstractC4825e abstractC4825e) {
        h hVar;
        int i10;
        if (abstractC4825e instanceof h) {
            hVar = (h) abstractC4825e;
            int i11 = hVar.f5136h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f5136h0 = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f5134Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = hVar.f5136h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    String str2 = c2311c.f26375b;
                    if (str2 == null) {
                        return new s0(0, new IllegalArgumentException("Conversation has no remoteId"));
                    }
                    hVar.f5136h0 = 1;
                    E e10 = this.f5137a;
                    e10.getClass();
                    obj = e10.c(new d0(str), str2, hVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return ((x) obj).b();
            }
        }
        hVar = new h(this, abstractC4825e);
        Object obj2 = hVar.f5134Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = hVar.f5136h0;
        if (i10 == 0) {
        }
        return ((x) obj2).b();
    }
}
