package Z;

import A.C0007a0;
import A.C0043t;
import Ng.AbstractC1070k;
import Ng.AbstractC1073l0;
import Ng.C1071k0;
import Ng.C1072l;
import Ng.C1079o0;
import b0.C2099c;
import f0.C2931b;
import h0.C3288a;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import j0.AbstractC3893i;
import j0.C3887c;
import j0.C3894j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import jf.C3959i;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import q1.AbstractC5260f;
import w.C6077x;
import yf.AbstractC6583a;
import z.C6672L;

/* loaded from: classes2.dex */
public final class E0 extends AbstractC1738u {

    /* renamed from: x  reason: collision with root package name */
    public static final Qg.F0 f22462x = Qg.s0.c(C2931b.f29515i0);

    /* renamed from: y  reason: collision with root package name */
    public static final AtomicReference f22463y = new AtomicReference(Boolean.FALSE);

    /* renamed from: a  reason: collision with root package name */
    public long f22464a;

    /* renamed from: b  reason: collision with root package name */
    public final C1713h f22465b;

    /* renamed from: d  reason: collision with root package name */
    public AbstractC1073l0 f22467d;

    /* renamed from: e  reason: collision with root package name */
    public Throwable f22468e;

    /* renamed from: g  reason: collision with root package name */
    public List f22470g;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f22477n;

    /* renamed from: o  reason: collision with root package name */
    public Set f22478o;

    /* renamed from: p  reason: collision with root package name */
    public AbstractC1070k f22479p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f22480q;

    /* renamed from: r  reason: collision with root package name */
    public C1745x0 f22481r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f22482s;

    /* renamed from: u  reason: collision with root package name */
    public final C1079o0 f22484u;

    /* renamed from: v  reason: collision with root package name */
    public final AbstractC4831k f22485v;

    /* renamed from: c  reason: collision with root package name */
    public final Object f22466c = new Object();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f22469f = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public C2099c f22471h = new C2099c();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f22472i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f22473j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f22474k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final LinkedHashMap f22475l = new LinkedHashMap();

    /* renamed from: m  reason: collision with root package name */
    public final LinkedHashMap f22476m = new LinkedHashMap();

    /* renamed from: t  reason: collision with root package name */
    public final Qg.F0 f22483t = Qg.s0.c(EnumC1747y0.f22772h0);

    /* renamed from: w  reason: collision with root package name */
    public final J0.a f22486w = new J0.a(this);

    public E0(AbstractC4831k abstractC4831k) {
        C1713h c1713h = new C1713h(new C6672L(12, this));
        this.f22465b = c1713h;
        C1079o0 c1079o0 = new C1079o0((AbstractC1073l0) abstractC4831k.get(C1071k0.f12951Y));
        c1079o0.V(new C6077x(20, this));
        this.f22484u = c1079o0;
        this.f22485v = abstractC4831k.plus(c1713h).plus(c1079o0);
    }

    public static final void D(ArrayList arrayList, E0 e02, D d10) {
        arrayList.clear();
        synchronized (e02.f22466c) {
            Iterator it = e02.f22474k.iterator();
            while (it.hasNext()) {
                AbstractC1704c0 abstractC1704c0 = (AbstractC1704c0) it.next();
                abstractC1704c0.getClass();
                if (AbstractC3557B.K(null, d10)) {
                    arrayList.add(abstractC1704c0);
                    it.remove();
                }
            }
        }
    }

