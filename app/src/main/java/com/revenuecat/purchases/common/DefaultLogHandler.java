package com.revenuecat.purchases.common;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.util.Log;
import com.revenuecat.purchases.LogHandler;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\n\u0010\u0007J)\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/common/DefaultLogHandler;", "Lcom/revenuecat/purchases/LogHandler;", "", ParameterNames.TAG, "msg", "Ljf/y;", "v", "(Ljava/lang/String;Ljava/lang/String;)V", "d", "i", "w", "", "throwable", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
final class DefaultLogHandler implements LogHandler {
    @Override // com.revenuecat.purchases.LogHandler
    public void d(String str, String str2) {
        AbstractC3557B.c0(ParameterNames.TAG, str);
        AbstractC3557B.c0("msg", str2);
        Log.d(str, str2);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void e(String str, String str2, Throwable th2) {
        AbstractC3557B.c0(ParameterNames.TAG, str);
        AbstractC3557B.c0("msg", str2);
        if (th2 != null) {
            AbstractC3612c.d(str, str2, th2);
        } else {
            AbstractC3612c.c(str, str2);
        }
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void i(String str, String str2) {
        AbstractC3557B.c0(ParameterNames.TAG, str);
        AbstractC3557B.c0("msg", str2);
        Log.i(str, str2);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void v(String str, String str2) {
        AbstractC3557B.c0(ParameterNames.TAG, str);
        AbstractC3557B.c0("msg", str2);
        Log.v(str, str2);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void w(String str, String str2) {
        AbstractC3557B.c0(ParameterNames.TAG, str);
        AbstractC3557B.c0("msg", str2);
        AbstractC3612c.r(str, str2);
    }
}
