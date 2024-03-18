package k9;

import android.gov.nist.core.Separators;
import ff.e;
import id.AbstractC3557B;
import vd.AbstractC6027b;

/* loaded from: classes2.dex */
public final class c implements AbstractC6027b {

    /* renamed from: a  reason: collision with root package name */
    public final e f37205a;

    /* renamed from: b  reason: collision with root package name */
    public ff.c f37206b;

    public c(e eVar) {
        this.f37205a = eVar;
    }

    public final void a() {
        ff.c cVar = this.f37206b;
        if (cVar != null) {
            cVar.b();
        } else {
            AbstractC3557B.C2("datadogSpan");
            throw null;
        }
    }

    public final c b() {
        this.f37206b = this.f37205a.start();
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && AbstractC3557B.K(this.f37205a, ((c) obj).f37205a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37205a.hashCode();
    }

    public final String toString() {
        return "DatadogTraceSpan(spanBuilder=" + this.f37205a + Separators.RPAREN;
    }
}
