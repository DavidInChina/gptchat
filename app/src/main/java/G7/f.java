package G7;

import android.os.IBinder;
import android.os.IInterface;
import t7.C5682d;
import w7.AbstractC6134f;

/* loaded from: classes.dex */
public final class f extends AbstractC6134f {
    @Override // u7.AbstractC5847c
    public final int f() {
        return 12451000;
    }

    @Override // w7.AbstractC6134f
    public final /* synthetic */ IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new d(iBinder);
    }

    @Override // w7.AbstractC6134f
    public final C5682d[] j() {
        return b.f6069b;
    }

    @Override // w7.AbstractC6134f
    public final String m() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // w7.AbstractC6134f
    public final String n() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // w7.AbstractC6134f
    public final boolean s() {
        return true;
    }
}
