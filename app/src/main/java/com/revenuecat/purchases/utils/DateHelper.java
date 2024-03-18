package com.revenuecat.purchases.utils;

import Df.H;
import Mg.b;
import Mg.d;
import id.AbstractC3557B;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/utils/DateHelper;", "", "()V", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class DateHelper {
    public static final Companion Companion = new Companion(null);
    private static final long ENTITLEMENT_GRACE_PERIOD = H.x0(3, d.f12137l0);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ/\u0010\n\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\u00a8\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/utils/DateHelper$Companion;", "", "Ljava/util/Date;", "expirationDate", "requestDate", "LMg/b;", "gracePeriod", "Lcom/revenuecat/purchases/utils/DateActive;", "isDateActive-SxA4cEA", "(Ljava/util/Date;Ljava/util/Date;J)Lcom/revenuecat/purchases/utils/DateActive;", "isDateActive", "ENTITLEMENT_GRACE_PERIOD", "J", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* renamed from: isDateActive-SxA4cEA$default */
        public static /* synthetic */ DateActive m66isDateActiveSxA4cEA$default(Companion companion, Date date, Date date2, long j6, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                j6 = DateHelper.ENTITLEMENT_GRACE_PERIOD;
            }
            return companion.m67isDateActiveSxA4cEA(date, date2, j6);
        }

        /* renamed from: isDateActive-SxA4cEA */
        public final DateActive m67isDateActiveSxA4cEA(Date date, Date date2, long j6) {
            AbstractC3557B.c0("requestDate", date2);
            boolean z10 = true;
            if (date == null) {
                return new DateActive(true, true);
            }
            if (new Date().getTime() - date2.getTime() > b.e(j6)) {
                z10 = false;
            }
            if (!z10) {
                date2 = new Date();
            }
            return new DateActive(date.after(date2), z10);
        }
    }

    static {
        Mg.a aVar = b.f12127Z;
    }

    private DateHelper() {
    }
}
