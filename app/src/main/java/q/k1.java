package q;

import Z.C1712g0;
import Z.C1724m0;
import a8.C1935a;
import android.os.Parcel;
import android.os.Parcelable;
import g8.C3209c;
import i8.C3508z;
import k6.AbstractC4194d;
import m1.C4549f;

/* loaded from: classes.dex */
public final class k1 implements Parcelable.ClassLoaderCreator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f43448a;

    public /* synthetic */ k1(int i10) {
        this.f43448a = i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Z.Y0, Z.m0] */
    public static C1724m0 a(Parcel parcel, ClassLoader classLoader) {
        Z.Z0 z02;
        if (classLoader == null) {
            classLoader = k1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt == 2) {
                    z02 = Z.F0.f22489a;
                } else {
                    throw new IllegalStateException(AbstractC4194d.v("Unsupported MutableState policy ", readInt, " was restored"));
                }
            } else {
                z02 = Z.o1.f22665a;
            }
        } else {
            z02 = C1712g0.f22623a;
        }
        return new Z.Y0(readValue, z02);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f43448a) {
            case 0:
                return new l1(parcel, null);
            case 1:
                return new y1(parcel, null);
            case 2:
                return a(parcel, null);
            case 3:
                return new C4549f(parcel, null);
            case 4:
                if (parcel.readParcelable(null) == null) {
                    return K1.b.f9324Z;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new w3.T(parcel, null);
            case 6:
                return new Q7.b(parcel, null);
            case 7:
                return new S7.c(parcel, (ClassLoader) null);
            case 8:
                return new T7.b(parcel, null);
            case 9:
                return new C1935a(parcel, null);
            case 10:
                return new C3209c(parcel, (ClassLoader) null);
            default:
                return new C3508z(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f43448a) {
            case 0:
                return new l1[i10];
            case 1:
                return new y1[i10];
            case 2:
                return new C1724m0[i10];
            case 3:
                return new C4549f[i10];
            case 4:
                return new K1.b[i10];
            case 5:
                return new w3.T[i10];
            case 6:
                return new Q7.b[i10];
            case 7:
                return new S7.c[i10];
            case 8:
                return new T7.b[i10];
            case 9:
                return new C1935a[i10];
            case 10:
                return new C3209c[i10];
            default:
                return new C3508z[i10];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f43448a) {
            case 0:
                return new l1(parcel, classLoader);
            case 1:
                return new y1(parcel, classLoader);
            case 2:
                return a(parcel, classLoader);
            case 3:
                return new C4549f(parcel, classLoader);
            case 4:
                if (parcel.readParcelable(classLoader) == null) {
                    return K1.b.f9324Z;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new w3.T(parcel, classLoader);
            case 6:
                return new Q7.b(parcel, classLoader);
            case 7:
                return new S7.c(parcel, classLoader);
            case 8:
                return new T7.b(parcel, classLoader);
            case 9:
                return new C1935a(parcel, classLoader);
            case 10:
                return new C3209c(parcel, classLoader);
            default:
                return new C3508z(parcel, classLoader);
        }
    }
}
