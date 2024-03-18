package F7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class c extends Binder implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5066a;

    public c(String str, int i10) {
        this.f5066a = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            attachInterface(this, str);
                            return;
                        } else {
                            attachInterface(this, str);
                            return;
                        }
                    }
                    attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
                    return;
                }
                attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
                return;
            }
            attachInterface(this, str);
            return;
        }
        attachInterface(this, str);
    }

    public abstract boolean g(int i10, Parcel parcel);

    public abstract boolean h(int i10, Parcel parcel, Parcel parcel2);

    public boolean j(int i10, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean k(int i10, Parcel parcel, Parcel parcel2);

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (this.f5066a) {
            case 0:
                if (i10 > 16777215) {
                    if (super.onTransact(i10, parcel, parcel2, i11)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return h(i10, parcel, parcel2);
            case 1:
                if (i10 > 16777215) {
                    if (super.onTransact(i10, parcel, parcel2, i11)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return j(i10, parcel, parcel2);
            case 2:
                if (i10 > 16777215) {
                    if (super.onTransact(i10, parcel, parcel2, i11)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return k(i10, parcel, parcel2);
            case 3:
                if (i10 > 16777215) {
                    if (super.onTransact(i10, parcel, parcel2, i11)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return j(i10, parcel, parcel2);
            case 4:
                if (i10 > 16777215) {
                    if (super.onTransact(i10, parcel, parcel2, i11)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return j(i10, parcel, parcel2);
            default:
                if (i10 > 16777215) {
                    if (super.onTransact(i10, parcel, parcel2, i11)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return g(i10, parcel);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
