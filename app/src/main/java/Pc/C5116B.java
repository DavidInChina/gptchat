package pc;

import android.gov.nist.core.Separators;
import com.openai.chatgpt.R;
import id.AbstractC3557B;

/* renamed from: pc.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5116B extends K {

    /* renamed from: i0  reason: collision with root package name */
    public final Throwable f42894i0 = null;

    public C5116B() {
        super(R.string.subscriptions_error_generic_unavailable, EnumC5121G.f42899Y, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5116B) && AbstractC3557B.K(this.f42894i0, ((C5116B) obj).f42894i0)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f42894i0;
    }

    public final int hashCode() {
        Throwable th2 = this.f42894i0;
        if (th2 == null) {
            return 0;
        }
        return th2.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "GenericError(cause=" + this.f42894i0 + Separators.RPAREN;
    }
}
