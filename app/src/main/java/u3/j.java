package U3;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f17418a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17419b;

    public j(String str, int i10) {
        AbstractC3557B.c0("workSpecId", str);
        this.f17418a = str;
        this.f17419b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (AbstractC3557B.K(this.f17418a, jVar.f17418a) && this.f17419b == jVar.f17419b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17418a.hashCode() * 31) + this.f17419b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f17418a);
        sb2.append(", generation=");
        return AbstractC2469q0.j(sb2, this.f17419b, ')');
    }
}
