package ta;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;

/* renamed from: ta.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5711j {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f45953a;

    /* renamed from: b  reason: collision with root package name */
    public final Kc.e f45954b;

    /* renamed from: c  reason: collision with root package name */
    public final Yg.p f45955c;

    /* renamed from: d  reason: collision with root package name */
    public final String f45956d;

    public C5711j(b0 b0Var, Kc.e eVar, Yg.p pVar) {
        AbstractC3557B.c0("requestHashParameters", b0Var);
        AbstractC3557B.c0("tokenConfig", eVar);
        AbstractC3557B.c0(DiagnosticsEntry.Event.TIMESTAMP_KEY, pVar);
        this.f45953a = b0Var;
        this.f45954b = eVar;
        this.f45955c = pVar;
        String b10 = eVar.f9628c.b();
        AbstractC3557B.b0("token(...)", b10);
        this.f45956d = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5711j)) {
            return false;
        }
        C5711j c5711j = (C5711j) obj;
        if (AbstractC3557B.K(this.f45953a, c5711j.f45953a) && AbstractC3557B.K(this.f45954b, c5711j.f45954b) && AbstractC3557B.K(this.f45955c, c5711j.f45955c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f45954b.hashCode();
        return this.f45955c.f22419Y.hashCode() + ((hashCode + (this.f45953a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ConversationIntegrityToken(requestHashParameters=" + this.f45953a + ", tokenConfig=" + this.f45954b + ", timestamp=" + this.f45955c + Separators.RPAREN;
    }
}
