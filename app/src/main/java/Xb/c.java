package Xb;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f21819a;

    public c(Intent intent) {
        this.f21819a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && AbstractC3557B.K(this.f21819a, ((c) obj).f21819a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21819a.hashCode();
    }

    public final String toString() {
        return "LaunchIntent(intent=" + this.f21819a + Separators.RPAREN;
    }
}
