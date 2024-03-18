package com.revenuecat.purchases.utils;

import android.net.Uri;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.paywalls.PaywallData;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "", "Lcom/revenuecat/purchases/Offering;", "offering", "Ljf/y;", "preDownloadOfferingImages", "(Lcom/revenuecat/purchases/Offering;)V", "", "shouldPredownloadImages", "Z", "Lcom/revenuecat/purchases/utils/CoilImageDownloader;", "coilImageDownloader", "Lcom/revenuecat/purchases/utils/CoilImageDownloader;", "<init>", "(ZLcom/revenuecat/purchases/utils/CoilImageDownloader;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class OfferingImagePreDownloader {
    private final CoilImageDownloader coilImageDownloader;
    private final boolean shouldPredownloadImages;

    public OfferingImagePreDownloader(boolean z10, CoilImageDownloader coilImageDownloader) {
        AbstractC3557B.c0("coilImageDownloader", coilImageDownloader);
        this.shouldPredownloadImages = z10;
        this.coilImageDownloader = coilImageDownloader;
    }

    public final void preDownloadOfferingImages(Offering offering) {
        AbstractC3557B.c0("offering", offering);
        if (!this.shouldPredownloadImages) {
            LogUtilsKt.verboseLog("OfferingImagePreDownloader won't pre-download images");
            return;
        }
        LogUtilsKt.debugLog("OfferingImagePreDownloader: starting image download");
        PaywallData paywall = offering.getPaywall();
        if (paywall != null) {
            List<String> all$purchases_customEntitlementComputationRelease = paywall.getConfig().getImages().getAll$purchases_customEntitlementComputationRelease();
            ArrayList<Uri> arrayList = new ArrayList(AbstractC6583a.H1(all$purchases_customEntitlementComputationRelease, 10));
            for (String str : all$purchases_customEntitlementComputationRelease) {
                arrayList.add(Uri.parse(paywall.getAssetBaseURL().toString()).buildUpon().path(str).build());
            }
            for (Uri uri : arrayList) {
                LogUtilsKt.debugLog("Pre-downloading paywall image: " + uri);
                CoilImageDownloader coilImageDownloader = this.coilImageDownloader;
                AbstractC3557B.b0("it", uri);
                coilImageDownloader.downloadImage(uri);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OfferingImagePreDownloader(boolean z10, CoilImageDownloader coilImageDownloader, int i10, g gVar) {
        this(z10, coilImageDownloader);
        if ((i10 & 1) != 0) {
            try {
                Class.forName("com.revenuecat.purchases.ui.revenuecatui.PaywallKt");
                z10 = true;
            } catch (ClassNotFoundException unused) {
                z10 = false;
            }
        }
    }
}
