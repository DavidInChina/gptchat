package pc;

import android.gov.nist.core.Separators;
import com.openai.chatgpt.R;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class H extends K {

    /* renamed from: i0  reason: collision with root package name */
    public final Throwable f42903i0;

    public H(Throwable th2) {
        super(R.string.subscriptions_error_purchase_failed, EnumC5121G.f42900Z, th2);
        this.f42903i0 = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof H) && AbstractC3557B.K(this.f42903i0, ((H) obj).f42903i0)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f42903i0;
    }

    public final int hashCode() {
        Throwable th2 = this.f42903i0;
        if (th2 == null) {
            return 0;
        }
        return th2.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "PurchaseFailed(cause=" + this.f42903i0 + Separators.RPAREN;
    }
}
