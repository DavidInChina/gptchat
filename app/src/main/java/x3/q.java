package x3;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import id.AbstractC3557B;
import m.RunnableC4517N;

/* loaded from: classes2.dex */
public final class q extends Binder implements i {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f48714b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f48715a;

    public q(s sVar) {
        this.f48715a = sVar;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
    }

    @Override // x3.i
    public final void c(String[] strArr) {
        AbstractC3557B.c0("tables", strArr);
        s sVar = this.f48715a;
        sVar.f48720c.execute(new RunnableC4517N(sVar, 18, strArr));
    }

    /* renamed from: g */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
        }
        if (i10 != 1598968902) {
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            c(parcel.createStringArray());
            return true;
        }
        parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
