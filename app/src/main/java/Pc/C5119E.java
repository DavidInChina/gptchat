package pc;

import android.gov.nist.core.Separators;
import com.openai.chatgpt.R;
import id.AbstractC3557B;

/* renamed from: pc.E  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5119E extends K {

    /* renamed from: i0  reason: collision with root package name */
    public final Throwable f42897i0;

    public C5119E(Throwable th2) {
        super(R.string.subscriptions_error_generic_unavailable, EnumC5121G.f42899Y, th2);
        this.f42897i0 = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5119E) && AbstractC3557B.K(this.f42897i0, ((C5119E) obj).f42897i0)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f42897i0;
    }

    public final int hashCode() {
        Throwable th2 = this.f42897i0;
        if (th2 == null) {
            return 0;
        }
        return th2.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "PackageFetchFailed(cause=" + this.f42897i0 + Separators.RPAREN;
    }
}
