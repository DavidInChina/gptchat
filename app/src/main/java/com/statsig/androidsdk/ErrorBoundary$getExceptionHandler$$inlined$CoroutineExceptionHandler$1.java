package com.statsig.androidsdk;

import Ng.C;
import Ng.D;
import kotlin.Metadata;
import nf.AbstractC4821a;
import nf.AbstractC4831k;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"com/statsig/androidsdk/ErrorBoundary$getExceptionHandler$$inlined$CoroutineExceptionHandler$1", "Lnf/a;", "LNg/D;", "Lnf/k;", "context", "", "exception", "Ljf/y;", "handleException", "(Lnf/k;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class ErrorBoundary$getExceptionHandler$$inlined$CoroutineExceptionHandler$1 extends AbstractC4821a implements D {
    final /* synthetic */ ErrorBoundary this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorBoundary$getExceptionHandler$$inlined$CoroutineExceptionHandler$1(C c10, ErrorBoundary errorBoundary) {
        super(c10);
        this.this$0 = errorBoundary;
    }

    @Override // Ng.D
    public void handleException(AbstractC4831k abstractC4831k, Throwable th2) {
        this.this$0.handleException(th2);
    }
}
