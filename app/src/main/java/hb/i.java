package hb;

import android.gov.nist.core.Separators;
import fa.C2969F;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class i implements l {

    /* renamed from: a  reason: collision with root package name */
    public final C2969F f32108a;

    public i(C2969F c2969f) {
        AbstractC3557B.c0("message", c2969f);
        this.f32108a = c2969f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && AbstractC3557B.K(this.f32108a, ((i) obj).f32108a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32108a.hashCode();
    }

    public final String toString() {
        return "PlayAudioMessage(message=" + this.f32108a + Separators.RPAREN;
    }
}
