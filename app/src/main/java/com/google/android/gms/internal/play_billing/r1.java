package com.google.android.gms.internal.play_billing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivity;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public abstract class r1 extends F7.c {
    @Override // F7.c
    public final boolean k(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) s1.a(parcel, Bundle.CREATOR);
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            K4.E e10 = (K4.E) this;
            ResultReceiver resultReceiver = e10.f9347c;
            if (resultReceiver == null) {
                AbstractC2468q.e("BillingClient", "Unable to send result for in-app messaging");
            } else if (bundle == null) {
                resultReceiver.send(0, null);
            } else {
                Activity activity = (Activity) e10.f9346b.get();
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
                if (activity != null && pendingIntent != null) {
                    try {
                        Intent intent = new Intent(activity, ProxyBillingActivity.class);
                        intent.putExtra("in_app_message_result_receiver", resultReceiver);
                        intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
                        activity.startActivity(intent);
                    } catch (CancellationException e11) {
                        resultReceiver.send(0, null);
                        AbstractC2468q.f("BillingClient", "Exception caught while launching intent for in-app messaging.", e11);
                    }
                } else {
                    resultReceiver.send(0, null);
                    AbstractC2468q.e("BillingClient", "Unable to launch intent for in-app messaging");
                }
            }
            parcel2.writeNoException();
            return true;
        }
        throw new BadParcelableException(android.gov.nist.core.a.e("Parcel data not fully consumed, unread size: ", dataAvail));
    }
}
