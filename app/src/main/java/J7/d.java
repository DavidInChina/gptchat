package J7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import t7.C5682d;
import v7.AbstractC5986d;
import v7.AbstractC5991i;
import w.C6049A;
import w7.AbstractC6134f;
import w7.C6131c;

/* loaded from: classes2.dex */
public final class d extends AbstractC6134f {

    /* renamed from: A  reason: collision with root package name */
    public final C6049A f8866A = new C6049A(0);

    /* renamed from: B  reason: collision with root package name */
    public final C6049A f8867B = new C6049A(0);

    /* renamed from: C  reason: collision with root package name */
    public final C6049A f8868C = new C6049A(0);

    public d(Context context, Looper looper, C6131c c6131c, AbstractC5986d abstractC5986d, AbstractC5991i abstractC5991i) {
        super(context, looper, 23, c6131c, abstractC5986d, abstractC5991i);
    }

    @Override // u7.AbstractC5847c
    public final int f() {
        return 11717000;
    }

    @Override // w7.AbstractC6134f
    public final /* synthetic */ IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof o) {
            return (o) queryLocalInterface;
        }
        return new o(iBinder);
    }

    @Override // w7.AbstractC6134f
    public final C5682d[] j() {
        return K7.c.f9533a;
    }

    @Override // w7.AbstractC6134f
    public final String m() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // w7.AbstractC6134f
    public final String n() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // w7.AbstractC6134f
    public final void r() {
        System.currentTimeMillis();
        synchronized (this.f8866A) {
            this.f8866A.clear();
        }
        synchronized (this.f8867B) {
            this.f8867B.clear();
        }
        synchronized (this.f8868C) {
            this.f8868C.clear();
        }
    }

    @Override // w7.AbstractC6134f
    public final boolean s() {
        return true;
    }
}
