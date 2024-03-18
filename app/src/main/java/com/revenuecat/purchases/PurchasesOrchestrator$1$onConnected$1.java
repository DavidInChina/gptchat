package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.BillingStrings;
import id.AbstractC3557B;
import java.util.Arrays;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "countryCode", "Ljf/y;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PurchasesOrchestrator$1$onConnected$1 extends o implements k {
    public static final PurchasesOrchestrator$1$onConnected$1 INSTANCE = new PurchasesOrchestrator$1$onConnected$1();

    public PurchasesOrchestrator$1$onConnected$1() {
        super(1);
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return y.f36177a;
    }

    public final void invoke(String str) {
        AbstractC3557B.c0("countryCode", str);
        LogUtilsKt.debugLog(String.format(BillingStrings.BILLING_COUNTRY_CODE, Arrays.copyOf(new Object[]{str}, 1)));
    }
}
