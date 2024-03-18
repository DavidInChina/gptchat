package w7;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import id.AbstractC3557B;
import java.util.ArrayList;
import l8.AbstractC4344b;
import r8.AbstractC5372a;
import r8.C5373b;
import t7.C5680b;
import t7.C5682d;

/* loaded from: classes2.dex */
public final class t implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f48199a;

    public /* synthetic */ t(int i10) {
        this.f48199a = i10;
    }

    public static void a(C6133e c6133e, Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        int i11 = c6133e.f48124Y;
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(i11);
        AbstractC4344b.G1(parcel, 2, 4);
        parcel.writeInt(c6133e.f48125Z);
        AbstractC4344b.G1(parcel, 3, 4);
        parcel.writeInt(c6133e.f48126h0);
        AbstractC4344b.A1(parcel, 4, c6133e.f48127i0);
        AbstractC4344b.y1(parcel, 5, c6133e.f48128j0);
        AbstractC4344b.B1(parcel, 6, c6133e.f48129k0, i10);
        AbstractC4344b.x1(parcel, 7, c6133e.f48130l0);
        AbstractC4344b.z1(parcel, 8, c6133e.f48131m0, i10);
        AbstractC4344b.B1(parcel, 10, c6133e.f48132n0, i10);
        AbstractC4344b.B1(parcel, 11, c6133e.f48133o0, i10);
        AbstractC4344b.G1(parcel, 12, 4);
        parcel.writeInt(c6133e.f48134p0 ? 1 : 0);
        AbstractC4344b.G1(parcel, 13, 4);
        parcel.writeInt(c6133e.f48135q0);
        boolean z10 = c6133e.f48136r0;
        AbstractC4344b.G1(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        AbstractC4344b.A1(parcel, 15, c6133e.f48137s0);
        AbstractC4344b.F1(parcel, D12);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [w7.E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.view.View$BaseSavedState, V7.b, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Float f6;
        Float f10;
        boolean z10 = true;
        int i10 = 0;
        Account account = null;
        Float f11 = null;
        C5680b c5680b = null;
        s sVar = null;
        Intent intent = null;
        String str = null;
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        switch (this.f48199a) {
            case 0:
                int q02 = U3.f.q0(parcel);
                int i11 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < q02) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    U3.f.o0(parcel, readInt);
                                } else {
                                    googleSignInAccount = (GoogleSignInAccount) U3.f.q(parcel, readInt, GoogleSignInAccount.CREATOR);
                                }
                            } else {
                                i11 = U3.f.l0(parcel, readInt);
                            }
                        } else {
                            account = (Account) U3.f.q(parcel, readInt, Account.CREATOR);
                        }
                    } else {
                        i10 = U3.f.l0(parcel, readInt);
                    }
                }
                U3.f.w(parcel, q02);
                return new s(i10, account, i11, googleSignInAccount);
            case 1:
                int q03 = U3.f.q0(parcel);
                int i12 = 0;
                boolean z11 = false;
                boolean z12 = false;
                IBinder iBinder = null;
                C5680b c5680b2 = null;
                while (parcel.dataPosition() < q03) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                if (c11 != 4) {
                                    if (c11 != 5) {
                                        U3.f.o0(parcel, readInt2);
                                    } else {
                                        z12 = U3.f.j0(parcel, readInt2);
                                    }
                                } else {
                                    z11 = U3.f.j0(parcel, readInt2);
                                }
                            } else {
                                c5680b2 = (C5680b) U3.f.q(parcel, readInt2, C5680b.CREATOR);
                            }
                        } else {
                            iBinder = U3.f.k0(parcel, readInt2);
                        }
                    } else {
                        i12 = U3.f.l0(parcel, readInt2);
                    }
                }
                U3.f.w(parcel, q03);
                return new u(i12, iBinder, c5680b2, z11, z12);
            case 2:
                int q04 = U3.f.q0(parcel);
                int i13 = 0;
                boolean z13 = false;
                boolean z14 = false;
                int i14 = 0;
                int i15 = 0;
                while (parcel.dataPosition() < q04) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                if (c12 != 4) {
                                    if (c12 != 5) {
                                        U3.f.o0(parcel, readInt3);
                                    } else {
                                        i15 = U3.f.l0(parcel, readInt3);
                                    }
                                } else {
                                    i14 = U3.f.l0(parcel, readInt3);
                                }
                            } else {
                                z14 = U3.f.j0(parcel, readInt3);
                            }
                        } else {
                            z13 = U3.f.j0(parcel, readInt3);
                        }
                    } else {
                        i13 = U3.f.l0(parcel, readInt3);
                    }
                }
                U3.f.w(parcel, q04);
                return new C6139k(i13, z13, z14, i14, i15);
            case 3:
                int q05 = U3.f.q0(parcel);
                C5682d[] c5682dArr = null;
                C6132d c6132d = null;
                while (parcel.dataPosition() < q05) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            if (c13 != 3) {
                                if (c13 != 4) {
                                    U3.f.o0(parcel, readInt4);
                                } else {
                                    c6132d = (C6132d) U3.f.q(parcel, readInt4, C6132d.CREATOR);
                                }
                            } else {
                                i10 = U3.f.l0(parcel, readInt4);
                            }
                        } else {
                            c5682dArr = (C5682d[]) U3.f.s(parcel, readInt4, C5682d.CREATOR);
                        }
                    } else {
                        bundle = U3.f.p(parcel, readInt4);
                    }
                }
                U3.f.w(parcel, q05);
                ?? obj = new Object();
                obj.f48079Y = bundle;
                obj.f48080Z = c5682dArr;
                obj.f48081h0 = i10;
                obj.f48082i0 = c6132d;
                return obj;
            case 4:
                int q06 = U3.f.q0(parcel);
                boolean z15 = false;
                boolean z16 = false;
                int i16 = 0;
                C6139k c6139k = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < q06) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            c6139k = (C6139k) U3.f.q(parcel, readInt5, C6139k.CREATOR);
                            break;
                        case 2:
                            z15 = U3.f.j0(parcel, readInt5);
                            break;
                        case 3:
                            z16 = U3.f.j0(parcel, readInt5);
                            break;
                        case 4:
                            int m02 = U3.f.m0(parcel, readInt5);
                            int dataPosition = parcel.dataPosition();
                            if (m02 == 0) {
                                iArr = null;
                                break;
                            } else {
                                int[] createIntArray = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition + m02);
                                iArr = createIntArray;
                                break;
                            }
                        case 5:
                            i16 = U3.f.l0(parcel, readInt5);
                            break;
                        case 6:
                            int m03 = U3.f.m0(parcel, readInt5);
                            int dataPosition2 = parcel.dataPosition();
                            if (m03 == 0) {
                                iArr2 = null;
                                break;
                            } else {
                                int[] createIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition2 + m03);
                                iArr2 = createIntArray2;
                                break;
                            }
                        default:
                            U3.f.o0(parcel, readInt5);
                            break;
                    }
                }
                U3.f.w(parcel, q06);
                return new C6132d(c6139k, z15, z16, iArr, i16, iArr2);
            case 5:
                int q07 = U3.f.q0(parcel);
                Scope[] scopeArr = C6133e.f48122t0;
                Bundle bundle2 = new Bundle();
                C5682d[] c5682dArr2 = C6133e.f48123u0;
                C5682d[] c5682dArr3 = c5682dArr2;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                boolean z17 = false;
                int i20 = 0;
                boolean z18 = false;
                String str2 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str3 = null;
                while (parcel.dataPosition() < q07) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i17 = U3.f.l0(parcel, readInt6);
                            break;
                        case 2:
                            i18 = U3.f.l0(parcel, readInt6);
                            break;
                        case 3:
                            i19 = U3.f.l0(parcel, readInt6);
                            break;
                        case 4:
                            str2 = U3.f.r(parcel, readInt6);
                            break;
                        case 5:
                            iBinder2 = U3.f.k0(parcel, readInt6);
                            break;
                        case 6:
                            scopeArr = (Scope[]) U3.f.s(parcel, readInt6, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = U3.f.p(parcel, readInt6);
                            break;
                        case '\b':
                            account2 = (Account) U3.f.q(parcel, readInt6, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            U3.f.o0(parcel, readInt6);
                            break;
                        case '\n':
                            c5682dArr2 = (C5682d[]) U3.f.s(parcel, readInt6, C5682d.CREATOR);
                            break;
                        case 11:
                            c5682dArr3 = (C5682d[]) U3.f.s(parcel, readInt6, C5682d.CREATOR);
                            break;
                        case '\f':
                            z17 = U3.f.j0(parcel, readInt6);
                            break;
                        case '\r':
                            i20 = U3.f.l0(parcel, readInt6);
                            break;
                        case 14:
                            z18 = U3.f.j0(parcel, readInt6);
                            break;
                        case 15:
                            str3 = U3.f.r(parcel, readInt6);
                            break;
                    }
                }
                U3.f.w(parcel, q07);
                return new C6133e(i17, i18, i19, str2, iBinder2, scopeArr, bundle2, account2, c5682dArr2, c5682dArr3, z17, i20, z18, str3);
            case 6:
                int q08 = U3.f.q0(parcel);
                int i21 = 0;
                String str4 = null;
                while (parcel.dataPosition() < q08) {
                    int readInt7 = parcel.readInt();
                    char c14 = (char) readInt7;
                    if (c14 != 1) {
                        if (c14 != 2) {
                            if (c14 != 3) {
                                if (c14 != 4) {
                                    U3.f.o0(parcel, readInt7);
                                } else {
                                    str4 = U3.f.r(parcel, readInt7);
                                }
                            } else {
                                pendingIntent = (PendingIntent) U3.f.q(parcel, readInt7, PendingIntent.CREATOR);
                            }
                        } else {
                            i21 = U3.f.l0(parcel, readInt7);
                        }
                    } else {
                        i10 = U3.f.l0(parcel, readInt7);
                    }
                }
                U3.f.w(parcel, q08);
                return new C5680b(i10, i21, pendingIntent, str4);
            case 7:
                int q09 = U3.f.q0(parcel);
                long j6 = -1;
                while (parcel.dataPosition() < q09) {
                    int readInt8 = parcel.readInt();
                    char c15 = (char) readInt8;
                    if (c15 != 1) {
                        if (c15 != 2) {
                            if (c15 != 3) {
                                U3.f.o0(parcel, readInt8);
                            } else {
                                U3.f.s0(parcel, readInt8, 8);
                                j6 = parcel.readLong();
                            }
                        } else {
                            i10 = U3.f.l0(parcel, readInt8);
                        }
                    } else {
                        str = U3.f.r(parcel, readInt8);
                    }
                }
                U3.f.w(parcel, q09);
                return new C5682d(j6, str, i10);
            case 8:
                int q010 = U3.f.q0(parcel);
                int i22 = 0;
                IBinder iBinder3 = null;
                IBinder iBinder4 = null;
                PendingIntent pendingIntent2 = null;
                String str5 = null;
                while (parcel.dataPosition() < q010) {
                    int readInt9 = parcel.readInt();
                    char c16 = (char) readInt9;
                    if (c16 != 1) {
                        if (c16 != 2) {
                            if (c16 != 3) {
                                if (c16 != 4) {
                                    if (c16 != 6) {
                                        U3.f.o0(parcel, readInt9);
                                    } else {
                                        str5 = U3.f.r(parcel, readInt9);
                                    }
                                } else {
                                    pendingIntent2 = (PendingIntent) U3.f.q(parcel, readInt9, PendingIntent.CREATOR);
                                }
                            } else {
                                iBinder4 = U3.f.k0(parcel, readInt9);
                            }
                        } else {
                            iBinder3 = U3.f.k0(parcel, readInt9);
                        }
                    } else {
                        i22 = U3.f.l0(parcel, readInt9);
                    }
                }
                U3.f.w(parcel, q010);
                return new J7.e(i22, iBinder3, iBinder4, pendingIntent2, str5);
            case 9:
                int q011 = U3.f.q0(parcel);
                int i23 = 0;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                ArrayList arrayList = null;
                J7.f fVar = null;
                while (parcel.dataPosition() < q011) {
                    int readInt10 = parcel.readInt();
                    char c17 = (char) readInt10;
                    if (c17 != 1) {
                        if (c17 != 3) {
                            if (c17 != 4) {
                                if (c17 != 6) {
                                    if (c17 != 7) {
                                        if (c17 != '\b') {
                                            U3.f.o0(parcel, readInt10);
                                        } else {
                                            arrayList = U3.f.t(parcel, readInt10, C5682d.CREATOR);
                                        }
                                    } else {
                                        fVar = (J7.f) U3.f.q(parcel, readInt10, J7.f.CREATOR);
                                    }
                                } else {
                                    str8 = U3.f.r(parcel, readInt10);
                                }
                            } else {
                                str7 = U3.f.r(parcel, readInt10);
                            }
                        } else {
                            str6 = U3.f.r(parcel, readInt10);
                        }
                    } else {
                        i23 = U3.f.l0(parcel, readInt10);
                    }
                }
                U3.f.w(parcel, q011);
                return new J7.f(i23, str6, str7, str8, arrayList, fVar);
            case 10:
                int q012 = U3.f.q0(parcel);
                int i24 = 0;
                boolean z19 = false;
                J7.f fVar2 = null;
                long j10 = Long.MAX_VALUE;
                while (parcel.dataPosition() < q012) {
                    int readInt11 = parcel.readInt();
                    char c18 = (char) readInt11;
                    if (c18 != 1) {
                        if (c18 != 2) {
                            if (c18 != 3) {
                                if (c18 != 5) {
                                    U3.f.o0(parcel, readInt11);
                                } else {
                                    fVar2 = (J7.f) U3.f.q(parcel, readInt11, J7.f.CREATOR);
                                }
                            } else {
                                z19 = U3.f.j0(parcel, readInt11);
                            }
                        } else {
                            i24 = U3.f.l0(parcel, readInt11);
                        }
                    } else {
                        U3.f.s0(parcel, readInt11, 8);
                        j10 = parcel.readLong();
                    }
                }
                U3.f.w(parcel, q012);
                return new K7.a(j10, i24, z19, fVar2);
            case 11:
                int q013 = U3.f.q0(parcel);
                int i25 = 0;
                while (parcel.dataPosition() < q013) {
                    int readInt12 = parcel.readInt();
                    char c19 = (char) readInt12;
                    if (c19 != 1) {
                        if (c19 != 2) {
                            if (c19 != 3) {
                                U3.f.o0(parcel, readInt12);
                            } else {
                                intent = (Intent) U3.f.q(parcel, readInt12, Intent.CREATOR);
                            }
                        } else {
                            i25 = U3.f.l0(parcel, readInt12);
                        }
                    } else {
                        i10 = U3.f.l0(parcel, readInt12);
                    }
                }
                U3.f.w(parcel, q013);
                return new M7.b(i10, i25, intent);
            case 12:
                int q014 = U3.f.q0(parcel);
                ArrayList<String> arrayList2 = null;
                String str9 = null;
                while (parcel.dataPosition() < q014) {
                    int readInt13 = parcel.readInt();
                    char c20 = (char) readInt13;
                    if (c20 != 1) {
                        if (c20 != 2) {
                            U3.f.o0(parcel, readInt13);
                        } else {
                            str9 = U3.f.r(parcel, readInt13);
                        }
                    } else {
                        int m04 = U3.f.m0(parcel, readInt13);
                        int dataPosition3 = parcel.dataPosition();
                        if (m04 == 0) {
                            arrayList2 = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition3 + m04);
                            arrayList2 = createStringArrayList;
                        }
                    }
                }
                U3.f.w(parcel, q014);
                return new M7.g(str9, arrayList2);
            case 13:
                int q015 = U3.f.q0(parcel);
                while (parcel.dataPosition() < q015) {
                    int readInt14 = parcel.readInt();
                    char c21 = (char) readInt14;
                    if (c21 != 1) {
                        if (c21 != 2) {
                            U3.f.o0(parcel, readInt14);
                        } else {
                            sVar = (s) U3.f.q(parcel, readInt14, s.CREATOR);
                        }
                    } else {
                        i10 = U3.f.l0(parcel, readInt14);
                    }
                }
                U3.f.w(parcel, q015);
                return new M7.h(i10, sVar);
            case 14:
                int q016 = U3.f.q0(parcel);
                u uVar = null;
                while (parcel.dataPosition() < q016) {
                    int readInt15 = parcel.readInt();
                    char c22 = (char) readInt15;
                    if (c22 != 1) {
                        if (c22 != 2) {
                            if (c22 != 3) {
                                U3.f.o0(parcel, readInt15);
                            } else {
                                uVar = (u) U3.f.q(parcel, readInt15, u.CREATOR);
                            }
                        } else {
                            c5680b = (C5680b) U3.f.q(parcel, readInt15, C5680b.CREATOR);
                        }
                    } else {
                        i10 = U3.f.l0(parcel, readInt15);
                    }
                }
                U3.f.w(parcel, q016);
                return new M7.i(i10, c5680b, uVar);
            case 15:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f18413Y = ((Integer) parcel.readValue(V7.b.class.getClassLoader())).intValue();
                return baseSavedState;
            case 16:
                return new com.google.android.material.datepicker.c((com.google.android.material.datepicker.p) parcel.readParcelable(com.google.android.material.datepicker.p.class.getClassLoader()), (com.google.android.material.datepicker.p) parcel.readParcelable(com.google.android.material.datepicker.p.class.getClassLoader()), (com.google.android.material.datepicker.b) parcel.readParcelable(com.google.android.material.datepicker.b.class.getClassLoader()), (com.google.android.material.datepicker.p) parcel.readParcelable(com.google.android.material.datepicker.p.class.getClassLoader()), parcel.readInt());
            case 17:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 18:
                return com.google.android.material.datepicker.p.a(parcel.readInt(), parcel.readInt());
            case 19:
                return new com.google.android.material.timepicker.g(parcel);
            case 20:
                PendingIntent pendingIntent3 = (PendingIntent) parcel.readParcelable(AbstractC5372a.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    z10 = false;
                }
                return new C5373b(pendingIntent3, z10);
            default:
                AbstractC3557B.c0("parcel", parcel);
                if (parcel.readInt() == 0) {
                    f6 = null;
                } else {
                    f6 = Float.valueOf(parcel.readFloat());
                }
                if (parcel.readInt() == 0) {
                    f10 = null;
                } else {
                    f10 = Float.valueOf(parcel.readFloat());
                }
                if (parcel.readInt() != 0) {
                    f11 = Float.valueOf(parcel.readFloat());
                }
                return new oh.K(f6, f10, f11);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f48199a) {
            case 0:
                return new s[i10];
            case 1:
                return new u[i10];
            case 2:
                return new C6139k[i10];
            case 3:
                return new C6127E[i10];
            case 4:
                return new C6132d[i10];
            case 5:
                return new C6133e[i10];
            case 6:
                return new C5680b[i10];
            case 7:
                return new C5682d[i10];
            case 8:
                return new J7.e[i10];
            case 9:
                return new J7.f[i10];
            case 10:
                return new K7.a[i10];
            case 11:
                return new M7.b[i10];
            case 12:
                return new M7.g[i10];
            case 13:
                return new M7.h[i10];
            case 14:
                return new M7.i[i10];
            case 15:
                return new V7.b[i10];
            case 16:
                return new com.google.android.material.datepicker.c[i10];
            case 17:
                return new com.google.android.material.datepicker.d[i10];
            case 18:
                return new com.google.android.material.datepicker.p[i10];
            case 19:
                return new com.google.android.material.timepicker.g[i10];
            case 20:
                return new AbstractC5372a[i10];
            default:
                return new oh.K[i10];
        }
    }
}
