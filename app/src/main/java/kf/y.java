package kf;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final int f37486a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f37487b;

    public y(int i10, Object obj) {
        this.f37486a = i10;
        this.f37487b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f37486a == yVar.f37486a && AbstractC3557B.K(this.f37487b, yVar.f37487b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f37486a * 31;
        Object obj = this.f37487b;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f37486a + ", value=" + this.f37487b + ')';
    }
}
