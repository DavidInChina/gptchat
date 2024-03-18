package com.statsig.androidsdk;

import Ng.F;
import android.content.SharedPreferences;
import com.google.android.gms.internal.play_billing.N;
import java.util.ArrayList;
import java.util.List;
import jf.y;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.n;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNg/F;", "", "Lcom/statsig/androidsdk/StatsigOfflineRequest;", "<anonymous>", "(LNg/F;)Ljava/util/List;"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigNetworkImpl$getSavedLogs$2", f = "StatsigNetwork.kt", l = {305, 306}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class StatsigNetworkImpl$getSavedLogs$2 extends AbstractC5163j implements n {
    int label;
    final /* synthetic */ StatsigNetworkImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigNetworkImpl$getSavedLogs$2(StatsigNetworkImpl statsigNetworkImpl, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.this$0 = statsigNetworkImpl;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new StatsigNetworkImpl$getSavedLogs$2(this.this$0, abstractC4825e);
    }

    public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
        return ((StatsigNetworkImpl$getSavedLogs$2) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[Catch: Exception -> 0x00ab, TryCatch #0 {Exception -> 0x00ab, blocks: (B:22:0x0057, B:25:0x0069, B:27:0x006f, B:29:0x0075, B:30:0x0086, B:32:0x008c, B:37:0x00a6), top: B:41:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: Exception -> 0x00ab, TryCatch #0 {Exception -> 0x00ab, blocks: (B:22:0x0057, B:25:0x0069, B:27:0x006f, B:29:0x0075, B:30:0x0086, B:32:0x008c, B:37:0x00a6), top: B:41:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: Exception -> 0x00ab, TryCatch #0 {Exception -> 0x00ab, blocks: (B:22:0x0057, B:25:0x0069, B:27:0x006f, B:29:0x0075, B:30:0x0086, B:32:0x008c, B:37:0x00a6), top: B:41:0x0057 }] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        I8.n nVar;
        StatsigPendingRequests statsigPendingRequests;
        List<StatsigOfflineRequest> list;
        long j6;
        boolean z10;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        String str2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        N.B0(obj);
                        str = (String) obj;
                        if (str == null) {
                            return new ArrayList();
                        }
                        nVar = this.this$0.gson;
                        statsigPendingRequests = (StatsigPendingRequests) nVar.e(StatsigPendingRequests.class, str);
                        if (statsigPendingRequests != null) {
                            list = null;
                        } else {
                            list = statsigPendingRequests.getRequests();
                        }
                        if (list != null) {
                            return new ArrayList();
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        List<StatsigOfflineRequest> requests = statsigPendingRequests.getRequests();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : requests) {
                            long timestamp = ((StatsigOfflineRequest) obj2).getTimestamp();
                            j6 = StatsigNetworkKt.MAX_LOG_PERIOD;
                            if (timestamp > currentTimeMillis - j6) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
            } else {
                N.B0(obj);
                StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
                sharedPreferences2 = this.this$0.sharedPrefs;
                str2 = this.this$0.offlineLogsKeyV2;
                this.label = 1;
                obj = statsigUtil.getFromSharedPrefs$build_release(sharedPreferences2, str2, this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            }
            nVar = this.this$0.gson;
            statsigPendingRequests = (StatsigPendingRequests) nVar.e(StatsigPendingRequests.class, str);
            if (statsigPendingRequests != null) {
            }
            if (list != null) {
            }
        } catch (Exception unused) {
            return new ArrayList();
        }
        str = (String) obj;
        if (str == null) {
            StatsigUtil statsigUtil2 = StatsigUtil.INSTANCE;
            sharedPreferences = this.this$0.sharedPrefs;
            this.label = 2;
            obj = statsigUtil2.getFromSharedPrefs$build_release(sharedPreferences, "StatsigNetwork.OFFLINE_LOGS", this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
            str = (String) obj;
            if (str == null) {
            }
        }
    }
}
