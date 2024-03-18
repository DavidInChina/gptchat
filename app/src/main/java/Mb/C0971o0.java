package Mb;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Mb.o0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0971o0 implements AbstractC0976r0 {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f11969a;

    public C0971o0(Intent intent) {
        AbstractC3557B.c0("intent", intent);
        this.f11969a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0971o0) && AbstractC3557B.K(this.f11969a, ((C0971o0) obj).f11969a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11969a.hashCode();
    }

    public final String toString() {
        return "LaunchIntent(intent=" + this.f11969a + Separators.RPAREN;
    }
}
