package com.statsig.androidsdk;

import android.content.Context;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.statsig.androidsdk.DebugView;
import id.AbstractC3557B;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class StatsigClient$openDebugView$1 extends o implements AbstractC6216a {
    final /* synthetic */ Context $context;
    final /* synthetic */ StatsigClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$openDebugView$1(StatsigClient statsigClient, Context context) {
        super(0);
        this.this$0 = statsigClient;
        this.$context = context;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        Store store;
        Store store2;
        StatsigUser statsigUser;
        String str;
        store = this.this$0.store;
        if (store != null) {
            C3959i[] c3959iArr = new C3959i[4];
            c3959iArr[0] = new C3959i(DiagnosticsEntry.Histogram.VALUES_KEY, store.getCurrentValuesAsString());
            store2 = this.this$0.store;
            if (store2 != null) {
                c3959iArr[1] = new C3959i("evalReason", store2.getReason());
                statsigUser = this.this$0.user;
                if (statsigUser != null) {
                    c3959iArr[2] = new C3959i("user", statsigUser.getCopyForEvaluation$build_release());
                    c3959iArr[3] = new C3959i("options", this.this$0.getOptions$build_release().toMap$build_release());
                    Map<String, ? extends Object> a12 = AbstractC4268D.a1(c3959iArr);
                    DebugView.Companion companion = DebugView.Companion;
                    Context context = this.$context;
                    str = this.this$0.sdkKey;
                    if (str != null) {
                        companion.show(context, str, a12);
                        return;
                    } else {
                        AbstractC3557B.C2("sdkKey");
                        throw null;
                    }
                }
                AbstractC3557B.C2("user");
                throw null;
            }
            AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
            throw null;
        }
        AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
        throw null;
    }
}
