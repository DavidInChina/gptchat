package com.revenuecat.purchases.google.usecase;

import K4.AbstractC0815c;
import com.revenuecat.purchases.models.StoreTransaction;
import id.AbstractC3557B;
import java.util.Map;
import jf.y;
import kf.AbstractC4268D;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LK4/c;", "Ljf/y;", "invoke", "(LK4/c;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class QueryPurchasesUseCase$executeAsync$1 extends o implements k {
    final /* synthetic */ QueryPurchasesUseCase this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "activeSubs", "Ljf/y;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase$executeAsync$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends o implements k {
        final /* synthetic */ QueryPurchasesUseCase this$0;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "unconsumedInApps", "Ljf/y;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* renamed from: com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase$executeAsync$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00031 extends o implements k {
            final /* synthetic */ Map<String, StoreTransaction> $activeSubs;
            final /* synthetic */ QueryPurchasesUseCase this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00031(QueryPurchasesUseCase queryPurchasesUseCase, Map<String, StoreTransaction> map) {
                super(1);
                this.this$0 = queryPurchasesUseCase;
                this.$activeSubs = map;
            }

            @Override // wf.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map) obj);
                return y.f36177a;
            }

            public final void invoke(Map<String, StoreTransaction> map) {
                AbstractC3557B.c0("unconsumedInApps", map);
                this.this$0.onOk2((Map<String, StoreTransaction>) AbstractC4268D.e1(this.$activeSubs, map));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(QueryPurchasesUseCase queryPurchasesUseCase) {
            super(1);
            this.this$0 = queryPurchasesUseCase;
        }

        @Override // wf.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map) obj);
            return y.f36177a;
        }

        public final void invoke(Map<String, StoreTransaction> map) {
            AbstractC3557B.c0("activeSubs", map);
            QueryPurchasesUseCase queryPurchasesUseCase = this.this$0;
            queryPurchasesUseCase.queryInApps(new C00031(queryPurchasesUseCase, map), this.this$0.getOnError());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchasesUseCase$executeAsync$1(QueryPurchasesUseCase queryPurchasesUseCase) {
        super(1);
        this.this$0 = queryPurchasesUseCase;
    }

    public final void invoke(AbstractC0815c abstractC0815c) {
        AbstractC3557B.c0("$this$invoke", abstractC0815c);
        QueryPurchasesUseCase queryPurchasesUseCase = this.this$0;
        queryPurchasesUseCase.querySubscriptions(new AnonymousClass1(queryPurchasesUseCase), this.this$0.getOnError());
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC0815c) obj);
        return y.f36177a;
    }
}
