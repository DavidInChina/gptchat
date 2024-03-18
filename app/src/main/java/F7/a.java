package F7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f5063a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5064b;

    public /* synthetic */ a(IBinder iBinder, String str, int i10) {
        this.f5063a = iBinder;
        this.f5064b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5063a;
    }

    public final void g(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f5063a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
