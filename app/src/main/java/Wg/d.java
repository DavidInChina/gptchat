package Wg;

import Df.H;
import Ng.C1072l;
import Q1.u;
import com.google.android.gms.internal.play_billing.N;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import q1.AbstractC5260f;

/* loaded from: classes2.dex */
public final class d extends i implements a {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21094h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public d(boolean z10) {
        super(1, z10 ? 1 : 0);
        u uVar;
        if (z10) {
            uVar = null;
        } else {
            uVar = e.f21095a;
        }
        this.owner$volatile = uVar;
    }

    public final boolean d() {
        if (Math.max(i.f21102g.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        r6 = Wg.d.f21094h;
        r3 = r2.f21092Z;
        r4 = r2.f21093h0;
        r6.set(r4, r3);
        r2.f21091Y.A(r1, new Wg.b(r4, r2, 0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, AbstractC4825e abstractC4825e) {
        boolean f6 = f(obj);
        y yVar = y.f36177a;
        if (!f6) {
            C1072l R10 = H.R(AbstractC5260f.z(abstractC4825e));
            try {
                c cVar = new c(this, R10, obj);
                while (true) {
                    int andDecrement = i.f21102g.getAndDecrement(this);
                    if (andDecrement <= this.f21103a) {
                        if (andDecrement > 0) {
                            break;
                        } else if (b(cVar)) {
                            break;
                        }
                    }
                }
                Object t10 = R10.t();
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                if (t10 == enumC5000a) {
                    N.k0(abstractC4825e);
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

    public final boolean f(Object obj) {
        int i10;
        boolean z10;
        boolean z11;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f21102g;
            int i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = this.f21103a;
            if (i11 > i12) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > i12) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i12));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21094h;
                if (i11 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (!d()) {
                                z10 = false;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != e.f21095a) {
                                if (obj2 == obj) {
                                    z10 = true;
                                } else {
                                    z10 = true;
                                }
                            }
                        }
                        if (!z10) {
                            if (z10) {
                                break;
                            }
                        } else {
                            z11 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    z11 = false;
                    break;
                }
            }
        }
        z11 = true;
        if (!z11) {
            return true;
        }
        if (z11) {
            return false;
        }
        if (!z11) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final void g(Object obj) {
        while (d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21094h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            u uVar = e.f21095a;
            if (obj2 != uVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, uVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                c();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        return "Mutex@" + Ng.H.q(this) + "[isLocked=" + d() + ",owner=" + f21094h.get(this) + ']';
    }
}
