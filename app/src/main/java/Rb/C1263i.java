package Rb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: Rb.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1263i {
    public static final C1262h Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f15351a;

    public /* synthetic */ C1263i(String str) {
        this.f15351a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1263i)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f15351a, ((C1263i) obj).f15351a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15351a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Id(value="), this.f15351a, Separators.RPAREN);
    }
}
