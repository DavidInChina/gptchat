package J7;

import android.location.Location;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import u7.C5849e;

/* loaded from: classes2.dex */
public abstract class p extends Binder implements IInterface {
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
            int i12 = b.f8864a;
            Parcelable parcelable = null;
            if (parcel.readInt() == 0) {
                status = null;
            } else {
                status = creator.createFromParcel(parcel);
            }
            Status status2 = status;
            Parcelable.Creator creator2 = Location.CREATOR;
            if (parcel.readInt() != 0) {
                parcelable = (Parcelable) creator2.createFromParcel(parcel);
            }
            Location location = (Location) parcelable;
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                int i13 = status2.f26807Y;
                N7.f fVar = ((c) this).f8865a;
                if (i13 <= 0) {
                    fVar.f12723a.g(location);
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
            StringBuilder sb2 = new StringBuilder(String.valueOf(dataAvail).length() + 45);
            sb2.append("Parcel data not fully consumed, unread size: ");
            sb2.append(dataAvail);
            throw new BadParcelableException(sb2.toString());
        }
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
