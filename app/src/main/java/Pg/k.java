package Pg;

import Df.H;
import Ng.AbstractC1070k;
import Ng.C1072l;
import Ng.P0;
import Sg.AbstractC1389a;
import Sg.AbstractC1393e;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k6.AbstractC4194d;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import q1.AbstractC5260f;
import y.C6471i;

/* loaded from: classes.dex */
public class k implements o {

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f14209i0 = AtomicLongFieldUpdater.newUpdater(k.class, "sendersAndCloseStatus$volatile");

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f14210j0 = AtomicLongFieldUpdater.newUpdater(k.class, "receivers$volatile");

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f14211k0 = AtomicLongFieldUpdater.newUpdater(k.class, "bufferEnd$volatile");

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f14212l0 = AtomicLongFieldUpdater.newUpdater(k.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14213m0 = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "sendSegment$volatile");

    /* renamed from: n0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14214n0 = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "receiveSegment$volatile");

    /* renamed from: o0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14215o0 = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: p0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14216p0 = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_closeCause$volatile");

    /* renamed from: q0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14217q0 = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "closeHandler$volatile");

    /* renamed from: Y  reason: collision with root package name */
    public final int f14218Y;

    /* renamed from: Z  reason: collision with root package name */
    public final wf.k f14219Z;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: h0  reason: collision with root package name */
    public final C6471i f14220h0;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public k(int i10, wf.k kVar) {
        long j6;
        C6471i c6471i;
        this.f14218Y = i10;
        this.f14219Z = kVar;
        if (i10 >= 0) {
            t tVar = m.f14222a;
            if (i10 != 0) {
                if (i10 != Integer.MAX_VALUE) {
                    j6 = i10;
                } else {
                    j6 = Long.MAX_VALUE;
                }
            } else {
                j6 = 0;
            }
            this.bufferEnd$volatile = j6;
            this.completedExpandBuffersAndPauseFlag$volatile = f14211k0.get(this);
            t tVar2 = new t(0L, null, this, 3);
            this.sendSegment$volatile = tVar2;
            this.receiveSegment$volatile = tVar2;
            if (D()) {
                tVar2 = m.f14222a;
                AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>", tVar2);
            }
            this.bufferEndSegment$volatile = tVar2;
            if (kVar != null) {
                c6471i = new C6471i(28, this);
            } else {
                c6471i = null;
            }
            this.f14220h0 = c6471i;
            this._closeCause$volatile = m.f14240s;
            return;
        }
        throw new IllegalArgumentException(AbstractC4194d.v("Invalid channel capacity: ", i10, ", should be >=0").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object G(k kVar, AbstractC4825e abstractC4825e) {
        i iVar;
        int i10;
        Object obj;
        if (abstractC4825e instanceof i) {
            iVar = (i) abstractC4825e;
            int i11 = iVar.f14205h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f14205h0 = i11 - Integer.MIN_VALUE;
                i iVar2 = iVar;
                Object obj2 = iVar2.f14203Y;
                Object obj3 = EnumC5000a.f41328Y;
                i10 = iVar2.f14205h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj2);
                        obj = ((s) obj2).f14247a;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj2);
                    t tVar = (t) f14214n0.get(kVar);
                    while (!kVar.B()) {
                        long andIncrement = f14210j0.getAndIncrement(kVar);
                        long j6 = m.f14223b;
                        long j10 = andIncrement / j6;
                        int i12 = (int) (andIncrement % j6);
                        if (tVar.f16688h0 != j10) {
                            t s10 = kVar.s(j10, tVar);
                            if (s10 == null) {
                                continue;
                            } else {
                                tVar = s10;
                            }
                        }
                        Object L10 = kVar.L(tVar, i12, andIncrement, null);
                        if (L10 != m.f14234m) {
                            if (L10 == m.f14236o) {
                                if (andIncrement < kVar.y()) {
                                    tVar.a();
                                }
                            } else if (L10 == m.f14235n) {
                                iVar2.f14205h0 = 1;
                                obj = kVar.H(tVar, i12, andIncrement, iVar2);
                                if (obj == obj3) {
                                    return obj3;
                                }
                            } else {
                                tVar.a();
                                return L10;
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    }
                    return new q(kVar.v());
                }
                return obj;
            }
        }
        iVar = new i(kVar, abstractC4825e);
        i iVar22 = iVar;
        Object obj22 = iVar22.f14203Y;
        Object obj32 = EnumC5000a.f41328Y;
        i10 = iVar22.f14205h0;
        if (i10 == 0) {
        }
        return obj;
    }

