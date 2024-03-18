package u8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: u8.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5860j implements AbstractC5862l, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f46494a;

    public C5860j(IBinder iBinder) {
        this.f46494a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f46494a;
    }

    public final void g(Parcel parcel, int i10) {
        try {
            this.f46494a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
