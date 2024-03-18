package E;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* loaded from: classes.dex */
public final class I implements A0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f3775a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f3776b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final int f3777c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final int f3778d = 0;

    @Override // E.A0
    public final int a(Z0.b bVar, Z0.l lVar) {
        return this.f3775a;
    }

    @Override // E.A0
    public final int b(Z0.b bVar, Z0.l lVar) {
        return this.f3777c;
    }

    @Override // E.A0
    public final int c(Z0.b bVar) {
        return this.f3776b;
    }

    @Override // E.A0
    public final int d(Z0.b bVar) {
        return this.f3778d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        if (this.f3775a == i10.f3775a && this.f3776b == i10.f3776b && this.f3777c == i10.f3777c && this.f3778d == i10.f3778d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f3775a * 31) + this.f3776b) * 31) + this.f3777c) * 31) + this.f3778d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets(left=");
        sb2.append(this.f3775a);
        sb2.append(", top=");
        sb2.append(this.f3776b);
        sb2.append(", right=");
        sb2.append(this.f3777c);
        sb2.append(", bottom=");
        return AbstractC2469q0.j(sb2, this.f3778d, ')');
    }
}
