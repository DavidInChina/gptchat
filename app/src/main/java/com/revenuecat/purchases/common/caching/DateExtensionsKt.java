package com.revenuecat.purchases.common.caching;

import Df.H;
import Mg.a;
import Mg.b;
import Mg.d;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.ReceiptStrings;
import id.AbstractC3557B;
import java.util.Date;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\t\u0010\n\"\u0017\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\b\r\u0010\f\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Ljava/util/Date;", "", "appInBackground", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "isCacheStale", "(Ljava/util/Date;ZLcom/revenuecat/purchases/common/DateProvider;)Z", "LMg/b;", "cacheDuration", "isCacheStale-8Mi8wO0", "(Ljava/util/Date;JLcom/revenuecat/purchases/common/DateProvider;)Z", "CACHE_REFRESH_PERIOD_IN_FOREGROUND", "J", "CACHE_REFRESH_PERIOD_IN_BACKGROUND", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DateExtensionsKt {
    private static final long CACHE_REFRESH_PERIOD_IN_FOREGROUND = H.x0(5, d.f12135j0);
    private static final long CACHE_REFRESH_PERIOD_IN_BACKGROUND = H.x0(25, d.f12136k0);

    static {
        a aVar = b.f12127Z;
    }

    public static final boolean isCacheStale(Date date, boolean z10, DateProvider dateProvider) {
        long j6;
        AbstractC3557B.c0("dateProvider", dateProvider);
        if (date == null) {
            return true;
        }
        AbstractC2469q0.t(new Object[]{Boolean.valueOf(z10)}, 1, ReceiptStrings.CHECKING_IF_CACHE_STALE, LogIntent.DEBUG);
        if (z10) {
            j6 = CACHE_REFRESH_PERIOD_IN_BACKGROUND;
        } else {
            j6 = CACHE_REFRESH_PERIOD_IN_FOREGROUND;
        }
        return m60isCacheStale8Mi8wO0(date, j6, dateProvider);
    }

    public static /* synthetic */ boolean isCacheStale$default(Date date, boolean z10, DateProvider dateProvider, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dateProvider = new DefaultDateProvider();
        }
        return isCacheStale(date, z10, dateProvider);
    }

    /* renamed from: isCacheStale-8Mi8wO0  reason: not valid java name */
    public static final boolean m60isCacheStale8Mi8wO0(Date date, long j6, DateProvider dateProvider) {
        AbstractC3557B.c0("dateProvider", dateProvider);
        if (date == null) {
            return true;
        }
        a aVar = b.f12127Z;
        if (b.c(H.y0(dateProvider.getNow().getTime() - date.getTime(), d.f12133h0), j6) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isCacheStale-8Mi8wO0$default  reason: not valid java name */
    public static /* synthetic */ boolean m61isCacheStale8Mi8wO0$default(Date date, long j6, DateProvider dateProvider, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dateProvider = new DefaultDateProvider();
        }
        return m60isCacheStale8Mi8wO0(date, j6, dateProvider);
    }
}
