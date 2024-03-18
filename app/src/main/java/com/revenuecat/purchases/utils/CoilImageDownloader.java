package com.revenuecat.purchases.utils;

import Ad.l;
import android.content.Context;
import android.net.Uri;
import f4.k;
import f4.q;
import id.AbstractC3557B;
import kotlin.Metadata;
import q4.h;
import q4.j;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/utils/CoilImageDownloader;", "", "Landroid/net/Uri;", "uri", "Ljf/y;", "downloadImage", "(Landroid/net/Uri;)V", "Landroid/content/Context;", "applicationContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CoilImageDownloader {
    private final Context applicationContext;

    public CoilImageDownloader(Context context) {
        AbstractC3557B.c0("applicationContext", context);
        this.applicationContext = context;
    }

    public final void downloadImage(Uri uri) {
        AbstractC3557B.c0("uri", uri);
        h hVar = new h(this.applicationContext);
        hVar.f43805c = uri;
        j a5 = hVar.a();
        q qVar = (q) CoilImageDownloaderKt.access$getRevenueCatUIImageLoader(this.applicationContext);
        qVar.getClass();
        l.L(qVar.f29637f, null, new k(qVar, a5, null), 3);
    }
}
