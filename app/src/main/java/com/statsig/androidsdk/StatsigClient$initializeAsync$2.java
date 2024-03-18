package com.statsig.androidsdk;

import com.statsig.androidsdk.InitializeResponse;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Ljf/y;", "<anonymous>", "(Ljava/lang/Exception;)V"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class StatsigClient$initializeAsync$2 extends o implements k {
    final /* synthetic */ IStatsigCallback $callback;
    final /* synthetic */ StatsigClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$initializeAsync$2(StatsigClient statsigClient, IStatsigCallback iStatsigCallback) {
        super(1);
        this.this$0 = statsigClient;
        this.$callback = iStatsigCallback;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Exception) obj);
        return y.f36177a;
    }

    public final void invoke(Exception exc) {
        long j6;
        this.this$0.logEndDiagnosticsWhenException(ContextType.INITIALIZE, exc);
        if (this.this$0.isInitialized()) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                j6 = this.this$0.initTime;
                InitializationDetails initializationDetails = new InitializationDetails(currentTimeMillis - j6, false, new InitializeResponse.FailedInitializeResponse(InitializeFailReason.InternalError, exc, null, 4, null));
                IStatsigCallback iStatsigCallback = this.$callback;
                if (iStatsigCallback == null) {
                    return;
                }
                iStatsigCallback.onStatsigInitialize(initializationDetails);
            } catch (Exception e10) {
                throw new ExternalException(e10.getMessage());
            }
        }
    }
}
