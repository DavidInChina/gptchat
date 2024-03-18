package U2;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import p2.C5065s;
import p2.J;
import p2.L;

/* loaded from: classes.dex */
public final class a implements L {
    public static final Parcelable.Creator<a> CREATOR = new C3871a(15);

    /* renamed from: Y  reason: collision with root package name */
    public final int f17388Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f17389Z;

    public a(int i10, String str) {
        this.f17388Y = i10;
        this.f17389Z = str;
    }

    @Override // p2.L
    public final /* synthetic */ C5065s b() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p2.L
    public final /* synthetic */ byte[] e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f17388Y);
        sb2.append(",url=");
        return R.a.t(sb2, this.f17389Z, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17389Z);
        parcel.writeInt(this.f17388Y);
    }

    @Override // p2.L
    public final /* synthetic */ void d(J j6) {
    }
}
