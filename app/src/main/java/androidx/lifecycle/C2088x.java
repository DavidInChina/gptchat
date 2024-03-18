package androidx.lifecycle;

import Qg.F0;
import Qg.s0;
import V1.C1478t;
import android.os.Looper;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2088x extends S {

    /* renamed from: f  reason: collision with root package name */
    public EnumC2082q f25386f;

    /* renamed from: g  reason: collision with root package name */
    public final WeakReference f25387g;

    /* renamed from: h  reason: collision with root package name */
    public int f25388h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f25389i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f25390j;

    /* renamed from: l  reason: collision with root package name */
    public final F0 f25392l;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f25384d = true;

    /* renamed from: e  reason: collision with root package name */
    public s.a f25385e = new s.a();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f25391k = new ArrayList();

    public C2088x(AbstractC2086v abstractC2086v) {
        AbstractC3557B.c0("provider", abstractC2086v);
        EnumC2082q enumC2082q = EnumC2082q.f25376Z;
        this.f25386f = enumC2082q;
        this.f25387g = new WeakReference(abstractC2086v);
        this.f25392l = s0.c(enumC2082q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.w, java.lang.Object] */
    @Override // androidx.lifecycle.S
    public final void a(AbstractC2085u abstractC2085u) {
        AbstractC2084t abstractC2084t;
        AbstractC2086v abstractC2086v;
        AbstractC3557B.c0("observer", abstractC2085u);
        j("addObserver");
        EnumC2082q enumC2082q = this.f25386f;
        EnumC2082q enumC2082q2 = EnumC2082q.f25375Y;
        if (enumC2082q != enumC2082q2) {
            enumC2082q2 = EnumC2082q.f25376Z;
        }
        ?? obj = new Object();
        HashMap hashMap = AbstractC2090z.f25394a;
        boolean z10 = abstractC2085u instanceof AbstractC2084t;
        boolean z11 = abstractC2085u instanceof DefaultLifecycleObserver;
        boolean z12 = false;
        if (z10 && z11) {
            abstractC2084t = new C2074i((DefaultLifecycleObserver) abstractC2085u, (AbstractC2084t) abstractC2085u);
        } else if (z11) {
            abstractC2084t = new C2074i((DefaultLifecycleObserver) abstractC2085u, (AbstractC2084t) null);
        } else if (z10) {
            abstractC2084t = (AbstractC2084t) abstractC2085u;
        } else {
            Class<?> cls = abstractC2085u.getClass();
            if (AbstractC2090z.b(cls) == 2) {
                Object obj2 = AbstractC2090z.f25395b.get(cls);
                AbstractC3557B.Z(obj2);
                List list = (List) obj2;
                if (list.size() != 1) {
                    int size = list.size();
                    AbstractC2076k[] abstractC2076kArr = new AbstractC2076k[size];
                    if (size <= 0) {
                        abstractC2084t = new C1478t(abstractC2076kArr);
                    } else {
                        AbstractC2090z.a((Constructor) list.get(0), abstractC2085u);
                        throw null;
                    }
                } else {
                    AbstractC2090z.a((Constructor) list.get(0), abstractC2085u);
                    throw null;
                }
            } else {
                abstractC2084t = new C2074i(abstractC2085u);
            }
        }
        obj.f25383b = abstractC2084t;
        obj.f25382a = enumC2082q2;
        if (((C2087w) this.f25385e.s(abstractC2085u, obj)) != null || (abstractC2086v = (AbstractC2086v) this.f25387g.get()) == null) {
            return;
        }
        if (this.f25388h != 0 || this.f25389i) {
            z12 = true;
        }
        EnumC2082q i10 = i(abstractC2085u);
        this.f25388h++;
        while (obj.f25382a.compareTo(i10) < 0 && this.f25385e.f45001j0.containsKey(abstractC2085u)) {
            this.f25391k.add(obj.f25382a);
            C2079n c2079n = EnumC2081p.Companion;
            EnumC2082q enumC2082q3 = obj.f25382a;
            c2079n.getClass();
            EnumC2081p a5 = C2079n.a(enumC2082q3);
            if (a5 != null) {
                obj.a(abstractC2086v, a5);
                ArrayList arrayList = this.f25391k;
                arrayList.remove(arrayList.size() - 1);
                i10 = i(abstractC2085u);
            } else {
                throw new IllegalStateException("no event up from " + obj.f25382a);
            }
        }
        if (!z12) {
            n();
        }
        this.f25388h--;
    }

    @Override // androidx.lifecycle.S
    public final EnumC2082q f() {
        return this.f25386f;
    }

    @Override // androidx.lifecycle.S
    public final void g(AbstractC2085u abstractC2085u) {
        AbstractC3557B.c0("observer", abstractC2085u);
        j("removeObserver");
        this.f25385e.r(abstractC2085u);
    }

    public final EnumC2082q i(AbstractC2085u abstractC2085u) {
        s.c cVar;
        EnumC2082q enumC2082q;
        C2087w c2087w;
        HashMap hashMap = this.f25385e.f45001j0;
        EnumC2082q enumC2082q2 = null;
        if (hashMap.containsKey(abstractC2085u)) {
            cVar = ((s.c) hashMap.get(abstractC2085u)).f45006i0;
        } else {
            cVar = null;
        }
        if (cVar != null && (c2087w = (C2087w) cVar.f45004Z) != null) {
            enumC2082q = c2087w.f25382a;
        } else {
            enumC2082q = null;
        }
        ArrayList arrayList = this.f25391k;
        if (!arrayList.isEmpty()) {
            enumC2082q2 = (EnumC2082q) arrayList.get(arrayList.size() - 1);
        }
        EnumC2082q enumC2082q3 = this.f25386f;
        AbstractC3557B.c0("state1", enumC2082q3);
        if (enumC2082q == null || enumC2082q.compareTo(enumC2082q3) >= 0) {
            enumC2082q = enumC2082q3;
        }
        if (enumC2082q2 == null || enumC2082q2.compareTo(enumC2082q) >= 0) {
            return enumC2082q;
        }
        return enumC2082q2;
    }

    public final void j(String str) {
        if (this.f25384d) {
            r.b.d0().f44150f.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(android.gov.nist.core.a.A("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void k(EnumC2081p enumC2081p) {
        AbstractC3557B.c0("event", enumC2081p);
        j("handleLifecycleEvent");
        l(enumC2081p.a());
    }

    public final void l(EnumC2082q enumC2082q) {
        EnumC2082q enumC2082q2 = this.f25386f;
        if (enumC2082q2 == enumC2082q) {
            return;
        }
        EnumC2082q enumC2082q3 = EnumC2082q.f25376Z;
        EnumC2082q enumC2082q4 = EnumC2082q.f25375Y;
        if (enumC2082q2 == enumC2082q3 && enumC2082q == enumC2082q4) {
            throw new IllegalStateException(("no event down from " + this.f25386f + " in component " + this.f25387g.get()).toString());
        }
        this.f25386f = enumC2082q;
        if (!this.f25389i && this.f25388h == 0) {
            this.f25389i = true;
            n();
            this.f25389i = false;
            if (this.f25386f == enumC2082q4) {
                this.f25385e = new s.a();
                return;
            }
            return;
        }
        this.f25390j = true;
    }

    public final void m(EnumC2082q enumC2082q) {
        AbstractC3557B.c0("state", enumC2082q);
        j("setCurrentState");
        l(enumC2082q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        r8.f25390j = false;
        r8.f25392l.setValue(r8.f25386f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        EnumC2081p enumC2081p;
        AbstractC2086v abstractC2086v = (AbstractC2086v) this.f25387g.get();
        if (abstractC2086v != null) {
            while (true) {
                s.a aVar = this.f25385e;
                if (aVar.f45015i0 != 0) {
                    s.c cVar = aVar.f45012Y;
                    AbstractC3557B.Z(cVar);
                    EnumC2082q enumC2082q = ((C2087w) cVar.f45004Z).f25382a;
                    s.c cVar2 = this.f25385e.f45013Z;
                    AbstractC3557B.Z(cVar2);
                    EnumC2082q enumC2082q2 = ((C2087w) cVar2.f45004Z).f25382a;
                    if (enumC2082q == enumC2082q2 && this.f25386f == enumC2082q2) {
                        break;
                    }
                    this.f25390j = false;
                    EnumC2082q enumC2082q3 = this.f25386f;
                    s.c cVar3 = this.f25385e.f45012Y;
                    AbstractC3557B.Z(cVar3);
                    if (enumC2082q3.compareTo(((C2087w) cVar3.f45004Z).f25382a) < 0) {
                        s.a aVar2 = this.f25385e;
                        s.b bVar = new s.b(aVar2.f45013Z, aVar2.f45012Y, 1);
                        aVar2.f45014h0.put(bVar, Boolean.FALSE);
                        while (bVar.hasNext() && !this.f25390j) {
                            Map.Entry entry = (Map.Entry) bVar.next();
                            AbstractC3557B.b0("next()", entry);
                            AbstractC2085u abstractC2085u = (AbstractC2085u) entry.getKey();
                            C2087w c2087w = (C2087w) entry.getValue();
                            while (c2087w.f25382a.compareTo(this.f25386f) > 0 && !this.f25390j && this.f25385e.f45001j0.containsKey(abstractC2085u)) {
                                C2079n c2079n = EnumC2081p.Companion;
                                EnumC2082q enumC2082q4 = c2087w.f25382a;
                                c2079n.getClass();
                                AbstractC3557B.c0("state", enumC2082q4);
                                int ordinal = enumC2082q4.ordinal();
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        if (ordinal != 4) {
                                            enumC2081p = null;
                                        } else {
                                            enumC2081p = EnumC2081p.ON_PAUSE;
                                        }
                                    } else {
                                        enumC2081p = EnumC2081p.ON_STOP;
                                    }
                                } else {
                                    enumC2081p = EnumC2081p.ON_DESTROY;
                                }
                                if (enumC2081p != null) {
                                    this.f25391k.add(enumC2081p.a());
                                    c2087w.a(abstractC2086v, enumC2081p);
                                    ArrayList arrayList = this.f25391k;
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event down from " + c2087w.f25382a);
                                }
                            }
                        }
                    }
                    s.c cVar4 = this.f25385e.f45013Z;
                    if (!this.f25390j && cVar4 != null && this.f25386f.compareTo(((C2087w) cVar4.f45004Z).f25382a) > 0) {
                        s.a aVar3 = this.f25385e;
                        aVar3.getClass();
                        s.d dVar = new s.d(aVar3);
                        aVar3.f45014h0.put(dVar, Boolean.FALSE);
                        while (dVar.hasNext() && !this.f25390j) {
                            Map.Entry entry2 = (Map.Entry) dVar.next();
                            AbstractC2085u abstractC2085u2 = (AbstractC2085u) entry2.getKey();
                            C2087w c2087w2 = (C2087w) entry2.getValue();
                            while (c2087w2.f25382a.compareTo(this.f25386f) < 0 && !this.f25390j && this.f25385e.f45001j0.containsKey(abstractC2085u2)) {
                                this.f25391k.add(c2087w2.f25382a);
                                C2079n c2079n2 = EnumC2081p.Companion;
                                EnumC2082q enumC2082q5 = c2087w2.f25382a;
                                c2079n2.getClass();
                                EnumC2081p a5 = C2079n.a(enumC2082q5);
                                if (a5 != null) {
                                    c2087w2.a(abstractC2086v, a5);
                                    ArrayList arrayList2 = this.f25391k;
                                    arrayList2.remove(arrayList2.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event up from " + c2087w2.f25382a);
                                }
                            }
                        }
                    }
                } else {
                    break;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
    }
}
