package Cd;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Cd.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326k implements AbstractC0330o {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f3062a;

    public C0326k(Intent intent) {
        AbstractC3557B.c0("intent", intent);
        this.f3062a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0326k) && AbstractC3557B.K(this.f3062a, ((C0326k) obj).f3062a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3062a.hashCode();
    }

    public final String toString() {
        return "LaunchIntent(intent=" + this.f3062a + Separators.RPAREN;
    }
}
