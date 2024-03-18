package Gg;

import Bg.I;
import Bg.Y;
import Bg.a0;
import Bg.d0;
import Bg.p0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import og.AbstractC5006b;

/* loaded from: classes2.dex */
public final class c extends a0 {
    @Override // Bg.a0
    public final d0 g(Y y10) {
        AbstractC5006b abstractC5006b;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, y10);
        if (y10 instanceof AbstractC5006b) {
            abstractC5006b = (AbstractC5006b) y10;
        } else {
            abstractC5006b = null;
        }
        if (abstractC5006b == null) {
            return null;
        }
        if (abstractC5006b.a().c()) {
            return new I(abstractC5006b.a().getType(), p0.f2148j0);
        }
        return abstractC5006b.a();
    }
}
