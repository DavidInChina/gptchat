package Hi;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class e extends AbstractC3557B {

    /* renamed from: h  reason: collision with root package name */
    public final Throwable f7862h;

    public e(Throwable th2) {
        AbstractC3557B.c0("throwable", th2);
        this.f7862h = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && AbstractC3557B.K(this.f7862h, ((e) obj).f7862h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7862h.hashCode();
    }

    public final String toString() {
        return "ErrorRetrievingAppUpdateData(throwable=" + this.f7862h + ')';
    }
}
