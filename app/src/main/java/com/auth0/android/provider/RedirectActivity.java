package com.auth0.android.provider;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.pairip.licensecheck3.LicenseClientV3;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/auth0/android/provider/RedirectActivity;", "Landroid/app/Activity;", "<init>", "()V", "auth0_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RedirectActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        LicenseClientV3.onActivityCreate(this);
        super.onCreate(bundle);
        Intent intent = new Intent(this, AuthenticationActivity.class);
        intent.addFlags(603979776);
        if (getIntent() != null) {
            intent.setData(getIntent().getData());
        }
        startActivity(intent);
        finish();
    }
}
