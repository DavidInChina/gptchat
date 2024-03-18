package com.openai.experiment;

import Qg.F0;
import Qg.s0;
import android.app.Application;
import com.statsig.androidsdk.IStatsigCallback;
import com.statsig.androidsdk.InitializationDetails;
import com.statsig.androidsdk.StatsigClient;
import com.statsig.androidsdk.StatsigOptions;
import com.statsig.androidsdk.StatsigUser;
import java.util.Map;
import jf.C3959i;
import ld.AbstractC4433f;
import u7.C5848d;
import vd.AbstractC6030e;
import vd.EnumC6026a;
import x8.W;

/* loaded from: classes2.dex */
public abstract class C implements IStatsigCallback {

    /* renamed from: f  reason: collision with root package name */
    public static final C5848d f27657f = new C5848d(28, 0);

    /* renamed from: g  reason: collision with root package name */
    public static final Map f27658g = P4.a.o0(new C3959i("client_type", "android"));

    /* renamed from: a  reason: collision with root package name */
    public final Ng.F f27659a;

    /* renamed from: b  reason: collision with root package name */
    public final F0 f27660b = s0.c(Boolean.FALSE);

    /* renamed from: c  reason: collision with root package name */
    public final Pc.g f27661c;

    /* renamed from: d  reason: collision with root package name */
    public final k9.c f27662d;

    /* renamed from: e  reason: collision with root package name */
    public final StatsigClient f27663e;

    public C(StatsigUser statsigUser, StatsigOptions statsigOptions, Application application, AbstractC4433f abstractC4433f) {
        this.f27659a = abstractC4433f;
        Pc.g i12 = Bi.c.i1(Pc.b.f13937o0);
        this.f27661c = i12;
        k9.c a5 = ((k9.d) AbstractC6030e.a()).a(EnumC6026a.f47472h0);
        this.f27662d = a5;
        StatsigClient statsigClient = new StatsigClient();
        W.F(i12, "Statsig initialization for " + statsigUser, null, 6);
        a5.b();
        statsigClient.initializeAsync(application, "client-zUdXdSTygXJdzoE0sWTkP8GKTVsUMF2IRM7ShVO2JAG", statsigUser, this, statsigOptions);
        this.f27663e = statsigClient;
    }

    @Override // com.statsig.androidsdk.IStatsigCallback
    public final void onStatsigInitialize(InitializationDetails initializationDetails) {
        IStatsigCallback.DefaultImpls.onStatsigInitialize(this, initializationDetails);
    }

    @Override // com.statsig.androidsdk.IStatsigCallback
    public final void onStatsigUpdateUser() {
    }

    @Override // com.statsig.androidsdk.IStatsigCallback
    public final void onStatsigInitialize() {
        W.F(this.f27661c, "Statsig initialized", null, 6);
        this.f27660b.setValue(Boolean.TRUE);
        this.f27662d.a();
    }
}
