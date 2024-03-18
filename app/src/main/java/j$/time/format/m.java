package j$.time.format;

import android.gov.nist.core.Separators;
import j$.time.DateTimeException;
import j$.util.Objects;
import livekit.org.webrtc.WebrtcBuildVersion;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class m implements AbstractC3713g {

    /* renamed from: d  reason: collision with root package name */
    static final String[] f35024d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e  reason: collision with root package name */
    static final m f35025e = new m("+HH:MM:ss", "Z");

    /* renamed from: f  reason: collision with root package name */
    static final m f35026f = new m("+HH:MM:ss", WebrtcBuildVersion.maint_version);

    /* renamed from: a  reason: collision with root package name */
    private final String f35027a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35028b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35029c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        int i10 = 0;
        while (true) {
            String[] strArr = f35024d;
            if (i10 >= 22) {
                throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
            } else if (strArr[i10].equals(str)) {
                this.f35028b = i10;
                this.f35029c = i10 % 11;
                this.f35027a = str2;
                return;
            } else {
                i10++;
            }
        }
    }

    private static void a(boolean z10, int i10, StringBuilder sb2) {
        sb2.append(z10 ? ":" : "");
        sb2.append((char) ((i10 / 10) + 48));
        sb2.append((char) ((i10 % 10) + 48));
    }

    private static boolean b(CharSequence charSequence, boolean z10, int i10, int[] iArr) {
        int i11 = iArr[0];
        if (i11 < 0) {
            return true;
        }
        if (z10 && i10 != 1) {
            int i12 = i11 + 1;
            if (i12 > charSequence.length() || charSequence.charAt(i11) != ':') {
                return false;
            }
            i11 = i12;
        }
        int i13 = i11 + 2;
        if (i13 > charSequence.length()) {
            return false;
        }
        int i14 = i11 + 1;
        char charAt = charSequence.charAt(i11);
        char charAt2 = charSequence.charAt(i14);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            int i15 = (charAt2 - '0') + ((charAt - '0') * 10);
            if (i15 >= 0 && i15 <= 59) {
                iArr[i10] = i15;
                iArr[0] = i13;
                return true;
            }
        }
        return false;
    }

    private static void c(CharSequence charSequence, boolean z10, int[] iArr) {
        if (!z10) {
            e(charSequence, 1, 2, iArr);
        } else if (b(charSequence, false, 1, iArr)) {
        } else {
            iArr[0] = ~iArr[0];
        }
    }

    private static void d(CharSequence charSequence, boolean z10, boolean z11, int[] iArr) {
        if (b(charSequence, z10, 2, iArr) || !z11) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        r12[0] = ~r12[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(CharSequence charSequence, int i10, int i11, int[] iArr) {
        int i12;
        char charAt;
        int i13 = iArr[0];
        char[] cArr = new char[i11];
        int i14 = 0;
        int i15 = 0;
        while (i14 < i11 && (i12 = i13 + 1) <= charSequence.length() && (charAt = charSequence.charAt(i13)) >= '0' && charAt <= '9') {
            cArr[i14] = charAt;
            i15++;
            i14++;
            i13 = i12;
        }
        switch (i15) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i13;
    }

    @Override // j$.time.format.AbstractC3713g
    public final boolean g(A a5, StringBuilder sb2) {
        Long e10 = a5.e(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z10 = false;
        if (e10 == null) {
            return false;
        }
        int j6 = j$.com.android.tools.r8.a.j(e10.longValue());
        String str = this.f35027a;
        if (j6 == 0) {
            sb2.append(str);
        } else {
            int abs = Math.abs((j6 / 3600) % 100);
            int abs2 = Math.abs((j6 / 60) % 60);
            int abs3 = Math.abs(j6 % 60);
            int length = sb2.length();
            sb2.append(j6 < 0 ? "-" : "+");
            if (this.f35028b >= 11 && abs < 10) {
                sb2.append((char) (abs + 48));
            } else {
                a(false, abs, sb2);
            }
            int i10 = this.f35029c;
            if ((i10 >= 3 && i10 <= 8) || ((i10 >= 9 && abs3 > 0) || (i10 >= 1 && abs2 > 0))) {
                a(i10 > 0 && i10 % 2 == 0, abs2, sb2);
                abs += abs2;
                if (i10 == 7 || i10 == 8 || (i10 >= 5 && abs3 > 0)) {
                    if (i10 > 0 && i10 % 2 == 0) {
                        z10 = true;
                    }
                    a(z10, abs3, sb2);
                    abs += abs3;
                }
            }
            if (abs == 0) {
                sb2.setLength(length);
                sb2.append(str);
            }
        }
        return true;
    }

    @Override // j$.time.format.AbstractC3713g
    public final int p(y yVar, CharSequence charSequence, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int length = charSequence.length();
        int length2 = this.f35027a.length();
        if (length2 == 0) {
            if (i10 == length) {
                return yVar.o(j$.time.temporal.a.OFFSET_SECONDS, 0L, i10, i10);
            }
        } else if (i10 == length) {
            return ~i10;
        } else {
            if (yVar.s(charSequence, i10, this.f35027a, 0, length2)) {
                return yVar.o(j$.time.temporal.a.OFFSET_SECONDS, 0L, i10, i10 + length2);
            }
        }
        char charAt = charSequence.charAt(i10);
        if (charAt == '+' || charAt == '-') {
            int i15 = charAt == '-' ? -1 : 1;
            int i16 = this.f35029c;
            boolean z10 = i16 > 0 && i16 % 2 == 0;
            int i17 = this.f35028b;
            boolean z11 = i17 < 11;
            int[] iArr = new int[4];
            iArr[0] = i10 + 1;
            if (!yVar.l()) {
                if (z11) {
                    if (z10 || (i17 == 0 && length > (i14 = i10 + 3) && charSequence.charAt(i14) == ':')) {
                        i17 = 10;
                        z10 = true;
                    } else {
                        i17 = 9;
                    }
                } else if (z10 || (i17 == 11 && length > (i13 = i10 + 3) && (charSequence.charAt(i10 + 2) == ':' || charSequence.charAt(i13) == ':'))) {
                    i17 = 21;
                    z10 = true;
                } else {
                    i17 = 20;
                }
            }
            switch (i17) {
                case 0:
                case 11:
                    c(charSequence, z11, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c(charSequence, z11, iArr);
                    d(charSequence, z10, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c(charSequence, z11, iArr);
                    d(charSequence, z10, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    c(charSequence, z11, iArr);
                    d(charSequence, z10, true, iArr);
                    b(charSequence, z10, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    c(charSequence, z11, iArr);
                    d(charSequence, z10, true, iArr);
                    if (!b(charSequence, z10, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                        break;
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    c(charSequence, z11, iArr);
                    if (b(charSequence, z10, 2, iArr)) {
                        b(charSequence, z10, 3, iArr);
                        break;
                    }
                    break;
                case 12:
                    e(charSequence, 1, 4, iArr);
                    break;
                case 14:
                    e(charSequence, 3, 4, iArr);
                    break;
                case 16:
                    e(charSequence, 3, 6, iArr);
                    break;
                case 18:
                    e(charSequence, 5, 6, iArr);
                    break;
                case 20:
                    e(charSequence, 1, 6, iArr);
                    break;
            }
            int i18 = iArr[0];
            if (i18 > 0) {
                int i19 = iArr[1];
                if (i19 > 23 || (i11 = iArr[2]) > 59 || (i12 = iArr[3]) > 59) {
                    throw new DateTimeException("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return yVar.o(j$.time.temporal.a.OFFSET_SECONDS, ((i11 * 60) + (i19 * 3600) + i12) * i15, i10, i18);
            }
        }
        return length2 == 0 ? yVar.o(j$.time.temporal.a.OFFSET_SECONDS, 0L, i10, i10) : ~i10;
    }

    public final String toString() {
        String replace = this.f35027a.replace(Separators.QUOTE, "''");
        String str = f35024d[this.f35028b];
        return "Offset(" + str + ",'" + replace + "')";
    }
}
