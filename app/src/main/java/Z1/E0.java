package Z1;

import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class E0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f22828a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22829b;

    public E0(int i10, int i11) {
        this.f22828a = i10;
        this.f22829b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        if (this.f22828a == e02.f22828a && this.f22829b == e02.f22829b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC6708l.f(this.f22829b) + (AbstractC6708l.f(this.f22828a) * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + R.a.J(this.f22828a) + ", height=" + R.a.J(this.f22829b) + ')';
    }
}
