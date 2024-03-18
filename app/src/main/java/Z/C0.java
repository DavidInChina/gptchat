package Z;

import android.content.pm.PackageInfo;
import android.os.Trace;
import b0.C2099c;
import id.AbstractC3557B;
import j0.AbstractC3893i;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class C0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22443Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f22444Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ List f22445h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f22446i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f22447j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f22448k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f22449l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Object f22450m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ Object f22451n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(E0 e02, C2099c c2099c, C2099c c2099c2, List list, List list2, Set set, List list3, Set set2) {
        super(1);
        this.f22446i0 = e02;
        this.f22447j0 = c2099c;
        this.f22448k0 = c2099c2;
        this.f22444Z = list;
        this.f22445h0 = list2;
        this.f22450m0 = set;
        this.f22449l0 = list3;
        this.f22451n0 = set2;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        List list;
        Set set = null;
        r2 = null;
        Long l10 = null;
        switch (this.f22443Y) {
            case 0:
                long longValue = ((Number) obj).longValue();
                if (E0.r((E0) this.f22446i0)) {
                    E0 e02 = (E0) this.f22446i0;
                    Trace.beginSection("Recomposer:animation");
                    try {
                        e02.f22465b.c(longValue);
                        int i10 = AbstractC3893i.f35891e;
                        io.sentry.hints.i.h();
                        Trace.endSection();
                    } finally {
                    }
                }
                E0 e03 = (E0) this.f22446i0;
                C2099c c2099c = (C2099c) this.f22447j0;
                C2099c c2099c2 = (C2099c) this.f22448k0;
                List list2 = this.f22444Z;
                List list3 = this.f22445h0;
                Set<D> set2 = (Set) this.f22450m0;
                List list4 = (List) this.f22449l0;
                Set<D> set3 = (Set) this.f22451n0;
                Trace.beginSection("Recomposer:recompose");
                try {
                    E0.t(e03);
                    synchronized (e03.f22466c) {
                        ArrayList arrayList = e03.f22472i;
                        int size = arrayList.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            list2.add((D) arrayList.get(i11));
                        }
                        e03.f22472i.clear();
                    }
                    c2099c.clear();
                    c2099c2.clear();
                } finally {
                }
                while (true) {
                    if ((!list2.isEmpty()) || (!list3.isEmpty())) {
                        List list5 = list3;
                        try {
                            int size2 = list2.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                D d10 = (D) list2.get(i12);
                                c2099c2.add(d10);
                                D s10 = E0.s(e03, d10, c2099c);
                                if (s10 != null) {
                                    list4.add(s10);
                                }
                            }
                            list2.clear();
                            if (c2099c.y()) {
                                synchronized (e03.f22466c) {
                                    List A10 = e03.A();
                                    int size3 = A10.size();
                                    for (int i13 = 0; i13 < size3; i13++) {
                                        Object obj2 = (D) A10.get(i13);
                                        if (!c2099c2.contains(obj2)) {
                                            C1744x c1744x = (C1744x) obj2;
                                            if (c1744x.v(c2099c)) {
                                                list2.add(c1744x);
                                            }
                                        }
                                    }
                                }
                            }
                            if (list2.isEmpty()) {
                                try {
                                    D0.r(list5, e03);
                                    while (!list5.isEmpty()) {
                                        kf.s.N1(e03.E(list5, c2099c), set2);
                                        D0.r(list5, e03);
                                    }
                                } catch (Exception e10) {
                                    E0.G(e03, e10, true, 2);
                                    D0.p(list2, list5, list4, set2, set3, c2099c, c2099c2);
                                }
                            }
                            list3 = list5;
                            set = null;
                        } catch (Exception e11) {
                            E0.G(e03, e11, true, 2);
                            D0.p(list2, list5, list4, set2, set3, c2099c, c2099c2);
                            list2.clear();
                        }
                    } else {
                        if (!list4.isEmpty()) {
                            list = list3;
                            e03.f22464a++;
                            try {
                                int size4 = list4.size();
                                for (int i14 = 0; i14 < size4; i14++) {
                                    set3.add((D) list4.get(i14));
                                }
                                int size5 = list4.size();
                                for (int i15 = 0; i15 < size5; i15++) {
                                    ((C1744x) ((D) list4.get(i15))).h();
                                }
                                list4.clear();
                            } catch (Exception e12) {
                                E0.G(e03, e12, false, 6);
                                D0.p(list2, list, list4, set2, set3, c2099c, c2099c2);
                                list4.clear();
                            }
                        } else {
                            list = list3;
                        }
                        if (!set2.isEmpty()) {
                            try {
                                kf.s.N1(set2, set3);
                                for (D d11 : set2) {
                                    ((C1744x) d11).j();
                                }
                                set2.clear();
                            } catch (Exception e13) {
                                E0.G(e03, e13, false, 6);
                                D0.p(list2, list, list4, set2, set3, c2099c, c2099c2);
                                set2.clear();
                            }
                        }
                        if (!set3.isEmpty()) {
                            try {
                                for (D d12 : set3) {
                                    ((C1744x) d12).k();
                                }
                                set3.clear();
                            } catch (Exception e14) {
                                E0.G(e03, e14, false, 6);
                                D0.p(list2, list, list4, set2, set3, c2099c, c2099c2);
                                set3.clear();
                            }
                        }
                        synchronized (e03.f22466c) {
                            e03.x();
                        }
                        int i16 = AbstractC3893i.f35891e;
                        j0.p.i().m();
                        c2099c2.clear();
                        c2099c.clear();
                        e03.f22478o = set;
                        return jf.y.f36177a;
                    }
                }
            default:
                Hi.c cVar = (Hi.c) obj;
                AbstractC3557B.c0("appStartData", cVar);
                Boolean bool = (Boolean) this.f22446i0;
                boolean K10 = AbstractC3557B.K(bool, Boolean.TRUE);
                Object obj3 = this.f22447j0;
                if (K10 && AbstractC3557B.K((Boolean) obj3, Boolean.FALSE)) {
                    Long l11 = (Long) this.f22448k0;
                    AbstractC3557B.Z(l11);
                    l10 = Long.valueOf(cVar.f7832a - l11.longValue());
                }
                Long l12 = l10;
                Hi.h hVar = (Hi.h) this.f22449l0;
                PackageInfo packageInfo = (PackageInfo) this.f22450m0;
                return Hi.c.a(cVar, null, new Hi.g(hVar, packageInfo.firstInstallTime, packageInfo.lastUpdateTime, this.f22444Z, this.f22445h0, (Boolean) this.f22451n0, (Boolean) obj3, bool, l12), null, null, null, null, null, null, null, null, null, null, null, null, -131073);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(Boolean bool, Boolean bool2, Long l10, Hi.h hVar, PackageInfo packageInfo, List list, ArrayList arrayList, Boolean bool3) {
        super(1);
        this.f22446i0 = bool;
        this.f22447j0 = bool2;
        this.f22448k0 = l10;
        this.f22449l0 = hVar;
        this.f22450m0 = packageInfo;
        this.f22444Z = list;
        this.f22445h0 = arrayList;
        this.f22451n0 = bool3;
    }
}
