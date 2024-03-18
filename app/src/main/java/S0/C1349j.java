package S0;

import id.AbstractC3557B;

/* renamed from: S0.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1349j {

    /* renamed from: a  reason: collision with root package name */
    public final Object f16031a;

    public /* synthetic */ C1349j(Object obj) {
        this.f16031a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1349j)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f16031a, ((C1349j) obj).f16031a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f16031a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f16031a + ')';
    }
}
