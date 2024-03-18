package a8;

import android.os.Parcel;
import android.os.Parcelable;
import q.k1;

/* renamed from: a8.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1935a extends K1.b {
    public static final Parcelable.Creator<C1935a> CREATOR = new k1(9);

    /* renamed from: h0  reason: collision with root package name */
    public boolean f23930h0;

    public C1935a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f23930h0 = parcel.readInt() != 1 ? false : true;
    }

    @Override // K1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f23930h0 ? 1 : 0);
    }
}
