package M7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import l8.AbstractC4344b;
import u7.m;
import w7.t;
import x7.AbstractC6355a;

/* loaded from: classes.dex */
public final class b extends AbstractC6355a implements m {
    public static final Parcelable.Creator<b> CREATOR = new t(11);

    /* renamed from: Y  reason: collision with root package name */
    public final int f11713Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f11714Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Intent f11715h0;

    public b(int i10, int i11, Intent intent) {
        this.f11713Y = i10;
        this.f11714Z = i11;
        this.f11715h0 = intent;
    }

    @Override // u7.m
    public final Status a() {
        if (this.f11714Z == 0) {
            return Status.f26802j0;
        }
        return Status.f26806n0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(this.f11713Y);
        AbstractC4344b.G1(parcel, 2, 4);
        parcel.writeInt(this.f11714Z);
        AbstractC4344b.z1(parcel, 3, this.f11715h0, i10);
        AbstractC4344b.F1(parcel, D12);
    }
}
