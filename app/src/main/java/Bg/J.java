package Bg;

import Mf.AbstractC1000i;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class J extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f2075c;

    public J(ArrayList arrayList) {
        this.f2075c = arrayList;
    }

    @Override // Bg.a0
    public final d0 g(Y y10) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, y10);
        if (this.f2075c.contains(y10)) {
            AbstractC1000i k10 = y10.k();
            AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor", k10);
            return m0.k((Mf.b0) k10);
        }
        return null;
    }
}
