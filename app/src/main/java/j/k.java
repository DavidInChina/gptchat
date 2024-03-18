package j;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new C3871a(1);

    /* renamed from: Y  reason: collision with root package name */
    public final IntentSender f35821Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Intent f35822Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f35823h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f35824i0;

    public k(IntentSender intentSender, Intent intent, int i10, int i11) {
        AbstractC3557B.c0("intentSender", intentSender);
        this.f35821Y = intentSender;
        this.f35822Z = intent;
        this.f35823h0 = i10;
        this.f35824i0 = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        AbstractC3557B.c0("dest", parcel);
        parcel.writeParcelable(this.f35821Y, i10);
        parcel.writeParcelable(this.f35822Z, i10);
        parcel.writeInt(this.f35823h0);
        parcel.writeInt(this.f35824i0);
    }
}
