package com.revenuecat.purchases.common.diagnostics;

import com.revenuecat.purchases.common.Anonymizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsAnonymizer;", "", "anonymizer", "Lcom/revenuecat/purchases/common/Anonymizer;", "(Lcom/revenuecat/purchases/common/Anonymizer;)V", "anonymizeCounter", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;", "diagnosticsCounter", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry$Counter;", "anonymizeEntryIfNeeded", "diagnosticsEntry", "anonymizeEvent", "diagnosticsEvent", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry$Event;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class DiagnosticsAnonymizer {
    private final Anonymizer anonymizer;

    public DiagnosticsAnonymizer(Anonymizer anonymizer) {
        AbstractC3557B.c0("anonymizer", anonymizer);
        this.anonymizer = anonymizer;
    }

    private final DiagnosticsEntry anonymizeCounter(DiagnosticsEntry.Counter counter) {
        return DiagnosticsEntry.Counter.copy$default(counter, null, this.anonymizer.anonymizedStringMap(counter.getTags()), 0, 5, null);
    }

    private final DiagnosticsEntry anonymizeEvent(DiagnosticsEntry.Event event) {
        return DiagnosticsEntry.Event.copy$default(event, null, this.anonymizer.anonymizedMap(event.getProperties()), null, null, 13, null);
    }

    public final DiagnosticsEntry anonymizeEntryIfNeeded(DiagnosticsEntry diagnosticsEntry) {
        AbstractC3557B.c0("diagnosticsEntry", diagnosticsEntry);
        if (diagnosticsEntry instanceof DiagnosticsEntry.Event) {
            return anonymizeEvent((DiagnosticsEntry.Event) diagnosticsEntry);
        }
        if (diagnosticsEntry instanceof DiagnosticsEntry.Counter) {
            return anonymizeCounter((DiagnosticsEntry.Counter) diagnosticsEntry);
        }
        if (diagnosticsEntry instanceof DiagnosticsEntry.Histogram) {
            return diagnosticsEntry;
        }
        throw new RuntimeException();
    }
}
