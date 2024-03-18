package s3;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC2082q;
import id.AbstractC3557B;

/* renamed from: s3.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5563m implements Parcelable {
    public static final Parcelable.Creator<C5563m> CREATOR = new Y2.n(12);

    /* renamed from: Y  reason: collision with root package name */
    public final String f45317Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f45318Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Bundle f45319h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Bundle f45320i0;

    public C5563m(Parcel parcel) {
        AbstractC3557B.c0("inParcel", parcel);
        String readString = parcel.readString();
        AbstractC3557B.Z(readString);
        this.f45317Y = readString;
        this.f45318Z = parcel.readInt();
        this.f45319h0 = parcel.readBundle(C5563m.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(C5563m.class.getClassLoader());
        AbstractC3557B.Z(readBundle);
        this.f45320i0 = readBundle;
    }

    public final C5562l a(Context context, AbstractC5540C abstractC5540C, EnumC2082q enumC2082q, C5569t c5569t) {
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("hostLifecycleState", enumC2082q);
        Bundle bundle = this.f45319h0;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.f45317Y;
        AbstractC3557B.c0(ParameterNames.ID, str);
        return new C5562l(context, abstractC5540C, bundle2, enumC2082q, c5569t, str, this.f45320i0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        AbstractC3557B.c0("parcel", parcel);
        parcel.writeString(this.f45317Y);
        parcel.writeInt(this.f45318Z);
        parcel.writeBundle(this.f45319h0);
        parcel.writeBundle(this.f45320i0);
    }

    public C5563m(C5562l c5562l) {
        AbstractC3557B.c0("entry", c5562l);
        this.f45317Y = c5562l.f45310k0;
        this.f45318Z = c5562l.f45306Z.f45221l0;
        this.f45319h0 = c5562l.d();
        Bundle bundle = new Bundle();
        this.f45320i0 = bundle;
        c5562l.f45313n0.c(bundle);
    }
}
