package Li;

import Df.AbstractC0405d;
import Ng.C1057d0;
import Ng.D0;
import Ng.E;
import Sg.C1394f;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jf.y;
import kf.t;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.C;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import pf.AbstractC5156c;
import pf.AbstractC5162i;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC4831k f11258d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC4831k f11259e;

    /* renamed from: c  reason: collision with root package name */
    public final C1394f f11257c = Ad.l.g(Bi.c.z());

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f11255a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f11256b = new ArrayList();

    public q() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC3557B.b0("Executors.newSingleThreadExecutor()", newSingleThreadExecutor);
        this.f11258d = new C1057d0(newSingleThreadExecutor).plus(new E("state.sync.sovran.com"));
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        AbstractC3557B.b0("Executors.newSingleThreadExecutor()", newSingleThreadExecutor2);
        this.f11259e = new C1057d0(newSingleThreadExecutor2).plus(new E("state.update.sovran.com"));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC0405d abstractC0405d, AbstractC4825e abstractC4825e) {
        g gVar;
        int i10;
        List list;
        if (abstractC4825e instanceof g) {
            gVar = (g) abstractC4825e;
            int i11 = gVar.f11221Z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f11221Z = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f11220Y;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = gVar.f11221Z;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    gVar.f11221Z = 1;
                    obj = e(abstractC0405d, gVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                    return null;
                }
                b bVar = ((c) list.get(0)).f11211a;
                if (!(bVar instanceof b)) {
                    return null;
                }
                return bVar;
            }
        }
        gVar = new g(this, abstractC4825e);
        Object obj3 = gVar.f11220Y;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = gVar.f11221Z;
        if (i10 == 0) {
        }
        list = (List) obj3;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(a aVar, AbstractC0405d abstractC0405d, AbstractC4825e abstractC4825e) {
        h hVar;
        int i10;
        q qVar;
        B b10;
        AbstractC0405d abstractC0405d2;
        q qVar2;
        c cVar;
        b bVar;
        if (abstractC4825e instanceof h) {
            hVar = (h) abstractC4825e;
            int i11 = hVar.f11224Z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f11224Z = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f11223Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = hVar.f11224Z;
                y yVar = y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    N.B0(obj);
                                    return yVar;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            b10 = (B) hVar.f11227j0;
                            qVar = hVar.f11226i0;
                            N.B0(obj);
                            hVar.f11226i0 = null;
                            hVar.f11227j0 = null;
                            hVar.f11224Z = 4;
                            if (qVar.c((List) obj, (b) b10.f37622Y, hVar) == enumC5000a) {
                                return enumC5000a;
                            }
                            return yVar;
                        }
                        b10 = (B) hVar.f11228k0;
                        q qVar3 = hVar.f11226i0;
                        N.B0(obj);
                        abstractC0405d2 = (AbstractC0405d) hVar.f11227j0;
                        qVar = qVar3;
                        hVar.f11226i0 = qVar;
                        hVar.f11227j0 = b10;
                        hVar.f11228k0 = null;
                        hVar.f11224Z = 3;
                        obj = Ad.l.L(qVar.f11257c, qVar.f11258d, new p(qVar, abstractC0405d2, null), 2).z(hVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        hVar.f11226i0 = null;
                        hVar.f11227j0 = null;
                        hVar.f11224Z = 4;
                        if (qVar.c((List) obj, (b) b10.f37622Y, hVar) == enumC5000a) {
                        }
                    } else {
                        abstractC0405d = (AbstractC0405d) hVar.f11228k0;
                        aVar = (a) hVar.f11227j0;
                        qVar2 = hVar.f11226i0;
                        N.B0(obj);
                    }
                } else {
                    N.B0(obj);
                    hVar.f11226i0 = this;
                    hVar.f11227j0 = aVar;
                    hVar.f11228k0 = abstractC0405d;
                    hVar.f11224Z = 1;
                    obj = e(abstractC0405d, hVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    qVar2 = this;
                }
                cVar = (c) t.h2((List) obj);
                ?? obj2 = new Object();
                if (cVar == null) {
                    bVar = cVar.f11211a;
                } else {
                    bVar = null;
                }
                if (!(bVar instanceof b)) {
                    bVar = null;
                }
                if (bVar != null) {
                    obj2.f37622Y = bVar;
                    D0 O02 = Ad.l.O0(qVar2.f11257c, qVar2.f11259e, null, new i(obj2, aVar, cVar, null), 2);
                    hVar.f11226i0 = qVar2;
                    hVar.f11227j0 = abstractC0405d;
                    hVar.f11228k0 = obj2;
                    hVar.f11224Z = 2;
                    if (O02.F(hVar) == enumC5000a) {
                        return enumC5000a;
                    }
                    abstractC0405d2 = abstractC0405d;
                    qVar = qVar2;
                    b10 = obj2;
                    hVar.f11226i0 = qVar;
                    hVar.f11227j0 = b10;
                    hVar.f11228k0 = null;
                    hVar.f11224Z = 3;
                    obj = Ad.l.L(qVar.f11257c, qVar.f11258d, new p(qVar, abstractC0405d2, null), 2).z(hVar);
                    if (obj == enumC5000a) {
                    }
                    hVar.f11226i0 = null;
                    hVar.f11227j0 = null;
                    hVar.f11224Z = 4;
                    if (qVar.c((List) obj, (b) b10.f37622Y, hVar) == enumC5000a) {
                    }
                }
                return yVar;
            }
        }
        hVar = new h(this, abstractC4825e);
        Object obj3 = hVar.f11223Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = hVar.f11224Z;
        y yVar2 = y.f36177a;
        if (i10 == 0) {
        }
        cVar = (c) t.h2((List) obj3);
        ?? obj22 = new Object();
        if (cVar == null) {
        }
        if (!(bVar instanceof b)) {
        }
        if (bVar != null) {
        }
        return yVar2;
    }

    public final Object c(List list, b bVar, AbstractC5156c abstractC5156c) {
        C1394f c1394f;
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c1394f = this.f11257c;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            wf.n nVar = dVar.f11215c;
            if (!(nVar instanceof AbstractC5162i) || !Ad.l.J0(2, nVar)) {
                nVar = null;
            }
            if (nVar != null && dVar.f11214b.get() != null) {
                Ad.l.O0(c1394f, dVar.f11217e, null, new j(nVar, bVar, null), 2);
            }
        }
        Object F10 = Ad.l.O0(c1394f, this.f11258d, null, new f(this, null), 2).F(abstractC5156c);
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        y yVar = y.f36177a;
        if (F10 != enumC5000a) {
            F10 = yVar;
        }
        if (F10 == enumC5000a) {
            return F10;
        }
        return yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Type inference failed for: r9v6, types: [Li.c, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(b bVar, AbstractC4825e abstractC4825e) {
        k kVar;
        Object obj;
        int i10;
        q qVar;
        if (abstractC4825e instanceof k) {
            kVar = (k) abstractC4825e;
            int i11 = kVar.f11236Z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f11236Z = i11 - Integer.MIN_VALUE;
                obj = kVar.f11235Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = kVar.f11236Z;
                y yVar = y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = kVar.f11239j0;
                    qVar = kVar.f11238i0;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    AbstractC0405d b10 = C.f37623a.b(bVar.getClass());
                    kVar.f11238i0 = this;
                    kVar.f11239j0 = bVar;
                    kVar.f11236Z = 1;
                    obj = e(b10, kVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    qVar = this;
                }
                if (!(!((List) obj).isEmpty())) {
                    return yVar;
                }
                AbstractC3557B.c0("state", bVar);
                ?? obj2 = new Object();
                obj2.f11211a = bVar;
                D0 O02 = Ad.l.O0(qVar.f11257c, qVar.f11259e, null, new l(qVar, obj2, null), 2);
                kVar.f11238i0 = null;
                kVar.f11239j0 = null;
                kVar.f11236Z = 2;
                if (O02.F(kVar) == enumC5000a) {
                    return enumC5000a;
                }
                return yVar;
            }
        }
        kVar = new k(this, abstractC4825e);
        obj = kVar.f11235Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = kVar.f11236Z;
        y yVar2 = y.f36177a;
        if (i10 == 0) {
        }
        if (!(!((List) obj).isEmpty())) {
        }
    }

    public final Object e(AbstractC0405d abstractC0405d, AbstractC5156c abstractC5156c) {
        m mVar = new m(this, abstractC0405d, null);
        Object z10 = Ad.l.L(this.f11257c, this.f11259e, mVar, 2).z(abstractC5156c);
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(r rVar, AbstractC0405d abstractC0405d, boolean z10, Ng.B b10, wf.n nVar, AbstractC4825e abstractC4825e) {
        n nVar2;
        int i10;
        d dVar;
        q qVar;
        b bVar;
        boolean z11;
        AbstractC0405d abstractC0405d2;
        if (abstractC4825e instanceof n) {
            nVar2 = (n) abstractC4825e;
            int i11 = nVar2.f11245Z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar2.f11245Z = i11 - Integer.MIN_VALUE;
                Object obj = nVar2.f11244Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = nVar2.f11245Z;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                dVar = (d) nVar2.f11247i0;
                                N.B0(obj);
                                return new Integer(dVar.f11213a);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dVar = (d) nVar2.f11248j0;
                        qVar = (q) nVar2.f11247i0;
                        N.B0(obj);
                        bVar = (b) obj;
                        if (bVar != null) {
                            List F02 = AbstractC4344b.F0(dVar);
                            nVar2.f11247i0 = dVar;
                            nVar2.f11248j0 = null;
                            nVar2.f11245Z = 3;
                            if (qVar.c(F02, bVar, nVar2) == enumC5000a) {
                                return enumC5000a;
                            }
                        }
                        return new Integer(dVar.f11213a);
                    }
                    boolean z12 = nVar2.f11250l0;
                    dVar = nVar2.f11249k0;
                    N.B0(obj);
                    abstractC0405d2 = (AbstractC0405d) nVar2.f11248j0;
                    qVar = (q) nVar2.f11247i0;
                    z11 = z12;
                } else {
                    N.B0(obj);
                    d dVar2 = new d(rVar, nVar, abstractC0405d, b10);
                    o oVar = new o(this, dVar2, null);
                    D0 O02 = Ad.l.O0(this.f11257c, this.f11258d, null, oVar, 2);
                    nVar2.f11247i0 = this;
                    nVar2.f11248j0 = abstractC0405d;
                    nVar2.f11249k0 = dVar2;
                    nVar2.f11250l0 = z10;
                    nVar2.f11245Z = 1;
                    if (O02.F(nVar2) == enumC5000a) {
                        return enumC5000a;
                    }
                    z11 = z10;
                    dVar = dVar2;
                    abstractC0405d2 = abstractC0405d;
                    qVar = this;
                }
                if (z11) {
                    nVar2.f11247i0 = qVar;
                    nVar2.f11248j0 = dVar;
                    nVar2.f11249k0 = null;
                    nVar2.f11245Z = 2;
                    obj = qVar.a(abstractC0405d2, nVar2);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    bVar = (b) obj;
                    if (bVar != null) {
                    }
                }
                return new Integer(dVar.f11213a);
            }
        }
        nVar2 = new n(this, abstractC4825e);
        Object obj2 = nVar2.f11244Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = nVar2.f11245Z;
        if (i10 == 0) {
        }
        if (z11) {
        }
        return new Integer(dVar.f11213a);
    }
}
