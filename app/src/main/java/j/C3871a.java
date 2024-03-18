package j;

import G.C0548c;
import Y2.m;
import Z.C1718j0;
import Z.C1720k0;
import Z.C1722l0;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import id.AbstractC3557B;
import p2.C5062o;
import p2.C5063p;
import p2.M;
import p2.b0;
import q.U;
import t2.C5664a;

/* renamed from: j.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3871a implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35795a;

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View$BaseSavedState, q.U, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View$BaseSavedState, H1.l, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z10;
        switch (this.f35795a) {
            case 0:
                return new C3872b(parcel);
            case 1:
                AbstractC3557B.c0("inParcel", parcel);
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                AbstractC3557B.Z(readParcelable);
                return new k((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 2:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readByte() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                baseSavedState.f43361Y = z10;
                return baseSavedState;
            case 3:
                return new C0548c(parcel.readInt());
            case 4:
                return new C1718j0(parcel.readFloat());
            case 5:
                return new C1720k0(parcel.readInt());
            case 6:
                return new C1722l0(parcel.readLong());
            case 7:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.f7180Y = parcel.readInt();
                return baseSavedState2;
            case 8:
                return new C5063p(parcel);
            case 9:
                return new C5062o(parcel);
            case 10:
                return new M(parcel);
            case 11:
                return new b0(parcel);
            case 12:
                return new C5664a(parcel);
            case 13:
                return new t2.b(parcel);
            case 14:
                return new t2.c(parcel);
            case 15:
                String readString = parcel.readString();
                readString.getClass();
                return new U2.a(parcel.readInt(), readString);
            case 16:
                return new V2.a(parcel);
            case 17:
                return new W2.a(parcel);
            case 18:
                return new W2.b(parcel);
            case 19:
                return new X2.b(parcel);
            case 20:
                return new X2.c(parcel);
            case 21:
                return new Y2.a(parcel);
            case 22:
                return new Y2.b(parcel);
            case 23:
                return new Y2.c(parcel);
            case 24:
                return new Y2.d(parcel);
            case 25:
                return new Y2.e(parcel);
            case 26:
                return new Y2.f(parcel);
            case 27:
                return new Y2.k(parcel);
            case 28:
                return new Y2.l(parcel);
            default:
                return new m(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f35795a) {
            case 0:
                return new C3872b[i10];
            case 1:
                return new k[i10];
            case 2:
                return new U[i10];
            case 3:
                return new C0548c[i10];
            case 4:
                return new C1718j0[i10];
            case 5:
                return new C1720k0[i10];
            case 6:
                return new C1722l0[i10];
            case 7:
                return new H1.l[i10];
            case 8:
                return new C5063p[i10];
            case 9:
                return new C5062o[i10];
            case 10:
                return new M[i10];
            case 11:
                return new b0[i10];
            case 12:
                return new C5664a[i10];
            case 13:
                return new t2.b[i10];
            case 14:
                return new t2.c[i10];
            case 15:
                return new U2.a[i10];
            case 16:
                return new V2.a[i10];
            case 17:
                return new W2.a[i10];
            case 18:
                return new W2.b[i10];
            case 19:
                return new X2.b[i10];
            case 20:
                return new X2.c[i10];
            case 21:
                return new Y2.a[i10];
            case 22:
                return new Y2.b[i10];
            case 23:
                return new Y2.c[i10];
            case 24:
                return new Y2.d[i10];
            case 25:
                return new Y2.e[i10];
            case 26:
                return new Y2.f[i10];
            case 27:
                return new Y2.k[i10];
            case 28:
                return new Y2.l[i10];
            default:
                return new m[i10];
        }
    }
}
