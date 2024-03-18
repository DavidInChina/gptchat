package Db;

import Df.H;
import Df.w;
import Vc.q;
import Vc.r;
import Vc.x;
import Vc.y;
import com.google.android.gms.internal.play_billing.N;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import x8.W;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Yc.f f3480a;

    /* renamed from: b  reason: collision with root package name */
    public final y f3481b;

    public m(Yc.f fVar, y yVar) {
        this.f3480a = fVar;
        this.f3481b = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        a aVar;
        int i10;
        x xVar;
        if (abstractC4825e instanceof a) {
            aVar = (a) abstractC4825e;
            int i11 = aVar.f3443h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f3443h0 = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f3441Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = aVar.f3443h0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return (r) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    b bVar = new b(this, null);
                    w a5 = C.a(Fb.c.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(Fb.c.class), a5);
                    aVar.f3443h0 = 1;
                    Yc.f fVar = this.f3480a;
                    fVar.getClass();
                    obj = W.S(fVar, n22, bVar, aVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    return new Vc.w((Fb.c) ((Vc.w) xVar).f18565a);
                }
                if (!(xVar instanceof q)) {
                    if (xVar instanceof r) {
                        aVar.f3443h0 = 2;
                        obj = W.B((r) xVar, aVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        return (r) obj;
                    }
                    throw new RuntimeException();
                }
                return xVar;
            }
        }
        aVar = new a(this, abstractC4825e);
        Object obj2 = aVar.f3441Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = aVar.f3443h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Eb.c cVar, AbstractC4825e abstractC4825e) {
        c cVar2;
        int i10;
        x xVar;
        if (abstractC4825e instanceof c) {
            cVar2 = (c) abstractC4825e;
            int i11 = cVar2.f3449h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f3449h0 = i11 - Integer.MIN_VALUE;
                Object obj = cVar2.f3447Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = cVar2.f3449h0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return (r) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    d dVar = new d(this, cVar, null);
                    w a5 = C.a(Fb.i.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(Fb.i.class), a5);
                    cVar2.f3449h0 = 1;
                    Yc.f fVar = this.f3480a;
                    fVar.getClass();
                    obj = W.S(fVar, n22, dVar, cVar2);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    return new Vc.w((Fb.i) ((Vc.w) xVar).f18565a);
                }
                if (!(xVar instanceof q)) {
                    if (xVar instanceof r) {
                        cVar2.f3449h0 = 2;
                        obj = W.B((r) xVar, cVar2);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        return (r) obj;
                    }
                    throw new RuntimeException();
                }
                return xVar;
            }
        }
        cVar2 = new c(this, abstractC4825e);
        Object obj2 = cVar2.f3447Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = cVar2.f3449h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC4825e abstractC4825e) {
        e eVar;
        int i10;
        x xVar;
        if (abstractC4825e instanceof e) {
            eVar = (e) abstractC4825e;
            int i11 = eVar.f3456h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f3456h0 = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f3454Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = eVar.f3456h0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return (r) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    f fVar = new f(this, null);
                    w a5 = C.a(Fb.l.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(Fb.l.class), a5);
                    eVar.f3456h0 = 1;
                    Yc.f fVar2 = this.f3480a;
                    fVar2.getClass();
                    obj = W.S(fVar2, n22, fVar, eVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    return new Vc.w((Fb.l) ((Vc.w) xVar).f18565a);
                }
                if (!(xVar instanceof q)) {
                    if (xVar instanceof r) {
                        eVar.f3456h0 = 2;
                        obj = W.B((r) xVar, eVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        return (r) obj;
                    }
                    throw new RuntimeException();
                }
                return xVar;
            }
        }
        eVar = new e(this, abstractC4825e);
        Object obj2 = eVar.f3454Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = eVar.f3456h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Eb.f fVar, AbstractC4825e abstractC4825e) {
        g gVar;
        int i10;
        x xVar;
        if (abstractC4825e instanceof g) {
            gVar = (g) abstractC4825e;
            int i11 = gVar.f3462h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f3462h0 = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f3460Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = gVar.f3462h0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return (r) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    h hVar = new h(this, fVar, null);
                    w a5 = C.a(Fb.y.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(Fb.y.class), a5);
                    gVar.f3462h0 = 1;
                    Yc.f fVar2 = this.f3480a;
                    fVar2.getClass();
                    obj = W.S(fVar2, n22, hVar, gVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    return new Vc.w((Fb.y) ((Vc.w) xVar).f18565a);
                }
                if (!(xVar instanceof q)) {
                    if (xVar instanceof r) {
                        gVar.f3462h0 = 2;
                        obj = W.B((r) xVar, gVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        return (r) obj;
                    }
                    throw new RuntimeException();
                }
                return xVar;
            }
        }
        gVar = new g(this, abstractC4825e);
        Object obj2 = gVar.f3460Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = gVar.f3462h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Eb.i iVar, AbstractC4825e abstractC4825e) {
        i iVar2;
        int i10;
        x xVar;
        if (abstractC4825e instanceof i) {
            iVar2 = (i) abstractC4825e;
            int i11 = iVar2.f3469h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar2.f3469h0 = i11 - Integer.MIN_VALUE;
                Object obj = iVar2.f3467Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = iVar2.f3469h0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return (r) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    j jVar = new j(this, iVar, null);
                    w a5 = C.a(Fb.y.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(Fb.y.class), a5);
                    iVar2.f3469h0 = 1;
                    Yc.f fVar = this.f3480a;
                    fVar.getClass();
                    obj = W.S(fVar, n22, jVar, iVar2);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    return new Vc.w((Fb.y) ((Vc.w) xVar).f18565a);
                }
                if (!(xVar instanceof q)) {
                    if (xVar instanceof r) {
                        iVar2.f3469h0 = 2;
                        obj = W.B((r) xVar, iVar2);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        return (r) obj;
                    }
                    throw new RuntimeException();
                }
                return xVar;
            }
        }
        iVar2 = new i(this, abstractC4825e);
        Object obj2 = iVar2.f3467Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = iVar2.f3469h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(AbstractC4825e abstractC4825e) {
        k kVar;
        int i10;
        x xVar;
        if (abstractC4825e instanceof k) {
            kVar = (k) abstractC4825e;
            int i11 = kVar.f3476h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f3476h0 = i11 - Integer.MIN_VALUE;
                Object obj = kVar.f3474Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = kVar.f3476h0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return (r) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    l lVar = new l(this, null);
                    w a5 = C.a(jf.y.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(jf.y.class), a5);
                    kVar.f3476h0 = 1;
                    Yc.f fVar = this.f3480a;
                    fVar.getClass();
                    obj = W.S(fVar, n22, lVar, kVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    jf.y yVar = (jf.y) ((Vc.w) xVar).f18565a;
                    return new Vc.w(jf.y.f36177a);
                } else if (!(xVar instanceof q)) {
                    if (xVar instanceof r) {
                        kVar.f3476h0 = 2;
                        obj = W.B((r) xVar, kVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        return (r) obj;
                    }
                    throw new RuntimeException();
                } else {
                    return xVar;
                }
            }
        }
        kVar = new k(this, abstractC4825e);
        Object obj2 = kVar.f3474Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = kVar.f3476h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }
}
