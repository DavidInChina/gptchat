package Z0;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f22800a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22801b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22802c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22803d;

    public j(int i10, int i11, int i12, int i13) {
        this.f22800a = i10;
        this.f22801b = i11;
        this.f22802c = i12;
        this.f22803d = i13;
    }

    public final int a() {
        return this.f22803d - this.f22801b;
    }

    public final int b() {
        return this.f22802c - this.f22800a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f22800a == jVar.f22800a && this.f22801b == jVar.f22801b && this.f22802c == jVar.f22802c && this.f22803d == jVar.f22803d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f22800a * 31) + this.f22801b) * 31) + this.f22802c) * 31) + this.f22803d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f22800a);
        sb2.append(", ");
        sb2.append(this.f22801b);
        sb2.append(", ");
        sb2.append(this.f22802c);
        sb2.append(", ");
        return AbstractC2469q0.j(sb2, this.f22803d, ')');
    }
}
