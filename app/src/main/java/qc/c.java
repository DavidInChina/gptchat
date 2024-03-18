package qc;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.LogHandler;
import id.AbstractC3557B;
import x8.W;

/* loaded from: classes2.dex */
public final class c implements LogHandler {

    /* renamed from: a  reason: collision with root package name */
    public static final c f44042a = new Object();

    @Override // com.revenuecat.purchases.LogHandler
    public final void d(String str, String str2) {
        AbstractC3557B.c0(ParameterNames.TAG, str);
        AbstractC3557B.c0("msg", str2);
        W.F(Pc.e.a(), android.gov.nist.core.a.j(str, ": ", str2), null, 6);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public final void e(String str, String str2, Throwable th2) {
        AbstractC3557B.c0(ParameterNames.TAG, str);
        AbstractC3557B.c0("msg", str2);
        W.G(Pc.e.a(), android.gov.nist.core.a.j(str, ": ", str2), th2, 4);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public final void i(String str, String str2) {
        AbstractC3557B.c0(ParameterNames.TAG, str);
        AbstractC3557B.c0("msg", str2);
        W.M(Pc.e.a(), android.gov.nist.core.a.j(str, ": ", str2), null, 6);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public final void v(String str, String str2) {
        AbstractC3557B.c0(ParameterNames.TAG, str);
        AbstractC3557B.c0("msg", str2);
        W.M(Pc.e.a(), android.gov.nist.core.a.j(str, ": ", str2), null, 6);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public final void w(String str, String str2) {
        AbstractC3557B.c0(ParameterNames.TAG, str);
        AbstractC3557B.c0("msg", str2);
        W.W(Pc.e.a(), android.gov.nist.core.a.j(str, ": ", str2), null, null, 6);
    }
}
