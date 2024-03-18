package X2;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import java.util.Arrays;
import p2.C5065s;
import p2.J;
import p2.L;

/* loaded from: classes2.dex */
public final class c implements L {
    public static final Parcelable.Creator<c> CREATOR = new C3871a(20);

    /* renamed from: Y  reason: collision with root package name */
    public final byte[] f21774Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f21775Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f21776h0;

    public c(String str, String str2, byte[] bArr) {
        this.f21774Y = bArr;
        this.f21775Z = str;
        this.f21776h0 = str2;
    }

    @Override // p2.L
    public final /* synthetic */ C5065s b() {
        return null;
    }

    @Override // p2.L
    public final void d(J j6) {
        String str = this.f21775Z;
        if (str != null) {
            j6.f41822a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p2.L
    public final /* synthetic */ byte[] e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return Arrays.equals(this.f21774Y, ((c) obj).f21774Y);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21774Y);
    }

    public final String toString() {
        int length = this.f21774Y.length;
        return "ICY: title=\"" + this.f21775Z + "\", url=\"" + this.f21776h0 + "\", rawMetadata.length=\"" + length + Separators.DOUBLE_QUOTE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f21774Y);
        parcel.writeString(this.f21775Z);
        parcel.writeString(this.f21776h0);
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f21774Y = createByteArray;
        this.f21775Z = parcel.readString();
        this.f21776h0 = parcel.readString();
    }
}
