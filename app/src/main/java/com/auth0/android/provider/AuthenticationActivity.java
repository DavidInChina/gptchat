package com.auth0.android.provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.auth0.android.request.internal.c;
import com.google.android.gms.internal.play_billing.N;
import com.pairip.licensecheck3.LicenseClientV3;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import k5.C4180f;
import k5.C4181g;
import k5.C4185k;
import k5.C4186l;
import k5.P;
import kotlin.Metadata;
import v8.C5996d;
import v8.C5997e;
import y2.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, d2 = {"Lcom/auth0/android/provider/AuthenticationActivity;", "Landroid/app/Activity;", "<init>", "()V", "i4/d", "auth0_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class AuthenticationActivity extends Activity {

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ int f26715h0 = 0;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f26716Y;

    /* renamed from: Z  reason: collision with root package name */
    public C4185k f26717Z;

    public static void a(Intent intent) {
        if (P.f37058b == null) {
            AbstractC3612c.r(P.f37057a, "There is no previous instance of this provider.");
            return;
        }
        C4181g c4181g = new C4181g(intent);
        N n10 = P.f37058b;
        AbstractC3557B.Z(n10);
        if (n10.v0(c4181g)) {
            P.f37058b = null;
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (i11 == 0) {
            intent = new Intent();
        }
        a(intent);
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C4185k c4185k = this.f26717Z;
        if (c4185k != null) {
            AbstractC3557B.Z(c4185k);
            Log.v("k", "Trying to unbind the service");
            Context context = (Context) c4185k.f37069b.get();
            if (c4185k.f37075h && context != null) {
                context.unbindService(c4185k);
                c4185k.f37075h = false;
            }
            C5997e c5997e = c4185k.f37073f;
            if (!c5997e.f47376h) {
                C5996d c5996d = c5997e.f47373e;
                if (c5996d != null) {
                    c5997e.f47369a.unbindService(c5996d);
                }
                c5997e.f47369a = null;
                c5997e.f47376h = true;
            }
            this.f26717Z = null;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if (!this.f26716Y && intent.getExtras() == null) {
            finish();
        } else if (!this.f26716Y) {
            this.f26716Y = true;
            Bundle extras = getIntent().getExtras();
            AbstractC3557B.Z(extras);
            Uri uri = (Uri) extras.getParcelable("com.auth0.android.EXTRA_AUTHORIZE_URI");
            Parcelable parcelable = extras.getParcelable("com.auth0.android.EXTRA_CT_OPTIONS");
            AbstractC3557B.Z(parcelable);
            boolean z10 = extras.getBoolean("com.auth0.android.EXTRA_LAUNCH_AS_TWA", false);
            C4185k c4185k = new C4185k(this, (C4186l) parcelable, new C5997e(this));
            this.f26717Z = c4185k;
            c4185k.b();
            C4185k c4185k2 = this.f26717Z;
            AbstractC3557B.Z(c4185k2);
            AbstractC3557B.Z(uri);
            c c02 = c.f26725b.c0();
            C4180f c4180f = new C4180f(this);
            Context context = (Context) c4185k2.f37069b.get();
            if (context == null) {
                Log.v("k", "Custom Tab Context was no longer valid.");
            } else {
                c02.a(new Y(c4185k2, z10, context, uri, c02, c4180f));
            }
        } else {
            if (intent.getData() == null) {
                setResult(0);
            }
            a(intent);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        AbstractC3557B.c0("outState", bundle);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.auth0.android.EXTRA_INTENT_LAUNCHED", this.f26716Y);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        LicenseClientV3.onActivityCreate(this);
        super.onCreate(bundle);
        if (bundle != null) {
            this.f26716Y = bundle.getBoolean("com.auth0.android.EXTRA_INTENT_LAUNCHED", false);
        }
    }
}
