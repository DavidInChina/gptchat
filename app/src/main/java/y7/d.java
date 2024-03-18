package y7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import t7.C5682d;
import v7.AbstractC5986d;
import v7.AbstractC5991i;
import w7.AbstractC6134f;
import w7.C6131c;
import w7.m;

/* loaded from: classes.dex */
public final class d extends AbstractC6134f {

    /* renamed from: A  reason: collision with root package name */
    public final m f50833A;

    public d(Context context, Looper looper, C6131c c6131c, m mVar, AbstractC5986d abstractC5986d, AbstractC5991i abstractC5991i) {
        super(context, looper, 270, c6131c, abstractC5986d, abstractC5991i);
        this.f50833A = mVar;
    }

    @Override // u7.AbstractC5847c
    public final int f() {
        return 203400000;
    }

    @Override // w7.AbstractC6134f
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new F7.a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // w7.AbstractC6134f
    public final C5682d[] j() {
        return H7.b.f7476b;
    }

    @Override // w7.AbstractC6134f
    public final Bundle k() {
        m mVar = this.f50833A;
        mVar.getClass();
        Bundle bundle = new Bundle();
        String str = mVar.f48184Y;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // w7.AbstractC6134f
    public final String m() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // w7.AbstractC6134f
    public final String n() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // w7.AbstractC6134f
    public final boolean o() {
        return true;
    }
}
