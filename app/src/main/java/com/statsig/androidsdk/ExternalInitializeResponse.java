package com.statsig.androidsdk;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010\b\u001a\u0004\u0018\u00010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/statsig/androidsdk/ExternalInitializeResponse;", "", DiagnosticsEntry.Histogram.VALUES_KEY, "", "evaluationDetails", "Lcom/statsig/androidsdk/EvaluationDetails;", "(Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;)V", "getEvaluationDetails", "getInitializeResponseJSON", "Companion", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class ExternalInitializeResponse {
    public static final Companion Companion = new Companion(null);
    private final EvaluationDetails evaluationDetails;
    private final String values;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/statsig/androidsdk/ExternalInitializeResponse$Companion;", "", "()V", "getUninitialized", "Lcom/statsig/androidsdk/ExternalInitializeResponse;", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ExternalInitializeResponse getUninitialized() {
            return new ExternalInitializeResponse(null, new EvaluationDetails(EvaluationReason.Uninitialized, 0L, 2, null));
        }
    }

    public ExternalInitializeResponse(String str, EvaluationDetails evaluationDetails) {
        AbstractC3557B.c0("evaluationDetails", evaluationDetails);
        this.values = str;
        this.evaluationDetails = evaluationDetails;
    }

    public final EvaluationDetails getEvaluationDetails() {
        return EvaluationDetails.copy$default(this.evaluationDetails, null, 0L, 3, null);
    }

    public final String getInitializeResponseJSON() {
        return this.values;
    }
}
