package m8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import l8.BinderC4349g;

/* loaded from: classes.dex */
public final class e implements g, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f38971a;

    public e(IBinder iBinder) {
        this.f38971a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f38971a;
    }

    @Override // m8.g
    public final void b(String str, Bundle bundle, BinderC4349g binderC4349g) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i10 = d.f38970a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(binderC4349g);
        try {
            this.f38971a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
