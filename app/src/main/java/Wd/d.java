package Wd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class d extends h {

    /* renamed from: a  reason: collision with root package name */
    public final String f20935a;

    public d(String str) {
        AbstractC3557B.c0("name", str);
        this.f20935a = str;
    }

    @Override // Wd.h
    public final String a() {
        return this.f20935a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (!AbstractC3557B.K(this.f20935a, ((d) obj).f20935a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f20935a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return R.a.t(new StringBuilder("BluetoothHeadset(name="), this.f20935a, Separators.RPAREN);
    }
}
