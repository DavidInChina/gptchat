package jc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: jc.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3939g {
    public static final C3938f Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f36108a;

    public /* synthetic */ C3939g(String str) {
        this.f36108a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3939g)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f36108a, ((C3939g) obj).f36108a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f36108a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("MemoryId(value="), this.f36108a, Separators.RPAREN);
    }
}
