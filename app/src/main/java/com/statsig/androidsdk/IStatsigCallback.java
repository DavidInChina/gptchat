package com.statsig.androidsdk;

import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@FunctionalInterface
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\b\u0010\u0004\u00a8\u0006\t"}, d2 = {"Lcom/statsig/androidsdk/IStatsigCallback;", "", "Ljf/y;", "onStatsigInitialize", "()V", "Lcom/statsig/androidsdk/InitializationDetails;", "initDetails", "(Lcom/statsig/androidsdk/InitializationDetails;)V", "onStatsigUpdateUser", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface IStatsigCallback {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onStatsigInitialize(IStatsigCallback iStatsigCallback) {
            AbstractC3557B.c0("this", iStatsigCallback);
        }

        public static void onStatsigInitialize(IStatsigCallback iStatsigCallback, InitializationDetails initializationDetails) {
            AbstractC3557B.c0("this", iStatsigCallback);
            AbstractC3557B.c0("initDetails", initializationDetails);
            iStatsigCallback.onStatsigInitialize();
        }
    }

    void onStatsigInitialize();

    void onStatsigInitialize(InitializationDetails initializationDetails);

    void onStatsigUpdateUser();
}
