package Pg;

import Ng.P0;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicReferenceArray;
import nf.AbstractC4831k;

/* loaded from: classes.dex */
public final class t extends Sg.z {

    /* renamed from: j0  reason: collision with root package name */
    public final k f14248j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f14249k0 = new AtomicReferenceArray(m.f14223b * 2);

    public t(long j6, t tVar, k kVar, int i10) {
        super(j6, tVar, i10);
        this.f14248j0 = kVar;
    }

    @Override // Sg.z
    public final int f() {
        return m.f14223b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
        id.AbstractC3557B.Z(r5);
        r7 = r5.f14219Z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
        r7 = Bi.c.X(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
        if (r7 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
        L4.a.A0(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    @Override // Sg.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i10, AbstractC4831k abstractC4831k) {
        boolean z10;
        Q1.u uVar;
        K0.e X10;
        int i11 = m.f14223b;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 -= i11;
        }
        Object obj = this.f14249k0.get(i10 * 2);
        while (true) {
            Object k10 = k(i10);
            boolean z11 = k10 instanceof P0;
            k kVar = this.f14248j0;
            if (!z11 && !(k10 instanceof E)) {
                if (k10 == m.f14231j || k10 == m.f14232k) {
                    break;
                } else if (k10 != m.f14228g && k10 != m.f14227f) {
                    if (k10 == m.f14230i || k10 == m.f14225d || k10 == m.f14233l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k10).toString());
                }
            } else {
                if (z10) {
                    uVar = m.f14231j;
                } else {
                    uVar = m.f14232k;
                }
                if (j(k10, i10, uVar)) {
                    m(i10, null);
                    l(i10, !z10);
                    if (z10) {
                        AbstractC3557B.Z(kVar);
                        wf.k kVar2 = kVar.f14219Z;
                        if (kVar2 != null && (X10 = Bi.c.X(kVar2, obj, null)) != null) {
                            L4.a.A0(abstractC4831k, X10);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final boolean j(Object obj, int i10, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f14249k0;
        int i11 = (i10 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
            if (atomicReferenceArray.get(i11) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i10) {
        return this.f14249k0.get((i10 * 2) + 1);
    }

    public final void l(int i10, boolean z10) {
        if (z10) {
            k kVar = this.f14248j0;
            AbstractC3557B.Z(kVar);
            kVar.N((this.f16688h0 * m.f14223b) + i10);
        }
        h();
    }

    public final void m(int i10, Object obj) {
        this.f14249k0.set(i10 * 2, obj);
    }

    public final void n(int i10, Q1.u uVar) {
        this.f14249k0.set((i10 * 2) + 1, uVar);
    }
}