    public static final t a(k kVar, long j6, t tVar) {
        Object a5;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        long j11;
        kVar.getClass();
        t tVar2 = m.f14222a;
        l lVar = l.f14221Y;
        loop0: while (true) {
            a5 = AbstractC1389a.a(tVar, j6, lVar);
            if (H.a0(a5)) {
                break;
            }
            Sg.z T = H.T(a5);
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14213m0;
                Sg.z zVar = (Sg.z) atomicReferenceFieldUpdater.get(kVar);
                if (zVar.f16688h0 >= T.f16688h0) {
                    break loop0;
                } else if (!T.i()) {
                    break;
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(kVar, zVar, T)) {
                        if (atomicReferenceFieldUpdater.get(kVar) != zVar) {
                            if (T.e()) {
                                T.d();
                            }
                        }
                    }
                    if (zVar.e()) {
                        zVar.d();
                    }
                }
            }
        }
        boolean a02 = H.a0(a5);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f14210j0;
        if (a02) {
            kVar.u();
            if (tVar.f16688h0 * m.f14223b >= atomicLongFieldUpdater2.get(kVar)) {
                return null;
            }
            tVar.a();
            return null;
        }
        t tVar3 = (t) H.T(a5);
        long j12 = tVar3.f16688h0;
        if (j12 > j6) {
            long j13 = m.f14223b * j12;
            do {
                atomicLongFieldUpdater = f14209i0;
                j10 = atomicLongFieldUpdater.get(kVar);
                j11 = 1152921504606846975L & j10;
                if (j11 >= j13) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(kVar, j10, j11 + (((int) (j10 >> 60)) << 60)));
            if (j12 * m.f14223b >= atomicLongFieldUpdater2.get(kVar)) {
                return null;
            }
            tVar3.a();
            return null;
        }
        return tVar3;
    }

    public static final void h(k kVar, Object obj, C1072l c1072l) {
        K0.e X10;
        wf.k kVar2 = kVar.f14219Z;
        if (kVar2 != null && (X10 = Bi.c.X(kVar2, obj, null)) != null) {
            L4.a.A0(c1072l.f12956j0, X10);
        }
        c1072l.resumeWith(N.w(kVar.x()));
    }

    public static final void i(k kVar, Ug.g gVar) {
        P0 p02;
        kVar.getClass();
        t tVar = (t) f14214n0.get(kVar);
        while (!kVar.B()) {
            long andIncrement = f14210j0.getAndIncrement(kVar);
            long j6 = m.f14223b;
            long j10 = andIncrement / j6;
            int i10 = (int) (andIncrement % j6);
            if (tVar.f16688h0 != j10) {
                t s10 = kVar.s(j10, tVar);
                if (s10 == null) {
                    continue;
                } else {
                    tVar = s10;
                }
            }
            Object L10 = kVar.L(tVar, i10, andIncrement, gVar);
            if (L10 == m.f14234m) {
                if (gVar instanceof P0) {
                    p02 = (P0) gVar;
                } else {
                    p02 = null;
                }
                if (p02 != null) {
                    p02.c(tVar, i10);
                    return;
                }
                return;
            } else if (L10 == m.f14236o) {
                if (andIncrement < kVar.y()) {
                    tVar.a();
                }
            } else if (L10 != m.f14235n) {
                tVar.a();
                ((Ug.f) gVar).f17876j0 = L10;
                return;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        ((Ug.f) gVar).f17876j0 = m.f14233l;
    }

    public static final int j(k kVar, t tVar, int i10, Object obj, long j6, Object obj2, boolean z10) {
        kVar.getClass();
        tVar.m(i10, obj);
        if (z10) {
            return kVar.M(tVar, i10, obj, j6, obj2, z10);
        }
        Object k10 = tVar.k(i10);
        if (k10 == null) {
            if (kVar.m(j6)) {
                if (tVar.j(null, i10, m.f14225d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (tVar.j(null, i10, obj2)) {
                    return 2;
                }
            }
        } else if (k10 instanceof P0) {
            tVar.m(i10, null);
            if (kVar.J(k10, obj)) {
                tVar.n(i10, m.f14230i);
                return 0;
            }
            Q1.u uVar = m.f14232k;
            if (tVar.f14249k0.getAndSet((i10 * 2) + 1, uVar) != uVar) {
                tVar.l(i10, true);
            }
            return 5;
        }
        return kVar.M(tVar, i10, obj, j6, obj2, z10);
    }

    public static void z(k kVar) {
        kVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14212l0;
        if ((atomicLongFieldUpdater.addAndGet(kVar, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(kVar) & 4611686018427387904L) != 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c6, code lost:
        r0 = (Pg.t) ((Sg.AbstractC1393e) Sg.AbstractC1393e.f16651Z.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A(long j6, boolean z10) {
        P0 p02;
        int i10 = (int) (j6 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14210j0;
        if (i10 != 2) {
            if (i10 == 3) {
                t p10 = p(j6 & 1152921504606846975L);
                K0.e eVar = null;
                Object obj = null;
                loop0: do {
                    int i11 = m.f14223b - 1;
                    while (true) {
                        if (-1 >= i11) {
                            break;
                        }
                        long j10 = (p10.f16688h0 * m.f14223b) + i11;
                        while (true) {
                            Object k10 = p10.k(i11);
                            if (k10 == m.f14230i) {
                                break loop0;
                            }
                            Q1.u uVar = m.f14225d;
                            AtomicReferenceArray atomicReferenceArray = p10.f14249k0;
                            wf.k kVar = this.f14219Z;
                            if (k10 == uVar) {
                                if (j10 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                } else if (p10.j(k10, i11, m.f14233l)) {
                                    if (kVar != null) {
                                        eVar = Bi.c.X(kVar, atomicReferenceArray.get(i11 * 2), eVar);
                                    }
                                    p10.m(i11, null);
                                    p10.h();
                                }
                            } else if (k10 != m.f14226e && k10 != null) {
                                if (!(k10 instanceof P0) && !(k10 instanceof E)) {
                                    Q1.u uVar2 = m.f14228g;
                                    if (k10 == uVar2 || k10 == m.f14227f) {
                                        break loop0;
                                    } else if (k10 != uVar2) {
                                        break;
                                    }
                                } else if (j10 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                } else {
                                    if (k10 instanceof E) {
                                        p02 = ((E) k10).f14191a;
                                    } else {
                                        p02 = (P0) k10;
                                    }
                                    if (p10.j(k10, i11, m.f14233l)) {
                                        if (kVar != null) {
                                            eVar = Bi.c.X(kVar, atomicReferenceArray.get(i11 * 2), eVar);
                                        }
                                        obj = Bi.c.v1(obj, p02);
                                        p10.m(i11, null);
                                        p10.h();
                                    }
                                }
                            } else if (p10.j(k10, i11, m.f14233l)) {
                                p10.h();
                                break;
                            }
                        }
                        i11--;
                    }
                } while (p10 != null);
                if (obj != null) {
                    if (!(obj instanceof ArrayList)) {
                        I((P0) obj, false);
                    } else {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            I((P0) arrayList.get(size), false);
                        }
                    }
                }
                if (eVar != null) {
                    throw eVar;
                }
            } else {
                throw new IllegalStateException(android.gov.nist.core.a.e("unexpected close status: ", i10).toString());
            }
        } else {
            p(j6 & 1152921504606846975L);
            if (z10) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14214n0;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    long j11 = atomicLongFieldUpdater.get(this);
                    if (y() <= j11) {
                        break;
                    }
                    long j12 = m.f14223b;
                    long j13 = j11 / j12;
                    if (tVar.f16688h0 != j13 && (tVar = s(j13, tVar)) == null) {
                        if (((t) atomicReferenceFieldUpdater.get(this)).f16688h0 < j13) {
                            break;
                        }
                    } else {
                        tVar.a();
                        int i12 = (int) (j11 % j12);
                        while (true) {
                            Object k11 = tVar.k(i12);
                            if (k11 != null && k11 != m.f14226e) {
                                if (k11 == m.f14225d) {
                                    return false;
                                }
                                if (k11 != m.f14231j && k11 != m.f14233l && k11 != m.f14230i && k11 != m.f14229h) {
                                    if (k11 == m.f14228g) {
                                        return false;
                                    }
                                    if (k11 != m.f14227f && j11 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            } else if (tVar.j(k11, i12, m.f14229h)) {
                                r();
                                break;
                            }
                        }
                        f14210j0.compareAndSet(this, j11, j11 + 1);
                    }
                }
            }
        }
        return true;
    }

    public final boolean B() {
        return A(f14209i0.get(this), true);
    }

    public boolean C() {
        return false;
    }

    public final boolean D() {
        long j6 = f14211k0.get(this);
        if (j6 != 0 && j6 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0011, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(long j6, t tVar) {
        t tVar2;
        t tVar3;
        while (tVar.f16688h0 < j6 && (tVar3 = (t) tVar.b()) != null) {
            tVar = tVar3;
        }
        while (true) {
            if (!tVar.c() || (tVar2 = (t) tVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14215o0;
                    Sg.z zVar = (Sg.z) atomicReferenceFieldUpdater.get(this);
                    if (zVar.f16688h0 < tVar.f16688h0) {
                        if (!tVar.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, zVar, tVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != zVar) {
                                if (tVar.e()) {
                                    tVar.d();
                                }
                            }
                        }
                        if (zVar.e()) {
                            zVar.d();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            tVar = tVar2;
        }
    }

    public final Object F(Object obj, AbstractC4825e abstractC4825e) {
        K0.e X10;
        C1072l c1072l = new C1072l(1, AbstractC5260f.z(abstractC4825e));
        c1072l.u();
        wf.k kVar = this.f14219Z;
        if (kVar != null && (X10 = Bi.c.X(kVar, obj, null)) != null) {
            P4.a.m(X10, x());
            c1072l.resumeWith(N.w(X10));
        } else {
            c1072l.resumeWith(N.w(x()));
        }
        Object t10 = c1072l.t();
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        if (t10 == enumC5000a) {
            N.k0(abstractC4825e);
        }
        if (t10 == enumC5000a) {
            return t10;
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(t tVar, int i10, long j6, AbstractC4825e abstractC4825e) {
        j jVar;
        int i11;
        s sVar;
        C6.a aVar;
        t tVar2;
        k kVar = this;
        if (abstractC4825e instanceof j) {
            jVar = (j) abstractC4825e;
            int i12 = jVar.f14208h0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                jVar.f14208h0 = i12 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                Object obj = jVar2.f14206Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = jVar2.f14208h0;
                if (i11 == 0) {
                    if (i11 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    jVar2.getClass();
                    jVar2.getClass();
                    jVar2.f14208h0 = 1;
                    C1072l R10 = H.R(AbstractC5260f.z(jVar2));
                    try {
                        B b10 = new B(R10);
                        Object L10 = L(tVar, i10, j6, b10);
                        if (L10 == m.f14234m) {
                            b10.c(tVar, i10);
                        } else {
                            Q1.u uVar = m.f14236o;
                            wf.k kVar2 = kVar.f14219Z;
                            AbstractC4831k abstractC4831k = R10.f12956j0;
                            if (L10 == uVar) {
                                if (j6 < y()) {
                                    tVar.a();
                                }
                                t tVar3 = (t) f14214n0.get(kVar);
                                while (true) {
                                    if (B()) {
                                        R10.resumeWith(new s(new q(v())));
                                        break;
                                    }
                                    long andIncrement = f14210j0.getAndIncrement(kVar);
                                    long j10 = m.f14223b;
                                    long j11 = andIncrement / j10;
                                    int i13 = (int) (andIncrement % j10);
                                    if (tVar3.f16688h0 != j11) {
                                        t s10 = kVar.s(j11, tVar3);
                                        if (s10 != null) {
                                            tVar2 = s10;
                                        }
                                    } else {
                                        tVar2 = tVar3;
                                    }
                                    t tVar4 = tVar2;
                                    Object L11 = L(tVar2, i13, andIncrement, b10);
                                    if (L11 == m.f14234m) {
                                        b10.c(tVar4, i13);
                                        break;
                                    } else if (L11 == m.f14236o) {
                                        if (andIncrement < y()) {
                                            tVar4.a();
                                        }
                                        kVar = this;
                                        tVar3 = tVar4;
                                    } else if (L11 != m.f14235n) {
                                        tVar4.a();
                                        sVar = new s(L11);
                                        if (kVar2 != null) {
                                            aVar = Bi.c.U(kVar2, L11, abstractC4831k);
                                        } else {
                                            aVar = null;
                                        }
                                    } else {
                                        throw new IllegalStateException("unexpected".toString());
                                    }
                                }
                            } else {
                                tVar.a();
                                sVar = new s(L10);
                                if (kVar2 != null) {
                                    aVar = Bi.c.U(kVar2, L10, abstractC4831k);
                                } else {
                                    aVar = null;
                                }
                            }
                            R10.A(sVar, aVar);
                        }
                        obj = R10.t();
                        if (obj == EnumC5000a.f41328Y) {
                            N.k0(jVar2);
                        }
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    } catch (Throwable th2) {
                        R10.E();
                        throw th2;
                    }
                }
                return ((s) obj).f14247a;
            }
        }
        jVar = new j(kVar, abstractC4825e);
        j jVar22 = jVar;
        Object obj2 = jVar22.f14206Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = jVar22.f14208h0;
        if (i11 == 0) {
        }
        return ((s) obj2).f14247a;
    }

    public final void I(P0 p02, boolean z10) {
        Throwable th2;
        if (p02 instanceof AbstractC1070k) {
            AbstractC4825e abstractC4825e = (AbstractC4825e) p02;
            if (z10) {
                th2 = w();
            } else {
                th2 = x();
            }
            abstractC4825e.resumeWith(N.w(th2));
        } else if (p02 instanceof B) {
            ((B) p02).f14190Y.resumeWith(new s(new q(v())));
        } else if (p02 instanceof C1171d) {
            C1171d c1171d = (C1171d) p02;
            C1072l c1072l = c1171d.f14197Z;
            AbstractC3557B.Z(c1072l);
            c1171d.f14197Z = null;
            c1171d.f14196Y = m.f14233l;
            Throwable v10 = c1171d.f14198h0.v();
            if (v10 == null) {
                c1072l.resumeWith(Boolean.FALSE);
            } else {
                c1072l.resumeWith(N.w(v10));
            }
        } else if (p02 instanceof Ug.g) {
            ((Ug.f) ((Ug.g) p02)).m(this, m.f14233l);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + p02).toString());
        }
    }

    public final boolean J(Object obj, Object obj2) {
        if (obj instanceof Ug.g) {
            if (((Ug.f) ((Ug.g) obj)).m(this, obj2) == 0) {
                return true;
            }
            return false;
        }
        boolean z10 = obj instanceof B;
        wf.k kVar = this.f14219Z;
        C6.a aVar = null;
        if (z10) {
            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>", obj);
            s sVar = new s(obj2);
            C1072l c1072l = ((B) obj).f14190Y;
            if (kVar != null) {
                aVar = Bi.c.U(kVar, obj2, c1072l.f12956j0);
            }
            return m.a(c1072l, sVar, aVar);
        } else if (obj instanceof C1171d) {
            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>", obj);
            C1171d c1171d = (C1171d) obj;
            C1072l c1072l2 = c1171d.f14197Z;
            AbstractC3557B.Z(c1072l2);
            c1171d.f14197Z = null;
            c1171d.f14196Y = obj2;
            Boolean bool = Boolean.TRUE;
            wf.k kVar2 = c1171d.f14198h0.f14219Z;
            if (kVar2 != null) {
                aVar = Bi.c.U(kVar2, obj2, c1072l2.f12956j0);
            }
            return m.a(c1072l2, bool, aVar);
        } else if (obj instanceof AbstractC1070k) {
            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>", obj);
            AbstractC1070k abstractC1070k = (AbstractC1070k) obj;
            if (kVar != null) {
                aVar = Bi.c.U(kVar, obj2, abstractC1070k.getContext());
            }
            return m.a(abstractC1070k, obj2, aVar);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    public final boolean K(Object obj, t tVar, int i10) {
        Ug.j jVar;
        boolean z10 = obj instanceof AbstractC1070k;
        jf.y yVar = jf.y.f36177a;
        if (z10) {
            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>", obj);
            return m.a((AbstractC1070k) obj, yVar, null);
        } else if (obj instanceof Ug.g) {
            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>", obj);
            int m10 = ((Ug.f) obj).m(this, yVar);
            if (m10 != 0) {
                if (m10 != 1) {
                    if (m10 != 2) {
                        if (m10 == 3) {
                            jVar = Ug.j.f17886i0;
                        } else {
                            throw new IllegalStateException(("Unexpected internal result: " + m10).toString());
                        }
                    } else {
                        jVar = Ug.j.f17885h0;
                    }
                } else {
                    jVar = Ug.j.f17884Z;
                }
            } else {
                jVar = Ug.j.f17883Y;
            }
            if (jVar == Ug.j.f17884Z) {
                tVar.m(i10, null);
            }
            if (jVar == Ug.j.f17883Y) {
                return true;
            }
            return false;
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    public final Object L(t tVar, int i10, long j6, Object obj) {
        Object k10 = tVar.k(i10);
        AtomicReferenceArray atomicReferenceArray = tVar.f14249k0;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14209i0;
        if (k10 == null) {
            if (j6 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return m.f14235n;
                }
                if (tVar.j(k10, i10, obj)) {
                    r();
                    return m.f14234m;
                }
            }
        } else if (k10 == m.f14225d && tVar.j(k10, i10, m.f14230i)) {
            r();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            tVar.m(i10, null);
            return obj2;
        }
        while (true) {
            Object k11 = tVar.k(i10);
            if (k11 != null && k11 != m.f14226e) {
                if (k11 == m.f14225d) {
                    if (tVar.j(k11, i10, m.f14230i)) {
                        r();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        tVar.m(i10, null);
                        return obj3;
                    }
                } else {
                    Q1.u uVar = m.f14231j;
                    if (k11 == uVar) {
                        return m.f14236o;
                    }
                    if (k11 == m.f14229h) {
                        return m.f14236o;
                    }
                    if (k11 == m.f14233l) {
                        r();
                        return m.f14236o;
                    } else if (k11 != m.f14228g && tVar.j(k11, i10, m.f14227f)) {
                        boolean z10 = k11 instanceof E;
                        if (z10) {
                            k11 = ((E) k11).f14191a;
                        }
                        if (K(k11, tVar, i10)) {
                            tVar.n(i10, m.f14230i);
                            r();
                            Object obj4 = atomicReferenceArray.get(i10 * 2);
                            tVar.m(i10, null);
                            return obj4;
                        }
                        tVar.n(i10, uVar);
                        tVar.l(i10, false);
                        if (z10) {
                            r();
                        }
                        return m.f14236o;
                    }
                }
            } else if (j6 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (tVar.j(k11, i10, m.f14229h)) {
                    r();
                    return m.f14236o;
                }
            } else if (obj == null) {
                return m.f14235n;
            } else {
                if (tVar.j(k11, i10, obj)) {
                    r();
                    return m.f14234m;
                }
            }
        }
    }

    public final int M(t tVar, int i10, Object obj, long j6, Object obj2, boolean z10) {
        while (true) {
            Object k10 = tVar.k(i10);
            if (k10 == null) {
                if (m(j6) && !z10) {
                    if (tVar.j(null, i10, m.f14225d)) {
                        return 1;
                    }
                } else if (z10) {
                    if (tVar.j(null, i10, m.f14231j)) {
                        tVar.l(i10, false);
                        return 4;
                    }
                } else if (obj2 == null) {
                    return 3;
                } else {
                    if (tVar.j(null, i10, obj2)) {
                        return 2;
                    }
                }
            } else if (k10 == m.f14226e) {
                if (tVar.j(k10, i10, m.f14225d)) {
                    return 1;
                }
            } else {
                Q1.u uVar = m.f14232k;
                if (k10 == uVar) {
                    tVar.m(i10, null);
                    return 5;
                } else if (k10 == m.f14229h) {
                    tVar.m(i10, null);
                    return 5;
                } else if (k10 == m.f14233l) {
                    tVar.m(i10, null);
                    u();
                    return 4;
                } else {
                    tVar.m(i10, null);
                    if (k10 instanceof E) {
                        k10 = ((E) k10).f14191a;
                    }
                    if (J(k10, obj)) {
                        tVar.n(i10, m.f14230i);
                        return 0;
                    }
                    if (tVar.f14249k0.getAndSet((i10 * 2) + 1, uVar) != uVar) {
                        tVar.l(i10, true);
                    }
                    return 5;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        r2 = r9.get(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r9.compareAndSet(r18, r2, 4611686018427387904L + (r2 & 4611686018427387903L)) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        r0 = r7.get(r18);
        r2 = r9.get(r18);
        r4 = r2 & 4611686018427387903L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        if ((r2 & 4611686018427387904L) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r0 != r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (r0 != r7.get(r18)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
        r2 = r9.get(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (r9.compareAndSet(r18, r2, r2 & 4611686018427387903L) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
        if (r14 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        r9.compareAndSet(r18, r2, r4 + 4611686018427387904L);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(long j6) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        if (D()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f14211k0;
        } while (atomicLongFieldUpdater.get(this) <= j6);
        int i10 = m.f14224c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f14212l0;
            if (i11 < i10) {
                long j10 = atomicLongFieldUpdater.get(this);
                if (j10 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j10 == atomicLongFieldUpdater.get(this)) {
                    return;
                }
                i11++;
            }
        }
    }

    @Override // Pg.C
    public final Ug.c b() {
        C1172e c1172e = C1172e.f14199Y;
        Ad.l.M(3, c1172e);
        f fVar = f.f14200Y;
        Ad.l.M(3, fVar);
        return new Ug.c(this, c1172e, fVar, this.f14220h0);
    }

    @Override // Pg.C
    public final Ug.c c() {
        g gVar = g.f14201Y;
        Ad.l.M(3, gVar);
        h hVar = h.f14202Y;
        Ad.l.M(3, hVar);
        return new Ug.c(this, gVar, hVar, this.f14220h0);
    }

    @Override // Pg.D
    public final void d(Xf.f fVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f14217q0;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, fVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Q1.u uVar = m.f14238q;
            if (obj == uVar) {
                Q1.u uVar2 = m.f14239r;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVar2)) {
                    if (atomicReferenceFieldUpdater.get(this) != uVar) {
                        break;
                    }
                }
                fVar.invoke(v());
                return;
            } else if (obj == m.f14239r) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
            } else {
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        }
    }

    @Override // Pg.C
    public final Object e() {
        t tVar;
        P0 p02;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14210j0;
        long j6 = atomicLongFieldUpdater.get(this);
        long j10 = f14209i0.get(this);
        if (A(j10, true)) {
            return new q(v());
        }
        int i10 = (j6 > (j10 & 1152921504606846975L) ? 1 : (j6 == (j10 & 1152921504606846975L) ? 0 : -1));
        Object obj = s.f14246b;
        if (i10 >= 0) {
            return obj;
        }
        Q1.u uVar = m.f14232k;
        t tVar2 = (t) f14214n0.get(this);
        while (!B()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = m.f14223b;
            long j12 = andIncrement / j11;
            int i11 = (int) (andIncrement % j11);
            if (tVar2.f16688h0 != j12) {
                t s10 = s(j12, tVar2);
                if (s10 == null) {
                    continue;
                } else {
                    tVar = s10;
                }
            } else {
                tVar = tVar2;
            }
            Object L10 = L(tVar, i11, andIncrement, uVar);
            if (L10 == m.f14234m) {
                if (uVar instanceof P0) {
                    p02 = (P0) uVar;
                } else {
                    p02 = null;
                }
                if (p02 != null) {
                    p02.c(tVar, i11);
                }
                N(andIncrement);
                tVar.h();
            } else if (L10 == m.f14236o) {
                if (andIncrement < y()) {
                    tVar.a();
                }
                tVar2 = tVar;
            } else if (L10 != m.f14235n) {
                tVar.a();
                obj = L10;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
            return obj;
        }
        return new q(v());
    }

    @Override // Pg.C
    public final Object f(AbstractC4825e abstractC4825e) {
        return G(this, abstractC4825e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [Ng.l] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r17v0, types: [Pg.k, java.lang.Object] */
    @Override // Pg.C
    public final Object g(AbstractC4825e abstractC4825e) {
        t tVar;
        C1072l c1072l;
        Throwable th2;
        C1072l c1072l2;
        C6.a aVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14214n0;
        t tVar2 = (t) atomicReferenceFieldUpdater.get(this);
        while (!B()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14210j0;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j6 = m.f14223b;
            long j10 = andIncrement / j6;
            int i10 = (int) (andIncrement % j6);
            if (tVar2.f16688h0 != j10) {
                t s10 = s(j10, tVar2);
                if (s10 == null) {
                    continue;
                } else {
                    tVar = s10;
                }
            } else {
                tVar = tVar2;
            }
            Object L10 = L(tVar, i10, andIncrement, null);
            Q1.u uVar = m.f14234m;
            if (L10 != uVar) {
                Q1.u uVar2 = m.f14236o;
                if (L10 == uVar2) {
                    if (andIncrement < y()) {
                        tVar.a();
                    }
                    tVar2 = tVar;
                } else {
                    if (L10 == m.f14235n) {
                        C1072l R10 = H.R(AbstractC5260f.z(abstractC4825e));
                        try {
                            Object L11 = L(tVar, i10, andIncrement, R10);
                            try {
                                if (L11 == uVar) {
                                    c1072l2 = R10;
                                    c1072l2.c(tVar, i10);
                                } else {
                                    c1072l2 = R10;
                                    wf.k kVar = this.f14219Z;
                                    AbstractC4831k abstractC4831k = c1072l2.f12956j0;
                                    if (L11 == uVar2) {
                                        if (andIncrement < y()) {
                                            tVar.a();
                                        }
                                        t tVar3 = (t) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            if (B()) {
                                                c1072l2.resumeWith(N.w(w()));
                                                break;
                                            }
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j11 = m.f14223b;
                                            long j12 = andIncrement2 / j11;
                                            int i11 = (int) (andIncrement2 % j11);
                                            if (tVar3.f16688h0 != j12) {
                                                t s11 = s(j12, tVar3);
                                                if (s11 != null) {
                                                    tVar3 = s11;
                                                }
                                            }
                                            AbstractC4831k abstractC4831k2 = abstractC4831k;
                                            wf.k kVar2 = kVar;
                                            L11 = L(tVar3, i11, andIncrement2, c1072l2);
                                            if (L11 == m.f14234m) {
                                                c1072l2.c(tVar3, i11);
                                                break;
                                            } else if (L11 == m.f14236o) {
                                                if (andIncrement2 < y()) {
                                                    tVar3.a();
                                                }
                                                abstractC4831k = abstractC4831k2;
                                                kVar = kVar2;
                                            } else if (L11 != m.f14235n) {
                                                tVar3.a();
                                                if (kVar2 != null) {
                                                    aVar = Bi.c.U(kVar2, L11, abstractC4831k2);
                                                } else {
                                                    aVar = null;
                                                }
                                            } else {
                                                throw new IllegalStateException("unexpected".toString());
                                            }
                                        }
                                    } else {
                                        tVar.a();
                                        if (kVar != null) {
                                            aVar = Bi.c.U(kVar, L11, abstractC4831k);
                                        } else {
                                            aVar = null;
                                        }
                                    }
                                    c1072l2.A(L11, aVar);
                                }
                                L10 = c1072l2.t();
                                if (L10 == EnumC5000a.f41328Y) {
                                    N.k0(abstractC4825e);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                c1072l = uVar;
                                c1072l.E();
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            c1072l = R10;
                        }
                    } else {
                        tVar.a();
                    }
                    return L10;
                }
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        Throwable w10 = w();
        int i12 = Sg.A.f16630a;
        throw w10;
    }

    @Override // Pg.C
    public final C1171d iterator() {
        return new C1171d(this);
    }

    @Override // Pg.C
    public final void k(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        o(cancellationException, true);
    }

    @Override // Pg.D
    public final boolean l(Throwable th2) {
        return o(th2, false);
    }

    public final boolean m(long j6) {
        if (j6 >= f14211k0.get(this) && j6 >= f14210j0.get(this) + this.f14218Y) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c9, code lost:
        r1.E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01cc, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f0, code lost:
        r5 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f2, code lost:
        h(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fa, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0142, code lost:
        if (r23 >= r5.get(r26)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0144, code lost:
        r21.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0147, code lost:
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0149, code lost:
        h(r26, r27, r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    @Override // Pg.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Object obj, AbstractC4825e abstractC4825e) {
        t tVar;
        Object F10;
        C1072l c1072l;
        Throwable th2;
        jf.y yVar;
        C1072l c1072l2;
        EnumC5000a enumC5000a;
        C1072l c1072l3;
        t tVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14213m0;
        t tVar3 = (t) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14209i0;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j6 = andIncrement & 1152921504606846975L;
            boolean A10 = A(andIncrement, false);
            int i10 = m.f14223b;
            long j10 = i10;
            long j11 = j6 / j10;
            int i11 = (int) (j6 % j10);
            int i12 = (tVar3.f16688h0 > j11 ? 1 : (tVar3.f16688h0 == j11 ? 0 : -1));
            jf.y yVar2 = jf.y.f36177a;
            if (i12 != 0) {
                t a5 = a(this, j11, tVar3);
                if (a5 == null) {
                    if (A10) {
                        F10 = F(obj, abstractC4825e);
                        if (F10 != EnumC5000a.f41328Y) {
                            return yVar2;
                        }
                    }
                } else {
                    tVar = a5;
                }
            } else {
                tVar = tVar3;
            }
            t tVar4 = tVar;
            int j12 = j(this, tVar, i11, obj, j6, null, A10);
            if (j12 != 0) {
                if (j12 == 1) {
                    break;
                } else if (j12 != 2) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = f14210j0;
                    if (j12 != 3) {
                        if (j12 != 4) {
                            if (j12 == 5) {
                                tVar4.a();
                            }
                            tVar3 = tVar4;
                        } else {
                            if (j6 < atomicLongFieldUpdater2.get(this)) {
                                tVar4.a();
                            }
                            Object F11 = F(obj, abstractC4825e);
                            if (F11 == EnumC5000a.f41328Y) {
                                return F11;
                            }
                        }
                    } else {
                        C1072l R10 = H.R(AbstractC5260f.z(abstractC4825e));
                        try {
                            int j13 = j(this, tVar4, i11, obj, j6, R10, false);
                            try {
                                if (j13 != 0) {
                                    if (j13 != 1) {
                                        if (j13 != 2) {
                                            if (j13 != 4) {
                                                if (j13 == 5) {
                                                    tVar4.a();
                                                    t tVar5 = (t) atomicReferenceFieldUpdater.get(this);
                                                    while (true) {
                                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                                        long j14 = andIncrement2 & 1152921504606846975L;
                                                        boolean A11 = A(andIncrement2, false);
                                                        int i13 = m.f14223b;
                                                        long j15 = i13;
                                                        long j16 = j14 / j15;
                                                        int i14 = (int) (j14 % j15);
                                                        if (tVar5.f16688h0 != j16) {
                                                            try {
                                                                t a10 = a(this, j16, tVar5);
                                                                if (a10 == null) {
                                                                    if (A11) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    c1072l3 = R10;
                                                                    tVar2 = a10;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th2 = th3;
                                                                C1072l c1072l4 = R10;
                                                            }
                                                        } else {
                                                            c1072l3 = R10;
                                                            tVar2 = tVar5;
                                                        }
                                                        R10 = c1072l3;
                                                        t tVar6 = tVar2;
                                                        int j17 = j(this, tVar2, i14, obj, j14, R10, A11);
                                                        if (j17 != 0) {
                                                            if (j17 == 1) {
                                                                break;
                                                            } else if (j17 != 2) {
                                                                if (j17 != 3) {
                                                                    if (j17 == 4) {
                                                                        break;
                                                                    }
                                                                    if (j17 == 5) {
                                                                        tVar6.a();
                                                                    }
                                                                    tVar5 = tVar6;
                                                                } else {
                                                                    throw new IllegalStateException("unexpected".toString());
                                                                }
                                                            } else {
                                                                c1072l2 = R10;
                                                                if (A11) {
                                                                    tVar6.h();
                                                                } else {
                                                                    c1072l2.c(tVar6, i14 + i13);
                                                                }
                                                            }
                                                        } else {
                                                            c1072l2 = R10;
                                                            yVar = yVar2;
                                                            tVar6.a();
                                                            break;
                                                        }
                                                    }
                                                    yVar = yVar2;
                                                } else {
                                                    throw new IllegalStateException("unexpected".toString());
                                                }
                                            } else {
                                                c1072l2 = R10;
                                                yVar = yVar2;
                                                if (j6 < atomicLongFieldUpdater2.get(this)) {
                                                    tVar4.a();
                                                }
                                                h(this, obj, c1072l2);
                                            }
                                        } else {
                                            c1072l2 = R10;
                                            yVar = yVar2;
                                            c1072l2.c(tVar4, i11 + i10);
                                        }
                                        F10 = c1072l2.t();
                                        enumC5000a = EnumC5000a.f41328Y;
                                        if (F10 == enumC5000a) {
                                            N.k0(abstractC4825e);
                                        }
                                        if (F10 != enumC5000a) {
                                            F10 = yVar;
                                        }
                                        if (F10 != enumC5000a) {
                                            return yVar;
                                        }
                                    }
                                    c1072l2 = R10;
                                    yVar = yVar2;
                                    c1072l2.resumeWith(yVar);
                                    F10 = c1072l2.t();
                                    enumC5000a = EnumC5000a.f41328Y;
                                    if (F10 == enumC5000a) {
                                    }
                                    if (F10 != enumC5000a) {
                                    }
                                    if (F10 != enumC5000a) {
                                    }
                                } else {
                                    c1072l2 = R10;
                                    yVar = yVar2;
                                    tVar4.a();
                                }
                                c1072l2.resumeWith(yVar);
                                F10 = c1072l2.t();
                                enumC5000a = EnumC5000a.f41328Y;
                                if (F10 == enumC5000a) {
                                }
                                if (F10 != enumC5000a) {
                                }
                                if (F10 != enumC5000a) {
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                c1072l = j13;
                            }
                        } catch (Throwable th5) {
                            th2 = th5;
                            c1072l = R10;
                        }
                    }
                } else if (!A10) {
                    return yVar2;
                } else {
                    tVar4.h();
                    F10 = F(obj, abstractC4825e);
                    if (F10 != EnumC5000a.f41328Y) {
                        return yVar2;
                    }
                }
            } else {
                tVar4.a();
                return yVar2;
            }
        }
        return F10;
    }

    public final boolean o(Throwable th2, boolean z10) {
        boolean z11;
        Object obj;
        Q1.u uVar;
        long j6;
        long j10;
        long j11;
        long j12;
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14209i0;
        if (z10) {
            do {
                j13 = atomicLongFieldUpdater.get(this);
                if (((int) (j13 >> 60)) != 0) {
                    break;
                }
                t tVar = m.f14222a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j13, (1 << 60) + (j13 & 1152921504606846975L)));
        }
        Q1.u uVar2 = m.f14240s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14216p0;
            if (atomicReferenceFieldUpdater.compareAndSet(this, uVar2, th2)) {
                z11 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != uVar2) {
                z11 = false;
                break;
            }
        }
        if (z10) {
            do {
                j12 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j12, (3 << 60) + (j12 & 1152921504606846975L)));
        } else {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j6 >> 60);
                if (i10 != 0) {
                    if (i10 != 1) {
                        break;
                    }
                    j10 = j6 & 1152921504606846975L;
                    j11 = 3;
                } else {
                    j10 = j6 & 1152921504606846975L;
                    j11 = 2;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (j11 << 60) + j10));
        }
        u();
        if (z11) {
            loop4: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f14217q0;
                obj = atomicReferenceFieldUpdater2.get(this);
                if (obj == null) {
                    uVar = m.f14238q;
                } else {
                    uVar = m.f14239r;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, uVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                Ad.l.M(1, obj);
                ((wf.k) obj).invoke(v());
            }
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
        r1 = (Pg.t) ((Sg.AbstractC1393e) Sg.AbstractC1393e.f16651Z.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t p(long j6) {
        Object obj;
        long j10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f14215o0.get(this);
        t tVar = (t) f14213m0.get(this);
        if (tVar.f16688h0 > ((t) obj2).f16688h0) {
            obj2 = tVar;
        }
        t tVar2 = (t) f14214n0.get(this);
        int i10 = (tVar2.f16688h0 > ((t) obj2).f16688h0 ? 1 : (tVar2.f16688h0 == ((t) obj2).f16688h0 ? 0 : -1));
        t tVar3 = obj2;
        if (i10 > 0) {
            tVar3 = tVar2;
        }
        AbstractC1393e abstractC1393e = (AbstractC1393e) tVar3;
        loop0: while (true) {
            abstractC1393e.getClass();
            Object obj3 = AbstractC1393e.f16650Y.get(abstractC1393e);
            Q1.u uVar = AbstractC1389a.f16642b;
            obj = null;
            if (obj3 == uVar) {
                break;
            }
            AbstractC1393e abstractC1393e2 = (AbstractC1393e) obj3;
            if (abstractC1393e2 == null) {
                do {
                    atomicReferenceFieldUpdater = AbstractC1393e.f16650Y;
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC1393e, null, uVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC1393e) == null);
            } else {
                abstractC1393e = abstractC1393e2;
            }
        }
        t tVar4 = (t) abstractC1393e;
        if (C()) {
            t tVar5 = tVar4;
            loop2: do {
                int i11 = m.f14223b - 1;
                while (true) {
                    if (-1 >= i11) {
                        break;
                    }
                    j10 = (tVar5.f16688h0 * m.f14223b) + i11;
                    if (j10 < f14210j0.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k10 = tVar5.k(i11);
                        if (k10 != null && k10 != m.f14226e) {
                            if (k10 == m.f14225d) {
                                break loop2;
                            }
                        } else if (tVar5.j(k10, i11, m.f14233l)) {
                            tVar5.h();
                            break;
                        }
                    }
                    i11--;
                }
            } while (tVar5 != null);
            j10 = -1;
            if (j10 != -1) {
                q(j10);
            }
        }
        t tVar6 = tVar4;
        loop5: while (tVar6 != null) {
            int i12 = m.f14223b - 1;
            obj = obj;
            while (-1 < i12) {
                if ((tVar6.f16688h0 * m.f14223b) + i12 < j6) {
                    break loop5;
                }
                while (true) {
                    Object k11 = tVar6.k(i12);
                    if (k11 != null && k11 != m.f14226e) {
                        if (k11 instanceof E) {
                            if (tVar6.j(k11, i12, m.f14233l)) {
                                obj = Bi.c.v1(obj, ((E) k11).f14191a);
                                tVar6.l(i12, true);
                                break;
                            }
                        } else if (!(k11 instanceof P0)) {
                            break;
                        } else if (tVar6.j(k11, i12, m.f14233l)) {
                            obj = Bi.c.v1(obj, k11);
                            tVar6.l(i12, true);
                            break;
                        }
                    } else if (tVar6.j(k11, i12, m.f14233l)) {
                        tVar6.h();
                        break;
                    }
                }
                i12--;
                obj = obj;
            }
            tVar6 = (t) ((AbstractC1393e) AbstractC1393e.f16651Z.get(tVar6));
            obj = obj;
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                I((P0) obj, true);
            } else {
                ArrayList arrayList = (ArrayList) obj;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    I((P0) arrayList.get(size), true);
                }
            }
        }
        return tVar4;
    }

    public final void q(long j6) {
        K0.e X10;
        t tVar = (t) f14214n0.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14210j0;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j6 < Math.max(this.f14218Y + j10, f14211k0.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, j10 + 1)) {
                long j11 = m.f14223b;
                long j12 = j10 / j11;
                int i10 = (int) (j10 % j11);
                if (tVar.f16688h0 != j12) {
                    t s10 = s(j12, tVar);
                    if (s10 == null) {
                        continue;
                    } else {
                        tVar = s10;
                    }
                }
                Object L10 = L(tVar, i10, j10, null);
                if (L10 == m.f14236o) {
                    if (j10 < y()) {
                        tVar.a();
                    }
                } else {
                    tVar.a();
                    wf.k kVar = this.f14219Z;
                    if (kVar != null && (X10 = Bi.c.X(kVar, L10, null)) != null) {
                        throw X10;
                    }
                }
            }
        }
    }

    public final void r() {
        Object a5;
        if (D()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14215o0;
        t tVar = (t) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f14211k0.getAndIncrement(this);
            long j6 = andIncrement / m.f14223b;
            if (y() <= andIncrement) {
                if (tVar.f16688h0 < j6 && tVar.b() != null) {
                    E(j6, tVar);
                }
                z(this);
                return;
            }
            if (tVar.f16688h0 != j6) {
                l lVar = l.f14221Y;
                while (true) {
                    a5 = AbstractC1389a.a(tVar, j6, lVar);
                    if (H.a0(a5)) {
                        break;
                    }
                    Sg.z T = H.T(a5);
                    while (true) {
                        Sg.z zVar = (Sg.z) atomicReferenceFieldUpdater.get(this);
                        if (zVar.f16688h0 >= T.f16688h0) {
                            break;
                        } else if (!T.i()) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, zVar, T)) {
                                if (atomicReferenceFieldUpdater.get(this) != zVar) {
                                    if (T.e()) {
                                        T.d();
                                    }
                                }
                            }
                            if (zVar.e()) {
                                zVar.d();
                            }
                        }
                    }
                }
                t tVar2 = null;
                if (H.a0(a5)) {
                    u();
                    E(j6, tVar);
                    z(this);
                } else {
                    t tVar3 = (t) H.T(a5);
                    long j10 = tVar3.f16688h0;
                    if (j10 > j6) {
                        long j11 = j10 * m.f14223b;
                        if (f14211k0.compareAndSet(this, andIncrement + 1, j11)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f14212l0;
                            if ((atomicLongFieldUpdater.addAndGet(this, j11 - andIncrement) & 4611686018427387904L) != 0) {
                                do {
                                } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
                            }
                        } else {
                            z(this);
                        }
                    } else {
                        tVar2 = tVar3;
                    }
                }
                if (tVar2 == null) {
                    continue;
                } else {
                    tVar = tVar2;
                }
            }
            int i10 = (int) (andIncrement % m.f14223b);
            Object k10 = tVar.k(i10);
            boolean z10 = k10 instanceof P0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f14210j0;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !tVar.j(k10, i10, m.f14228g)) {
                while (true) {
                    Object k11 = tVar.k(i10);
                    if (k11 instanceof P0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (tVar.j(k11, i10, new E((P0) k11))) {
                                break loop0;
                            }
                        } else if (tVar.j(k11, i10, m.f14228g)) {
                            if (K(k11, tVar, i10)) {
                                tVar.n(i10, m.f14225d);
                                break;
                            } else {
                                tVar.n(i10, m.f14231j);
                                tVar.l(i10, false);
                            }
                        }
                    } else if (k11 != m.f14231j) {
                        if (k11 == null) {
                            if (tVar.j(k11, i10, m.f14226e)) {
                                break loop0;
                            }
                        } else if (k11 == m.f14225d || k11 == m.f14229h || k11 == m.f14230i || k11 == m.f14232k || k11 == m.f14233l) {
                            break loop0;
                        } else if (k11 != m.f14227f) {
                            throw new IllegalStateException(("Unexpected cell state: " + k11).toString());
                        }
                    } else {
                        break;
                    }
                }
            } else if (K(k10, tVar, i10)) {
                tVar.n(i10, m.f14225d);
                break;
            } else {
                tVar.n(i10, m.f14231j);
                tVar.l(i10, false);
                z(this);
            }
        }
        z(this);
    }

    public final t s(long j6, t tVar) {
        Object a5;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        t tVar2 = m.f14222a;
        l lVar = l.f14221Y;
        loop0: while (true) {
            a5 = AbstractC1389a.a(tVar, j6, lVar);
            if (H.a0(a5)) {
                break;
            }
            Sg.z T = H.T(a5);
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14214n0;
                Sg.z zVar = (Sg.z) atomicReferenceFieldUpdater.get(this);
                if (zVar.f16688h0 >= T.f16688h0) {
                    break loop0;
                } else if (!T.i()) {
                    break;
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, zVar, T)) {
                        if (atomicReferenceFieldUpdater.get(this) != zVar) {
                            if (T.e()) {
                                T.d();
                            }
                        }
                    }
                    if (zVar.e()) {
                        zVar.d();
                    }
                }
            }
        }
        if (H.a0(a5)) {
            u();
            if (tVar.f16688h0 * m.f14223b >= y()) {
                return null;
            }
            tVar.a();
            return null;
        }
        t tVar3 = (t) H.T(a5);
        boolean D6 = D();
        long j11 = tVar3.f16688h0;
        if (!D6 && j6 <= f14211k0.get(this) / m.f14223b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f14215o0;
                Sg.z zVar2 = (Sg.z) atomicReferenceFieldUpdater2.get(this);
                if (zVar2.f16688h0 >= j11 || !tVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, zVar2, tVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != zVar2) {
                        if (tVar3.e()) {
                            tVar3.d();
                        }
                    }
                }
                if (zVar2.e()) {
                    zVar2.d();
                }
            }
        }
        if (j11 > j6) {
            long j12 = m.f14223b * j11;
            do {
                atomicLongFieldUpdater = f14210j0;
                j10 = atomicLongFieldUpdater.get(this);
                if (j10 >= j12) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j12));
            if (j11 * m.f14223b >= y()) {
                return null;
            }
            tVar3.a();
            return null;
        }
        return tVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
        return r1;
     */
    @Override // Pg.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(Object obj) {
        long j6;
        t tVar;
        P0 p02;
        t tVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14209i0;
        boolean A10 = A(atomicLongFieldUpdater.get(this), false);
        r rVar = s.f14246b;
        if (!A10 && (!m(j6 & 1152921504606846975L))) {
            return rVar;
        }
        Q1.u uVar = m.f14231j;
        t tVar3 = (t) f14213m0.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean A11 = A(andIncrement, false);
            int i10 = m.f14223b;
            long j11 = i10;
            long j12 = j10 / j11;
            int i11 = (int) (j10 % j11);
            if (tVar3.f16688h0 != j12) {
                t a5 = a(this, j12, tVar3);
                if (a5 == null) {
                    if (A11) {
                        return new q(x());
                    }
                } else {
                    tVar = a5;
                }
            } else {
                tVar = tVar3;
            }
            t tVar4 = tVar;
            int j13 = j(this, tVar, i11, obj, j10, uVar, A11);
            jf.y yVar = jf.y.f36177a;
            if (j13 != 0) {
                if (j13 == 1) {
                    break;
                } else if (j13 != 2) {
                    if (j13 != 3) {
                        if (j13 != 4) {
                            if (j13 == 5) {
                                tVar4.a();
                            }
                            tVar3 = tVar4;
                        } else {
                            if (j10 < f14210j0.get(this)) {
                                tVar4.a();
                            }
                            return new q(x());
                        }
                    } else {
                        throw new IllegalStateException("unexpected".toString());
                    }
                } else if (A11) {
                    tVar4.h();
                    return new q(x());
                } else {
                    if (uVar instanceof P0) {
                        p02 = (P0) uVar;
                    } else {
                        p02 = null;
                    }
                    if (p02 != null) {
                        tVar2 = tVar4;
                        p02.c(tVar2, i11 + i10);
                    } else {
                        tVar2 = tVar4;
                    }
                    tVar2.h();
                    return rVar;
                }
            } else {
                tVar4.a();
                break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b6, code lost:
        r3 = (Pg.t) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01bd, code lost:
        if (r3 != null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b6 A[EDGE_INSN: B:97:0x01b6->B:79:0x01b6 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i10;
        int i11;
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i12 = (int) (f14209i0.get(this) >> 60);
        if (i12 != 2) {
            if (i12 == 3) {
                sb2.append("cancelled,");
            }
        } else {
            sb2.append("closed,");
        }
        sb2.append("capacity=" + this.f14218Y + ',');
        sb2.append("data=[");
        int i13 = 0;
        List G02 = AbstractC4344b.G0(f14214n0.get(this), f14213m0.get(this), f14215o0.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : G02) {
            if (((t) obj) != m.f14222a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long j6 = ((t) next).f16688h0;
                do {
                    Object next2 = it.next();
                    long j10 = ((t) next2).f16688h0;
                    if (j6 > j10) {
                        next = next2;
                        j6 = j10;
                    }
                } while (it.hasNext());
                t tVar = (t) next;
                long j11 = f14210j0.get(this);
                long y10 = y();
                loop2: while (true) {
                    i10 = m.f14223b;
                    i11 = i13;
                    while (true) {
                        if (i11 >= i10) {
                        }
                        i11++;
                    }
                    i13 = 0;
                }
                if (Lg.o.Y2(sb2) == ',') {
                }
                sb2.append("]");
                return sb2.toString();
            }
            t tVar2 = (t) next;
            long j112 = f14210j0.get(this);
            long y102 = y();
            loop2: while (true) {
                i10 = m.f14223b;
                i11 = i13;
                while (true) {
                    if (i11 >= i10) {
                        break;
                    }
                    long j12 = (tVar2.f16688h0 * m.f14223b) + i11;
                    int i14 = (j12 > y102 ? 1 : (j12 == y102 ? 0 : -1));
                    if (i14 >= 0 && j12 >= j112) {
                        break loop2;
                    }
                    Object k10 = tVar2.k(i11);
                    Object obj2 = tVar2.f14249k0.get(i11 * 2);
                    if (k10 instanceof AbstractC1070k) {
                        int i15 = (j12 > j112 ? 1 : (j12 == j112 ? 0 : -1));
                        if (i15 < 0 && i14 >= 0) {
                            str = "receive";
                        } else if (i14 < 0 && i15 >= 0) {
                            str = "send";
                        } else {
                            str = "cont";
                        }
                    } else if (k10 instanceof Ug.g) {
                        int i16 = (j12 > j112 ? 1 : (j12 == j112 ? 0 : -1));
                        if (i16 < 0 && i14 >= 0) {
                            str = "onReceive";
                        } else if (i14 < 0 && i16 >= 0) {
                            str = "onSend";
                        } else {
                            str = "select";
                        }
                    } else if (k10 instanceof B) {
                        str = "receiveCatching";
                    } else if (k10 instanceof E) {
                        str = "EB(" + k10 + ')';
                    } else if (AbstractC3557B.K(k10, m.f14227f) || AbstractC3557B.K(k10, m.f14228g)) {
                        str = "resuming_sender";
                    } else {
                        if (k10 != null && !AbstractC3557B.K(k10, m.f14226e) && !AbstractC3557B.K(k10, m.f14230i) && !AbstractC3557B.K(k10, m.f14229h) && !AbstractC3557B.K(k10, m.f14232k) && !AbstractC3557B.K(k10, m.f14231j) && !AbstractC3557B.K(k10, m.f14233l)) {
                            str = k10.toString();
                        }
                        i11++;
                    }
                    if (obj2 != null) {
                        sb2.append(Separators.LPAREN + str + ',' + obj2 + "),");
                    } else {
                        sb2.append(str + ',');
                    }
                    i11++;
                }
                i13 = 0;
            }
            if (Lg.o.Y2(sb2) == ',') {
                AbstractC3557B.b0("deleteCharAt(...)", sb2.deleteCharAt(sb2.length() - 1));
            }
            sb2.append("]");
            return sb2.toString();
        }
        throw new NoSuchElementException();
    }

    @Override // Pg.D
    public final boolean u() {
        return A(f14209i0.get(this), false);
    }

    public final Throwable v() {
        return (Throwable) f14216p0.get(this);
    }

    public final Throwable w() {
        Throwable v10 = v();
        if (v10 == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return v10;
    }

    public final Throwable x() {
        Throwable v10 = v();
        if (v10 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return v10;
    }

    public final long y() {
        return f14209i0.get(this) & 1152921504606846975L;
    }
}
