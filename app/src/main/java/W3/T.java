package w3;

import android.os.Parcel;
import android.os.Parcelable;
import q.k1;

/* loaded from: classes.dex */
public final class T extends K1.b {
    public static final Parcelable.Creator<T> CREATOR = new k1(5);

    /* renamed from: h0  reason: collision with root package name */
    public Parcelable f47777h0;

    public T(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f47777h0 = parcel.readParcelable(classLoader == null ? K.class.getClassLoader() : classLoader);
    }

    @Override // K1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f47777h0, 0);
    }
}
