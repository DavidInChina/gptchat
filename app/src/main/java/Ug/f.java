package Ug;

import Ng.AbstractC1068j;
import Ng.AbstractC1070k;
import Ng.C1072l;
import Ng.P0;
import Q1.u;
import Sg.z;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.y;
import kf.t;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q1.AbstractC5260f;
import wf.k;
import wf.n;
import wf.o;

/* loaded from: classes.dex */
public final class f extends AbstractC1068j implements g, P0 {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17871k0 = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "state$volatile");

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4831k f17872Y;

    /* renamed from: h0  reason: collision with root package name */
    public Object f17874h0;
    private volatile /* synthetic */ Object state$volatile = i.f17878a;

    /* renamed from: Z  reason: collision with root package name */
    public ArrayList f17873Z = new ArrayList(2);

    /* renamed from: i0  reason: collision with root package name */
    public int f17875i0 = -1;

    /* renamed from: j0  reason: collision with root package name */
    public Object f17876j0 = i.f17881d;

    public f(AbstractC4831k abstractC4831k) {
        this.f17872Y = abstractC4831k;
    }

    @Override // Ng.AbstractC1068j
    public final void a(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17871k0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == i.f17879b) {
                return;
            }
            u uVar = i.f17880c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f17873Z;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a();
            }
            this.f17876j0 = i.f17881d;
            this.f17873Z = null;
            return;
        }
    }

    @Override // Ng.P0
    public final void c(z zVar, int i10) {
        this.f17874h0 = zVar;
        this.f17875i0 = i10;
    }

    public final Object e(AbstractC4825e abstractC4825e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17871k0;
        Object obj = atomicReferenceFieldUpdater.get(this);
        AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>", obj);
        d dVar = (d) obj;
        Object obj2 = this.f17876j0;
        ArrayList arrayList = this.f17873Z;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d dVar2 = (d) it.next();
                if (dVar2 != dVar) {
                    dVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, i.f17879b);
            this.f17876j0 = i.f17881d;
            this.f17873Z = null;
        }
        return dVar.b(dVar.f17860c.invoke(dVar.f17858a, dVar.f17861d, obj2), abstractC4825e);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5 A[PHI: r11 
      PHI: (r11v2 java.lang.Object) = (r11v3 java.lang.Object), (r11v1 java.lang.Object) binds: [B:50:0x00d2, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(AbstractC4825e abstractC4825e) {
        e eVar;
        Object obj;
        EnumC5000a enumC5000a;
        int i10;
        f fVar;
        Object obj2;
        k kVar;
        if (abstractC4825e instanceof e) {
            eVar = (e) abstractC4825e;
            int i11 = eVar.f17870i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f17870i0 = i11 - Integer.MIN_VALUE;
                obj = eVar.f17868Z;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = eVar.f17870i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = eVar.f17867Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    eVar.f17867Y = this;
                    eVar.f17870i0 = 1;
                    C1072l c1072l = new C1072l(1, AbstractC5260f.z(eVar));
                    c1072l.u();
                    loop0: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17871k0;
                        Object obj3 = atomicReferenceFieldUpdater.get(this);
                        u uVar = i.f17878a;
                        obj2 = y.f36177a;
                        if (obj3 == uVar) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, c1072l)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj3) {
                                    break;
                                }
                            }
                            c1072l.w(this);
                            break loop0;
                        } else if (obj3 instanceof List) {
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, uVar)) {
                                    List list = (List) obj3;
                                    for (Object obj4 : (Iterable) obj3) {
                                        d g10 = g(obj4);
                                        AbstractC3557B.Z(g10);
                                        g10.f17864g = null;
                                        g10.f17865h = -1;
                                        j(g10, true);
                                    }
                                } else if (atomicReferenceFieldUpdater.get(this) != obj3) {
                                    break;
                                }
                            }
                        } else if (obj3 instanceof d) {
                            d dVar = (d) obj3;
                            Object obj5 = this.f17876j0;
                            o oVar = dVar.f17863f;
                            if (oVar != null) {
                                kVar = (k) oVar.invoke(this, dVar.f17861d, obj5);
                            } else {
                                kVar = null;
                            }
                            c1072l.A(obj2, kVar);
                        } else {
                            throw new IllegalStateException(("unexpected state: " + obj3).toString());
                        }
                    }
                    Object t10 = c1072l.t();
                    EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                    if (t10 == enumC5000a2) {
                        N.k0(eVar);
                    }
                    if (t10 == enumC5000a2) {
                        obj2 = t10;
                    }
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    fVar = this;
                }
                eVar.f17867Y = null;
                eVar.f17870i0 = 2;
                obj = fVar.e(eVar);
                if (obj != enumC5000a) {
                    return enumC5000a;
                }
                return obj;
            }
        }
        eVar = new e(this, abstractC4825e);
        obj = eVar.f17868Z;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = eVar.f17870i0;
        if (i10 == 0) {
        }
        eVar.f17867Y = null;
        eVar.f17870i0 = 2;
        obj = fVar.e(eVar);
        if (obj != enumC5000a) {
        }
    }

    public final d g(Object obj) {
        ArrayList arrayList = this.f17873Z;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((d) next).f17858a == obj) {
                obj2 = next;
                break;
            }
        }
        d dVar = (d) obj2;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void i(c cVar, n nVar) {
        Object obj = cVar.f17854a;
        o oVar = cVar.f17857d;
        j(new d(this, obj, cVar.f17855b, cVar.f17856c, null, (AbstractC5163j) nVar, oVar), false);
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return y.f36177a;
    }

    public final void j(d dVar, boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17871k0;
        if (atomicReferenceFieldUpdater.get(this) instanceof d) {
            return;
        }
        Object obj = dVar.f17858a;
        if (!z10) {
            ArrayList arrayList = this.f17873Z;
            AbstractC3557B.Z(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((d) it.next()).f17858a == obj) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        dVar.f17859b.invoke(obj, this, dVar.f17861d);
        if (this.f17876j0 == i.f17881d) {
            if (!z10) {
                ArrayList arrayList2 = this.f17873Z;
                AbstractC3557B.Z(arrayList2);
                arrayList2.add(dVar);
            }
            dVar.f17864g = this.f17874h0;
            dVar.f17865h = this.f17875i0;
            this.f17874h0 = null;
            this.f17875i0 = -1;
            return;
        }
        atomicReferenceFieldUpdater.set(this, dVar);
    }

    public final int m(Object obj, Object obj2) {
        k kVar;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17871k0;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof AbstractC1070k) {
                d g10 = g(obj);
                if (g10 != null) {
                    o oVar = g10.f17863f;
                    if (oVar != null) {
                        kVar = (k) oVar.invoke(this, g10.f17861d, obj2);
                    } else {
                        kVar = null;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, g10)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    AbstractC1070k abstractC1070k = (AbstractC1070k) obj3;
                    this.f17876j0 = obj2;
                    u x10 = abstractC1070k.x(y.f36177a, kVar);
                    if (x10 == null) {
                        this.f17876j0 = i.f17881d;
                        return 2;
                    }
                    abstractC1070k.B(x10);
                    return 0;
                }
                continue;
            } else if (AbstractC3557B.K(obj3, i.f17879b) || (obj3 instanceof d)) {
                return 3;
            } else {
                if (AbstractC3557B.K(obj3, i.f17880c)) {
                    return 2;
                }
                if (AbstractC3557B.K(obj3, i.f17878a)) {
                    List F02 = AbstractC4344b.F0(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, F02)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                } else if (obj3 instanceof List) {
                    ArrayList x22 = t.x2(obj, (Collection) obj3);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, x22)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                } else {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
            }
        }
    }
}
