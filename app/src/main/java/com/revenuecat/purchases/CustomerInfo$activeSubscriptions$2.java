package com.revenuecat.purchases;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import r9.y;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class CustomerInfo$activeSubscriptions$2 extends o implements AbstractC6216a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$activeSubscriptions$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Set<String> mo122invoke() {
        Set<String> activeIdentifiers;
        CustomerInfo customerInfo = this.this$0;
        activeIdentifiers = customerInfo.activeIdentifiers(customerInfo.getAllExpirationDatesByProduct());
        return activeIdentifiers;
    }
}
