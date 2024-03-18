package io.sentry.hints;

import H0.C0717z0;
import Qg.F0;
import Z.E0;
import Z.h1;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import b0.C2099c;
import e0.C2741d;
import e0.C2755r;
import f0.C2930a;
import f0.C2931b;
import g0.C3135b;
import id.AbstractC3557B;
import j0.AbstractC3893i;
import j0.C3886b;
import j0.C3887c;
import j0.C3892h;
import j0.L;
import j0.o;
import j0.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kf.t;
import nf.AbstractC4828h;
import v.AbstractC5933b;
import wf.AbstractC6216a;
import y.C6473k;

/* loaded from: classes2.dex */
public final class i implements AbstractC5933b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f34356a;

    public /* synthetic */ i(int i10) {
        this.f34356a = i10;
    }

    public static final void b(J0.a aVar) {
        F0 f02;
        c0.g gVar;
        C2931b c2931b;
        int i10;
        Object obj;
        F0 f03 = E0.f22462x;
        do {
            f02 = E0.f22462x;
            gVar = (c0.g) f02.getValue();
            c2931b = (C2931b) gVar;
            C2741d c2741d = c2931b.f29518h0;
            C2930a c2930a = (C2930a) c2741d.get(aVar);
            if (c2930a != null) {
                boolean z10 = false;
                if (aVar != null) {
                    i10 = aVar.hashCode();
                } else {
                    i10 = 0;
                }
                C2755r c2755r = c2741d.f28686Y;
                C2755r v10 = c2755r.v(i10, aVar, 0);
                if (c2755r != v10) {
                    if (v10 == null) {
                        c2741d = C2741d.f28685h0;
                        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>", c2741d);
                    } else {
                        c2741d = new C2741d(v10, c2741d.f28687Z - 1);
                    }
                }
                C3135b c3135b = C3135b.f31015a;
                Object obj2 = c2930a.f29513a;
                if (obj2 != c3135b) {
                    z10 = true;
                }
                Object obj3 = c2930a.f29514b;
                if (z10) {
                    Object obj4 = c2741d.get(obj2);
                    AbstractC3557B.Z(obj4);
                    c2741d = c2741d.b(obj2, new C2930a(((C2930a) obj4).f29513a, obj3));
                }
                if (obj3 != c3135b) {
                    Object obj5 = c2741d.get(obj3);
                    AbstractC3557B.Z(obj5);
                    c2741d = c2741d.b(obj3, new C2930a(obj2, ((C2930a) obj5).f29514b));
                }
                if (obj2 != c3135b) {
                    obj = c2931b.f29516Y;
                } else {
                    obj = obj3;
                }
                if (obj3 != c3135b) {
                    obj2 = c2931b.f29517Z;
                }
                c2931b = new C2931b(obj, obj2, c2741d);
            }
            if (gVar == c2931b) {
                return;
            }
        } while (!f02.e(gVar, c2931b));
    }

    public static Y.b c(long j6) {
        Set set;
        Set set2;
        int i10 = Y.b.f22007c;
        switch (Y.c.f22010Z.f29664Y) {
            case 17:
                set = Y.a.f22004h0;
                break;
            default:
                set = Y.c.f22011h0;
                break;
        }
        switch (Y.a.f22003Z.f29664Y) {
            case 17:
                set2 = Y.a.f22004h0;
                break;
            default:
                set2 = Y.c.f22011h0;
                break;
        }
        float b10 = Z0.g.b(j6);
        int i11 = 0;
        float f6 = 0;
        if (Float.compare(b10, f6) >= 0) {
            if (!set.isEmpty()) {
                List list = Y.c.f22012i0;
                int size = list.size();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 < size) {
                        int i14 = ((Y.c) list.get(i12)).f22013Y;
                        if (set.contains(new Y.c(i14))) {
                            f8.e eVar = Y.c.f22010Z;
                            if (Float.compare(b10, f8.e.j(i14)) >= 0) {
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        i12++;
                    }
                }
                f8.e eVar2 = Y.a.f22003Z;
                float a5 = Z0.g.a(j6);
                if (Float.compare(a5, f6) >= 0) {
                    if (!set2.isEmpty()) {
                        List list2 = Y.a.f22005i0;
                        int size2 = list2.size();
                        int i15 = 2;
                        while (true) {
                            if (i11 < size2) {
                                int i16 = ((Y.a) list2.get(i11)).f22006Y;
                                if (set2.contains(new Y.a(i16))) {
                                    f8.e eVar3 = Y.a.f22003Z;
                                    if (Float.compare(a5, f8.e.k(i16)) >= 0) {
                                        i15 = i16;
                                    } else {
                                        i15 = i16;
                                    }
                                }
                                i11++;
                            }
                        }
                        return new Y.b(i13, i15);
                    }
                    throw new IllegalArgumentException("Must support at least one size class".toString());
                }
                throw new IllegalArgumentException("Width must not be negative".toString());
            }
            throw new IllegalArgumentException("Must support at least one size class".toString());
        }
        throw new IllegalArgumentException("Width must not be negative".toString());
    }

    public static AbstractC3893i d() {
        return p.g((AbstractC3893i) p.f35917a.a(), null, false);
    }

    public static Object e(AbstractC6216a abstractC6216a, wf.k kVar) {
        AbstractC3893i abstractC3893i;
        C3887c c3887c;
        if (kVar == null) {
            return abstractC6216a.mo122invoke();
        }
        AbstractC3893i abstractC3893i2 = (AbstractC3893i) p.f35917a.a();
        if (abstractC3893i2 != null && !(abstractC3893i2 instanceof C3887c)) {
            if (kVar == null) {
                return abstractC6216a.mo122invoke();
            }
            abstractC3893i = abstractC3893i2.t(kVar);
        } else {
            if (abstractC3893i2 instanceof C3887c) {
                c3887c = (C3887c) abstractC3893i2;
            } else {
                c3887c = null;
            }
            abstractC3893i = new L(c3887c, kVar, null, true, false);
        }
        try {
            AbstractC3893i j6 = abstractC3893i.j();
            Object mo122invoke = abstractC6216a.mo122invoke();
            AbstractC3893i.p(j6);
            return mo122invoke;
        } finally {
            abstractC3893i.c();
        }
    }

    public static C3892h f(C6473k c6473k) {
        h1 h1Var = p.f35917a;
        p.e(o.f35915h0);
        synchronized (p.f35918b) {
            p.f35923g = t.x2(c6473k, p.f35923g);
        }
        return new C3892h(c6473k, 1);
    }

    public static C3892h g(C0717z0 c0717z0) {
        synchronized (p.f35918b) {
            p.f35924h = t.x2(c0717z0, p.f35924h);
        }
        p.e(o.f35914Z);
        return new C3892h(c0717z0, 0);
    }

    public static void h() {
        boolean z10;
        synchronized (p.f35918b) {
            C2099c c2099c = ((C3886b) p.f35925i.get()).f35877i;
            z10 = false;
            if (c2099c != null) {
                if (c2099c.y()) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            p.e(o.f35914Z);
        }
    }

    public static C3887c i(wf.k kVar, wf.k kVar2) {
        C3887c c3887c;
        C3887c B10;
        AbstractC3893i i10 = p.i();
        if (i10 instanceof C3887c) {
            c3887c = (C3887c) i10;
        } else {
            c3887c = null;
        }
        if (c3887c != null && (B10 = c3887c.B(kVar, kVar2)) != null) {
            return B10;
        }
        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
    }

    @Override // v.AbstractC5933b
    public final ArrayList a(PackageManager packageManager, String str) {
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
        ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
        for (Signature signature : packageInfo.signatures) {
            byte[] M10 = AbstractC4828h.M(signature);
            if (M10 == null) {
                return null;
            }
            arrayList.add(M10);
        }
        return arrayList;
    }

    public final String toString() {
        switch (this.f34356a) {
            case 18:
                return "Empty";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, int i11) {
        this(1);
        this.f34356a = i10;
        switch (i10) {
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
            case 6:
            case 18:
            default:
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                this(29);
                return;
        }
    }
}
