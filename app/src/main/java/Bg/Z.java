package Bg;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Z extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f2099c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f2100d;

    public Z(Map map, boolean z10) {
        this.f2099c = map;
        this.f2100d = z10;
    }

    @Override // Bg.h0
    public final boolean a() {
        return this.f2100d;
    }

    @Override // Bg.h0
    public final boolean e() {
        return this.f2099c.isEmpty();
    }

    @Override // Bg.a0
    public final d0 g(Y y10) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, y10);
        return (d0) this.f2099c.get(y10);
    }
}
