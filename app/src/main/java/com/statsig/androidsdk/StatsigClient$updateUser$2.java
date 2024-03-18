package com.statsig.androidsdk;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.k;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigClient$updateUser$2", f = "StatsigClient.kt", l = {413}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class StatsigClient$updateUser$2 extends AbstractC5163j implements k {
    final /* synthetic */ StatsigUser $user;
    int label;
    final /* synthetic */ StatsigClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$updateUser$2(StatsigClient statsigClient, StatsigUser statsigUser, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.this$0 = statsigClient;
        this.$user = statsigUser;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new StatsigClient$updateUser$2(this.this$0, this.$user, abstractC4825e);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object updateUserImpl;
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
            this.this$0.updateUserCache(this.$user);
            StatsigClient statsigClient = this.this$0;
            this.label = 1;
            updateUserImpl = statsigClient.updateUserImpl(this);
            if (updateUserImpl == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }

    public final Object invoke(AbstractC4825e abstractC4825e) {
        return ((StatsigClient$updateUser$2) create(abstractC4825e)).invokeSuspend(y.f36177a);
    }
}
