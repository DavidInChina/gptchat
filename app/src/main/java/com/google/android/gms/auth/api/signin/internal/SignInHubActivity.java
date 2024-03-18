package com.google.android.gms.auth.api.signin.internal;

import S4.o;
import U3.u;
import V1.AbstractActivityC1483y;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.pairip.licensecheck3.LicenseClientV3;
import io.sentry.android.core.AbstractC3612c;
import java.lang.reflect.Modifier;
import n2.C4710a;
import n2.C4711b;
import n2.C4712c;
import s7.C5583d;
import u7.j;
import w.C6050B;

@KeepName
/* loaded from: classes2.dex */
public class SignInHubActivity extends AbstractActivityC1483y {

    /* renamed from: J0  reason: collision with root package name */
    public static boolean f26792J0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f26793E0 = false;

    /* renamed from: F0  reason: collision with root package name */
    public SignInConfiguration f26794F0;

    /* renamed from: G0  reason: collision with root package name */
    public boolean f26795G0;

    /* renamed from: H0  reason: collision with root package name */
    public int f26796H0;

    /* renamed from: I0  reason: collision with root package name */
    public Intent f26797I0;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void n() {
        C4712c c4712c = (C4712c) new u(e(), C4712c.f39604f).l(C4712c.class);
        o oVar = new o(this);
        if (!c4712c.f39606e) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                C6050B c6050b = c4712c.f39605d;
                C4710a c4710a = (C4710a) c6050b.c(0);
                if (c4710a == null) {
                    try {
                        c4712c.f39606e = true;
                        C5583d c5583d = new C5583d((SignInHubActivity) oVar.f16184Z, j.a());
                        if (C5583d.class.isMemberClass() && !Modifier.isStatic(C5583d.class.getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c5583d);
                        }
                        C4710a c4710a2 = new C4710a(c5583d);
                        c6050b.e(0, c4710a2);
                        c4712c.f39606e = false;
                        C4711b c4711b = new C4711b(c4710a2.f39596n, oVar);
                        c4710a2.d(this, c4711b);
                        C4711b c4711b2 = c4710a2.f39598p;
                        if (c4711b2 != null) {
                            c4710a2.h(c4711b2);
                        }
                        c4710a2.f39597o = this;
                        c4710a2.f39598p = c4711b;
                    } catch (Throwable th2) {
                        c4712c.f39606e = false;
                        throw th2;
                    }
                } else {
                    C4711b c4711b3 = new C4711b(c4710a.f39596n, oVar);
                    c4710a.d(this, c4711b3);
                    C4711b c4711b4 = c4710a.f39598p;
                    if (c4711b4 != null) {
                        c4710a.h(c4711b4);
                    }
                    c4710a.f39597o = this;
                    c4710a.f39598p = c4711b3;
                }
                f26792J0 = false;
                return;
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public final void o(int i10) {
        Status status = new Status(i10, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f26792J0 = false;
    }

    @Override // V1.AbstractActivityC1483y, g.AbstractActivityC3122o, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (!this.f26793E0) {
            setResult(0);
            if (i10 != 40962) {
                return;
            }
            if (intent != null) {
                SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                if (signInAccount != null && (googleSignInAccount = signInAccount.f26788Z) != null) {
                    s7.j a5 = s7.j.a(this);
                    GoogleSignInOptions googleSignInOptions = this.f26794F0.f26791Z;
                    googleSignInAccount.getClass();
                    synchronized (a5) {
                        a5.f45439a.d(googleSignInAccount, googleSignInOptions);
                    }
                    intent.removeExtra("signInAccount");
                    intent.putExtra("googleSignInAccount", googleSignInAccount);
                    this.f26795G0 = true;
                    this.f26796H0 = i11;
                    this.f26797I0 = intent;
                    n();
                    return;
                } else if (intent.hasExtra("errorCode")) {
                    int intExtra = intent.getIntExtra("errorCode", 8);
                    if (intExtra == 13) {
                        intExtra = 12501;
                    }
                    o(intExtra);
                    return;
                }
            }
            o(8);
        }
    }

    @Override // V1.AbstractActivityC1483y, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f26792J0 = false;
    }

    @Override // g.AbstractActivityC3122o, o1.AbstractActivityC4898m, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f26795G0);
        if (this.f26795G0) {
            bundle.putInt("signInResultCode", this.f26796H0);
            bundle.putParcelable("signInResultData", this.f26797I0);
        }
    }

    @Override // V1.AbstractActivityC1483y, g.AbstractActivityC3122o, o1.AbstractActivityC4898m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        LicenseClientV3.onActivityCreate(this);
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            o(12500);
        } else if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            AbstractC3612c.c("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
        } else {
            Bundle bundleExtra = intent.getBundleExtra("config");
            bundleExtra.getClass();
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                AbstractC3612c.c("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f26794F0 = signInConfiguration;
            if (bundle == null) {
                if (f26792J0) {
                    setResult(0);
                    o(12502);
                    return;
                }
                f26792J0 = true;
                Intent intent2 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.f26794F0);
                try {
                    startActivityForResult(intent2, 40962);
                    return;
                } catch (ActivityNotFoundException unused) {
                    this.f26793E0 = true;
                    AbstractC3612c.r("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    o(17);
                    return;
                }
            }
            boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
            this.f26795G0 = z10;
            if (z10) {
                this.f26796H0 = bundle.getInt("signInResultCode");
                Intent intent3 = (Intent) bundle.getParcelable("signInResultData");
                intent3.getClass();
                this.f26797I0 = intent3;
                n();
            }
        }
    }
}
