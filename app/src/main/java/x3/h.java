package x3;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a  reason: collision with root package name */
    public IBinder f48686a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f48686a;
    }

    @Override // x3.i
    public final void c(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.f48686a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
