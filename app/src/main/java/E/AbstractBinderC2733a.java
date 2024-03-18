package e;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: e.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2733a extends Binder implements AbstractC2734b {
    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1598968902) {
            switch (i10) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    if (parcel.readInt() != 0) {
                        Bundle bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        Uri uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    }
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        Bundle bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
        parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
