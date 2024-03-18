package V1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: V1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1463d implements Parcelable {
    public static final Parcelable.Creator<C1463d> CREATOR = new C1461b(1);

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayList f18177Y;

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f18178Z;

    public C1463d(Parcel parcel) {
        this.f18177Y = parcel.createStringArrayList();
        this.f18178Z = parcel.createTypedArrayList(C1462c.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f18177Y);
        parcel.writeTypedList(this.f18178Z);
    }
}
