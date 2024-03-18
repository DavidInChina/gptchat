package com.revenuecat.purchases;

import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.models.Transaction;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import r.f;
import r9.y;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/revenuecat/purchases/models/Transaction;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class CustomerInfo$nonSubscriptionTransactions$2 extends o implements AbstractC6216a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$nonSubscriptionTransactions$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final List<Transaction> mo122invoke() {
        JSONObject jSONObject;
        ArrayList arrayList = new ArrayList();
        jSONObject = this.this$0.subscriberJSONObject;
        JSONObject jSONObject2 = jSONObject.getJSONObject(CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS);
        Iterator<String> keys = jSONObject2.keys();
        AbstractC3557B.b0("nonSubscriptions.keys()", keys);
        while (keys.hasNext()) {
            String next = keys.next();
            JSONArray jSONArray = jSONObject2.getJSONArray(next);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                AbstractC3557B.b0("productId", next);
                AbstractC3557B.b0("transactionJSONObject", jSONObject3);
                arrayList.add(new Transaction(next, jSONObject3));
            }
        }
        return t.F2(arrayList, new Comparator() { // from class: com.revenuecat.purchases.CustomerInfo$nonSubscriptionTransactions$2$invoke$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return f.n(((Transaction) t10).getPurchaseDate(), ((Transaction) t11).getPurchaseDate());
            }
        });
    }
}
