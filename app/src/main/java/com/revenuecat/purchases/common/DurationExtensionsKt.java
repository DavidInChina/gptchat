package com.revenuecat.purchases.common;

import Df.H;
import Mg.d;
import id.AbstractC3557B;
import java.util.Date;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"LMg/a;", "Ljava/util/Date;", "startTime", "endTime", "LMg/b;", "between", "(LMg/a;Ljava/util/Date;Ljava/util/Date;)J", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DurationExtensionsKt {
    public static final long between(Mg.a aVar, Date date, Date date2) {
        AbstractC3557B.c0("<this>", aVar);
        AbstractC3557B.c0("startTime", date);
        AbstractC3557B.c0("endTime", date2);
        return H.y0(date2.getTime() - date.getTime(), d.f12133h0);
    }
}
