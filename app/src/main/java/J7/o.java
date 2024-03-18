package J7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class o implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f8893a;

    public o(IBinder iBinder) {
        this.f8893a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8893a;
    }

    public final void g(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f8893a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
