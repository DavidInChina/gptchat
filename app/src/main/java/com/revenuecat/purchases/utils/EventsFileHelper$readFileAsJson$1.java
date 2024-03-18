package com.revenuecat.purchases.utils;

import android.gov.nist.javax.sip.parser.TokenNames;
import id.AbstractC3557B;
import j$.util.stream.Stream;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import r9.y;
import wf.k;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n\u00a2\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/revenuecat/purchases/utils/Event;", TokenNames.T, "j$/util/stream/Stream", "", "stream", "Ljf/y;", "invoke", "(Lj$/util/stream/Stream;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class EventsFileHelper$readFileAsJson$1 extends o implements k {
    final /* synthetic */ k $streamBlock;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n\u00a2\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", TokenNames.T, "Lcom/revenuecat/purchases/utils/Event;", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFileAsJson$1$1 */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends o implements k {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final JSONObject invoke(String str) {
            return new JSONObject(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventsFileHelper$readFileAsJson$1(k kVar) {
        super(1);
        this.$streamBlock = kVar;
    }

    public static final JSONObject invoke$lambda$0(k kVar, Object obj) {
        AbstractC3557B.c0("$tmp0", kVar);
        return (JSONObject) kVar.invoke(obj);
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Stream) obj);
        return jf.y.f36177a;
    }

    public final void invoke(Stream<String> stream) {
        AbstractC3557B.c0("stream", stream);
        k kVar = this.$streamBlock;
        Object map = stream.map(new a(1, AnonymousClass1.INSTANCE));
        AbstractC3557B.b0("stream.map { JSONObject(it) }", map);
        kVar.invoke(map);
    }
}
