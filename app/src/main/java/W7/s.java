package w7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import l8.AbstractC4344b;
import x7.AbstractC6355a;

/* loaded from: classes2.dex */
public final class s extends AbstractC6355a {
    public static final Parcelable.Creator<s> CREATOR = new t(0);

    /* renamed from: Y  reason: collision with root package name */
    public final int f48195Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Account f48196Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f48197h0;

    /* renamed from: i0  reason: collision with root package name */
    public final GoogleSignInAccount f48198i0;

    public s(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f48195Y = i10;
        this.f48196Z = account;
        this.f48197h0 = i11;
        this.f48198i0 = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(this.f48195Y);
        AbstractC4344b.z1(parcel, 2, this.f48196Z, i10);
        AbstractC4344b.G1(parcel, 3, 4);
        parcel.writeInt(this.f48197h0);
        AbstractC4344b.z1(parcel, 4, this.f48198i0, i10);
        AbstractC4344b.F1(parcel, D12);
    }
}
