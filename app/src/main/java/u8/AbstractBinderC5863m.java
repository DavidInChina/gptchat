package u8;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: u8.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5863m extends F7.c implements AbstractC5864n {
    @Override // F7.c
    public final boolean g(int i10, Parcel parcel) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        return false;
                    }
                    Bundle bundle = (Bundle) AbstractC5858h.a(parcel, Bundle.CREATOR);
                    AbstractC5858h.b(parcel);
                    o8.l lVar = (o8.l) this;
                    lVar.f40964c.f40976f.c(lVar.f40963b);
                    return true;
                }
                Bundle bundle2 = (Bundle) AbstractC5858h.a(parcel, Bundle.CREATOR);
                AbstractC5858h.b(parcel);
                o8.l lVar2 = (o8.l) this;
                lVar2.f40964c.f40976f.c(lVar2.f40963b);
                return true;
            }
            AbstractC5858h.b(parcel);
            d((Bundle) AbstractC5858h.a(parcel, Bundle.CREATOR));
            return true;
        }
        AbstractC5858h.b(parcel);
        f((Bundle) AbstractC5858h.a(parcel, Bundle.CREATOR));
        return true;
    }
}
