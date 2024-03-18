package ia;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: ia.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3520c {
    public static final C3519b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f32901a;

    public /* synthetic */ C3520c(String str) {
        this.f32901a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3520c)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f32901a, ((C3520c) obj).f32901a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f32901a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("PluginId(value="), this.f32901a, Separators.RPAREN);
    }
}
