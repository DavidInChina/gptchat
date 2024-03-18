package gc;

import android.gov.nist.core.Separators;
import com.openai.experiment.ExperimentKey;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;

/* renamed from: gc.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3254f implements g {

    /* renamed from: a  reason: collision with root package name */
    public final ExperimentKey.BooleanKey f31555a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f31556b;

    public C3254f(ExperimentKey.BooleanKey booleanKey, boolean z10) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, booleanKey);
        this.f31555a = booleanKey;
        this.f31556b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3254f)) {
            return false;
        }
        C3254f c3254f = (C3254f) obj;
        if (AbstractC3557B.K(this.f31555a, c3254f.f31555a) && this.f31556b == c3254f.f31556b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f31555a.hashCode() * 31;
        if (this.f31556b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "UpdateValue(key=" + this.f31555a + ", value=" + this.f31556b + Separators.RPAREN;
    }
}
