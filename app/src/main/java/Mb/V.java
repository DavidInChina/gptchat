package Mb;

import android.content.Intent;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class V extends Y {

    /* renamed from: a  reason: collision with root package name */
    public final String f11854a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11855b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11856c;

    /* renamed from: d  reason: collision with root package name */
    public final Intent f11857d;

    public /* synthetic */ V(String str, int i10, int i11) {
        this(str, (i11 & 2) != 0 ? 1 : i10, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        if (AbstractC3557B.K(this.f11854a, v10.f11854a) && this.f11855b == v10.f11855b && AbstractC3557B.K(this.f11856c, v10.f11856c) && AbstractC3557B.K(this.f11857d, v10.f11857d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int d10 = AbstractC6708l.d(this.f11855b, this.f11854a.hashCode() * 31, 31);
        int i11 = 0;
        String str = this.f11856c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (d10 + i10) * 31;
        Intent intent = this.f11857d;
        if (intent != null) {
            i11 = intent.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "ShowError(message=" + this.f11854a + ", duration=" + R.a.H(this.f11855b) + ", actionLabel=" + this.f11856c + ", action=" + this.f11857d + Separators.RPAREN;
    }

    public V(String str, int i10, String str2, Intent intent) {
        AbstractC3557B.c0("message", str);
        AbstractC2469q0.q("duration", i10);
        this.f11854a = str;
        this.f11855b = i10;
        this.f11856c = str2;
        this.f11857d = intent;
    }
}
