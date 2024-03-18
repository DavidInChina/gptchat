package pc;

import android.gov.nist.core.Separators;
import com.openai.chatgpt.R;
import id.AbstractC3557B;

/* renamed from: pc.F  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5120F extends K {

    /* renamed from: i0  reason: collision with root package name */
    public final Throwable f42898i0;

    public C5120F(Throwable th2) {
        super(R.string.subscriptions_error_payment_pending, EnumC5121G.f42901h0, th2);
        this.f42898i0 = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5120F) && AbstractC3557B.K(this.f42898i0, ((C5120F) obj).f42898i0)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f42898i0;
    }

    public final int hashCode() {
        Throwable th2 = this.f42898i0;
        if (th2 == null) {
            return 0;
        }
        return th2.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "PaymentPending(cause=" + this.f42898i0 + Separators.RPAREN;
    }
}
