package com.android.billingclient.api;

import Df.H;
import J0.a;
import K4.C0822j;
import K4.F;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.AbstractC2446f;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import com.google.android.gms.internal.play_billing.C2442d;
import com.google.android.gms.internal.play_billing.C2454j;
import com.google.android.gms.internal.play_billing.V0;
import com.pairip.licensecheck3.LicenseClientV3;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import g.AbstractActivityC3122o;
import id.AbstractC3557B;
import j.C3875e;
import j.k;
import r2.d;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends AbstractActivityC3122o {

    /* renamed from: A0  reason: collision with root package name */
    public ResultReceiver f26695A0;

    /* renamed from: B0  reason: collision with root package name */
    public ResultReceiver f26696B0;

    /* renamed from: C0  reason: collision with root package name */
    public ResultReceiver f26697C0;

    /* renamed from: D0  reason: collision with root package name */
    public ResultReceiver f26698D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f26699E0;

    /* renamed from: F0  reason: collision with root package name */
    public boolean f26700F0;

    /* renamed from: y0  reason: collision with root package name */
    public C3875e f26701y0;

    /* renamed from: z0  reason: collision with root package name */
    public C3875e f26702z0;

    public final Intent m() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        V0 a5 = F.a(intent.getAction());
        C2442d c2442d = AbstractC2446f.f26919Z;
        Object[] objArr = {a5};
        H.E0(1, objArr);
        intent.putExtra("BROADCAST_RECEIVER_LOGGING_PAYLOAD", F.d(new C2454j(1, objArr)).b());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    @Override // g.AbstractActivityC3122o, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i10, int i11, Intent intent) {
        ResultReceiver resultReceiver;
        Intent intent2;
        int i12;
        ResultReceiver resultReceiver2;
        super.onActivityResult(i10, i11, intent);
        Bundle bundle = null;
        if (i10 != 100 && i10 != 110) {
            if (i10 == 101) {
                if (intent == null) {
                    AbstractC2468q.e("ProxyBillingActivity", "Got null intent!");
                } else {
                    int i13 = AbstractC2468q.f26955a;
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        AbstractC2468q.e("ProxyBillingActivity", "Unexpected null bundle received!");
                    } else {
                        i12 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                        resultReceiver2 = this.f26696B0;
                        if (resultReceiver2 != null) {
                            if (intent != null) {
                                bundle = intent.getExtras();
                            }
                            resultReceiver2.send(i12, bundle);
                        }
                    }
                }
                i12 = 0;
                resultReceiver2 = this.f26696B0;
                if (resultReceiver2 != null) {
                }
            } else {
                AbstractC2468q.e("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i10 + "; skipping...");
            }
        } else {
            int i14 = AbstractC2468q.b(intent, "ProxyBillingActivity").f9439a;
            if (i11 == -1) {
                if (i14 != 0) {
                    i11 = -1;
                } else {
                    i14 = 0;
                    resultReceiver = this.f26695A0;
                    if (resultReceiver == null) {
                        if (intent != null) {
                            bundle = intent.getExtras();
                        }
                        resultReceiver.send(i14, bundle);
                    } else {
                        if (intent != null) {
                            if (intent.getExtras() != null) {
                                String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                                if (string != null) {
                                    intent2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                                    intent2.setPackage(getApplicationContext().getPackageName());
                                    intent2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                                    V0 a5 = F.a(intent2.getAction());
                                    C2442d c2442d = AbstractC2446f.f26919Z;
                                    Object[] objArr = {a5};
                                    H.E0(1, objArr);
                                    intent2.putExtra("BROADCAST_RECEIVER_LOGGING_PAYLOAD", F.d(new C2454j(1, objArr)).b());
                                    intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                                } else {
                                    Intent m10 = m();
                                    m10.putExtras(intent.getExtras());
                                    m10.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                                    intent2 = m10;
                                }
                            } else {
                                intent2 = m();
                                AbstractC2468q.e("ProxyBillingActivity", "Got null bundle!");
                                intent2.putExtra("RESPONSE_CODE", 6);
                                intent2.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                                d a10 = C0822j.a();
                                a10.f44376a = 6;
                                a10.f44377b = "An internal error occurred.";
                                intent2.putExtra("FAILURE_LOGGING_PAYLOAD", F.b(22, 2, a10.c()).b());
                                intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            }
                        } else {
                            intent2 = m();
                        }
                        if (i10 == 110) {
                            intent2.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        sendBroadcast(intent2);
                    }
                }
            }
            AbstractC2468q.e("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + i14);
            resultReceiver = this.f26695A0;
            if (resultReceiver == null) {
            }
        }
        this.f26699E0 = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f26699E0) {
            Intent m10 = m();
            m10.putExtra("RESPONSE_CODE", 1);
            m10.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(m10);
        }
    }

    @Override // g.AbstractActivityC3122o, o1.AbstractActivityC4898m, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f26695A0;
        if (resultReceiver != null) {
            bundle.putParcelable(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f26696B0;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f26697C0;
        if (resultReceiver3 != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.f26698D0;
        if (resultReceiver4 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver4);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f26699E0);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f26700F0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [k.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [k.h, java.lang.Object] */
    @Override // g.AbstractActivityC3122o, o1.AbstractActivityC4898m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i10;
        PendingIntent pendingIntent;
        int i11;
        LicenseClientV3.onActivityCreate(this);
        super.onCreate(bundle);
        this.f26701y0 = l(new a(this), new Object());
        this.f26702z0 = l(new F4.a(26, this), new Object());
        if (bundle == null) {
            AbstractC2468q.d("ProxyBillingActivity", "Launching Play Store billing flow");
            if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
                PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                this.f26697C0 = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                C3875e c3875e = this.f26701y0;
                AbstractC3557B.c0("pendingIntent", pendingIntent2);
                IntentSender intentSender = pendingIntent2.getIntentSender();
                AbstractC3557B.b0("pendingIntent.intentSender", intentSender);
                c3875e.K(new k(intentSender, null, 0, 0));
                return;
            } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
                PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
                this.f26698D0 = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                C3875e c3875e2 = this.f26702z0;
                AbstractC3557B.c0("pendingIntent", pendingIntent3);
                IntentSender intentSender2 = pendingIntent3.getIntentSender();
                AbstractC3557B.b0("pendingIntent.intentSender", intentSender2);
                c3875e2.K(new k(intentSender2, null, 0, 0));
                return;
            } else {
                if (getIntent().hasExtra("BUY_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                    if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                        this.f26700F0 = true;
                        i11 = 110;
                        i10 = i11;
                    }
                    i10 = 100;
                } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                    this.f26695A0 = (ResultReceiver) getIntent().getParcelableExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER);
                    i10 = 100;
                } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                    this.f26696B0 = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                    i11 = 101;
                    i10 = i11;
                } else {
                    i10 = 100;
                    pendingIntent = null;
                }
                try {
                    this.f26699E0 = true;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), i10, new Intent(), 0, 0, 0);
                    return;
                } catch (IntentSender.SendIntentException e10) {
                    AbstractC2468q.f("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e10);
                    ResultReceiver resultReceiver = this.f26695A0;
                    if (resultReceiver != null) {
                        resultReceiver.send(6, null);
                    } else {
                        ResultReceiver resultReceiver2 = this.f26696B0;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(0, null);
                        } else {
                            Intent m10 = m();
                            if (this.f26700F0) {
                                m10.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                            }
                            m10.putExtra("RESPONSE_CODE", 6);
                            m10.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                            sendBroadcast(m10);
                        }
                    }
                    this.f26699E0 = false;
                    finish();
                    return;
                }
            }
        }
        AbstractC2468q.d("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
        this.f26699E0 = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
        if (bundle.containsKey(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER)) {
            this.f26695A0 = (ResultReceiver) bundle.getParcelable(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER);
        } else if (bundle.containsKey("in_app_message_result_receiver")) {
            this.f26696B0 = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
        } else if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
            this.f26697C0 = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
        } else if (bundle.containsKey("external_payment_dialog_result_receiver")) {
            this.f26698D0 = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
        }
        this.f26700F0 = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
    }
}
