package com.google.android.gms.internal.play_billing;

import K4.C0818f;
import K4.C0822j;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import o8.BinderC4950c;
import o8.C4948a;
import org.json.JSONException;
import u8.AbstractC5858h;
import u8.C5852b;
import u8.C5865o;

/* loaded from: classes2.dex */
public abstract class n1 extends F7.c {
    @Override // F7.c
    public boolean g(int i10, Parcel parcel) {
        if (i10 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC5858h.a(parcel, Bundle.CREATOR);
        AbstractC5858h.b(parcel);
        BinderC4950c binderC4950c = (BinderC4950c) this;
        C5852b c5852b = binderC4950c.f40939g;
        N7.f fVar = binderC4950c.f40937e;
        c5852b.c(fVar);
        String str = binderC4950c.f40935c;
        C5865o c5865o = binderC4950c.f40934b;
        c5865o.b("onRequestDialog(%s)", str);
        binderC4950c.f40936d.getClass();
        int i11 = bundle.getInt("error");
        C4948a c4948a = null;
        if (i11 != 0) {
            c4948a = new C4948a(i11, null);
        }
        if (c4948a != null) {
            fVar.a(c4948a);
        } else {
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
            String str2 = c5865o.f46496a;
            if (pendingIntent == null) {
                Object[] objArr = {str};
                if (Log.isLoggable("PlayCore", 6)) {
                    Log.e("PlayCore", C5865o.c(str2, "onRequestDialog(%s): got null dialog intent", objArr));
                }
                fVar.b(0);
            } else {
                Activity activity = binderC4950c.f40938f;
                Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
                intent.putExtra("confirmation_intent", pendingIntent);
                intent.setFlags(536870912);
                intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, new K4.B(binderC4950c, c5852b.a()));
                Object[] objArr2 = new Object[0];
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", C5865o.c(str2, "Starting dialog intent...", objArr2));
                }
                activity.startActivityForResult(intent, 0);
            }
        }
        return true;
    }

    @Override // F7.c
    public boolean h(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) F7.d.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) F7.d.a(parcel, Status.CREATOR);
                F7.d.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status2 = (Status) F7.d.a(parcel, Status.CREATOR);
                F7.d.b(parcel);
                s7.f fVar = (s7.f) this;
                switch (fVar.f45434b) {
                    case 0:
                        ((s7.g) fVar.f45435c).J0(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            case 103:
                Status status3 = (Status) F7.d.a(parcel, Status.CREATOR);
                F7.d.b(parcel);
                s7.f fVar2 = (s7.f) this;
                switch (fVar2.f45434b) {
                    case 1:
                        ((s7.g) fVar2.f45435c).J0(status3);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // F7.c
    public boolean k(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            Bundle bundle = (Bundle) s1.a(parcel, Bundle.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                K4.D d10 = (K4.D) this;
                K4.G g10 = d10.f9345c;
                com.revenuecat.purchases.google.usecase.b bVar = d10.f9344b;
                if (bundle == null) {
                    C0822j c0822j = K4.H.f9359h;
                    ((U3.u) g10).S(K4.F.b(63, 13, c0822j));
                    bVar.a(c0822j, null);
                } else {
                    int a5 = AbstractC2468q.a(bundle, "BillingClient");
                    String c10 = AbstractC2468q.c(bundle, "BillingClient");
                    r2.d a10 = C0822j.a();
                    a10.f44376a = a5;
                    a10.f44377b = c10;
                    if (a5 != 0) {
                        AbstractC2468q.e("BillingClient", "getBillingConfig() failed. Response code: " + a5);
                        C0822j c11 = a10.c();
                        ((U3.u) g10).S(K4.F.b(23, 13, c11));
                        bVar.a(c11, null);
                    } else if (!bundle.containsKey("BILLING_CONFIG")) {
                        AbstractC2468q.e("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                        a10.f44376a = 6;
                        C0822j c12 = a10.c();
                        ((U3.u) g10).S(K4.F.b(64, 13, c12));
                        bVar.a(c12, null);
                    } else {
                        try {
                            bVar.a(a10.c(), new C0818f(bundle.getString("BILLING_CONFIG")));
                        } catch (JSONException e10) {
                            AbstractC2468q.f("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e10);
                            C0822j c0822j2 = K4.H.f9359h;
                            ((U3.u) g10).S(K4.F.b(65, 13, c0822j2));
                            bVar.a(c0822j2, null);
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            }
            throw new BadParcelableException(android.gov.nist.core.a.e("Parcel data not fully consumed, unread size: ", dataAvail));
        }
        return false;
    }
}
