package M7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import q.RunnableC5216j;
import t7.C5680b;
import v7.BinderC5982C;

/* loaded from: classes.dex */
public abstract class d extends Binder implements e, IInterface {
    /* renamed from: j */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 > 16777215) {
            if (super.onTransact(i10, parcel, parcel2, i11)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        switch (i10) {
            case 3:
                C5680b c5680b = (C5680b) H7.a.a(parcel, C5680b.CREATOR);
                b bVar = (b) H7.a.a(parcel, b.CREATOR);
                H7.a.b(parcel);
                break;
            case 4:
                Status status = (Status) H7.a.a(parcel, Status.CREATOR);
                H7.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) H7.a.a(parcel, Status.CREATOR);
                H7.a.b(parcel);
                break;
            case 7:
                Status status3 = (Status) H7.a.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) H7.a.a(parcel, GoogleSignInAccount.CREATOR);
                H7.a.b(parcel);
                break;
            case 8:
                H7.a.b(parcel);
                BinderC5982C binderC5982C = (BinderC5982C) this;
                binderC5982C.f47269b.post(new RunnableC5216j(binderC5982C, 22, (i) H7.a.a(parcel, i.CREATOR)));
                break;
            case 9:
                g gVar = (g) H7.a.a(parcel, g.CREATOR);
                H7.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
