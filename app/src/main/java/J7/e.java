package J7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import l8.AbstractC4344b;
import w7.t;
import x7.AbstractC6355a;

/* loaded from: classes2.dex */
public final class e extends AbstractC6355a {
    public static final Parcelable.Creator<e> CREATOR = new t(8);

    /* renamed from: Y  reason: collision with root package name */
    public final int f8869Y;

    /* renamed from: Z  reason: collision with root package name */
    public final IBinder f8870Z;

    /* renamed from: h0  reason: collision with root package name */
    public final IBinder f8871h0;

    /* renamed from: i0  reason: collision with root package name */
    public final PendingIntent f8872i0;

    /* renamed from: j0  reason: collision with root package name */
    public final String f8873j0;

    public e(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f8869Y = i10;
        this.f8870Z = iBinder;
        this.f8871h0 = iBinder2;
        this.f8872i0 = pendingIntent;
        this.f8873j0 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(this.f8869Y);
        AbstractC4344b.y1(parcel, 2, this.f8870Z);
        AbstractC4344b.y1(parcel, 3, this.f8871h0);
        AbstractC4344b.z1(parcel, 4, this.f8872i0, i10);
        AbstractC4344b.A1(parcel, 6, this.f8873j0);
        AbstractC4344b.F1(parcel, D12);
    }
}
