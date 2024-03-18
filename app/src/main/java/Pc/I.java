package pc;

import android.gov.nist.core.Separators;
import com.openai.chatgpt.R;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class I extends K {

    /* renamed from: i0  reason: collision with root package name */
    public final Throwable f42904i0;

    public I(Throwable th2) {
        super(R.string.subscriptions_error_receipt_already_in_use, EnumC5121G.f42900Z, th2);
        this.f42904i0 = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof I) && AbstractC3557B.K(this.f42904i0, ((I) obj).f42904i0)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f42904i0;
    }

    public final int hashCode() {
        Throwable th2 = this.f42904i0;
        if (th2 == null) {
            return 0;
        }
        return th2.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ReceiptAlreadyInUse(cause=" + this.f42904i0 + Separators.RPAREN;
    }
}
