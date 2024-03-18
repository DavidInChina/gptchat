package w7;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class J implements AbstractC6135g, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f48105a;

    public J(IBinder iBinder) {
        this.f48105a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f48105a;
    }

    public final Account g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.f48105a.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) I7.a.a(obtain, Account.CREATOR);
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            obtain.recycle();
        }
    }
}
