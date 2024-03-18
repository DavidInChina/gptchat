package com.statsig.androidsdk;

import Ng.F;
import android.content.SharedPreferences;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import jf.y;
import kf.t;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "Ljf/y;", "<anonymous>", "(LNg/F;)V"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigNetworkImpl$addFailedLogRequest$2", f = "StatsigNetwork.kt", l = {289, 292, 298}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class StatsigNetworkImpl$addFailedLogRequest$2 extends AbstractC5163j implements n {
    final /* synthetic */ String $requestBody;
    int label;
    final /* synthetic */ StatsigNetworkImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigNetworkImpl$addFailedLogRequest$2(StatsigNetworkImpl statsigNetworkImpl, String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.this$0 = statsigNetworkImpl;
        this.$requestBody = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new StatsigNetworkImpl$addFailedLogRequest$2(this.this$0, this.$requestBody, abstractC4825e);
    }

    public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
        return ((StatsigNetworkImpl$addFailedLogRequest$2) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        SharedPreferences sharedPreferences;
        String str;
        SharedPreferences sharedPreferences2;
        String str2;
        I8.n nVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.label;
        try {
        } catch (Exception unused) {
            StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
            sharedPreferences = this.this$0.sharedPrefs;
            str = this.this$0.offlineLogsKeyV2;
            this.label = 3;
            if (statsigUtil.removeFromSharedPrefs$build_release(sharedPreferences, str, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        N.B0(obj);
                        return y.f36177a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                return y.f36177a;
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            StatsigNetworkImpl statsigNetworkImpl = this.this$0;
            this.label = 1;
            obj = statsigNetworkImpl.getSavedLogs(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        ArrayList x22 = t.x2(new StatsigOfflineRequest(System.currentTimeMillis(), this.$requestBody), (Collection) obj);
        StatsigUtil statsigUtil2 = StatsigUtil.INSTANCE;
        sharedPreferences2 = this.this$0.sharedPrefs;
        str2 = this.this$0.offlineLogsKeyV2;
        nVar = this.this$0.gson;
        String i11 = nVar.i(new StatsigPendingRequests(x22));
        AbstractC3557B.b0("gson.toJson(StatsigPendingRequests(savedLogs))", i11);
        this.label = 2;
        if (statsigUtil2.saveStringToSharedPrefs$build_release(sharedPreferences2, str2, i11, this) == enumC5000a) {
            return enumC5000a;
        }
        return y.f36177a;
    }
}
