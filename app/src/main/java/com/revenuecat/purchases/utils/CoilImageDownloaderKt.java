package com.revenuecat.purchases.utils;

import R4.b;
import android.content.Context;
import f4.h;
import f4.i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Landroid/content/Context;", "Lf4/i;", "getRevenueCatUIImageLoader", "(Landroid/content/Context;)Lf4/i;", "", "MAX_CACHE_SIZE_BYTES", "J", "", "PAYWALL_IMAGE_CACHE_FOLDER", "Ljava/lang/String;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CoilImageDownloaderKt {
    private static final long MAX_CACHE_SIZE_BYTES = 26214400;
    private static final String PAYWALL_IMAGE_CACHE_FOLDER = "revenuecatui_cache";

    public static final /* synthetic */ i access$getRevenueCatUIImageLoader(Context context) {
        return getRevenueCatUIImageLoader(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i getRevenueCatUIImageLoader(Context context) {
        h hVar = new h(context);
        hVar.f29604c = b.D1(new CoilImageDownloaderKt$getRevenueCatUIImageLoader$1(context));
        return hVar.a();
    }
}
