package s8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r8.BinderC5375d;

/* renamed from: s8.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5585b implements AbstractC5587d, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f45442a;

    public C5585b(IBinder iBinder) {
        this.f45442a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f45442a;
    }

    @Override // s8.AbstractC5587d
    public final void e(String str, Bundle bundle, BinderC5375d binderC5375d) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        obtain.writeString(str);
        int i10 = AbstractC5584a.f45441a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(binderC5375d);
        try {
            this.f45442a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
