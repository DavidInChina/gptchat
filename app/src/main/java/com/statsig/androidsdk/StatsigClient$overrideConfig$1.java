package com.statsig.androidsdk;

import Ad.l;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import id.AbstractC3557B;
import java.util.Map;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.AbstractC6216a;
import wf.n;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class StatsigClient$overrideConfig$1 extends o implements AbstractC6216a {
    final /* synthetic */ String $configName;
    final /* synthetic */ Map<String, Object> $value;
    final /* synthetic */ StatsigClient this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "Ljf/y;", "<anonymous>", "(LNg/F;)V"}, k = 3, mv = {1, 5, 1})
    @AbstractC5158e(c = "com.statsig.androidsdk.StatsigClient$overrideConfig$1$1", f = "StatsigClient.kt", l = {472}, m = "invokeSuspend")
    /* renamed from: com.statsig.androidsdk.StatsigClient$overrideConfig$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends AbstractC5163j implements n {
        int label;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StatsigClient statsigClient, AbstractC4825e abstractC4825e) {
            super(2, abstractC4825e);
            this.this$0 = statsigClient;
        }

        @Override // pf.AbstractC5154a
        public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
            return new AnonymousClass1(this.this$0, abstractC4825e);
        }

        public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
            return ((AnonymousClass1) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
        }

        @Override // pf.AbstractC5154a
        public final Object invokeSuspend(Object obj) {
            Store store;
            EnumC5000a enumC5000a = EnumC5000a.f41328Y;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N.B0(obj);
                store = this.this$0.store;
                if (store != null) {
                    this.label = 1;
                    if (store.saveOverridesToLocalStorage(this) == enumC5000a) {
                        return enumC5000a;
                    }
                } else {
                    AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
                    throw null;
                }
            }
            return y.f36177a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$overrideConfig$1(StatsigClient statsigClient, String str, Map<String, ? extends Object> map) {
        super(0);
        this.this$0 = statsigClient;
        this.$configName = str;
        this.$value = map;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        Store store;
        F f6;
        store = this.this$0.store;
        if (store != null) {
            store.overrideConfig(this.$configName, this.$value);
            f6 = this.this$0.statsigScope;
            if (f6 != null) {
                l.O0(f6, null, null, new AnonymousClass1(this.this$0, null), 3);
                return;
            } else {
                AbstractC3557B.C2("statsigScope");
                throw null;
            }
        }
        AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
        throw null;
    }
}
