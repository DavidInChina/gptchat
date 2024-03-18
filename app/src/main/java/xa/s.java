package xa;

import L9.AbstractC0904j;
import M1.w;
import ca.C2311c;
import ca.C2319k;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jf.y;
import ld.C4428a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import rc.Q;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;
import x8.W;

/* loaded from: classes.dex */
public final class s implements Ea.b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0904j f49766a;

    /* renamed from: b  reason: collision with root package name */
    public final U9.a f49767b;

    /* renamed from: c  reason: collision with root package name */
    public final xd.h f49768c;

    /* renamed from: d  reason: collision with root package name */
    public final w f49769d;

    /* renamed from: e  reason: collision with root package name */
    public final Wg.d f49770e = Wg.e.a();

    /* renamed from: f  reason: collision with root package name */
    public h f49771f = h.f49718c;

    public s(AbstractC0904j abstractC0904j, U9.a aVar, xd.h hVar, C4428a c4428a) {
        this.f49766a = abstractC0904j;
        this.f49767b = aVar;
        this.f49768c = hVar;
        this.f49769d = new w(((Ia.l) aVar).f8531f, 19);
        Ad.l.O0(c4428a, null, null, new k(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(s sVar, AbstractC4825e abstractC4825e) {
        m mVar;
        EnumC5000a enumC5000a;
        int i10;
        Wg.d dVar;
        s sVar2;
        v0 v0Var;
        Wg.d dVar2;
        sVar.getClass();
        if (abstractC4825e instanceof m) {
            mVar = (m) abstractC4825e;
            int i11 = mVar.f49739j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f49739j0 = i11 - Integer.MIN_VALUE;
                Object obj = mVar.f49737h0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = mVar.f49739j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            dVar = mVar.f49736Z;
                            sVar2 = mVar.f49735Y;
                            N.B0(obj);
                            try {
                                sVar2.f49771f = h.f49718c;
                                dVar.g(null);
                                return y.f36177a;
                            } catch (Throwable th2) {
                                dVar.g(null);
                                throw th2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = mVar.f49735Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    mVar.f49735Y = sVar;
                    mVar.f49739j0 = 1;
                    obj = ((Ia.l) sVar.f49767b).c(mVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (v0) obj;
                if (v0Var instanceof q0) {
                    W.G(Pc.e.a(), "Failed to delete conversation cache", ((q0) v0Var).f48450a, 4);
                }
                dVar2 = sVar.f49770e;
                mVar.f49735Y = sVar;
                mVar.f49736Z = dVar2;
                mVar.f49739j0 = 2;
                if (dVar2.e(null, mVar) == enumC5000a) {
                    sVar2 = sVar;
                    dVar = dVar2;
                    sVar2.f49771f = h.f49718c;
                    dVar.g(null);
                    return y.f36177a;
                }
                return enumC5000a;
            }
        }
        mVar = new m(sVar, abstractC4825e);
        Object obj2 = mVar.f49737h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = mVar.f49739j0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj2;
        if (v0Var instanceof q0) {
        }
        dVar2 = sVar.f49770e;
        mVar.f49735Y = sVar;
        mVar.f49736Z = dVar2;
        mVar.f49739j0 = 2;
        if (dVar2.e(null, mVar) == enumC5000a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        l lVar;
        int i10;
        Wg.d dVar;
        s sVar;
        s sVar2;
        v0 v0Var;
        v0 v0Var2;
        if (abstractC4825e instanceof l) {
            lVar = (l) abstractC4825e;
            int i11 = lVar.f49734j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f49734j0 = i11 - Integer.MIN_VALUE;
                Object obj = lVar.f49732h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = lVar.f49734j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                dVar = lVar.f49731Z;
                                sVar = lVar.f49730Y;
                                N.B0(obj);
                                try {
                                    sVar.f49771f = h.f49718c;
                                    dVar.g(null);
                                    return new u0(y.f36177a);
                                } catch (Throwable th2) {
                                    dVar.g(null);
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sVar2 = lVar.f49730Y;
                        N.B0(obj);
                        v0Var = (v0) obj;
                        if (!(v0Var instanceof q0)) {
                            return (q0) v0Var;
                        }
                        Wg.d dVar2 = sVar2.f49770e;
                        lVar.f49730Y = sVar2;
                        lVar.f49731Z = dVar2;
                        lVar.f49734j0 = 3;
                        if (dVar2.e(null, lVar) == enumC5000a) {
                            return enumC5000a;
                        }
                        dVar = dVar2;
                        sVar = sVar2;
                        sVar.f49771f = h.f49718c;
                        dVar.g(null);
                        return new u0(y.f36177a);
                    }
                    sVar2 = lVar.f49730Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    lVar.f49730Y = this;
                    lVar.f49734j0 = 1;
                    obj = ((Fa.i) this.f49766a).b(lVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    sVar2 = this;
                }
                v0Var2 = (v0) obj;
                if (!(v0Var2 instanceof q0)) {
                    return (q0) v0Var2;
                }
                U9.a aVar = sVar2.f49767b;
                lVar.f49730Y = sVar2;
                lVar.f49734j0 = 2;
                obj = ((Ia.l) aVar).c(lVar);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                v0Var = (v0) obj;
                if (!(v0Var instanceof q0)) {
                }
            }
        }
        lVar = new l(this, abstractC4825e);
        Object obj2 = lVar.f49732h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = lVar.f49734j0;
        if (i10 == 0) {
        }
        v0Var2 = (v0) obj2;
        if (!(v0Var2 instanceof q0)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0209 -> B:101:0x020c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC4825e abstractC4825e) {
        n nVar;
        int i10;
        s sVar;
        List<C2311c> list;
        Yg.p pVar;
        Iterator it;
        int i11;
        Iterator it2;
        Yg.p pVar2;
        List list2;
        s sVar2;
        boolean z10;
        Yg.p pVar3;
        Iterator it3;
        Iterator it4;
        boolean z11;
        Yg.p pVar4;
        if (abstractC4825e instanceof n) {
            nVar = (n) abstractC4825e;
            int i12 = nVar.f49747m0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                nVar.f49747m0 = i12 - Integer.MIN_VALUE;
                Object obj = nVar.f49745k0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = nVar.f49747m0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    i11 = nVar.f49744j0;
                                    it2 = (Iterator) nVar.f49743i0;
                                    pVar2 = nVar.f49742h0;
                                    list2 = nVar.f49741Z;
                                    sVar2 = nVar.f49740Y;
                                    N.B0(obj);
                                    v0 v0Var = (v0) obj;
                                    if (v0Var instanceof q0) {
                                        return (q0) v0Var;
                                    }
                                    if (it2.hasNext()) {
                                        U9.a aVar = sVar2.f49767b;
                                        nVar.f49740Y = sVar2;
                                        nVar.f49741Z = list2;
                                        nVar.f49742h0 = pVar2;
                                        nVar.f49743i0 = it2;
                                        nVar.f49744j0 = i11;
                                        nVar.f49747m0 = 4;
                                        obj = ((Ia.l) aVar).f((C2311c) it2.next(), true, nVar);
                                        if (obj == enumC5000a) {
                                            return enumC5000a;
                                        }
                                        v0 v0Var2 = (v0) obj;
                                        if (v0Var2 instanceof q0) {
                                        }
                                        if (it2.hasNext()) {
                                            int i13 = sVar2.f49771f.f49719a;
                                            AbstractC3557B.c0("oldestDate", pVar2);
                                            sVar2.f49771f = new h(list2.size() + i13, pVar2);
                                            if (i11 != 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            return new u0(Boolean.valueOf(z10));
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                i11 = nVar.f49744j0;
                                it = (Iterator) nVar.f49743i0;
                                pVar = nVar.f49742h0;
                                list = nVar.f49741Z;
                                sVar = nVar.f49740Y;
                                N.B0(obj);
                                while (it.hasNext()) {
                                    U9.a aVar2 = sVar.f49767b;
                                    nVar.f49740Y = sVar;
                                    nVar.f49741Z = list;
                                    nVar.f49742h0 = pVar;
                                    nVar.f49743i0 = it;
                                    nVar.f49744j0 = i11;
                                    nVar.f49747m0 = 3;
                                    if (((Ia.l) aVar2).b((C2311c) it.next(), nVar) == enumC5000a) {
                                        return enumC5000a;
                                    }
                                }
                                it2 = list.iterator();
                                pVar2 = pVar;
                                list2 = list;
                                sVar2 = sVar;
                                if (it2.hasNext()) {
                                }
                            }
                        } else {
                            i11 = nVar.f49744j0;
                            pVar3 = (Yg.p) nVar.f49743i0;
                            pVar = nVar.f49742h0;
                            list = nVar.f49741Z;
                            sVar = nVar.f49740Y;
                            N.B0(obj);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : (Iterable) obj) {
                                if (((C2311c) obj2).f26375b != null) {
                                    arrayList.add(obj2);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                Yg.p pVar5 = ((C2311c) next).f26377d;
                                pVar5.getClass();
                                if (pVar5.compareTo(pVar) >= 0 && pVar5.compareTo(pVar3) <= 0) {
                                    arrayList2.add(next);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                Object next2 = it4.next();
                                C2311c c2311c = (C2311c) next2;
                                if (!(list instanceof Collection) || !list.isEmpty()) {
                                    for (C2311c c2311c2 : list) {
                                        String str = c2311c.f26375b;
                                        String str2 = c2311c2.f26374a;
                                        if (str != null && AbstractC3557B.K(str, str2)) {
                                            break;
                                        }
                                    }
                                }
                                arrayList3.add(next2);
                            }
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                            }
                            it2 = list.iterator();
                            pVar2 = pVar;
                            list2 = list;
                            sVar2 = sVar;
                            if (it2.hasNext()) {
                            }
                        }
                    } else {
                        s sVar3 = nVar.f49740Y;
                        N.B0(obj);
                        sVar = sVar3;
                    }
                } else {
                    N.B0(obj);
                    if (this.f49770e.d()) {
                        int i14 = this.f49771f.f49719a;
                        nVar.f49740Y = this;
                        nVar.f49747m0 = 1;
                        obj = ((Fa.i) this.f49766a).f(i14, 20, false, nVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        sVar = this;
                    } else {
                        throw new IllegalStateException("Must be called with mutex locked".toString());
                    }
                }
                v0 v0Var3 = (v0) obj;
                z11 = v0Var3 instanceof u0;
                if (z11) {
                    if (z11) {
                        C2319k c2319k = (C2319k) ((u0) v0Var3).f48468a;
                        return new u0(Boolean.TRUE);
                    } else if ((v0Var3 instanceof p0) || (v0Var3 instanceof q0)) {
                        return v0Var3;
                    } else {
                        throw new RuntimeException();
                    }
                }
                list = ((C2319k) ((u0) v0Var3).f48468a).f26396a;
                if (list.size() == 20) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i11 != 0) {
                    Iterator it5 = list.iterator();
                    if (it5.hasNext()) {
                        Yg.p pVar6 = ((C2311c) it5.next()).f26377d;
                        while (it5.hasNext()) {
                            Yg.p pVar7 = ((C2311c) it5.next()).f26377d;
                            pVar6.getClass();
                            if (pVar6.compareTo(pVar7) > 0) {
                                pVar6 = pVar7;
                            }
                        }
                        pVar4 = pVar6;
                    } else {
                        throw new NoSuchElementException();
                    }
                } else {
                    Yg.p.Companion.getClass();
                    pVar4 = Yg.p.f22415Z;
                }
                pVar3 = sVar.f49771f.f49720b;
                nVar.f49740Y = sVar;
                nVar.f49741Z = list;
                nVar.f49742h0 = pVar4;
                nVar.f49743i0 = pVar3;
                nVar.f49744j0 = i11;
                nVar.f49747m0 = 2;
                Object m02 = L4.a.m0(sVar.f49769d, nVar);
                if (m02 == enumC5000a) {
                    return enumC5000a;
                }
                pVar = pVar4;
                obj = m02;
                ArrayList arrayList4 = new ArrayList();
                while (r1.hasNext()) {
                }
                ArrayList arrayList22 = new ArrayList();
                it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                }
                ArrayList arrayList32 = new ArrayList();
                it4 = arrayList22.iterator();
                while (it4.hasNext()) {
                }
                it = arrayList32.iterator();
                while (it.hasNext()) {
                }
                it2 = list.iterator();
                pVar2 = pVar;
                list2 = list;
                sVar2 = sVar;
                if (it2.hasNext()) {
                }
            }
        }
        nVar = new n(this, abstractC4825e);
        Object obj3 = nVar.f49745k0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = nVar.f49747m0;
        if (i10 == 0) {
        }
        v0 v0Var32 = (v0) obj3;
        z11 = v0Var32 instanceof u0;
        if (z11) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC4825e abstractC4825e) {
        o oVar;
        Object obj;
        int i10;
        Wg.d dVar;
        s sVar;
        Wg.d dVar2;
        Throwable th2;
        Object c10;
        s sVar2;
        if (abstractC4825e instanceof o) {
            oVar = (o) abstractC4825e;
            int i11 = oVar.f49752j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f49752j0 = i11 - Integer.MIN_VALUE;
                obj = oVar.f49750h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = oVar.f49752j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                dVar2 = (Wg.a) oVar.f49748Y;
                                try {
                                    N.B0(obj);
                                    v0 v0Var = (v0) obj;
                                    ((Wg.d) dVar2).g(null);
                                    return v0Var;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    dVar2.g(null);
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Wg.d dVar3 = oVar.f49749Z;
                        sVar = (s) oVar.f49748Y;
                        N.B0(obj);
                        dVar = dVar3;
                        try {
                            sVar.f49771f = h.f49718c;
                            oVar.f49748Y = dVar;
                            oVar.f49749Z = null;
                            oVar.f49752j0 = 3;
                            c10 = sVar.c(oVar);
                            if (c10 != enumC5000a) {
                                return enumC5000a;
                            }
                            dVar2 = dVar;
                            obj = c10;
                            v0 v0Var2 = (v0) obj;
                            ((Wg.d) dVar2).g(null);
                            return v0Var2;
                        } catch (Throwable th4) {
                            dVar2 = dVar;
                            th2 = th4;
                            dVar2.g(null);
                            throw th2;
                        }
                    }
                    sVar2 = (s) oVar.f49748Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    Ia.j jVar = ((Q) this.f49768c).f44819b;
                    oVar.f49748Y = this;
                    oVar.f49752j0 = 1;
                    obj = L4.a.m0(jVar, oVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    sVar2 = this;
                }
                if (!((zd.n) obj).f51982a) {
                    return p0.f48449a;
                }
                dVar = sVar2.f49770e;
                oVar.f49748Y = sVar2;
                oVar.f49749Z = dVar;
                oVar.f49752j0 = 2;
                if (dVar.e(null, oVar) == enumC5000a) {
                    return enumC5000a;
                }
                sVar = sVar2;
                sVar.f49771f = h.f49718c;
                oVar.f49748Y = dVar;
                oVar.f49749Z = null;
                oVar.f49752j0 = 3;
                c10 = sVar.c(oVar);
                if (c10 != enumC5000a) {
                }
            }
        }
        oVar = new o(this, abstractC4825e);
        obj = oVar.f49750h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = oVar.f49752j0;
        if (i10 == 0) {
        }
        if (!((zd.n) obj).f51982a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(AbstractC4825e abstractC4825e) {
        p pVar;
        int i10;
        Wg.d dVar;
        s sVar;
        s sVar2;
        v0 v0Var;
        v0 v0Var2;
        if (abstractC4825e instanceof p) {
            pVar = (p) abstractC4825e;
            int i11 = pVar.f49757j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pVar.f49757j0 = i11 - Integer.MIN_VALUE;
                Object obj = pVar.f49755h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = pVar.f49757j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                dVar = pVar.f49754Z;
                                sVar = pVar.f49753Y;
                                N.B0(obj);
                                try {
                                    sVar.f49771f = h.f49718c;
                                    dVar.g(null);
                                    return new u0(y.f36177a);
                                } catch (Throwable th2) {
                                    dVar.g(null);
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sVar2 = pVar.f49753Y;
                        N.B0(obj);
                        v0Var = (v0) obj;
                        if (!(v0Var instanceof q0)) {
                            return (q0) v0Var;
                        }
                        Wg.d dVar2 = sVar2.f49770e;
                        pVar.f49753Y = sVar2;
                        pVar.f49754Z = dVar2;
                        pVar.f49757j0 = 3;
                        if (dVar2.e(null, pVar) == enumC5000a) {
                            return enumC5000a;
                        }
                        dVar = dVar2;
                        sVar = sVar2;
                        sVar.f49771f = h.f49718c;
                        dVar.g(null);
                        return new u0(y.f36177a);
                    }
                    sVar2 = pVar.f49753Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    pVar.f49753Y = this;
                    pVar.f49757j0 = 1;
                    obj = ((Fa.i) this.f49766a).d(pVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    sVar2 = this;
                }
                v0Var2 = (v0) obj;
                if (!(v0Var2 instanceof q0)) {
                    return (q0) v0Var2;
                }
                U9.a aVar = sVar2.f49767b;
                pVar.f49753Y = sVar2;
                pVar.f49757j0 = 2;
                obj = ((Ia.l) aVar).c(pVar);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                v0Var = (v0) obj;
                if (!(v0Var instanceof q0)) {
                }
            }
        }
        pVar = new p(this, abstractC4825e);
        Object obj2 = pVar.f49755h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = pVar.f49757j0;
        if (i10 == 0) {
        }
        v0Var2 = (v0) obj2;
        if (!(v0Var2 instanceof q0)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[RETURN] */
    /* JADX WARN: Type inference failed for: r7v12, types: [Wg.a] */
    /* JADX WARN: Type inference failed for: r7v6, types: [Wg.d] */
    /* JADX WARN: Type inference failed for: r7v9, types: [Wg.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Yg.p pVar, AbstractC4825e abstractC4825e) {
        r rVar;
        Object obj;
        EnumC5000a enumC5000a;
        int i10;
        Yg.p pVar2;
        s sVar;
        try {
            if (abstractC4825e instanceof r) {
                rVar = (r) abstractC4825e;
                int i11 = rVar.f49765j0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    rVar.f49765j0 = i11 - Integer.MIN_VALUE;
                    obj = rVar.f49763h0;
                    enumC5000a = EnumC5000a.f41328Y;
                    i10 = rVar.f49765j0;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                ?? r72 = (Wg.a) rVar.f49761Y;
                                N.B0(obj);
                                pVar = r72;
                                return (v0) obj;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r73 = rVar.f49762Z;
                        sVar = (s) rVar.f49761Y;
                        N.B0(obj);
                        pVar2 = r73;
                    } else {
                        N.B0(obj);
                        if (pVar != null && pVar.compareTo(this.f49771f.f49720b) > 0) {
                            return new u0(Boolean.TRUE);
                        }
                        rVar.f49761Y = this;
                        ?? r74 = this.f49770e;
                        rVar.f49762Z = r74;
                        rVar.f49765j0 = 1;
                        if (r74.e(null, rVar) == enumC5000a) {
                            return enumC5000a;
                        }
                        sVar = this;
                        pVar2 = r74;
                    }
                    rVar.f49761Y = pVar2;
                    rVar.f49762Z = null;
                    rVar.f49765j0 = 2;
                    obj = sVar.c(rVar);
                    pVar = pVar2;
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    return (v0) obj;
                }
            }
            if (i10 == 0) {
            }
            rVar.f49761Y = pVar2;
            rVar.f49762Z = null;
            rVar.f49765j0 = 2;
            obj = sVar.c(rVar);
            pVar = pVar2;
            if (obj == enumC5000a) {
            }
            return (v0) obj;
        } finally {
            ((Wg.d) pVar).g(null);
        }
        rVar = new r(this, abstractC4825e);
        obj = rVar.f49763h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = rVar.f49765j0;
    }
}
