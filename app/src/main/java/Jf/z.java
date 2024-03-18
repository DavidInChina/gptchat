package jf;

import id.AbstractC3557B;
import java.io.Serializable;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class z implements AbstractC3957g, Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC6216a f36178Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f36179Z;

    @Override // jf.AbstractC3957g
    public final Object getValue() {
        if (this.f36179Z == v.f36174a) {
            AbstractC6216a abstractC6216a = this.f36178Y;
            AbstractC3557B.Z(abstractC6216a);
            this.f36179Z = abstractC6216a.mo122invoke();
            this.f36178Y = null;
        }
        return this.f36179Z;
    }

    @Override // jf.AbstractC3957g
    public final boolean isInitialized() {
        if (this.f36179Z != v.f36174a) {
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
