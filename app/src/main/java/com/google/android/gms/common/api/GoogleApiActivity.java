package com.google.android.gms.common.api;

import A7.b;
import H7.d;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepName;
import com.pairip.licensecheck3.LicenseClientV3;
import io.sentry.android.core.AbstractC3612c;
import t7.C5680b;
import t7.e;
import v7.C5987e;

@KeepName
/* loaded from: classes2.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ int f26798Z = 0;

    /* renamed from: Y  reason: collision with root package name */
    public int f26799Y = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f26799Y = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                C5987e e10 = C5987e.e(this);
                if (i11 != -1) {
                    if (i11 == 0) {
                        e10.f(new C5680b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    d dVar = e10.f47313r0;
                    dVar.sendMessage(dVar.obtainMessage(3));
                }
            }
        } else if (i10 == 2) {
            this.f26799Y = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f26799Y = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f26799Y);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        LicenseClientV3.onActivityCreate(this);
        super.onCreate(bundle);
        if (bundle != null) {
            this.f26799Y = bundle.getInt("resolution");
        }
        if (this.f26799Y != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                AbstractC3612c.c("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                AbstractC3612c.c("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.f26799Y = 1;
                } catch (ActivityNotFoundException e10) {
                    if (extras.getBoolean("notify_manager", true)) {
                        C5987e.e(this).f(new C5680b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                    } else {
                        String A10 = a.A("Activity not found while launching ", pendingIntent.toString(), Separators.DOT);
                        if (Build.FINGERPRINT.contains("generic")) {
                            A10 = A10.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        AbstractC3612c.d("GoogleApiActivity", A10, e10);
                    }
                    this.f26799Y = 1;
                    finish();
                } catch (IntentSender.SendIntentException e11) {
                    AbstractC3612c.d("GoogleApiActivity", "Failed to launch pendingIntent", e11);
                    finish();
                }
            } else {
                b.k0(num);
                e.f45771d.c(this, num.intValue(), this);
                this.f26799Y = 1;
            }
        }
    }
}
