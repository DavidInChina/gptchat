package na;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class K implements Z {

    /* renamed from: a  reason: collision with root package name */
    public final String f39815a;

    /* renamed from: b  reason: collision with root package name */
    public final N1 f39816b;

    public K(String str, N1 n12) {
        AbstractC3557B.c0(SDPKeywords.PROMPT, str);
        this.f39815a = str;
        this.f39816b = n12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        if (AbstractC3557B.K(this.f39815a, k10.f39815a) && this.f39816b == k10.f39816b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39816b.hashCode() + (this.f39815a.hashCode() * 31);
    }

    public final String toString() {
        return "PromptSelected(prompt=" + this.f39815a + ", type=" + this.f39816b + Separators.RPAREN;
    }
}
