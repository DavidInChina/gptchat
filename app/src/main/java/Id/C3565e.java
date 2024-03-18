package id;

import android.gov.nist.core.Separators;

/* renamed from: id.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3565e extends AbstractC3566f {

    /* renamed from: a  reason: collision with root package name */
    public final String f33093a;

    public C3565e(String str) {
        AbstractC3557B.c0("value", str);
        this.f33093a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3565e) && AbstractC3557B.K(this.f33093a, ((C3565e) obj).f33093a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33093a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("StringValue(value="), this.f33093a, Separators.RPAREN);
    }
}
