package com.statsig.androidsdk;

import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/statsig/androidsdk/EvaluationDetails;", "", "reason", "Lcom/statsig/androidsdk/EvaluationReason;", "time", "", "(Lcom/statsig/androidsdk/EvaluationReason;J)V", "getReason", "()Lcom/statsig/androidsdk/EvaluationReason;", "setReason", "(Lcom/statsig/androidsdk/EvaluationReason;)V", "getTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class EvaluationDetails {
    private EvaluationReason reason;
    private final long time;

    public EvaluationDetails(EvaluationReason evaluationReason, long j6) {
        AbstractC3557B.c0("reason", evaluationReason);
        this.reason = evaluationReason;
        this.time = j6;
    }

    public static /* synthetic */ EvaluationDetails copy$default(EvaluationDetails evaluationDetails, EvaluationReason evaluationReason, long j6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            evaluationReason = evaluationDetails.reason;
        }
        if ((i10 & 2) != 0) {
            j6 = evaluationDetails.time;
        }
        return evaluationDetails.copy(evaluationReason, j6);
    }

    public final EvaluationReason component1() {
        return this.reason;
    }

    public final long component2() {
        return this.time;
    }

    public final EvaluationDetails copy(EvaluationReason evaluationReason, long j6) {
        AbstractC3557B.c0("reason", evaluationReason);
        return new EvaluationDetails(evaluationReason, j6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvaluationDetails)) {
            return false;
        }
        EvaluationDetails evaluationDetails = (EvaluationDetails) obj;
        return this.reason == evaluationDetails.reason && this.time == evaluationDetails.time;
    }

    public final EvaluationReason getReason() {
        return this.reason;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        long j6 = this.time;
        return (this.reason.hashCode() * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final void setReason(EvaluationReason evaluationReason) {
        AbstractC3557B.c0("<set-?>", evaluationReason);
        this.reason = evaluationReason;
    }

    public String toString() {
        return "EvaluationDetails(reason=" + this.reason + ", time=" + this.time + ')';
    }

    public /* synthetic */ EvaluationDetails(EvaluationReason evaluationReason, long j6, int i10, g gVar) {
        this(evaluationReason, (i10 & 2) != 0 ? System.currentTimeMillis() : j6);
    }
}
