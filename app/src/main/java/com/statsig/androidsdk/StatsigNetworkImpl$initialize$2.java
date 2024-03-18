package com.statsig.androidsdk;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import java.util.Map;
import jf.y;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "Lcom/statsig/androidsdk/InitializeResponse;", "<anonymous>", "(LNg/F;)Lcom/statsig/androidsdk/InitializeResponse;"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigNetworkImpl$initialize$2", f = "StatsigNetwork.kt", l = {135}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StatsigNetworkImpl$initialize$2 extends AbstractC5163j implements n {
    final /* synthetic */ String $api;
    final /* synthetic */ ContextType $contextType;
    final /* synthetic */ Diagnostics $diagnostics;
    final /* synthetic */ HashAlgorithm $hashUsed;
    final /* synthetic */ long $initTimeoutMs;
    final /* synthetic */ StatsigMetadata $metadata;
    final /* synthetic */ Map<String, String> $previousDerivedFields;
    final /* synthetic */ Long $sinceTime;
    final /* synthetic */ StatsigUser $user;
    int label;
    final /* synthetic */ StatsigNetworkImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigNetworkImpl$initialize$2(StatsigNetworkImpl statsigNetworkImpl, String str, StatsigUser statsigUser, Long l10, StatsigMetadata statsigMetadata, ContextType contextType, Diagnostics diagnostics, long j6, HashAlgorithm hashAlgorithm, Map<String, String> map, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.this$0 = statsigNetworkImpl;
        this.$api = str;
        this.$user = statsigUser;
        this.$sinceTime = l10;
        this.$metadata = statsigMetadata;
        this.$contextType = contextType;
        this.$diagnostics = diagnostics;
        this.$initTimeoutMs = j6;
        this.$hashUsed = hashAlgorithm;
        this.$previousDerivedFields = map;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new StatsigNetworkImpl$initialize$2(this.this$0, this.$api, this.$user, this.$sinceTime, this.$metadata, this.$contextType, this.$diagnostics, this.$initTimeoutMs, this.$hashUsed, this.$previousDerivedFields, abstractC4825e);
    }

    public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
        return ((StatsigNetworkImpl$initialize$2) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
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
            StatsigNetworkImpl statsigNetworkImpl = this.this$0;
            String str = this.$api;
            StatsigUser statsigUser = this.$user;
            Long l10 = this.$sinceTime;
            StatsigMetadata statsigMetadata = this.$metadata;
            ContextType contextType = this.$contextType;
            Diagnostics diagnostics = this.$diagnostics;
            Integer num = new Integer((int) this.$initTimeoutMs);
            HashAlgorithm hashAlgorithm = this.$hashUsed;
            Map<String, String> map = this.$previousDerivedFields;
            this.label = 1;
            obj = statsigNetworkImpl.initializeImpl(str, statsigUser, l10, statsigMetadata, contextType, diagnostics, num, hashAlgorithm, map, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
