package com.revenuecat.purchases.amazon.attribution;

import android.app.Application;
import android.content.ContentResolver;
import android.provider.Settings;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import id.AbstractC3557B;
import jf.C3959i;
import kf.AbstractC4268D;
import kotlin.Metadata;
import wf.k;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ7\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004H\u0016\u00a2\u0006\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/amazon/attribution/AmazonDeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "Landroid/app/Application;", "applicationContext", "Lkotlin/Function1;", "", "", "Ljf/y;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;Lwf/k;)V", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AmazonDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    @Override // com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher
    public void getDeviceIdentifiers(Application application, k kVar) {
        String str;
        ContentResolver contentResolver;
        AbstractC3557B.c0("applicationContext", application);
        AbstractC3557B.c0("completion", kVar);
        try {
            contentResolver = application.getContentResolver();
        } catch (Settings.SettingNotFoundException e10) {
            AbstractC2469q0.t(new Object[]{e10.getLocalizedMessage()}, 1, AttributionStrings.AMAZON_COULD_NOT_GET_ADID, LogIntent.AMAZON_ERROR);
        }
        if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0) {
            str = Settings.Secure.getString(contentResolver, "advertising_id");
            kVar.invoke(MapExtensionsKt.filterNotNullValues(AbstractC4268D.a1(new C3959i(SubscriberAttributeKey.DeviceIdentifiers.AmazonAdID.INSTANCE.getBackendKey(), str), new C3959i(SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), "true"))));
        }
        str = null;
        kVar.invoke(MapExtensionsKt.filterNotNullValues(AbstractC4268D.a1(new C3959i(SubscriberAttributeKey.DeviceIdentifiers.AmazonAdID.INSTANCE.getBackendKey(), str), new C3959i(SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), "true"))));
    }
}
