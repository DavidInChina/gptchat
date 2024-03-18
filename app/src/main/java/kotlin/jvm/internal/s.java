package kotlin.jvm.internal;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class s implements AbstractC4306e {

    /* renamed from: Y  reason: collision with root package name */
    public final Class f37643Y;

    public s(Class cls, String str) {
        AbstractC3557B.c0("jClass", cls);
        this.f37643Y = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            if (AbstractC3557B.K(this.f37643Y, ((s) obj).f37643Y)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.jvm.internal.AbstractC4306e
    public final Class f() {
        return this.f37643Y;
    }

    public final int hashCode() {
        return this.f37643Y.hashCode();
    }

    public final String toString() {
        return this.f37643Y.toString() + " (Kotlin reflection is not available)";
    }
}
