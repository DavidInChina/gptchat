package com.statsig.androidsdk;

import J8.b;
import com.statsig.androidsdk.InitializeResponse;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/statsig/androidsdk/InitializationDetails;", "", "duration", "", "success", "", "failureDetails", "Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "(JZLcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;)V", "getDuration", "()J", "setDuration", "(J)V", "getFailureDetails", "()Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "setFailureDetails", "(Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class InitializationDetails {
    @b("duration")
    private long duration;
    @b("failureDetails")
    private InitializeResponse.FailedInitializeResponse failureDetails;
    @b("success")
    private boolean success;

    public InitializationDetails(long j6, boolean z10, InitializeResponse.FailedInitializeResponse failedInitializeResponse) {
        this.duration = j6;
        this.success = z10;
        this.failureDetails = failedInitializeResponse;
    }

    public static /* synthetic */ InitializationDetails copy$default(InitializationDetails initializationDetails, long j6, boolean z10, InitializeResponse.FailedInitializeResponse failedInitializeResponse, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j6 = initializationDetails.duration;
        }
        if ((i10 & 2) != 0) {
            z10 = initializationDetails.success;
        }
        if ((i10 & 4) != 0) {
            failedInitializeResponse = initializationDetails.failureDetails;
        }
        return initializationDetails.copy(j6, z10, failedInitializeResponse);
    }

    public final long component1() {
        return this.duration;
    }

    public final boolean component2() {
        return this.success;
    }

    public final InitializeResponse.FailedInitializeResponse component3() {
        return this.failureDetails;
    }

    public final InitializationDetails copy(long j6, boolean z10, InitializeResponse.FailedInitializeResponse failedInitializeResponse) {
        return new InitializationDetails(j6, z10, failedInitializeResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationDetails)) {
            return false;
        }
        InitializationDetails initializationDetails = (InitializationDetails) obj;
        return this.duration == initializationDetails.duration && this.success == initializationDetails.success && AbstractC3557B.K(this.failureDetails, initializationDetails.failureDetails);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final InitializeResponse.FailedInitializeResponse getFailureDetails() {
        return this.failureDetails;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        long j6 = this.duration;
        int i10 = ((int) (j6 ^ (j6 >>> 32))) * 31;
        boolean z10 = this.success;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = (i10 + i11) * 31;
        InitializeResponse.FailedInitializeResponse failedInitializeResponse = this.failureDetails;
        return i13 + (failedInitializeResponse == null ? 0 : failedInitializeResponse.hashCode());
    }

    public final void setDuration(long j6) {
        this.duration = j6;
    }

    public final void setFailureDetails(InitializeResponse.FailedInitializeResponse failedInitializeResponse) {
        this.failureDetails = failedInitializeResponse;
    }

    public final void setSuccess(boolean z10) {
        this.success = z10;
    }

    public String toString() {
        return "InitializationDetails(duration=" + this.duration + ", success=" + this.success + ", failureDetails=" + this.failureDetails + ')';
    }

    public /* synthetic */ InitializationDetails(long j6, boolean z10, InitializeResponse.FailedInitializeResponse failedInitializeResponse, int i10, g gVar) {
        this(j6, z10, (i10 & 4) != 0 ? null : failedInitializeResponse);
    }
}
