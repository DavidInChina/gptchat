package Z1;

import android.widget.RemoteViews;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public final RemoteViews f23115a;

    /* renamed from: b  reason: collision with root package name */
    public final C1763g0 f23116b;

    public u0(RemoteViews remoteViews, C1763g0 c1763g0) {
        this.f23115a = remoteViews;
        this.f23116b = c1763g0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (AbstractC3557B.K(this.f23115a, u0Var.f23115a) && AbstractC3557B.K(this.f23116b, u0Var.f23116b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23116b.hashCode() + (this.f23115a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.f23115a + ", view=" + this.f23116b + ')';
    }
}
