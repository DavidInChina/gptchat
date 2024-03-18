package com.revenuecat.purchases.common.diagnostics;

import com.revenuecat.purchases.common.LogUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DiagnosticsSynchronizer$clearDiagnosticsFileIfTooBig$1 extends o implements AbstractC6216a {
    final /* synthetic */ DiagnosticsSynchronizer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsSynchronizer$clearDiagnosticsFileIfTooBig$1(DiagnosticsSynchronizer diagnosticsSynchronizer) {
        super(0);
        this.this$0 = diagnosticsSynchronizer;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        DiagnosticsFileHelper diagnosticsFileHelper;
        DiagnosticsTracker diagnosticsTracker;
        diagnosticsFileHelper = this.this$0.diagnosticsFileHelper;
        if (diagnosticsFileHelper.isDiagnosticsFileTooBig()) {
            LogUtilsKt.verboseLog("Diagnostics file is too big. Deleting it.");
            diagnosticsTracker = this.this$0.diagnosticsTracker;
            DiagnosticsTracker.trackMaxEventsStoredLimitReached$default(diagnosticsTracker, false, 1, null);
            this.this$0.resetDiagnosticsStatus();
        }
    }
}
