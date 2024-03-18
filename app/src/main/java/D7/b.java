package D7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class b implements d, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f3419a;

    public b(IBinder iBinder) {
        this.f3419a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3419a;
    }

    public final Parcel g(Parcel parcel, int i10) {
        parcel = Parcel.obtain();
        try {
            this.f3419a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }
}
