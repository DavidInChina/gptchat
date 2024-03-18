package di;

import android.gov.nist.javax.sip.parser.TokenNames;
import id.AbstractC3557B;
import ji.C4138m;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final C4138m f28579a = ei.l.g("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f28580b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f28581c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f28582d;

    static {
        C4138m c4138m = C4138m.f36722i0;
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            AbstractC3557B.b0("toBinaryString(it)", binaryString);
            strArr[i10] = Lg.n.z2(Xh.b.i("%8s", binaryString), ' ', '0');
        }
        f28582d = strArr;
        String[] strArr2 = f28581c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = R.a.t(new StringBuilder(), strArr2[i11], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f28581c;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i14]);
            sb2.append('|');
            strArr3[i15 | 8] = R.a.t(sb2, strArr3[i13], "|PADDED");
        }
        int length = f28581c.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f28581c;
            if (strArr4[i16] == null) {
                strArr4[i16] = f28582d[i16];
            }
        }
    }

    public static String a(int i10, int i11, int i12, int i13, boolean z10) {
        String str;
        String str2;
        String str3;
        String str4;
        String[] strArr = f28580b;
        if (i12 < strArr.length) {
            str = strArr[i12];
        } else {
            str = Xh.b.i("0x%02x", Integer.valueOf(i12));
        }
        if (i13 == 0) {
            str2 = "";
        } else {
            String[] strArr2 = f28582d;
            if (i12 != 2 && i12 != 3) {
                if (i12 != 4 && i12 != 6) {
                    if (i12 != 7 && i12 != 8) {
                        String[] strArr3 = f28581c;
                        if (i13 < strArr3.length) {
                            str4 = strArr3[i13];
                            AbstractC3557B.Z(str4);
                        } else {
                            str4 = strArr2[i13];
                        }
                        if (i12 == 5 && (i13 & 4) != 0) {
                            str2 = Lg.n.A2(str4, "HEADERS", "PUSH_PROMISE");
                        } else if (i12 == 0 && (i13 & 32) != 0) {
                            str2 = Lg.n.A2(str4, "PRIORITY", "COMPRESSED");
                        } else {
                            str2 = str4;
                        }
                    }
                } else if (i13 == 1) {
                    str2 = TokenNames.ACK;
                } else {
                    str2 = strArr2[i13];
                }
            }
            str2 = strArr2[i13];
        }
        if (z10) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        return Xh.b.i("%s 0x%08x %5d %-13s %s", str3, Integer.valueOf(i10), Integer.valueOf(i11), str, str2);
    }
}
