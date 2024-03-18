package a3;

import Y2.n;
import android.os.Parcel;
import android.os.Parcelable;
import s2.AbstractC5530A;

/* renamed from: a3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1923a extends AbstractC1924b {
    public static final Parcelable.Creator<C1923a> CREATOR = new n(6);

    /* renamed from: Y  reason: collision with root package name */
    public final long f23859Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f23860Z;

    /* renamed from: h0  reason: collision with root package name */
    public final byte[] f23861h0;

    public C1923a(long j6, byte[] bArr, long j10) {
        this.f23859Y = j10;
        this.f23860Z = j6;
        this.f23861h0 = bArr;
    }

    @Override // a3.AbstractC1924b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb2.append(this.f23859Y);
        sb2.append(", identifier= ");
        return android.gov.nist.core.a.m(sb2, this.f23860Z, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f23859Y);
        parcel.writeLong(this.f23860Z);
        parcel.writeByteArray(this.f23861h0);
    }

    public C1923a(Parcel parcel) {
        this.f23859Y = parcel.readLong();
        this.f23860Z = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i10 = AbstractC5530A.f45131a;
        this.f23861h0 = createByteArray;
    }
}
