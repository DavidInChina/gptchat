package i6;

import android.app.Activity;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import kf.w;

/* loaded from: classes.dex */
public final class c implements f {
    @Override // i6.f
    public final Map h() {
        return w.f37484Y;
    }

    @Override // i6.f
    public final void i(String str, String str2, Throwable th2) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC2469q0.q("source", 1);
    }

    @Override // i6.f
    public final void j(String str, Integer num, Long l10, int i10, LinkedHashMap linkedHashMap) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC2469q0.q("kind", i10);
    }

    @Override // i6.f
    public final void k(String str, Object obj, Map map) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, obj);
    }

    @Override // i6.f
    public final void m(String str, Object obj) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("value", obj);
    }

    @Override // i6.f
    public final void n(String str, Object obj) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
    }

    @Override // i6.f
    public final void o(Activity activity, Map map) {
        AbstractC3557B.c0("attributes", map);
    }

    @Override // i6.f
    public final void q(String str, int i10, Throwable th2, Map map) {
        AbstractC2469q0.q("source", i10);
    }

    @Override // i6.f
    public final void s(String str, int i10, String str2, Map map) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC2469q0.q("method", i10);
        AbstractC3557B.c0("url", str2);
        AbstractC3557B.c0("attributes", map);
    }

    @Override // i6.f
    public final void r(LinkedHashMap linkedHashMap) {
    }

    @Override // i6.f
    public final void p(d dVar, LinkedHashMap linkedHashMap) {
    }

    @Override // i6.f
    public final void l(d dVar, String str, Map map) {
    }
}
