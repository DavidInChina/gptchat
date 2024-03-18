package x3;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    public IBinder f48687a;

    @Override // x3.k
    public final int a(i iVar, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
            obtain.writeStrongInterface(iVar);
            obtain.writeString(str);
            this.f48687a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f48687a;
    }

    @Override // x3.k
    public final void i(int i10, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
            obtain.writeInt(i10);
            obtain.writeStringArray(strArr);
            this.f48687a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
