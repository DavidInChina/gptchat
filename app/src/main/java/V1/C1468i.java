package V1;

import android.transition.Transition;
import m.AbstractC4508E;
import y1.C6497g;

/* renamed from: V1.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1468i extends AbstractC4508E {

    /* renamed from: h0  reason: collision with root package name */
    public final Object f18204h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f18205i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Object f18206j0;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r6 == V1.AbstractComponentCallbacksC1480v.f18259Z0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r6 == V1.AbstractComponentCallbacksC1480v.f18259Z0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1468i(e0 e0Var, C6497g c6497g, boolean z10, boolean z11) {
        super(e0Var, c6497g);
        Object obj;
        Object obj2;
        int i10 = e0Var.f18183a;
        Object obj3 = null;
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = e0Var.f18185c;
        if (i10 == 2) {
            if (z10) {
                C1479u c1479u = abstractComponentCallbacksC1480v.f18272M0;
                if (c1479u != null) {
                    obj = c1479u.f18255j;
                }
            } else {
                abstractComponentCallbacksC1480v.getClass();
            }
            obj = null;
        } else {
            if (z10) {
                C1479u c1479u2 = abstractComponentCallbacksC1480v.f18272M0;
                if (c1479u2 != null) {
                    obj = c1479u2.f18254i;
                }
            } else {
                abstractComponentCallbacksC1480v.getClass();
            }
            obj = null;
        }
        this.f18204h0 = obj;
        if (e0Var.f18183a == 2) {
            if (z10) {
                C1479u c1479u3 = abstractComponentCallbacksC1480v.f18272M0;
            } else {
                C1479u c1479u4 = abstractComponentCallbacksC1480v.f18272M0;
            }
        }
        this.f18205i0 = true;
        if (z11) {
            if (z10) {
                C1479u c1479u5 = abstractComponentCallbacksC1480v.f18272M0;
                if (c1479u5 != null && (obj2 = c1479u5.f18256k) != AbstractComponentCallbacksC1480v.f18259Z0) {
                    obj3 = obj2;
                }
            } else {
                abstractComponentCallbacksC1480v.getClass();
            }
        }
        this.f18206j0 = obj3;
    }

    public final Z k() {
        Object obj = this.f18204h0;
        Z l10 = l(obj);
        Object obj2 = this.f18206j0;
        Z l11 = l(obj2);
        if (l10 != null && l11 != null && l10 != l11) {
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + ((e0) this.f38593Y).f18185c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        } else if (l10 == null) {
            return l11;
        } else {
            return l10;
        }
    }

    public final Z l(Object obj) {
        if (obj == null) {
            return null;
        }
        X x10 = S.f18113a;
        if (obj instanceof Transition) {
            return x10;
        }
        Z z10 = S.f18114b;
        if (z10 != null && z10.e(obj)) {
            return z10;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + ((e0) this.f38593Y).f18185c + " is not a valid framework Transition or AndroidX Transition");
    }
}
