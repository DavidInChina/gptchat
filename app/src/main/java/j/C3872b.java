package j;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3872b implements Parcelable {
    public static final Parcelable.Creator<C3872b> CREATOR = new C3871a(0);

    /* renamed from: Y  reason: collision with root package name */
    public final int f35796Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Intent f35797Z;

    public C3872b(Intent intent, int i10) {
        this.f35796Y = i10;
        this.f35797Z = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i10 = this.f35796Y;
        if (i10 != -1) {
            if (i10 != 0) {
                str = String.valueOf(i10);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb2.append(str);
        sb2.append(", data=");
        sb2.append(this.f35797Z);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeInt(this.f35796Y);
        Intent intent = this.f35797Z;
        if (intent == null) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        parcel.writeInt(i11);
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    public C3872b(Parcel parcel) {
        this.f35796Y = parcel.readInt();
        this.f35797Z = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
