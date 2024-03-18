package Y2;

import a3.C1923a;
import a3.C1927e;
import a3.C1928f;
import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import b3.C2119a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k5.C4184j;
import k5.C4186l;
import s3.C5563m;
import s7.C5580a;
import t7.C5680b;
import w3.C6114v;
import w3.e0;
import w3.f0;
import w7.C6136h;
import x8.N;

/* loaded from: classes2.dex */
public final class n implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22093a;

    public /* synthetic */ n(int i10) {
        this.f22093a = i10;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [w3.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [w3.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [w3.f0, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        int i10 = 0;
        Bundle bundle = null;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        GoogleSignInAccount googleSignInAccount = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        switch (this.f22093a) {
            case 0:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new o(readString, readString2, N.i0(createStringArray));
            case 1:
                return new p(parcel);
            case 2:
                return new Z2.a(parcel);
            case 3:
                ArrayList arrayList3 = new ArrayList();
                parcel.readList(arrayList3, Z2.b.class.getClassLoader());
                return new Z2.c(arrayList3);
            case 4:
                return new Z2.b(parcel.readLong(), parcel.readInt(), parcel.readLong());
            case 5:
                return new Z2.d(parcel);
            case 6:
                return new C1923a(parcel);
            case 7:
                return new C1927e(parcel);
            case 8:
                return new Object();
            case 9:
                return new a3.i(parcel);
            case 10:
                return new a3.j(parcel.readLong(), parcel.readLong());
            case 11:
                return new W2.b(parcel);
            case 12:
                AbstractC3557B.c0("inParcel", parcel);
                return new C5563m(parcel);
            case 13:
                ?? obj = new Object();
                obj.f47989Y = parcel.readInt();
                obj.f47990Z = parcel.readInt();
                if (parcel.readInt() != 1) {
                    z12 = false;
                }
                obj.f47991h0 = z12;
                return obj;
            case 14:
                ?? obj2 = new Object();
                obj2.f47852Y = parcel.readInt();
                obj2.f47853Z = parcel.readInt();
                if (parcel.readInt() != 1) {
                    z12 = false;
                }
                obj2.f47855i0 = z12;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj2.f47854h0 = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj2;
            case 15:
                ?? obj3 = new Object();
                obj3.f47862Y = parcel.readInt();
                obj3.f47863Z = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj3.f47864h0 = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj3.f47865i0 = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj3.f47866j0 = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj3.f47867k0 = iArr3;
                    parcel.readIntArray(iArr3);
                }
                if (parcel.readInt() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                obj3.f47869m0 = z10;
                if (parcel.readInt() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                obj3.f47870n0 = z11;
                if (parcel.readInt() != 1) {
                    z12 = false;
                }
                obj3.f47871o0 = z12;
                obj3.f47868l0 = parcel.readArrayList(e0.class.getClassLoader());
                return obj3;
            case 16:
                return new ParcelImpl(parcel);
            case 17:
                String readString3 = parcel.readString();
                AbstractC3557B.Z(readString3);
                int readInt4 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt4);
                while (i10 < readInt4) {
                    String readString4 = parcel.readString();
                    AbstractC3557B.Z(readString4);
                    String readString5 = parcel.readString();
                    AbstractC3557B.Z(readString5);
                    linkedHashMap.put(readString4, readString5);
                    i10++;
                }
                return new o4.c(readString3, linkedHashMap);
            case 18:
                return new com.auth0.android.jwt.d(parcel.readString());
            case 19:
                return new C4184j(parcel);
            case 20:
                return new C4186l(parcel);
            case 21:
                int q02 = U3.f.q0(parcel);
                int i11 = 0;
                while (parcel.dataPosition() < q02) {
                    int readInt5 = parcel.readInt();
                    char c10 = (char) readInt5;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                U3.f.o0(parcel, readInt5);
                            } else {
                                bundle = U3.f.p(parcel, readInt5);
                            }
                        } else {
                            i11 = U3.f.l0(parcel, readInt5);
                        }
                    } else {
                        i10 = U3.f.l0(parcel, readInt5);
                    }
                }
                U3.f.w(parcel, q02);
                return new C5580a(i10, i11, bundle);
            case 22:
                int q03 = U3.f.q0(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < q03) {
                    int readInt6 = parcel.readInt();
                    char c11 = (char) readInt6;
                    if (c11 != 2) {
                        if (c11 != 5) {
                            U3.f.o0(parcel, readInt6);
                        } else {
                            googleSignInOptions = (GoogleSignInOptions) U3.f.q(parcel, readInt6, GoogleSignInOptions.CREATOR);
                        }
                    } else {
                        str3 = U3.f.r(parcel, readInt6);
                    }
                }
                U3.f.w(parcel, q03);
                return new SignInConfiguration(str3, googleSignInOptions);
            case 23:
                int q04 = U3.f.q0(parcel);
                long j6 = 0;
                int i12 = 0;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                Uri uri = null;
                String str8 = null;
                String str9 = null;
                ArrayList arrayList4 = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < q04) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            i12 = U3.f.l0(parcel, readInt7);
                            break;
                        case 2:
                            str4 = U3.f.r(parcel, readInt7);
                            break;
                        case 3:
                            str5 = U3.f.r(parcel, readInt7);
                            break;
                        case 4:
                            str6 = U3.f.r(parcel, readInt7);
                            break;
                        case 5:
                            str7 = U3.f.r(parcel, readInt7);
                            break;
                        case 6:
                            uri = (Uri) U3.f.q(parcel, readInt7, Uri.CREATOR);
                            break;
                        case 7:
                            str8 = U3.f.r(parcel, readInt7);
                            break;
                        case '\b':
                            U3.f.s0(parcel, readInt7, 8);
                            j6 = parcel.readLong();
                            break;
                        case '\t':
                            str9 = U3.f.r(parcel, readInt7);
                            break;
                        case '\n':
                            arrayList4 = U3.f.t(parcel, readInt7, Scope.CREATOR);
                            break;
                        case 11:
                            str10 = U3.f.r(parcel, readInt7);
                            break;
                        case '\f':
                            str11 = U3.f.r(parcel, readInt7);
                            break;
                        default:
                            U3.f.o0(parcel, readInt7);
                            break;
                    }
                }
                U3.f.w(parcel, q04);
                return new GoogleSignInAccount(i12, str4, str5, str6, str7, uri, str8, j6, str9, arrayList4, str10, str11);
            case 24:
                int q05 = U3.f.q0(parcel);
                int i13 = 0;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                ArrayList arrayList5 = null;
                Account account = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < q05) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i13 = U3.f.l0(parcel, readInt8);
                            break;
                        case 2:
                            arrayList5 = U3.f.t(parcel, readInt8, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) U3.f.q(parcel, readInt8, Account.CREATOR);
                            break;
                        case 4:
                            z13 = U3.f.j0(parcel, readInt8);
                            break;
                        case 5:
                            z14 = U3.f.j0(parcel, readInt8);
                            break;
                        case 6:
                            z15 = U3.f.j0(parcel, readInt8);
                            break;
                        case 7:
                            str12 = U3.f.r(parcel, readInt8);
                            break;
                        case '\b':
                            str13 = U3.f.r(parcel, readInt8);
                            break;
                        case '\t':
                            arrayList2 = U3.f.t(parcel, readInt8, C5580a.CREATOR);
                            break;
                        case '\n':
                            str14 = U3.f.r(parcel, readInt8);
                            break;
                        default:
                            U3.f.o0(parcel, readInt8);
                            break;
                    }
                }
                U3.f.w(parcel, q05);
                return new GoogleSignInOptions(i13, arrayList5, account, z13, z14, z15, str12, str13, GoogleSignInOptions.f(arrayList2), str14);
            case 25:
                int q06 = U3.f.q0(parcel);
                String str15 = "";
                String str16 = str15;
                while (parcel.dataPosition() < q06) {
                    int readInt9 = parcel.readInt();
                    char c12 = (char) readInt9;
                    if (c12 != 4) {
                        if (c12 != 7) {
                            if (c12 != '\b') {
                                U3.f.o0(parcel, readInt9);
                            } else {
                                str16 = U3.f.r(parcel, readInt9);
                            }
                        } else {
                            googleSignInAccount = (GoogleSignInAccount) U3.f.q(parcel, readInt9, GoogleSignInAccount.CREATOR);
                        }
                    } else {
                        str15 = U3.f.r(parcel, readInt9);
                    }
                }
                U3.f.w(parcel, q06);
                return new SignInAccount(str15, googleSignInAccount, str16);
            case 26:
                int q07 = U3.f.q0(parcel);
                while (parcel.dataPosition() < q07) {
                    int readInt10 = parcel.readInt();
                    char c13 = (char) readInt10;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            U3.f.o0(parcel, readInt10);
                        } else {
                            str2 = U3.f.r(parcel, readInt10);
                        }
                    } else {
                        i10 = U3.f.l0(parcel, readInt10);
                    }
                }
                U3.f.w(parcel, q07);
                return new Scope(i10, str2);
            case 27:
                int q08 = U3.f.q0(parcel);
                PendingIntent pendingIntent = null;
                C5680b c5680b = null;
                while (parcel.dataPosition() < q08) {
                    int readInt11 = parcel.readInt();
                    char c14 = (char) readInt11;
                    if (c14 != 1) {
                        if (c14 != 2) {
                            if (c14 != 3) {
                                if (c14 != 4) {
                                    U3.f.o0(parcel, readInt11);
                                } else {
                                    c5680b = (C5680b) U3.f.q(parcel, readInt11, C5680b.CREATOR);
                                }
                            } else {
                                pendingIntent = (PendingIntent) U3.f.q(parcel, readInt11, PendingIntent.CREATOR);
                            }
                        } else {
                            str = U3.f.r(parcel, readInt11);
                        }
                    } else {
                        i10 = U3.f.l0(parcel, readInt11);
                    }
                }
                U3.f.w(parcel, q08);
                return new Status(i10, str, pendingIntent, c5680b);
            case 28:
                int q09 = U3.f.q0(parcel);
                while (parcel.dataPosition() < q09) {
                    int readInt12 = parcel.readInt();
                    char c15 = (char) readInt12;
                    if (c15 != 1) {
                        if (c15 != 2) {
                            U3.f.o0(parcel, readInt12);
                        } else {
                            arrayList = U3.f.t(parcel, readInt12, C6136h.CREATOR);
                        }
                    } else {
                        i10 = U3.f.l0(parcel, readInt12);
                    }
                }
                U3.f.w(parcel, q09);
                return new w7.l(i10, arrayList);
            default:
                int q010 = U3.f.q0(parcel);
                int i14 = -1;
                long j10 = 0;
                long j11 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                String str17 = null;
                String str18 = null;
                while (parcel.dataPosition() < q010) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            i15 = U3.f.l0(parcel, readInt13);
                            break;
                        case 2:
                            i16 = U3.f.l0(parcel, readInt13);
                            break;
                        case 3:
                            i17 = U3.f.l0(parcel, readInt13);
                            break;
                        case 4:
                            U3.f.s0(parcel, readInt13, 8);
                            j10 = parcel.readLong();
                            break;
                        case 5:
                            U3.f.s0(parcel, readInt13, 8);
                            j11 = parcel.readLong();
                            break;
                        case 6:
                            str17 = U3.f.r(parcel, readInt13);
                            break;
                        case 7:
                            str18 = U3.f.r(parcel, readInt13);
                            break;
                        case '\b':
                            i18 = U3.f.l0(parcel, readInt13);
                            break;
                        case '\t':
                            i14 = U3.f.l0(parcel, readInt13);
                            break;
                        default:
                            U3.f.o0(parcel, readInt13);
                            break;
                    }
                }
                U3.f.w(parcel, q010);
                return new C6136h(i15, i16, i17, j10, j11, str17, str18, i18, i14);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f22093a) {
            case 0:
                return new o[i10];
            case 1:
                return new p[i10];
            case 2:
                return new Z2.a[i10];
            case 3:
                return new Z2.c[i10];
            case 4:
                return new Z2.b[i10];
            case 5:
                return new Z2.d[i10];
            case 6:
                return new C1923a[i10];
            case 7:
                return new C1927e[i10];
            case 8:
                return new C1928f[i10];
            case 9:
                return new a3.i[i10];
            case 10:
                return new a3.j[i10];
            case 11:
                return new C2119a[i10];
            case 12:
                return new C5563m[i10];
            case 13:
                return new C6114v[i10];
            case 14:
                return new e0[i10];
            case 15:
                return new f0[i10];
            case 16:
                return new ParcelImpl[i10];
            case 17:
                return new o4.c[i10];
            case 18:
                return new com.auth0.android.jwt.d[i10];
            case 19:
                return new C4184j[i10];
            case 20:
                return new C4186l[i10];
            case 21:
                return new C5580a[i10];
            case 22:
                return new SignInConfiguration[i10];
            case 23:
                return new GoogleSignInAccount[i10];
            case 24:
                return new GoogleSignInOptions[i10];
            case 25:
                return new SignInAccount[i10];
            case 26:
                return new Scope[i10];
            case 27:
                return new Status[i10];
            case 28:
                return new w7.l[i10];
            default:
                return new C6136h[i10];
        }
    }
}
