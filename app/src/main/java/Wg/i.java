package Wg;

import Df.H;
import Ng.AbstractC1070k;
import Ng.C1072l;
import Ng.P0;
import Q1.u;
import Sg.AbstractC1389a;
import Sg.z;
import com.google.android.gms.internal.play_billing.N;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.y;
import of.EnumC5000a;
import pf.AbstractC5156c;
import q1.AbstractC5260f;

/* loaded from: classes2.dex */
public class i implements f {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21098c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f21099d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21100e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f21101f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21102g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final int f21103a;

    /* renamed from: b  reason: collision with root package name */
    public final Xf.f f21104b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public i(int i10, int i11) {
        this.f21103a = i10;
        if (i10 > 0) {
            if (i11 >= 0 && i11 <= i10) {
                k kVar = new k(0L, null, 2);
                this.head$volatile = kVar;
                this.tail$volatile = kVar;
                this._availablePermits$volatile = i10 - i11;
                this.f21104b = new Xf.f(18, this);
                return;
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.e("The number of acquired permits should be in 0..", i10).toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("Semaphore should have at least 1 permit, but had ", i10).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        r1.A(r3, r5.f21104b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC5156c abstractC5156c) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i10;
        do {
            atomicIntegerFieldUpdater = f21102g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i10 = this.f21103a;
        } while (andDecrement > i10);
        y yVar = y.f36177a;
        if (andDecrement <= 0) {
            C1072l R10 = H.R(AbstractC5260f.z(abstractC5156c));
            try {
                if (!b(R10)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i10) {
                            if (andDecrement2 > 0) {
                                break;
                            } else if (b(R10)) {
                                break;
                            }
                        }
                    }
                }
                Object t10 = R10.t();
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                if (t10 == enumC5000a) {
                    N.k0(abstractC5156c);
                }
                if (t10 != enumC5000a) {
                    t10 = yVar;
                }
                if (t10 == enumC5000a) {
                    return t10;
                }
                return yVar;
            } catch (Throwable th2) {
                R10.E();
                throw th2;
            }
        }
        return yVar;
    }

    public final boolean b(P0 p02) {
        Object a5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21100e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f21101f.getAndIncrement(this);
        g gVar = g.f21096Y;
        long j6 = andIncrement / j.f21110f;
        loop0: while (true) {
            a5 = AbstractC1389a.a(kVar, j6, gVar);
            if (H.a0(a5)) {
                break;
            }
            z T = H.T(a5);
            while (true) {
                z zVar = (z) atomicReferenceFieldUpdater.get(this);
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
        k kVar2 = (k) H.T(a5);
        int i10 = (int) (andIncrement % j.f21110f);
        AtomicReferenceArray atomicReferenceArray = kVar2.f21111j0;
        while (!atomicReferenceArray.compareAndSet(i10, null, p02)) {
            if (atomicReferenceArray.get(i10) != null) {
                u uVar = j.f21106b;
                u uVar2 = j.f21107c;
                while (!atomicReferenceArray.compareAndSet(i10, uVar, uVar2)) {
                    if (atomicReferenceArray.get(i10) != uVar) {
                        return false;
                    }
                }
                ((AbstractC1070k) p02).A(y.f36177a, this.f21104b);
                return true;
            }
        }
        p02.c(kVar2, i10);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
        r1 = r0.get(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f4, code lost:
        if (r1 <= r2) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fa, code lost:
        if (r0.compareAndSet(r14, r1, r2) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0114, code lost:
        throw new java.lang.IllegalStateException(("The number of released permits cannot be greater than " + r2).toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        Object a5;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f21102g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.f21103a;
            if (andIncrement < i10) {
                if (andIncrement >= 0) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21098c;
                k kVar = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = f21099d.getAndIncrement(this);
                long j6 = andIncrement2 / j.f21110f;
                h hVar = h.f21097Y;
                while (true) {
                    a5 = AbstractC1389a.a(kVar, j6, hVar);
                    if (H.a0(a5)) {
                        break;
                    }
                    z T = H.T(a5);
                    while (true) {
                        z zVar = (z) atomicReferenceFieldUpdater.get(this);
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
                k kVar2 = (k) H.T(a5);
                kVar2.a();
                if (kVar2.f16688h0 <= j6) {
                    int i11 = (int) (andIncrement2 % j.f21110f);
                    u uVar = j.f21106b;
                    AtomicReferenceArray atomicReferenceArray = kVar2.f21111j0;
                    Object andSet = atomicReferenceArray.getAndSet(i11, uVar);
                    if (andSet == null) {
                        int i12 = j.f21105a;
                        boolean z10 = false;
                        for (int i13 = 0; i13 < i12; i13++) {
                            if (atomicReferenceArray.get(i11) == j.f21107c) {
                                return;
                            }
                        }
                        u uVar2 = j.f21106b;
                        u uVar3 = j.f21108d;
                        while (true) {
                            if (atomicReferenceArray.compareAndSet(i11, uVar2, uVar3)) {
                                z10 = true;
                                break;
                            } else if (atomicReferenceArray.get(i11) != uVar2) {
                                break;
                            }
                        }
                        if (!z10) {
                            return;
                        }
                    } else if (andSet == j.f21109e) {
                        continue;
                    } else {
                        boolean z11 = andSet instanceof AbstractC1070k;
                        y yVar = y.f36177a;
                        if (z11) {
                            AbstractC1070k abstractC1070k = (AbstractC1070k) andSet;
                            u x10 = abstractC1070k.x(yVar, this.f21104b);
                            if (x10 != null) {
                                abstractC1070k.B(x10);
                                return;
                            }
                        } else if (andSet instanceof Ug.g) {
                            if (((Ug.f) ((Ug.g) andSet)).m(this, yVar) == 0) {
                                return;
                            }
                        } else {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                    }
                }
            }
        }
    }
}
