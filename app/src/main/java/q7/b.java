package Q7;

import android.os.Parcel;
import android.os.Parcelable;
import q.k1;

/* loaded from: classes2.dex */
public final class b extends K1.b {
    public static final Parcelable.Creator<b> CREATOR = new k1(6);

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f14455h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f14456i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f14457j0;

    /* renamed from: k0  reason: collision with root package name */
    public final float f14458k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f14459l0;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14455h0 = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f14456i0 = z11;
        this.f14457j0 = parcel.readInt();
        this.f14458k0 = parcel.readFloat();
        this.f14459l0 = parcel.readByte() == 0 ? false : z12;
    }

    @Override // K1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeByte(this.f14455h0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14456i0 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f14457j0);
        parcel.writeFloat(this.f14458k0);
        parcel.writeByte(this.f14459l0 ? (byte) 1 : (byte) 0);
    }
}
