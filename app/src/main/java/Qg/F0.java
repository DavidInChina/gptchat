package Qg;

import Ng.C1072l;
import Pg.EnumC1170c;
import Rg.AbstractC1281b;
import Rg.AbstractC1282c;
import Rg.AbstractC1283d;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nf.AbstractC4825e;
import nf.AbstractC4831k;

/* loaded from: classes2.dex */
public final class F0 extends AbstractC1281b implements l0, AbstractC1206i, Rg.y {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14746k0 = AtomicReferenceFieldUpdater.newUpdater(F0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: j0  reason: collision with root package name */
    public int f14747j0;

    public F0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // Rg.y
    public final AbstractC1206i a(AbstractC4831k abstractC4831k, int i10, EnumC1170c enumC1170c) {
        if (((i10 >= 0 && i10 < 2) || i10 == -2) && enumC1170c == EnumC1170c.f14193Z) {
            return this;
        }
        return s0.f(this, abstractC4831k, i10, enumC1170c);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:20:0x0053, B:22:0x005d, B:24:0x006e, B:25:0x007d, B:27:0x0085, B:30:0x008c, B:31:0x0090, B:33:0x0093, B:35:0x0099, B:39:0x00a0, B:43:0x00b4, B:46:0x00c7, B:47:0x00df, B:50:0x00ea, B:52:0x00f0, B:53:0x00f3, B:55:0x00fb), top: B:62:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:20:0x0053, B:22:0x005d, B:24:0x006e, B:25:0x007d, B:27:0x0085, B:30:0x008c, B:31:0x0090, B:33:0x0093, B:35:0x0099, B:39:0x00a0, B:43:0x00b4, B:46:0x00c7, B:47:0x00df, B:50:0x00ea, B:52:0x00f0, B:53:0x00f3, B:55:0x00fb), top: B:62:0x0027 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c6 -> B:25:0x007d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0101 -> B:25:0x007d). Please submit an issue!!! */
    @Override // Qg.AbstractC1206i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(Qg.AbstractC1207j r17, nf.AbstractC4825e r18) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Qg.F0.b(Qg.j, nf.e):java.lang.Object");
    }

    @Override // Qg.k0, Qg.AbstractC1207j
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        setValue(obj);
        return jf.y.f36177a;
    }

    @Override // Qg.l0
    public final boolean e(Object obj, Object obj2) {
        Q1.u uVar = AbstractC1282c.f15530b;
        if (obj == null) {
            obj = uVar;
        }
        if (obj2 == null) {
            obj2 = uVar;
        }
        return l(obj, obj2);
    }

    @Override // Qg.k0
    public final void f() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // Qg.k0
    public final boolean g(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // Qg.l0, Qg.D0
    public final Object getValue() {
        Q1.u uVar = AbstractC1282c.f15530b;
        Object obj = f14746k0.get(this);
        if (obj == uVar) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Rg.d] */
    @Override // Rg.AbstractC1281b
    public final AbstractC1283d h() {
        return new Object();
    }

    @Override // Rg.AbstractC1281b
    public final AbstractC1283d[] j() {
        return new G0[2];
    }

    public final boolean l(Object obj, Object obj2) {
        int i10;
        AbstractC1283d[] abstractC1283dArr;
        Q1.u uVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14746k0;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC3557B.K(obj3, obj)) {
                return false;
            }
            if (AbstractC3557B.K(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f14747j0;
            if ((i11 & 1) == 0) {
                int i12 = i11 + 1;
                this.f14747j0 = i12;
                AbstractC1283d[] abstractC1283dArr2 = this.f15525Y;
                while (true) {
                    G0[] g0Arr = (G0[]) abstractC1283dArr2;
                    if (g0Arr != null) {
                        for (G0 g02 : g0Arr) {
                            if (g02 != null) {
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = G0.f14753a;
                                    Object obj4 = atomicReferenceFieldUpdater2.get(g02);
                                    if (obj4 != null && obj4 != (uVar = s0.f14919c)) {
                                        Q1.u uVar2 = s0.f14918b;
                                        if (obj4 == uVar2) {
                                            while (!atomicReferenceFieldUpdater2.compareAndSet(g02, obj4, uVar)) {
                                                if (atomicReferenceFieldUpdater2.get(g02) != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReferenceFieldUpdater2.compareAndSet(g02, obj4, uVar2)) {
                                                if (atomicReferenceFieldUpdater2.get(g02) != obj4) {
                                                    break;
                                                }
                                            }
                                            ((C1072l) obj4).resumeWith(jf.y.f36177a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i10 = this.f14747j0;
                        if (i10 == i12) {
                            this.f14747j0 = i12 + 1;
                            return true;
                        }
                        abstractC1283dArr = this.f15525Y;
                    }
                    abstractC1283dArr2 = abstractC1283dArr;
                    i12 = i10;
                }
            } else {
                this.f14747j0 = i11 + 2;
                return true;
            }
        }
    }

    @Override // Qg.l0
    public final void setValue(Object obj) {
        if (obj == null) {
            obj = AbstractC1282c.f15530b;
        }
        l(null, obj);
    }
}
