package d4;

import id.AbstractC3557B;

/* renamed from: d4.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2595d implements AbstractC2596e {

    /* renamed from: b  reason: collision with root package name */
    public final Object f27991b;

    public /* synthetic */ C2595d(Object obj) {
        this.f27991b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2595d)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f27991b, ((C2595d) obj).f27991b)) {
            return false;
        }
        return true;
    }

    @Override // d4.AbstractC2596e
    public final Object getValue() {
        return this.f27991b;
    }

    public final int hashCode() {
        Object obj = this.f27991b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Value(value=" + this.f27991b + ')';
    }
}
