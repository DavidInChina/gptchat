package M7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC4344b;
import u7.m;
import w7.t;
import x7.AbstractC6355a;

/* loaded from: classes.dex */
public final class g extends AbstractC6355a implements m {
    public static final Parcelable.Creator<g> CREATOR = new t(12);

    /* renamed from: Y  reason: collision with root package name */
    public final List f11716Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f11717Z;

    public g(String str, ArrayList arrayList) {
        this.f11716Y = arrayList;
        this.f11717Z = str;
    }

    @Override // u7.m
    public final Status a() {
        if (this.f11717Z != null) {
            return Status.f26802j0;
        }
        return Status.f26806n0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        List<String> list = this.f11716Y;
        if (list != null) {
            int D13 = AbstractC4344b.D1(parcel, 1);
            parcel.writeStringList(list);
            AbstractC4344b.F1(parcel, D13);
        }
        AbstractC4344b.A1(parcel, 2, this.f11717Z);
        AbstractC4344b.F1(parcel, D12);
    }
}
