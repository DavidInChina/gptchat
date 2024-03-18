package com.revenuecat.purchases.google.attribution;

import Q1.n;
import android.annotation.SuppressLint;
import android.app.Application;
import android.provider.Settings;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import id.AbstractC3557B;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import jf.C3959i;
import kf.AbstractC4268D;
import kotlin.Metadata;
import o7.C4947a;
import t7.g;
import wf.k;
import x3.z;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\b\u0010\u0007J7\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "Landroid/app/Application;", "applicationContext", "", "kotlin.jvm.PlatformType", "getAndroidID", "(Landroid/app/Application;)Ljava/lang/String;", "getAdvertisingID", "Lkotlin/Function1;", "", "Ljf/y;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;Lwf/k;)V", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "Lcom/revenuecat/purchases/common/Dispatcher;", "noPermissionAdvertisingIdValue", "Ljava/lang/String;", "<init>", "(Lcom/revenuecat/purchases/common/Dispatcher;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class GoogleDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    private final Dispatcher dispatcher;
    private final String noPermissionAdvertisingIdValue = "00000000-0000-0000-0000-000000000000";

    public GoogleDeviceIdentifiersFetcher(Dispatcher dispatcher) {
        AbstractC3557B.c0("dispatcher", dispatcher);
        this.dispatcher = dispatcher;
    }

    private final String getAdvertisingID(Application application) {
        try {
            z a5 = C4947a.a(application);
            String str = a5.f48762b;
            if (!a5.f48763c) {
                if (AbstractC3557B.K(str, this.noPermissionAdvertisingIdValue)) {
                    LogWrapperKt.log(LogIntent.WARNING, AttributionStrings.GOOGLE_PLAY_ADVERTISING_ID_NOT_AVAILABLE);
                } else {
                    return str;
                }
            }
        } catch (IOException e10) {
            AbstractC2469q0.t(new Object[]{e10.getLocalizedMessage()}, 1, AttributionStrings.IO_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, LogIntent.GOOGLE_ERROR);
        } catch (NullPointerException e11) {
            AbstractC2469q0.t(new Object[]{e11.getLocalizedMessage()}, 1, AttributionStrings.NULL_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, LogIntent.GOOGLE_ERROR);
        } catch (TimeoutException e12) {
            AbstractC2469q0.t(new Object[]{e12.getLocalizedMessage()}, 1, AttributionStrings.TIMEOUT_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, LogIntent.GOOGLE_ERROR);
        } catch (g e13) {
            AbstractC2469q0.t(new Object[]{e13.getLocalizedMessage()}, 1, AttributionStrings.GOOGLE_PLAY_SERVICES_NOT_INSTALLED_FETCHING_ADVERTISING_IDENTIFIER, LogIntent.GOOGLE_ERROR);
        }
        return null;
    }

    @SuppressLint({"HardwareIds"})
    private final String getAndroidID(Application application) {
        return Settings.Secure.getString(application.getContentResolver(), "android_id");
    }

    public static final void getDeviceIdentifiers$lambda$0(GoogleDeviceIdentifiersFetcher googleDeviceIdentifiersFetcher, Application application, k kVar) {
        AbstractC3557B.c0("this$0", googleDeviceIdentifiersFetcher);
        AbstractC3557B.c0("$applicationContext", application);
        AbstractC3557B.c0("$completion", kVar);
        kVar.invoke(MapExtensionsKt.filterNotNullValues(AbstractC4268D.a1(new C3959i(SubscriberAttributeKey.DeviceIdentifiers.GPSAdID.INSTANCE.getBackendKey(), googleDeviceIdentifiersFetcher.getAdvertisingID(application)), new C3959i(SubscriberAttributeKey.DeviceIdentifiers.AndroidID.INSTANCE.getBackendKey(), googleDeviceIdentifiersFetcher.getAndroidID(application)), new C3959i(SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), "true"))));
    }

    @Override // com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher
    public void getDeviceIdentifiers(Application application, k kVar) {
        AbstractC3557B.c0("applicationContext", application);
        AbstractC3557B.c0("completion", kVar);
        Dispatcher.enqueue$default(this.dispatcher, new n(this, application, kVar, 17), null, 2, null);
    }
}
