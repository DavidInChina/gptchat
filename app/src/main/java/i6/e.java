package i6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.C4196f;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f32729a;

    /* renamed from: b  reason: collision with root package name */
    public final C4196f f32730b;

    public e(String str, C4196f c4196f) {
        AbstractC3557B.c0("applicationId", str);
        AbstractC3557B.c0("featureConfiguration", c4196f);
        this.f32729a = str;
        this.f32730b = c4196f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3557B.K(this.f32729a, eVar.f32729a) && AbstractC3557B.K(this.f32730b, eVar.f32730b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32730b.hashCode() + (this.f32729a.hashCode() * 31);
    }

    public final String toString() {
        return "RumConfiguration(applicationId=" + this.f32729a + ", featureConfiguration=" + this.f32730b + Separators.RPAREN;
    }
}
