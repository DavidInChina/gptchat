package w7;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class K extends F7.c implements w {
    @Override // F7.c
    public final boolean j(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(((t7.n) this).f45787b);
        } else {
            B7.a aVar = new B7.a(((t7.n) this).m());
            parcel2.writeNoException();
            int i11 = I7.a.f8094a;
            parcel2.writeStrongBinder(aVar);
        }
        return true;
    }
}