    public static /* synthetic */ void G(E0 e02, Exception exc, boolean z10, int i10) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        e02.F(exc, null, z10);
    }

    public static final Object p(E0 e02, AbstractC4825e abstractC4825e) {
        C1072l c1072l;
        if (!e02.z()) {
            C1072l c1072l2 = new C1072l(1, AbstractC5260f.z(abstractC4825e));
            c1072l2.u();
            synchronized (e02.f22466c) {
                if (e02.z()) {
                    c1072l = c1072l2;
                } else {
                    e02.f22479p = c1072l2;
                    c1072l = null;
                }
            }
            if (c1072l != null) {
                c1072l.resumeWith(jf.y.f36177a);
            }
            Object t10 = c1072l2.t();
            EnumC5000a enumC5000a = EnumC5000a.f41328Y;
            if (t10 == enumC5000a) {
                com.google.android.gms.internal.play_billing.N.k0(abstractC4825e);
            }
            if (t10 != enumC5000a) {
                return jf.y.f36177a;
            }
            return t10;
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(E0 e02) {
        int i10;
        kf.v vVar;
        synchronized (e02.f22466c) {
            try {
                if (!e02.f22475l.isEmpty()) {
                    ArrayList I12 = AbstractC6583a.I1(e02.f22475l.values());
                    e02.f22475l.clear();
                    ArrayList arrayList = new ArrayList(I12.size());
                    int size = I12.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        AbstractC1704c0 abstractC1704c0 = (AbstractC1704c0) I12.get(i11);
                        arrayList.add(new C3959i(abstractC1704c0, e02.f22476m.get(abstractC1704c0)));
                    }
                    e02.f22476m.clear();
                    vVar = arrayList;
                } else {
                    vVar = kf.v.f37483Y;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size2 = vVar.size();
        for (i10 = 0; i10 < size2; i10++) {
            C3959i c3959i = (C3959i) vVar.get(i10);
            AbstractC1704c0 abstractC1704c02 = (AbstractC1704c0) c3959i.f36155Y;
            AbstractC1702b0 abstractC1702b0 = (AbstractC1702b0) c3959i.f36156Z;
        }
    }

    public static final boolean r(E0 e02) {
        boolean y10;
        synchronized (e02.f22466c) {
            y10 = e02.y();
        }
        return y10;
    }

    public static final D s(E0 e02, D d10, C2099c c2099c) {
        C1744x c1744x = (C1744x) d10;
        if (c1744x.f22765w0.f22685E || c1744x.f22766x0) {
            return null;
        }
        Set set = e02.f22478o;
        if (set != null && set.contains(d10)) {
            return null;
        }
        int i10 = AbstractC3893i.f35891e;
        C3887c i11 = io.sentry.hints.i.i(new C6077x(21, d10), new C0043t(d10, 14, c2099c));
        try {
            AbstractC3893i j6 = i11.j();
            if (c2099c.y()) {
                C0007a0 c0007a0 = new C0007a0(c2099c, 8, d10);
                r rVar = ((C1744x) d10).f22765w0;
                if (!rVar.f22685E) {
                    rVar.f22685E = true;
                    c0007a0.mo122invoke();
                    rVar.f22685E = false;
                } else {
                    AbstractC1734s.j("Preparing a composition while composing is not supported".toString());
                    throw null;
                }
            }
            boolean w10 = ((C1744x) d10).w();
            AbstractC3893i.p(j6);
            if (!w10) {
                d10 = null;
            }
            return d10;
        } finally {
            v(i11);
        }
    }

    public static final boolean t(E0 e02) {
        boolean z10;
        List A10;
        synchronized (e02.f22466c) {
            z10 = false;
            if (e02.f22471h.isEmpty()) {
                if ((!e02.f22472i.isEmpty()) || e02.y()) {
                    z10 = true;
                }
            } else {
                C2099c c2099c = e02.f22471h;
                e02.f22471h = new C2099c();
                synchronized (e02.f22466c) {
                    A10 = e02.A();
                }
                try {
                    int size = A10.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((C1744x) ((D) A10.get(i10))).x(c2099c);
                        if (((EnumC1747y0) e02.f22483t.getValue()).compareTo(EnumC1747y0.f22771Z) <= 0) {
                            break;
                        }
                    }
                    e02.f22471h = new C2099c();
                    synchronized (e02.f22466c) {
                        if (e02.x() == null) {
                            if ((!e02.f22472i.isEmpty()) || e02.y()) {
                                z10 = true;
                            }
                        } else {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (e02.f22466c) {
                        e02.f22471h.r(c2099c);
                        throw th2;
                    }
                }
            }
        }
        return z10;
    }

    public static final void u(E0 e02, AbstractC1073l0 abstractC1073l0) {
        synchronized (e02.f22466c) {
            Throwable th2 = e02.f22468e;
            if (th2 == null) {
                if (((EnumC1747y0) e02.f22483t.getValue()).compareTo(EnumC1747y0.f22771Z) > 0) {
                    if (e02.f22467d == null) {
                        e02.f22467d = abstractC1073l0;
                        e02.x();
                    } else {
                        throw new IllegalStateException("Recomposer already running".toString());
                    }
                } else {
                    throw new IllegalStateException("Recomposer shut down".toString());
                }
            } else {
                throw th2;
            }
        }
    }

    public static void v(C3887c c3887c) {
        try {
            if (!(c3887c.v() instanceof C3894j)) {
                return;
            }
            throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
        } finally {
            c3887c.c();
        }
    }

    public final List A() {
        List list = this.f22470g;
        if (list == null) {
            ArrayList arrayList = this.f22469f;
            if (arrayList.isEmpty()) {
                list = kf.v.f37483Y;
            } else {
                list = new ArrayList(arrayList);
            }
            this.f22470g = list;
        }
        return list;
    }

    public final void B() {
        synchronized (this.f22466c) {
            this.f22482s = true;
        }
    }

    public final void C(D d10) {
        synchronized (this.f22466c) {
            ArrayList arrayList = this.f22474k;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC1704c0) arrayList.get(i10)).getClass();
                if (AbstractC3557B.K(null, d10)) {
                    ArrayList arrayList2 = new ArrayList();
                    D(arrayList2, this, d10);
                    while (!arrayList2.isEmpty()) {
                        E(arrayList2, null);
                        D(arrayList2, this, d10);
                    }
                    return;
                }
            }
        }
    }

    public final List E(List list, C2099c c2099c) {
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            ((AbstractC1704c0) obj).getClass();
            Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(null, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            D d10 = (D) entry.getKey();
            List list2 = (List) entry.getValue();
            AbstractC1734s.o(!((C1744x) d10).f22765w0.f22685E);
            int i11 = AbstractC3893i.f35891e;
            C3887c i12 = io.sentry.hints.i.i(new C6077x(21, d10), new C0043t(d10, 14, c2099c));
            try {
                AbstractC3893i j6 = i12.j();
                synchronized (this.f22466c) {
                    arrayList = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        AbstractC1704c0 abstractC1704c0 = (AbstractC1704c0) list2.get(i13);
                        LinkedHashMap linkedHashMap = this.f22475l;
                        abstractC1704c0.getClass();
                        Object obj3 = null;
                        List list3 = (List) linkedHashMap.get(null);
                        if (list3 != null) {
                            Object T12 = kf.s.T1(list3);
                            if (list3.isEmpty()) {
                                linkedHashMap.remove(null);
                            }
                            obj3 = T12;
                        }
                        arrayList.add(new C3959i(abstractC1704c0, obj3));
                    }
                }
                ((C1744x) d10).r(arrayList);
                AbstractC3893i.p(j6);
            } finally {
                v(i12);
            }
        }
        return kf.t.K2(hashMap.keySet());
    }

    public final void F(Exception exc, D d10, boolean z10) {
        if (((Boolean) f22463y.get()).booleanValue() && !(exc instanceof C1721l)) {
            synchronized (this.f22466c) {
                try {
                    int i10 = AbstractC1703c.f22606b;
                    AbstractC3612c.d("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                    this.f22473j.clear();
                    this.f22472i.clear();
                    this.f22471h = new C2099c();
                    this.f22474k.clear();
                    this.f22475l.clear();
                    this.f22476m.clear();
                    this.f22481r = new C1745x0(exc, z10);
                    if (d10 != null) {
                        ArrayList arrayList = this.f22477n;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            this.f22477n = arrayList;
                        }
                        if (!arrayList.contains(d10)) {
                            arrayList.add(d10);
                        }
                        this.f22469f.remove(d10);
                        this.f22470g = null;
                    }
                    x();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        synchronized (this.f22466c) {
            C1745x0 c1745x0 = this.f22481r;
            if (c1745x0 == null) {
                this.f22481r = new C1745x0(exc, false);
            } else {
                throw ((Exception) c1745x0.f22768b);
            }
        }
        throw exc;
    }

    public final void H() {
        AbstractC1070k abstractC1070k;
        synchronized (this.f22466c) {
            if (this.f22482s) {
                this.f22482s = false;
                abstractC1070k = x();
            } else {
                abstractC1070k = null;
            }
        }
        if (abstractC1070k != null) {
            abstractC1070k.resumeWith(jf.y.f36177a);
        }
    }

    public final Object I(AbstractC4825e abstractC4825e) {
        Object n12 = Ad.l.n1(abstractC4825e, this.f22465b, new B0(this, new D0(this, null), kotlin.jvm.internal.m.v(abstractC4825e.getContext()), null));
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        jf.y yVar = jf.y.f36177a;
        if (n12 != enumC5000a) {
            n12 = yVar;
        }
        if (n12 == enumC5000a) {
            return n12;
        }
        return yVar;
    }

    @Override // Z.AbstractC1738u
    public final void a(D d10, C3288a c3288a) {
        boolean z10 = ((C1744x) d10).f22765w0.f22685E;
        try {
            int i10 = AbstractC3893i.f35891e;
            C3887c i11 = io.sentry.hints.i.i(new C6077x(21, d10), new C0043t(d10, 14, null));
            AbstractC3893i j6 = i11.j();
            try {
                C1744x c1744x = (C1744x) d10;
                c1744x.m(c3288a);
                v(i11);
                if (!z10) {
                    j0.p.i().m();
                }
                synchronized (this.f22466c) {
                    if (((EnumC1747y0) this.f22483t.getValue()).compareTo(EnumC1747y0.f22771Z) > 0 && !A().contains(d10)) {
                        this.f22469f.add(d10);
                        this.f22470g = null;
                    }
                }
                try {
                    C(d10);
                    try {
                        c1744x.h();
                        c1744x.j();
                        if (!z10) {
                            j0.p.i().m();
                        }
                    } catch (Exception e10) {
                        G(this, e10, false, 6);
                    }
                } catch (Exception e11) {
                    F(e11, d10, true);
                }
            } finally {
                AbstractC3893i.p(j6);
            }
        } catch (Exception e12) {
            F(e12, d10, true);
        }
    }

    @Override // Z.AbstractC1738u
    public final boolean c() {
        return false;
    }

    @Override // Z.AbstractC1738u
    public final boolean d() {
        return false;
    }

    @Override // Z.AbstractC1738u
    public final int f() {
        return 1000;
    }

    @Override // Z.AbstractC1738u
    public final AbstractC4831k g() {
        return this.f22485v;
    }

    @Override // Z.AbstractC1738u
    public final void h(D d10) {
        AbstractC1070k abstractC1070k;
        synchronized (this.f22466c) {
            if (!this.f22472i.contains(d10)) {
                this.f22472i.add(d10);
                abstractC1070k = x();
            } else {
                abstractC1070k = null;
            }
        }
        if (abstractC1070k != null) {
            abstractC1070k.resumeWith(jf.y.f36177a);
        }
    }

    @Override // Z.AbstractC1738u
    public final AbstractC1702b0 i(AbstractC1704c0 abstractC1704c0) {
        AbstractC1702b0 abstractC1702b0;
        synchronized (this.f22466c) {
            abstractC1702b0 = (AbstractC1702b0) this.f22476m.remove(abstractC1704c0);
        }
        return abstractC1702b0;
    }

    @Override // Z.AbstractC1738u
    public final void l(D d10) {
        synchronized (this.f22466c) {
            try {
                Set set = this.f22478o;
                if (set == null) {
                    set = new LinkedHashSet();
                    this.f22478o = set;
                }
                set.add(d10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Z.AbstractC1738u
    public final void o(D d10) {
        synchronized (this.f22466c) {
            this.f22469f.remove(d10);
            this.f22470g = null;
            this.f22472i.remove(d10);
            this.f22473j.remove(d10);
        }
    }

    public final void w() {
        synchronized (this.f22466c) {
            if (((EnumC1747y0) this.f22483t.getValue()).compareTo(EnumC1747y0.f22774j0) >= 0) {
                this.f22483t.setValue(EnumC1747y0.f22771Z);
            }
        }
        this.f22484u.k(null);
    }

    public final AbstractC1070k x() {
        Qg.F0 f02 = this.f22483t;
        int compareTo = ((EnumC1747y0) f02.getValue()).compareTo(EnumC1747y0.f22771Z);
        ArrayList arrayList = this.f22474k;
        ArrayList arrayList2 = this.f22473j;
        ArrayList arrayList3 = this.f22472i;
        if (compareTo <= 0) {
            this.f22469f.clear();
            this.f22470g = kf.v.f37483Y;
            this.f22471h = new C2099c();
            arrayList3.clear();
            arrayList2.clear();
            arrayList.clear();
            this.f22477n = null;
            AbstractC1070k abstractC1070k = this.f22479p;
            if (abstractC1070k != null) {
                abstractC1070k.s(null);
            }
            this.f22479p = null;
            this.f22481r = null;
            return null;
        }
        C1745x0 c1745x0 = this.f22481r;
        EnumC1747y0 enumC1747y0 = EnumC1747y0.f22775k0;
        EnumC1747y0 enumC1747y02 = EnumC1747y0.f22772h0;
        if (c1745x0 == null) {
            if (this.f22467d == null) {
                this.f22471h = new C2099c();
                arrayList3.clear();
                if (y()) {
                    enumC1747y02 = EnumC1747y0.f22773i0;
                }
            } else {
                enumC1747y02 = ((arrayList3.isEmpty() ^ true) || this.f22471h.y() || (arrayList2.isEmpty() ^ true) || (arrayList.isEmpty() ^ true) || y()) ? enumC1747y0 : EnumC1747y0.f22774j0;
            }
        }
        f02.setValue(enumC1747y02);
        if (enumC1747y02 != enumC1747y0) {
            return null;
        }
        AbstractC1070k abstractC1070k2 = this.f22479p;
        this.f22479p = null;
        return abstractC1070k2;
    }

    public final boolean y() {
        boolean z10;
        if (!this.f22482s) {
            C1713h c1713h = this.f22465b;
            synchronized (c1713h.f22633Z) {
                z10 = !c1713h.f22635i0.isEmpty();
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        boolean z10;
        synchronized (this.f22466c) {
            z10 = true;
            if (!this.f22471h.y() && !(!this.f22472i.isEmpty())) {
                if (!y()) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    @Override // Z.AbstractC1738u
    public final void j(Set set) {
    }
}
