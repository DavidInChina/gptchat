package com.revenuecat.purchases;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import r.f;
import r9.y;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/Date;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class CustomerInfo$latestExpirationDate$2 extends o implements AbstractC6216a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$latestExpirationDate$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Date mo122invoke() {
        List F22 = t.F2(this.this$0.getAllExpirationDatesByProduct().values(), new Comparator() { // from class: com.revenuecat.purchases.CustomerInfo$latestExpirationDate$2$invoke$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return f.n((Date) t10, (Date) t11);
            }
        });
        if (F22.isEmpty()) {
            F22 = null;
        }
        if (F22 != null) {
            return (Date) t.o2(F22);
        }
        return null;
    }
}
