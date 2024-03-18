package k3;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.text.TextUtils;
import l8.AbstractC4344b;

/* renamed from: k3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4156a {

    /* renamed from: a  reason: collision with root package name */
    public int f36961a;

    /* renamed from: b  reason: collision with root package name */
    public int f36962b;

    /* renamed from: c  reason: collision with root package name */
    public int f36963c;

    /* renamed from: d  reason: collision with root package name */
    public int f36964d;

    /* renamed from: e  reason: collision with root package name */
    public int f36965e;

    public C4156a(int i10, int i11, int i12, int i13, int i14) {
        this.f36961a = i10;
        this.f36962b = i11;
        this.f36963c = i12;
        this.f36964d = i13;
        this.f36965e = i14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C4156a b(String str) {
        char c10;
        Gi.e.l(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), Separators.COMMA);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String k12 = AbstractC4344b.k1(split[i14].trim());
            k12.getClass();
            switch (k12.hashCode()) {
                case 100571:
                    if (k12.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    c10 = '\uffff';
                    break;
                case 3556653:
                    if (k12.equals(ParameterNames.TEXT)) {
                        c10 = 1;
                        break;
                    }
                    c10 = '\uffff';
                    break;
                case 109757538:
                    if (k12.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    c10 = '\uffff';
                    break;
                case 109780401:
                    if (k12.equals("style")) {
                        c10 = 3;
                        break;
                    }
                    c10 = '\uffff';
                    break;
                default:
                    c10 = '\uffff';
                    break;
            }
            switch (c10) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i13 = i14;
                    break;
                case 2:
                    i10 = i14;
                    break;
                case 3:
                    i12 = i14;
                    break;
            }
        }
        if (i10 != -1 && i11 != -1 && i13 != -1) {
            return new C4156a(i10, i11, i12, i13, split.length);
        }
        return null;
    }

    public boolean a() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f36961a;
        int i14 = 2;
        if ((i13 & 7) != 0) {
            int i15 = this.f36964d;
            int i16 = this.f36962b;
            if (i15 > i16) {
                i12 = 1;
            } else if (i15 == i16) {
                i12 = 2;
            } else {
                i12 = 4;
            }
            if ((i12 & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 112) != 0) {
            int i17 = this.f36964d;
            int i18 = this.f36963c;
            if (i17 > i18) {
                i11 = 1;
            } else if (i17 == i18) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            if (((i11 << 4) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 1792) != 0) {
            int i19 = this.f36965e;
            int i20 = this.f36962b;
            if (i19 > i20) {
                i10 = 1;
            } else if (i19 == i20) {
                i10 = 2;
            } else {
                i10 = 4;
            }
            if (((i10 << 8) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 28672) != 0) {
            int i21 = this.f36965e;
            int i22 = this.f36963c;
            if (i21 > i22) {
                i14 = 1;
            } else if (i21 != i22) {
                i14 = 4;
            }
            if ((i13 & (i14 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    public C4156a() {
        this.f36961a = 0;
    }
}
