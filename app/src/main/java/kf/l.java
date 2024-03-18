package Kf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final k f9807a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9808b;

    public l(k kVar, int i10) {
        this.f9807a = kVar;
        this.f9808b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3557B.K(this.f9807a, lVar.f9807a) && this.f9808b == lVar.f9808b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9807a.hashCode() * 31) + this.f9808b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KindWithArity(kind=");
        sb2.append(this.f9807a);
        sb2.append(", arity=");
        return AbstractC2469q0.j(sb2, this.f9808b, ')');
    }
}
