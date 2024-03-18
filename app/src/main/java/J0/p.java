package j0;

import Z.C1709f;
import Z.h1;
import Z.p1;
import b0.C2099c;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final h1 f35917a = new h1();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f35918b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static n f35919c;

    /* renamed from: d  reason: collision with root package name */
    public static int f35920d;

    /* renamed from: e  reason: collision with root package name */
    public static final C3896l f35921e;

    /* renamed from: f  reason: collision with root package name */
    public static final C3877B f35922f;

    /* renamed from: g  reason: collision with root package name */
    public static List f35923g;

    /* renamed from: h  reason: collision with root package name */
    public static List f35924h;

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReference f35925i;

    /* renamed from: j  reason: collision with root package name */
    public static final AbstractC3893i f35926j;

    /* renamed from: k  reason: collision with root package name */
    public static final C1709f f35927k;

    /* JADX WARN: Type inference failed for: r0v8, types: [Z.f, java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j0.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, j0.B] */
    static {
        n nVar = n.f35909j0;
        f35919c = nVar;
        f35920d = 1;
        ?? obj = new Object();
        obj.f35899b = new int[16];
        obj.f35900c = new int[16];
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        obj.f35901d = iArr;
        f35921e = obj;
        ?? obj2 = new Object();
        obj2.f35837b = new int[16];
        obj2.f35838c = new p1[16];
        f35922f = obj2;
        kf.v vVar = kf.v.f37483Y;
        f35923g = vVar;
        f35924h = vVar;
        int i12 = f35920d;
        f35920d = i12 + 1;
        C3886b c3886b = new C3886b(i12, nVar);
        f35919c = f35919c.M(c3886b.f35893b);
        AtomicReference atomicReference = new AtomicReference(c3886b);
        f35925i = atomicReference;
        f35926j = (AbstractC3893i) atomicReference.get();
        f35927k = new AtomicInteger(0);
    }

    public static final wf.k a(wf.k kVar, wf.k kVar2) {
        if (kVar != null && kVar2 != null && !AbstractC3557B.K(kVar, kVar2)) {
            return new C3885a(kVar, kVar2, 3);
        }
        if (kVar == null) {
            return kVar2;
        }
        return kVar;
    }

    public static final HashMap b(C3887c c3887c, C3887c c3887c2, n nVar) {
        AbstractC3884I r10;
        C2099c w10 = c3887c2.w();
        int d10 = c3887c.d();
        if (w10 == null) {
            return null;
        }
        n I10 = c3887c2.e().M(c3887c2.d()).I(c3887c2.f35879k);
        Object[] objArr = w10.f25559Z;
        int i10 = w10.f25558Y;
        HashMap hashMap = null;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet", obj);
            AbstractC3882G abstractC3882G = (AbstractC3882G) obj;
            AbstractC3884I r11 = abstractC3882G.r();
            AbstractC3884I r12 = r(r11, d10, nVar);
            if (r12 != null && (r10 = r(r11, d10, I10)) != null && !AbstractC3557B.K(r12, r10)) {
                AbstractC3884I r13 = r(r11, c3887c2.d(), c3887c2.e());
                if (r13 != null) {
                    AbstractC3884I s10 = abstractC3882G.s(r10, r12, r13);
                    if (s10 == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(r12, s10);
                    hashMap = hashMap;
                } else {
                    q();
                    throw null;
                }
            }
        }
        return hashMap;
    }

    public static final void c(AbstractC3893i abstractC3893i) {
        C3887c c3887c;
        Object obj;
        int i10;
        if (!f35919c.y(abstractC3893i.d())) {
            StringBuilder sb2 = new StringBuilder("Snapshot is not open: id=");
            sb2.append(abstractC3893i.d());
            sb2.append(", disposed=");
            sb2.append(abstractC3893i.f35894c);
            sb2.append(", applied=");
            if (abstractC3893i instanceof C3887c) {
                c3887c = (C3887c) abstractC3893i;
            } else {
                c3887c = null;
            }
            if (c3887c != null) {
                obj = Boolean.valueOf(c3887c.f35882n);
            } else {
                obj = "read-only";
            }
            sb2.append(obj);
            sb2.append(", lowestPin=");
            synchronized (f35918b) {
                C3896l c3896l = f35921e;
                if (c3896l.f35898a > 0) {
                    i10 = c3896l.f35899b[0];
                } else {
                    i10 = -1;
                }
            }
            sb2.append(i10);
            throw new IllegalStateException(sb2.toString().toString());
        }
    }

    public static final n d(int i10, int i11, n nVar) {
        while (i10 < i11) {
            nVar = nVar.M(i10);
            i10++;
        }
        return nVar;
    }

    public static final Object e(wf.k kVar) {
        Object obj;
        C2099c c2099c;
        Object u10;
        AbstractC3893i abstractC3893i = f35926j;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot", abstractC3893i);
        C3886b c3886b = (C3886b) abstractC3893i;
        synchronized (f35918b) {
            try {
                obj = f35925i.get();
                c2099c = ((C3886b) obj).f35877i;
                if (c2099c != null) {
                    f35927k.addAndGet(1);
                }
                u10 = u((AbstractC3893i) obj, kVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c2099c != null) {
            try {
                List list = f35923g;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((wf.n) list.get(i10)).invoke(c2099c, obj);
                }
            } finally {
                f35927k.addAndGet(-1);
            }
        }
        synchronized (f35918b) {
            f();
            if (c2099c != null) {
                Object[] objArr = c2099c.f25559Z;
                int i11 = c2099c.f25558Y;
                for (int i12 = 0; i12 < i11; i12++) {
                    Object obj2 = objArr[i12];
                    AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet", obj2);
                    p((AbstractC3882G) obj2);
                }
            }
        }
        return u10;
    }

    public static final void f() {
        C3877B c3877b = f35922f;
        int i10 = c3877b.f35836a;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            Object obj = null;
            if (i11 >= i10) {
                break;
            }
            p1 p1Var = c3877b.f35838c[i11];
            if (p1Var != null) {
                obj = p1Var.get();
            }
            if (obj != null && !(!o((AbstractC3882G) obj))) {
                if (i12 != i11) {
                    c3877b.f35838c[i12] = p1Var;
                    int[] iArr = c3877b.f35837b;
                    iArr[i12] = iArr[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < i10; i13++) {
            c3877b.f35838c[i13] = null;
            c3877b.f35837b[i13] = 0;
        }
        if (i12 != i10) {
            c3877b.f35836a = i12;
        }
    }

    public static final AbstractC3893i g(AbstractC3893i abstractC3893i, wf.k kVar, boolean z10) {
        C3887c c3887c;
        boolean z11 = abstractC3893i instanceof C3887c;
        if (!z11 && abstractC3893i != null) {
            return new M(abstractC3893i, kVar, z10);
        }
        if (z11) {
            c3887c = (C3887c) abstractC3893i;
        } else {
            c3887c = null;
        }
        return new L(c3887c, kVar, null, false, z10);
    }

    public static final AbstractC3884I h(AbstractC3884I abstractC3884I) {
        AbstractC3884I r10;
        int i10 = AbstractC3893i.f35891e;
        AbstractC3893i i11 = i();
        AbstractC3884I r11 = r(abstractC3884I, i11.d(), i11.e());
        if (r11 == null) {
            synchronized (f35918b) {
                AbstractC3893i i12 = i();
                r10 = r(abstractC3884I, i12.d(), i12.e());
            }
            if (r10 != null) {
                return r10;
            }
            q();
            throw null;
        }
        return r11;
    }

    public static final AbstractC3893i i() {
        AbstractC3893i abstractC3893i = (AbstractC3893i) f35917a.a();
        if (abstractC3893i == null) {
            return (AbstractC3893i) f35925i.get();
        }
        return abstractC3893i;
    }

    public static final wf.k j(boolean z10, wf.k kVar, wf.k kVar2) {
        if (!z10) {
            kVar2 = null;
        }
        if (kVar != null && kVar2 != null && !AbstractC3557B.K(kVar, kVar2)) {
            return new C3885a(kVar, kVar2, 2);
        }
        if (kVar == null) {
            return kVar2;
        }
        return kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC3884I k(AbstractC3884I abstractC3884I, AbstractC3882G abstractC3882G) {
        AbstractC3884I r10 = abstractC3882G.r();
        int i10 = f35920d;
        C3896l c3896l = f35921e;
        if (c3896l.f35898a > 0) {
            i10 = c3896l.f35899b[0];
        }
        int i11 = i10 - 1;
        AbstractC3884I abstractC3884I2 = null;
        AbstractC3884I abstractC3884I3 = null;
        while (true) {
            if (r10 != null) {
                int i12 = r10.f35854a;
                if (i12 == 0) {
                    break;
                }
                if (i12 != 0 && i12 <= i11) {
                    if ((r6 = i12 + 0) >= 0) {
                    }
                    boolean z10 = false;
                    if (z10) {
                        continue;
                    } else if (abstractC3884I3 == null) {
                        abstractC3884I3 = r10;
                    } else if (r10.f35854a >= abstractC3884I3.f35854a) {
                        abstractC3884I2 = abstractC3884I3;
                    }
                }
                r10 = r10.f35855b;
            } else {
                break;
            }
        }
        abstractC3884I2 = r10;
        if (abstractC3884I2 != null) {
            abstractC3884I2.f35854a = Integer.MAX_VALUE;
            return abstractC3884I2;
        }
        AbstractC3884I b10 = abstractC3884I.b();
        b10.f35854a = Integer.MAX_VALUE;
        b10.f35855b = abstractC3882G.r();
        abstractC3882G.y(b10);
        return b10;
    }

    public static final AbstractC3884I l(AbstractC3884I abstractC3884I, AbstractC3882G abstractC3882G, AbstractC3893i abstractC3893i) {
        AbstractC3884I k10;
        synchronized (f35918b) {
            k10 = k(abstractC3884I, abstractC3882G);
            k10.a(abstractC3884I);
            k10.f35854a = abstractC3893i.d();
        }
        return k10;
    }

    public static final void m(AbstractC3893i abstractC3893i, AbstractC3882G abstractC3882G) {
        abstractC3893i.s(abstractC3893i.h() + 1);
        wf.k i10 = abstractC3893i.i();
        if (i10 != null) {
            i10.invoke(abstractC3882G);
        }
    }

    public static final AbstractC3884I n(AbstractC3884I abstractC3884I, AbstractC3882G abstractC3882G, AbstractC3893i abstractC3893i, AbstractC3884I abstractC3884I2) {
        AbstractC3884I k10;
        if (abstractC3893i.g()) {
            abstractC3893i.n(abstractC3882G);
        }
        int d10 = abstractC3893i.d();
        if (abstractC3884I2.f35854a == d10) {
            return abstractC3884I2;
        }
        synchronized (f35918b) {
            k10 = k(abstractC3884I, abstractC3882G);
        }
        k10.f35854a = d10;
        abstractC3893i.n(abstractC3882G);
        return k10;
    }

    public static final boolean o(AbstractC3882G abstractC3882G) {
        AbstractC3884I abstractC3884I;
        int i10 = f35920d;
        C3896l c3896l = f35921e;
        if (c3896l.f35898a > 0) {
            i10 = c3896l.f35899b[0];
        }
        AbstractC3884I abstractC3884I2 = null;
        AbstractC3884I abstractC3884I3 = null;
        int i11 = 0;
        for (AbstractC3884I r10 = abstractC3882G.r(); r10 != null; r10 = r10.f35855b) {
            int i12 = r10.f35854a;
            if (i12 != 0) {
                if (i12 < i10) {
                    if (abstractC3884I2 == null) {
                        i11++;
                        abstractC3884I2 = r10;
                    } else {
                        if (i12 < abstractC3884I2.f35854a) {
                            abstractC3884I = abstractC3884I2;
                            abstractC3884I2 = r10;
                        } else {
                            abstractC3884I = r10;
                        }
                        if (abstractC3884I3 == null) {
                            abstractC3884I3 = abstractC3882G.r();
                            AbstractC3884I abstractC3884I4 = abstractC3884I3;
                            while (true) {
                                if (abstractC3884I3 != null) {
                                    int i13 = abstractC3884I3.f35854a;
                                    if (i13 >= i10) {
                                        break;
                                    }
                                    if (abstractC3884I4.f35854a < i13) {
                                        abstractC3884I4 = abstractC3884I3;
                                    }
                                    abstractC3884I3 = abstractC3884I3.f35855b;
                                } else {
                                    abstractC3884I3 = abstractC3884I4;
                                    break;
                                }
                            }
                        }
                        abstractC3884I2.f35854a = 0;
                        abstractC3884I2.a(abstractC3884I3);
                        abstractC3884I2 = abstractC3884I;
                    }
                } else {
                    i11++;
                }
            }
        }
        if (i11 <= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(AbstractC3882G abstractC3882G) {
        Object obj;
        Object obj2;
        Object obj3;
        if (o(abstractC3882G)) {
            C3877B c3877b = f35922f;
            int i10 = c3877b.f35836a;
            int identityHashCode = System.identityHashCode(abstractC3882G);
            int i11 = -1;
            if (i10 > 0) {
                int i12 = c3877b.f35836a - 1;
                int i13 = 0;
                while (true) {
                    if (i13 <= i12) {
                        int i14 = (i13 + i12) >>> 1;
                        int i15 = c3877b.f35837b[i14];
                        if (i15 < identityHashCode) {
                            i13 = i14 + 1;
                        } else if (i15 > identityHashCode) {
                            i12 = i14 - 1;
                        } else {
                            p1 p1Var = c3877b.f35838c[i14];
                            if (p1Var != null) {
                                obj = p1Var.get();
                            } else {
                                obj = null;
                            }
                            if (abstractC3882G == obj) {
                                i11 = i14;
                            } else {
                                int i16 = i14 - 1;
                                while (-1 < i16 && c3877b.f35837b[i16] == identityHashCode) {
                                    p1 p1Var2 = c3877b.f35838c[i16];
                                    if (p1Var2 != null) {
                                        obj3 = p1Var2.get();
                                    } else {
                                        obj3 = null;
                                    }
                                    if (obj3 == abstractC3882G) {
                                        break;
                                    }
                                    i16--;
                                }
                                int i17 = c3877b.f35836a;
                                i16 = i14 + 1;
                                while (true) {
                                    if (i16 < i17) {
                                        if (c3877b.f35837b[i16] != identityHashCode) {
                                            i16 = -(i16 + 1);
                                            break;
                                        }
                                        p1 p1Var3 = c3877b.f35838c[i16];
                                        if (p1Var3 != null) {
                                            obj2 = p1Var3.get();
                                        } else {
                                            obj2 = null;
                                        }
                                        if (obj2 == abstractC3882G) {
                                            break;
                                        }
                                        i16++;
                                    } else {
                                        i16 = -(c3877b.f35836a + 1);
                                        break;
                                    }
                                }
                                i11 = i16;
                            }
                        }
                    } else {
                        i11 = -(i13 + 1);
                        break;
                    }
                }
                if (i11 >= 0) {
                    return;
                }
            }
            int i18 = -(i11 + 1);
            p1[] p1VarArr = c3877b.f35838c;
            int length = p1VarArr.length;
            if (i10 == length) {
                int i19 = length * 2;
                p1[] p1VarArr2 = new p1[i19];
                int[] iArr = new int[i19];
                int i20 = i18 + 1;
                kf.q.W2(i20, i18, i10, p1VarArr, p1VarArr2);
                kf.q.a3(c3877b.f35838c, p1VarArr2, 0, i18, 6);
                kf.q.V2(i20, i18, i10, c3877b.f35837b, iArr);
                kf.q.Z2(c3877b.f35837b, iArr, i18, 6);
                c3877b.f35838c = p1VarArr2;
                c3877b.f35837b = iArr;
            } else {
                int i21 = i18 + 1;
                kf.q.W2(i21, i18, i10, p1VarArr, p1VarArr);
                int[] iArr2 = c3877b.f35837b;
                kf.q.V2(i21, i18, i10, iArr2, iArr2);
            }
            c3877b.f35838c[i18] = new WeakReference(abstractC3882G);
            c3877b.f35837b[i18] = identityHashCode;
            c3877b.f35836a++;
        }
    }

    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final AbstractC3884I r(AbstractC3884I abstractC3884I, int i10, n nVar) {
        AbstractC3884I abstractC3884I2 = null;
        while (abstractC3884I != null) {
            int i11 = abstractC3884I.f35854a;
            if (i11 != 0 && i11 <= i10 && !nVar.y(i11) && (abstractC3884I2 == null || abstractC3884I2.f35854a < abstractC3884I.f35854a)) {
                abstractC3884I2 = abstractC3884I;
            }
            abstractC3884I = abstractC3884I.f35855b;
        }
        if (abstractC3884I2 == null) {
            return null;
        }
        return abstractC3884I2;
    }

    public static final AbstractC3884I s(AbstractC3884I abstractC3884I, AbstractC3882G abstractC3882G) {
        AbstractC3884I r10;
        int i10 = AbstractC3893i.f35891e;
        AbstractC3893i i11 = i();
        wf.k f6 = i11.f();
        if (f6 != null) {
            f6.invoke(abstractC3882G);
        }
        AbstractC3884I r11 = r(abstractC3884I, i11.d(), i11.e());
        if (r11 == null) {
            synchronized (f35918b) {
                AbstractC3893i i12 = i();
                AbstractC3884I r12 = abstractC3882G.r();
                AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9", r12);
                r10 = r(r12, i12.d(), i12.e());
                if (r10 == null) {
                    q();
                    throw null;
                }
            }
            return r10;
        }
        return r11;
    }

    public static final void t(int i10) {
        int i11;
        C3896l c3896l = f35921e;
        int i12 = c3896l.f35901d[i10];
        c3896l.b(i12, c3896l.f35898a - 1);
        c3896l.f35898a--;
        int[] iArr = c3896l.f35899b;
        int i13 = iArr[i12];
        int i14 = i12;
        while (i14 > 0) {
            int i15 = ((i14 + 1) >> 1) - 1;
            if (iArr[i15] <= i13) {
                break;
            }
            c3896l.b(i15, i14);
            i14 = i15;
        }
        int[] iArr2 = c3896l.f35899b;
        int i16 = c3896l.f35898a >> 1;
        while (i12 < i16) {
            int i17 = (i12 + 1) << 1;
            int i18 = i17 - 1;
            if (i17 < c3896l.f35898a && (i11 = iArr2[i17]) < iArr2[i18]) {
                if (i11 >= iArr2[i12]) {
                    break;
                }
                c3896l.b(i17, i12);
                i12 = i17;
            } else if (iArr2[i18] >= iArr2[i12]) {
                break;
            } else {
                c3896l.b(i18, i12);
                i12 = i18;
            }
        }
        c3896l.f35901d[i10] = c3896l.f35902e;
        c3896l.f35902e = i10;
    }

    public static final Object u(AbstractC3893i abstractC3893i, wf.k kVar) {
        Object invoke = kVar.invoke(f35919c.s(abstractC3893i.d()));
        synchronized (f35918b) {
            int i10 = f35920d;
            f35920d = i10 + 1;
            f35919c = f35919c.s(abstractC3893i.d());
            f35925i.set(new C3886b(i10, f35919c));
            abstractC3893i.c();
            f35919c = f35919c.M(i10);
        }
        return invoke;
    }

    public static final AbstractC3884I v(AbstractC3884I abstractC3884I, AbstractC3882G abstractC3882G, AbstractC3893i abstractC3893i) {
        if (abstractC3893i.g()) {
            abstractC3893i.n(abstractC3882G);
        }
        AbstractC3884I r10 = r(abstractC3884I, abstractC3893i.d(), abstractC3893i.e());
        if (r10 != null) {
            if (r10.f35854a == abstractC3893i.d()) {
                return r10;
            }
            AbstractC3884I l10 = l(r10, abstractC3882G, abstractC3893i);
            abstractC3893i.n(abstractC3882G);
            return l10;
        }
        q();
        throw null;
    }
}
