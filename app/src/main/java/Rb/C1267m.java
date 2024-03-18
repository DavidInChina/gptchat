package Rb;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Rb.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1267m implements AbstractC1270p {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f15363a;

    public C1267m(Intent intent) {
        this.f15363a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1267m) && AbstractC3557B.K(this.f15363a, ((C1267m) obj).f15363a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15363a.hashCode();
    }

    public final String toString() {
        return "LaunchIntent(intent=" + this.f15363a + Separators.RPAREN;
    }
}
