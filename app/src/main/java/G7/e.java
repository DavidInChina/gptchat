package G7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import u7.C5849e;

/* loaded from: classes.dex */
public abstract class e extends Binder implements IInterface {
    /* renamed from: g */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        Status status;
        C5849e c5849e;
        if (i10 > 16777215) {
            if (super.onTransact(i10, parcel, parcel2, i11)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        if (i10 == 1) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            int i12 = c.f6070a;
            if (parcel.readInt() == 0) {
                status = null;
            } else {
                status = creator.createFromParcel(parcel);
            }
            Status status2 = status;
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                int i13 = status2.f26807Y;
                N7.f fVar = ((g) this).f6072a;
                if (i13 <= 0) {
                    fVar.f12723a.g(null);
                    return true;
                }
                if (status2.f26809h0 != null) {
                    c5849e = new C5849e(status2);
                } else {
                    c5849e = new C5849e(status2);
                }
                fVar.f12723a.f(c5849e);
                return true;
            }
            throw new BadParcelableException(android.gov.nist.core.a.e("Parcel data not fully consumed, unread size: ", dataAvail));
        }
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
