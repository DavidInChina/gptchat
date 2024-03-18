package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import id.AbstractC3557B;

/* renamed from: androidx.lifecycle.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC2089y extends Service implements AbstractC2086v {

    /* renamed from: Y  reason: collision with root package name */
    public final U3.u f25393Y = new U3.u(this);

    @Override // androidx.lifecycle.AbstractC2086v
    public final S h() {
        return (C2088x) this.f25393Y.f17492Z;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC3557B.c0("intent", intent);
        this.f25393Y.M(EnumC2081p.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f25393Y.M(EnumC2081p.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC2081p enumC2081p = EnumC2081p.ON_STOP;
        U3.u uVar = this.f25393Y;
        uVar.M(enumC2081p);
        uVar.M(EnumC2081p.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        this.f25393Y.M(EnumC2081p.ON_START);
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
