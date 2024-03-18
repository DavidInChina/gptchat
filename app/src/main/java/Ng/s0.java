package Ng;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class s0 implements AbstractC1063g0 {

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12969Z = AtomicIntegerFieldUpdater.newUpdater(s0.class, "_isCompleting$volatile");

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12970h0 = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_rootCause$volatile");

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12971i0 = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_exceptionsHolder$volatile");

    /* renamed from: Y  reason: collision with root package name */
    public final y0 f12972Y;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    public s0(y0 y0Var, Throwable th2) {
        this.f12972Y = y0Var;
        this._rootCause$volatile = th2;
    }

    @Override // Ng.AbstractC1063g0
    public final boolean a() {
        if (c() == null) {
            return true;
        }
        return false;
    }

    public final void b(Throwable th2) {
        Throwable c10 = c();
        if (c10 == null) {
            f12970h0.set(this, th2);
        } else if (th2 == c10) {
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12971i0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th2);
            } else if (obj instanceof Throwable) {
                if (th2 == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th2);
                atomicReferenceFieldUpdater.set(this, arrayList);
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th2);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    public final Throwable c() {
        return (Throwable) f12970h0.get(this);
    }

    public final boolean d() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    @Override // Ng.AbstractC1063g0
    public final y0 e() {
        return this.f12972Y;
    }

    public final boolean f() {
        if (f12969Z.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final ArrayList g(Throwable th2) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12971i0;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable c10 = c();
        if (c10 != null) {
            arrayList.add(0, c10);
        }
        if (th2 != null && !AbstractC3557B.K(th2, c10)) {
            arrayList.add(th2);
        }
        atomicReferenceFieldUpdater.set(this, H.f12880h);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + f() + ", rootCause=" + c() + ", exceptions=" + f12971i0.get(this) + ", list=" + this.f12972Y + ']';
    }
}
