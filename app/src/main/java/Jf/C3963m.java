package jf;

import id.AbstractC3557B;
import java.io.Serializable;
import wf.AbstractC6216a;

/* renamed from: jf.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3963m implements AbstractC3957g, Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC6216a f36162Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile Object f36163Z = v.f36174a;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f36164h0 = this;

    public C3963m(AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("initializer", abstractC6216a);
        this.f36162Y = abstractC6216a;
    }

    @Override // jf.AbstractC3957g
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f36163Z;
        v vVar = v.f36174a;
        if (obj2 != vVar) {
            return obj2;
        }
        synchronized (this.f36164h0) {
            obj = this.f36163Z;
            if (obj == vVar) {
                AbstractC6216a abstractC6216a = this.f36162Y;
                AbstractC3557B.Z(abstractC6216a);
                obj = abstractC6216a.mo122invoke();
                this.f36163Z = obj;
                this.f36162Y = null;
            }
        }
        return obj;
    }

    @Override // jf.AbstractC3957g
    public final boolean isInitialized() {
        if (this.f36163Z != v.f36174a) {
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
