package Wd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class e extends h {

    /* renamed from: a  reason: collision with root package name */
    public final String f20936a = "Earpiece";

    @Override // Wd.h
    public final String a() {
        return this.f20936a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                if (!AbstractC3557B.K(this.f20936a, ((e) obj).f20936a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f20936a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Earpiece(name="), this.f20936a, Separators.RPAREN);
    }
}
