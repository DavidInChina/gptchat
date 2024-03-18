package pe;

import Ng.C1059e0;
import Ng.D0;
import Ng.Q;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jf.y;
import kf.s;
import kf.t;
import kf.v;
import kf.w;
import l8.AbstractC4344b;
import me.C4628a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import te.C5760d;
import ve.AbstractC6034c;
import xe.AbstractC6423l;
import xe.AbstractC6432u;
import xe.AbstractC6435x;
import xe.C6405J;
import xe.C6410O;
import xe.C6419h;
import xe.C6433v;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class l implements Closeable {

    /* renamed from: i0  reason: collision with root package name */
    public static final C4628a f43127i0 = new C4628a(7, 0);

    /* renamed from: j0  reason: collision with root package name */
    public static final Fe.a f43128j0 = new Fe.a("HttpCookies");

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC5152d f43129Y;

    /* renamed from: Z  reason: collision with root package name */
    public final List f43130Z;

    /* renamed from: h0  reason: collision with root package name */
    public final D0 f43131h0 = Ad.l.O0(C1059e0.f12936Y, Q.f12905b, null, new i(this, null), 2);

    public l(AbstractC5152d abstractC5152d, ArrayList arrayList) {
        AbstractC3557B.c0("storage", abstractC5152d);
        AbstractC3557B.c0("defaults", arrayList);
        this.f43129Y = abstractC5152d;
        this.f43130Z = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C5760d c5760d, AbstractC4825e abstractC4825e) {
        l lVar;
        g gVar;
        int i10;
        l lVar2;
        C6410O c6410o;
        Iterator it;
        ArrayList arrayList;
        if (abstractC4825e instanceof g) {
            gVar = (g) abstractC4825e;
            int i11 = gVar.f43107k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f43107k0 = i11 - Integer.MIN_VALUE;
                lVar = this;
                Object obj = gVar.f43105i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = gVar.f43107k0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        it = gVar.f43104h0;
                        c6410o = gVar.f43103Z;
                        lVar2 = gVar.f43102Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    C6405J c6405j = c5760d.f46125a;
                    AbstractC3557B.c0("<this>", c6405j);
                    C6405J c6405j2 = new C6405J();
                    N.A0(c6405j2, c6405j);
                    C6410O b10 = c6405j2.b();
                    List list = AbstractC6435x.f49956a;
                    String i12 = c5760d.f46127c.i("Cookie");
                    if (i12 != null) {
                        Ei.a aVar = o.f43135a;
                        StringBuilder s10 = android.gov.nist.core.a.s("Saving cookie ", i12, " for ");
                        s10.append(c5760d.f46125a);
                        aVar.c(s10.toString());
                        Map c10 = AbstractC6423l.c(i12, true);
                        arrayList = new ArrayList(c10.size());
                        for (Map.Entry entry : c10.entrySet()) {
                            arrayList.add(new C6419h((String) entry.getKey(), (String) entry.getValue(), 3, 0, null, null, null, false, false, w.f37484Y));
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        it = arrayList.iterator();
                        c6410o = b10;
                        lVar2 = lVar;
                    }
                    return y.f36177a;
                }
                while (it.hasNext()) {
                    AbstractC5152d abstractC5152d = lVar2.f43129Y;
                    gVar.f43102Y = lVar2;
                    gVar.f43103Z = c6410o;
                    gVar.f43104h0 = it;
                    gVar.f43107k0 = 1;
                    if (abstractC5152d.n0(c6410o, (C6419h) it.next(), gVar) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return y.f36177a;
            }
        }
        lVar = this;
        gVar = new g(lVar, abstractC4825e);
        Object obj2 = gVar.f43105i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = gVar.f43107k0;
        if (i10 == 0) {
        }
        while (it.hasNext()) {
        }
        return y.f36177a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f43129Y.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[PHI: r7 
      PHI: (r7v2 java.lang.Object) = (r7v4 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x005a, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(C6410O c6410o, AbstractC4825e abstractC4825e) {
        h hVar;
        Object obj;
        EnumC5000a enumC5000a;
        int i10;
        l lVar;
        if (abstractC4825e instanceof h) {
            hVar = (h) abstractC4825e;
            int i11 = hVar.f43112j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f43112j0 = i11 - Integer.MIN_VALUE;
                obj = hVar.f43110h0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = hVar.f43112j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c6410o = hVar.f43109Z;
                    lVar = hVar.f43108Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    hVar.f43108Y = this;
                    hVar.f43109Z = c6410o;
                    hVar.f43112j0 = 1;
                    if (this.f43131h0.F(hVar) == enumC5000a) {
                        return enumC5000a;
                    }
                    lVar = this;
                }
                AbstractC5152d abstractC5152d = lVar.f43129Y;
                hVar.f43108Y = null;
                hVar.f43109Z = null;
                hVar.f43112j0 = 2;
                obj = abstractC5152d.G0(c6410o, hVar);
                if (obj != enumC5000a) {
                    return enumC5000a;
                }
                return obj;
            }
        }
        hVar = new h(this, abstractC4825e);
        obj = hVar.f43110h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = hVar.f43112j0;
        if (i10 == 0) {
        }
        AbstractC5152d abstractC5152d2 = lVar.f43129Y;
        hVar.f43108Y = null;
        hVar.f43109Z = null;
        hVar.f43112j0 = 2;
        obj = abstractC5152d2.G0(c6410o, hVar);
        if (obj != enumC5000a) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARN: Type inference failed for: r0v11, types: [kf.v] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(AbstractC6034c abstractC6034c, AbstractC4825e abstractC4825e) {
        l lVar;
        j jVar;
        int i10;
        l lVar2;
        C6410O c6410o;
        Iterator it;
        C6410O c6410o2;
        ?? r02;
        C6410O c6410o3;
        List list;
        int i11;
        if (abstractC4825e instanceof j) {
            jVar = (j) abstractC4825e;
            int i12 = jVar.f43122k0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                jVar.f43122k0 = i12 - Integer.MIN_VALUE;
                lVar = this;
                Object obj = jVar.f43120i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = jVar.f43122k0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        it = jVar.f43119h0;
                        c6410o = jVar.f43118Z;
                        lVar2 = jVar.f43117Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    C6410O O10 = AbstractC3557B.u1(abstractC6034c).O();
                    AbstractC6432u a5 = abstractC6034c.a();
                    List list2 = AbstractC6435x.f49956a;
                    List<String> c10 = a5.c("Set-Cookie");
                    if (c10 != null) {
                        for (String str : c10) {
                            Ei.a aVar = o.f43135a;
                            StringBuilder s10 = android.gov.nist.core.a.s("Received cookie ", str, " in response for ");
                            s10.append(abstractC6034c.b().c().O());
                            aVar.c(s10.toString());
                        }
                    }
                    AbstractC6432u a10 = abstractC6034c.a();
                    List list3 = AbstractC6435x.f49956a;
                    List<String> c11 = a10.c("Set-Cookie");
                    if (c11 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : c11) {
                            AbstractC3557B.c0("<this>", str2);
                            int k22 = Lg.n.k2(str2, ',', 0, false, 6);
                            if (k22 == -1) {
                                list = AbstractC4344b.F0(str2);
                                c6410o3 = O10;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                char c12 = '=';
                                int k23 = Lg.n.k2(str2, '=', k22, false, 4);
                                int i13 = 0;
                                int k24 = Lg.n.k2(str2, ';', k22, false, 4);
                                while (i13 < str2.length() && k22 > 0) {
                                    if (k23 < k22) {
                                        k23 = Lg.n.k2(str2, c12, k22, false, 4);
                                    }
                                    c6410o3 = O10;
                                    int k25 = Lg.n.k2(str2, ',', k22 + 1, false, 4);
                                    while (true) {
                                        int i14 = k25;
                                        i11 = k22;
                                        k22 = i14;
                                        if (k22 < 0 || k22 >= k23) {
                                            break;
                                        }
                                        k25 = Lg.n.k2(str2, ',', k22 + 1, false, 4);
                                    }
                                    if (k24 < i11) {
                                        k24 = Lg.n.k2(str2, ';', i11, false, 4);
                                    }
                                    if (k23 < 0) {
                                        String substring = str2.substring(i13);
                                        AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring);
                                        arrayList2.add(substring);
                                        break;
                                    }
                                    if (k24 == -1 || k24 > k23) {
                                        String substring2 = str2.substring(i13, i11);
                                        AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring2);
                                        arrayList2.add(substring2);
                                        i13 = i11 + 1;
                                    }
                                    O10 = c6410o3;
                                    c12 = '=';
                                }
                                c6410o3 = O10;
                                if (i13 < str2.length()) {
                                    String substring3 = str2.substring(i13);
                                    AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring3);
                                    arrayList2.add(substring3);
                                }
                                list = arrayList2;
                            }
                            s.N1(list, arrayList);
                            O10 = c6410o3;
                        }
                        c6410o2 = O10;
                        r02 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            r02.add(AbstractC6423l.d((String) it2.next()));
                        }
                    } else {
                        c6410o2 = O10;
                        r02 = v.f37483Y;
                    }
                    it = r02.iterator();
                    lVar2 = lVar;
                    c6410o = c6410o2;
                }
                while (it.hasNext()) {
                    AbstractC5152d abstractC5152d = lVar2.f43129Y;
                    jVar.f43117Y = lVar2;
                    jVar.f43118Z = c6410o;
                    jVar.f43119h0 = it;
                    jVar.f43122k0 = 1;
                    if (abstractC5152d.n0(c6410o, (C6419h) it.next(), jVar) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return y.f36177a;
            }
        }
        lVar = this;
        jVar = new j(lVar, abstractC4825e);
        Object obj2 = jVar.f43120i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = jVar.f43122k0;
        if (i10 == 0) {
        }
        while (it.hasNext()) {
        }
        return y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(C5760d c5760d, AbstractC4825e abstractC4825e) {
        k kVar;
        int i10;
        List list;
        if (abstractC4825e instanceof k) {
            kVar = (k) abstractC4825e;
            int i11 = kVar.f43126i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f43126i0 = i11 - Integer.MIN_VALUE;
                Object obj = kVar.f43124Z;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = kVar.f43126i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c5760d = kVar.f43123Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    C6405J c6405j = c5760d.f46125a;
                    AbstractC3557B.c0("<this>", c6405j);
                    C6405J c6405j2 = new C6405J();
                    N.A0(c6405j2, c6405j);
                    C6410O b10 = c6405j2.b();
                    kVar.f43123Y = c5760d;
                    kVar.f43126i0 = 1;
                    obj = h(b10, kVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                list = (List) obj;
                if (!(!list.isEmpty())) {
                    Ei.a aVar = o.f43135a;
                    String m22 = t.m2(list, "; ", null, null, n.f43134Y, 30);
                    C6433v c6433v = c5760d.f46127c;
                    List list2 = AbstractC6435x.f49956a;
                    c6433v.k("Cookie", m22);
                    Ei.a aVar2 = o.f43135a;
                    StringBuilder s10 = android.gov.nist.core.a.s("Sending cookie ", m22, " for ");
                    s10.append(c5760d.f46125a);
                    aVar2.c(s10.toString());
                } else {
                    C6433v c6433v2 = c5760d.f46127c;
                    List list3 = AbstractC6435x.f49956a;
                    c6433v2.j("Cookie");
                }
                return y.f36177a;
            }
        }
        kVar = new k(this, abstractC4825e);
        Object obj3 = kVar.f43124Z;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = kVar.f43126i0;
        if (i10 == 0) {
        }
        list = (List) obj3;
        if (!(!list.isEmpty())) {
        }
        return y.f36177a;
    }
}
