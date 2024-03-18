package com.revenuecat.purchases.common.diagnostics;

import H0.RunnableC0712x;
import R4.b;
import android.content.Context;
import android.content.SharedPreferences;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Dispatcher;
import id.AbstractC3557B;
import java.util.List;
import jf.AbstractC3957g;
import kf.v;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import r9.y;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'B?\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u00a2\u0006\u0004\b%\u0010&J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0012\u0010\fR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"\u00a8\u0006("}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;", "", "", "Lorg/json/JSONObject;", "getEventsToSync", "()Ljava/util/List;", "Lkotlin/Function0;", "Ljf/y;", "command", "enqueue", "(Lwf/a;)V", "clearConsecutiveNumberOfErrors", "()V", "", "increaseConsecutiveNumberOfErrors", "()I", "resetDiagnosticsStatus", "clearDiagnosticsFileIfTooBig", "syncDiagnosticsFileIfNeeded", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "diagnosticsFileHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTracker", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/Dispatcher;", "diagnosticsDispatcher", "Lcom/revenuecat/purchases/common/Dispatcher;", "Ljf/g;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Ljf/g;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/Dispatcher;Ljf/g;)V", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DiagnosticsSynchronizer {
    public static final String CONSECUTIVE_FAILURES_COUNT_KEY = "consecutive_failures_count";
    public static final Companion Companion = new Companion(null);
    public static final long MAX_EVENTS_TO_SYNC_PER_REQUEST = 200;
    public static final int MAX_NUMBER_POST_RETRIES = 3;
    private final Backend backend;
    private final Dispatcher diagnosticsDispatcher;
    private final DiagnosticsFileHelper diagnosticsFileHelper;
    private final DiagnosticsTracker diagnosticsTracker;
    private final AbstractC3957g sharedPreferences;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements AbstractC6216a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // wf.AbstractC6216a
        /* renamed from: invoke */
        public final SharedPreferences mo122invoke() {
            return DiagnosticsSynchronizer.Companion.initializeSharedPreferences(this.$context);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087T\u00a2\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u00a8\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer$Companion;", "", "()V", "CONSECUTIVE_FAILURES_COUNT_KEY", "", "getCONSECUTIVE_FAILURES_COUNT_KEY$annotations", "MAX_EVENTS_TO_SYNC_PER_REQUEST", "", "getMAX_EVENTS_TO_SYNC_PER_REQUEST$annotations", "MAX_NUMBER_POST_RETRIES", "", "getMAX_NUMBER_POST_RETRIES$annotations", "initializeSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ void getCONSECUTIVE_FAILURES_COUNT_KEY$annotations() {
        }

        public static /* synthetic */ void getMAX_EVENTS_TO_SYNC_PER_REQUEST$annotations() {
        }

        public static /* synthetic */ void getMAX_NUMBER_POST_RETRIES$annotations() {
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            AbstractC3557B.c0("context", context);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com_revenuecat_purchases_" + context.getPackageName() + "_preferences_diagnostics", 0);
            AbstractC3557B.b0("context.getSharedPrefere\u2026DE_PRIVATE,\n            )", sharedPreferences);
            return sharedPreferences;
        }
    }

    public DiagnosticsSynchronizer(Context context, DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsTracker diagnosticsTracker, Backend backend, Dispatcher dispatcher, AbstractC3957g abstractC3957g) {
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("diagnosticsFileHelper", diagnosticsFileHelper);
        AbstractC3557B.c0("diagnosticsTracker", diagnosticsTracker);
        AbstractC3557B.c0("backend", backend);
        AbstractC3557B.c0("diagnosticsDispatcher", dispatcher);
        AbstractC3557B.c0("sharedPreferences", abstractC3957g);
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.diagnosticsTracker = diagnosticsTracker;
        this.backend = backend;
        this.diagnosticsDispatcher = dispatcher;
        this.sharedPreferences = abstractC3957g;
    }

    public static /* synthetic */ void a(AbstractC6216a abstractC6216a) {
        enqueue$lambda$0(abstractC6216a);
    }

    public final void clearConsecutiveNumberOfErrors() {
        ((SharedPreferences) this.sharedPreferences.getValue()).edit().remove(CONSECUTIVE_FAILURES_COUNT_KEY).apply();
    }

    private final void enqueue(AbstractC6216a abstractC6216a) {
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new RunnableC0712x(abstractC6216a, 4), null, 2, null);
    }

    public static final void enqueue$lambda$0(AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("$tmp0", abstractC6216a);
        abstractC6216a.mo122invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final List<JSONObject> getEventsToSync() {
        ?? obj = new Object();
        obj.f37622Y = v.f37483Y;
        this.diagnosticsFileHelper.readFileAsJson(new DiagnosticsSynchronizer$getEventsToSync$1(obj));
        return (List) obj.f37622Y;
    }

    public final int increaseConsecutiveNumberOfErrors() {
        int i10 = ((SharedPreferences) this.sharedPreferences.getValue()).getInt(CONSECUTIVE_FAILURES_COUNT_KEY, 0) + 1;
        ((SharedPreferences) this.sharedPreferences.getValue()).edit().putInt(CONSECUTIVE_FAILURES_COUNT_KEY, i10).apply();
        return i10;
    }

    public final void resetDiagnosticsStatus() {
        clearConsecutiveNumberOfErrors();
        this.diagnosticsFileHelper.deleteFile();
    }

    public final void clearDiagnosticsFileIfTooBig() {
        enqueue(new DiagnosticsSynchronizer$clearDiagnosticsFileIfTooBig$1(this));
    }

    public final void syncDiagnosticsFileIfNeeded() {
        enqueue(new DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1(this));
    }

    public /* synthetic */ DiagnosticsSynchronizer(Context context, DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsTracker diagnosticsTracker, Backend backend, Dispatcher dispatcher, AbstractC3957g abstractC3957g, int i10, g gVar) {
        this(context, diagnosticsFileHelper, diagnosticsTracker, backend, dispatcher, (i10 & 32) != 0 ? b.D1(new AnonymousClass1(context)) : abstractC3957g);
    }
}
