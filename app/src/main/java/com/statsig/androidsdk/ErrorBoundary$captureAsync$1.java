package com.statsig.androidsdk;

import kotlin.Metadata;
import nf.AbstractC4825e;
import pf.AbstractC5156c;
import pf.AbstractC5158e;
import r9.y;

@Metadata(k = 3, mv = {1, 5, 1}, xi = y.f44626f)
@AbstractC5158e(c = "com.statsig.androidsdk.ErrorBoundary", f = "ErrorBoundary.kt", l = {77}, m = "captureAsync")
/* loaded from: classes2.dex */
public final class ErrorBoundary$captureAsync$1<T> extends AbstractC5156c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ErrorBoundary this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorBoundary$captureAsync$1(ErrorBoundary errorBoundary, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.this$0 = errorBoundary;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.captureAsync(null, this);
    }
}
