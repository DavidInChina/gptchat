package com.revenuecat.purchases.common.diagnostics;

import id.AbstractC3557B;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wf.k;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"j$/util/stream/Stream", "Lorg/json/JSONObject;", "stream", "Ljf/y;", "invoke", "(Lj$/util/stream/Stream;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DiagnosticsSynchronizer$getEventsToSync$1 extends o implements k {
    final /* synthetic */ B $eventsToSync;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsSynchronizer$getEventsToSync$1(B b10) {
        super(1);
        this.$eventsToSync = b10;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Stream) obj);
        return y.f36177a;
    }

    public final void invoke(Stream<JSONObject> stream) {
        AbstractC3557B.c0("stream", stream);
        B b10 = this.$eventsToSync;
        Object collect = stream.limit(200L).collect(Collectors.toList());
        AbstractC3557B.b0("stream.limit(MAX_EVENTS_\u2026lect(Collectors.toList())", collect);
        b10.f37622Y = collect;
    }
}
