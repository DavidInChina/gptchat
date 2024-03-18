package u8;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u8.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5858h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f46491a = 0;

    static {
        AbstractC5858h.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException(android.gov.nist.core.a.e("Parcel data not fully consumed, unread size: ", dataAvail));
    }
}
