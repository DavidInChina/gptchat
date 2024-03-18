package K0;

import android.content.res.Resources;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Resources.Theme f9321a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9322b;

    public c(int i10, Resources.Theme theme) {
        this.f9321a = theme;
        this.f9322b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3557B.K(this.f9321a, cVar.f9321a) && this.f9322b == cVar.f9322b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9321a.hashCode() * 31) + this.f9322b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.f9321a);
        sb2.append(", id=");
        return AbstractC2469q0.j(sb2, this.f9322b, ')');
    }
}
