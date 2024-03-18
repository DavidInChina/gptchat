package w7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class x implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f48211a;

    public x(IBinder iBinder) {
        this.f48211a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f48211a;
    }

    public final void g(BinderC6123A binderC6123A, C6133e c6133e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(binderC6123A);
            obtain.writeInt(1);
            t.a(c6133e, obtain, 0);
            this.f48211a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
