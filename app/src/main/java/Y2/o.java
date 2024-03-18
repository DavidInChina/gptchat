package Y2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p2.J;
import s2.AbstractC5530A;
import x8.N;
import x8.k0;

/* loaded from: classes2.dex */
public final class o extends j {
    public static final Parcelable.Creator<o> CREATOR = new n(0);

    /* renamed from: Z  reason: collision with root package name */
    public final String f22094Z;

    /* renamed from: h0  reason: collision with root package name */
    public final N f22095h0;

    public o(String str, String str2, k0 k0Var) {
        super(str);
        Gi.e.l(!k0Var.isEmpty());
        this.f22094Z = str2;
        N V10 = N.V(k0Var);
        this.f22095h0 = V10;
        String str3 = (String) V10.get(0);
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // Y2.j, p2.L
    public final void d(J j6) {
        Integer num;
        String str = this.f22082Y;
        str.getClass();
        char c10 = '\uffff';
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                break;
        }
        N n10 = this.f22095h0;
        try {
            switch (c10) {
                case 0:
                case '\n':
                    j6.c((CharSequence) n10.get(0));
                    return;
                case 1:
                case 11:
                    j6.e((CharSequence) n10.get(0));
                    return;
                case 2:
                case '\f':
                    String str2 = (String) n10.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    j6.h(Integer.valueOf(parseInt));
                    j6.g(Integer.valueOf(parseInt2));
                    return;
                case 3:
                case 17:
                    j6.d((CharSequence) n10.get(0));
                    return;
                case 4:
                case 18:
                    j6.b((CharSequence) n10.get(0));
                    return;
                case 5:
                case 19:
                    j6.f((CharSequence) n10.get(0));
                    return;
                case 6:
                case 20:
                    String[] K10 = AbstractC5530A.K((String) n10.get(0));
                    int parseInt3 = Integer.parseInt(K10[0]);
                    if (K10.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(K10[1]));
                    } else {
                        num = null;
                    }
                    j6.o(Integer.valueOf(parseInt3));
                    j6.n(num);
                    return;
                case 7:
                case 16:
                    j6.m((CharSequence) n10.get(0));
                    return;
                case '\b':
                case 15:
                    j6.p((CharSequence) n10.get(0));
                    return;
                case '\t':
                case 21:
                    j6.i(Integer.valueOf(Integer.parseInt((String) n10.get(0))));
                    return;
                case '\r':
                    ArrayList a5 = a((String) n10.get(0));
                    int size = a5.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                j6.g((Integer) a5.get(2));
                            } else {
                                return;
                            }
                        }
                        j6.h((Integer) a5.get(1));
                    }
                    j6.i((Integer) a5.get(0));
                    return;
                case 14:
                    ArrayList a10 = a((String) n10.get(0));
                    int size2 = a10.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                j6.j((Integer) a10.get(2));
                            } else {
                                return;
                            }
                        }
                        j6.k((Integer) a10.get(1));
                    }
                    j6.l((Integer) a10.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (AbstractC5530A.a(this.f22082Y, oVar.f22082Y) && AbstractC5530A.a(this.f22094Z, oVar.f22094Z) && this.f22095h0.equals(oVar.f22095h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f22082Y, 527, 31);
        String str = this.f22094Z;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return this.f22095h0.hashCode() + ((v10 + i10) * 31);
    }

    @Override // Y2.j
    public final String toString() {
        return this.f22082Y + ": description=" + this.f22094Z + ": values=" + this.f22095h0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22082Y);
        parcel.writeString(this.f22094Z);
        parcel.writeStringArray((String[]) this.f22095h0.toArray(new String[0]));
    }
}
