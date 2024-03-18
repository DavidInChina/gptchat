package com.revenuecat.purchases.common.diagnostics;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogUtilsKt;
import id.AbstractC3557B;
import java.io.IOException;
import java.util.List;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wf.AbstractC6216a;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1 extends o implements AbstractC6216a {
    final /* synthetic */ DiagnosticsSynchronizer this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "Ljf/y;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends o implements k {
        final /* synthetic */ int $diagnosticsCount;
        final /* synthetic */ DiagnosticsSynchronizer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DiagnosticsSynchronizer diagnosticsSynchronizer, int i10) {
            super(1);
            this.this$0 = diagnosticsSynchronizer;
            this.$diagnosticsCount = i10;
        }

        @Override // wf.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return y.f36177a;
        }

        public final void invoke(JSONObject jSONObject) {
            DiagnosticsFileHelper diagnosticsFileHelper;
            AbstractC3557B.c0("it", jSONObject);
            LogUtilsKt.verboseLog("Synced diagnostics file successfully.");
            this.this$0.clearConsecutiveNumberOfErrors();
            diagnosticsFileHelper = this.this$0.diagnosticsFileHelper;
            diagnosticsFileHelper.clear(this.$diagnosticsCount);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "shouldRetry", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends o implements n {
        final /* synthetic */ DiagnosticsSynchronizer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DiagnosticsSynchronizer diagnosticsSynchronizer) {
            super(2);
            this.this$0 = diagnosticsSynchronizer;
        }

        @Override // wf.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
            return y.f36177a;
        }

        public final void invoke(PurchasesError purchasesError, boolean z10) {
            int increaseConsecutiveNumberOfErrors;
            AbstractC3557B.c0("error", purchasesError);
            if (z10) {
                LogUtilsKt.verboseLog("Error syncing diagnostics file: " + purchasesError + ". Will retry the next time the SDK is initialized");
                increaseConsecutiveNumberOfErrors = this.this$0.increaseConsecutiveNumberOfErrors();
                if (increaseConsecutiveNumberOfErrors < 3) {
                    return;
                }
                LogUtilsKt.verboseLog("Error syncing diagnostics file: " + purchasesError + ". This was the final attempt (3). Deleting diagnostics file without posting.");
                this.this$0.resetDiagnosticsStatus();
                return;
            }
            LogUtilsKt.verboseLog("Error syncing diagnostics file: " + purchasesError + ". Deleting diagnostics file without retrying.");
            this.this$0.resetDiagnosticsStatus();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1(DiagnosticsSynchronizer diagnosticsSynchronizer) {
        super(0);
        this.this$0 = diagnosticsSynchronizer;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        List<? extends JSONObject> eventsToSync;
        Backend backend;
        try {
            eventsToSync = this.this$0.getEventsToSync();
            int size = eventsToSync.size();
            if (size != 0) {
                backend = this.this$0.backend;
                backend.postDiagnostics(eventsToSync, new AnonymousClass1(this.this$0, size), new AnonymousClass2(this.this$0));
                return;
            }
            LogUtilsKt.verboseLog("No diagnostics to sync.");
        } catch (Exception e10) {
            LogUtilsKt.verboseLog("Error syncing diagnostics file: " + e10);
            try {
                this.this$0.resetDiagnosticsStatus();
            } catch (IOException e11) {
                LogUtilsKt.verboseLog("Error deleting diagnostics file: " + e11);
            }
        }
    }
}
