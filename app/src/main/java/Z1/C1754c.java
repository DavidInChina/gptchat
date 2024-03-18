package Z1;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: Z1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1754c {

    /* renamed from: a  reason: collision with root package name */
    public final int f22945a;

    public C1754c(int i10) {
        this.f22945a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1754c) && this.f22945a == ((C1754c) obj).f22945a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22945a;
    }

    public final String toString() {
        return AbstractC2469q0.j(new StringBuilder("AppWidgetId(appWidgetId="), this.f22945a, ')');
    }
}
