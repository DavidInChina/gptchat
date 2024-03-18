package gc;

import android.gov.nist.core.Separators;
import com.openai.experiment.ExperimentKey;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import k6.AbstractC4194d;

/* renamed from: gc.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3251c {

    /* renamed from: a  reason: collision with root package name */
    public final ExperimentKey.BooleanKey f31550a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f31551b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f31552c;

    public C3251c(ExperimentKey.BooleanKey booleanKey, boolean z10, boolean z11) {
        this.f31550a = booleanKey;
        this.f31551b = z10;
        this.f31552c = z11;
    }

    public static C3251c a(C3251c c3251c, boolean z10, boolean z11) {
        ExperimentKey.BooleanKey booleanKey = c3251c.f31550a;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, booleanKey);
        return new C3251c(booleanKey, z10, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3251c)) {
            return false;
        }
        C3251c c3251c = (C3251c) obj;
        if (AbstractC3557B.K(this.f31550a, c3251c.f31550a) && this.f31551b == c3251c.f31551b && this.f31552c == c3251c.f31552c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f31550a.hashCode() * 31;
        int i11 = 1237;
        if (this.f31551b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (hashCode + i10) * 31;
        if (this.f31552c) {
            i11 = 1231;
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExperimentItem(key=");
        sb2.append(this.f31550a);
        sb2.append(", value=");
        sb2.append(this.f31551b);
        sb2.append(", hasOverride=");
        return AbstractC4194d.w(sb2, this.f31552c, Separators.RPAREN);
    }
}
