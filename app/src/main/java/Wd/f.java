package Wd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class f extends h {

    /* renamed from: a  reason: collision with root package name */
    public final String f20937a = "Speakerphone";

    @Override // Wd.h
    public final String a() {
        return this.f20937a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                if (!AbstractC3557B.K(this.f20937a, ((f) obj).f20937a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f20937a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Speakerphone(name="), this.f20937a, Separators.RPAREN);
    }
}
