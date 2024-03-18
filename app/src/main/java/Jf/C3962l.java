package jf;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wf.AbstractC6216a;

/* renamed from: jf.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3962l implements AbstractC3957g, Serializable {

    /* renamed from: h0  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f36159h0 = AtomicReferenceFieldUpdater.newUpdater(C3962l.class, Object.class, "Z");

    /* renamed from: Y  reason: collision with root package name */
    public volatile AbstractC6216a f36160Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile Object f36161Z;

    @Override // jf.AbstractC3957g
    public final Object getValue() {
        Object obj = this.f36161Z;
        v vVar = v.f36174a;
        if (obj != vVar) {
            return obj;
        }
        AbstractC6216a abstractC6216a = this.f36160Y;
        if (abstractC6216a != null) {
            Object mo122invoke = abstractC6216a.mo122invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36159h0;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, mo122invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                    return this.f36161Z;
                }
            }
            this.f36160Y = null;
            return mo122invoke;
        }
        return this.f36161Z;
    }

    @Override // jf.AbstractC3957g
    public final boolean isInitialized() {
        if (this.f36161Z != v.f36174a) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
