package j$.time.format;

import android.gov.nist.core.Separators;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class j implements AbstractC3713g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35013a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f35014b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f35013a = i10;
        this.f35014b = obj;
    }

    private static void a(StringBuilder sb2, int i10) {
        sb2.append((char) ((i10 / 10) + 48));
        sb2.append((char) ((i10 % 10) + 48));
    }

    static int b(CharSequence charSequence, int i10) {
        char charAt = charSequence.charAt(i10);
        if (charAt < '0' || charAt > '9') {
            return -1;
        }
        return charAt - '0';
    }

    @Override // j$.time.format.AbstractC3713g
    public final boolean g(A a5, StringBuilder sb2) {
        int i10 = this.f35013a;
        Object obj = this.f35014b;
        switch (i10) {
            case 0:
                Long e10 = a5.e(j$.time.temporal.a.OFFSET_SECONDS);
                if (e10 == null) {
                    return false;
                }
                sb2.append("GMT");
                int j6 = j$.com.android.tools.r8.a.j(e10.longValue());
                if (j6 == 0) {
                    return true;
                }
                int abs = Math.abs((j6 / 3600) % 100);
                int abs2 = Math.abs((j6 / 60) % 60);
                int abs3 = Math.abs(j6 % 60);
                sb2.append(j6 < 0 ? "-" : "+");
                if (((H) obj) == H.FULL) {
                    a(sb2, abs);
                    sb2.append(':');
                    a(sb2, abs2);
                    if (abs3 == 0) {
                        return true;
                    }
                } else {
                    if (abs >= 10) {
                        sb2.append((char) ((abs / 10) + 48));
                    }
                    sb2.append((char) ((abs % 10) + 48));
                    if (abs2 == 0 && abs3 == 0) {
                        return true;
                    }
                    sb2.append(':');
                    a(sb2, abs2);
                    if (abs3 == 0) {
                        return true;
                    }
                }
                sb2.append(':');
                a(sb2, abs3);
                return true;
            default:
                sb2.append((String) obj);
                return true;
        }
    }

    @Override // j$.time.format.AbstractC3713g
    public final int p(y yVar, CharSequence charSequence, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f35013a;
        Object obj = this.f35014b;
        switch (i17) {
            case 0:
                int length = charSequence.length();
                if (yVar.s(charSequence, i10, "GMT", 0, 3)) {
                    int i18 = i10 + 3;
                    if (i18 != length) {
                        char charAt = charSequence.charAt(i18);
                        if (charAt == '+') {
                            i11 = 1;
                        } else if (charAt == '-') {
                            i11 = -1;
                        }
                        int i19 = i10 + 4;
                        int i20 = 0;
                        if (((H) obj) == H.FULL) {
                            int b10 = b(charSequence, i19);
                            int i21 = i10 + 6;
                            int b11 = b(charSequence, i10 + 5);
                            if (b10 >= 0 && b11 >= 0) {
                                int i22 = i10 + 7;
                                if (charSequence.charAt(i21) == ':') {
                                    i14 = (b10 * 10) + b11;
                                    int b12 = b(charSequence, i22);
                                    i16 = i10 + 9;
                                    int b13 = b(charSequence, i10 + 8);
                                    if (b12 >= 0 && b13 >= 0) {
                                        i15 = (b12 * 10) + b13;
                                        int i23 = i10 + 11;
                                        if (i23 < length && charSequence.charAt(i16) == ':') {
                                            int b14 = b(charSequence, i10 + 10);
                                            int b15 = b(charSequence, i23);
                                            if (b14 >= 0 && b15 >= 0) {
                                                i20 = (b14 * 10) + b15;
                                                i16 = i10 + 12;
                                            }
                                        }
                                        i12 = i20;
                                        i13 = i16;
                                    }
                                }
                            }
                        } else {
                            int i24 = i10 + 5;
                            i14 = b(charSequence, i19);
                            if (i14 >= 0) {
                                if (i24 < length) {
                                    int b16 = b(charSequence, i24);
                                    if (b16 >= 0) {
                                        i14 = (i14 * 10) + b16;
                                        i24 = i10 + 6;
                                    }
                                    int i25 = i24 + 2;
                                    if (i25 < length && charSequence.charAt(i24) == ':' && i25 < length && charSequence.charAt(i24) == ':') {
                                        int b17 = b(charSequence, i24 + 1);
                                        int b18 = b(charSequence, i25);
                                        if (b17 >= 0 && b18 >= 0) {
                                            i15 = (b17 * 10) + b18;
                                            int i26 = i24 + 3;
                                            int i27 = i24 + 5;
                                            if (i27 < length && charSequence.charAt(i26) == ':') {
                                                int b19 = b(charSequence, i24 + 4);
                                                int b20 = b(charSequence, i27);
                                                if (b19 >= 0 && b20 >= 0) {
                                                    i20 = (b19 * 10) + b20;
                                                    i16 = i24 + 6;
                                                    i12 = i20;
                                                    i13 = i16;
                                                }
                                            }
                                            i13 = i26;
                                            i12 = 0;
                                        }
                                    }
                                }
                                i12 = 0;
                                i13 = i24;
                                return yVar.o(j$.time.temporal.a.OFFSET_SECONDS, ((i20 * 60) + (i14 * 3600) + i12) * i11, i10, i13);
                            }
                        }
                        i20 = i15;
                        return yVar.o(j$.time.temporal.a.OFFSET_SECONDS, ((i20 * 60) + (i14 * 3600) + i12) * i11, i10, i13);
                    }
                    return yVar.o(j$.time.temporal.a.OFFSET_SECONDS, 0L, i10, i18);
                }
                return ~i10;
            default:
                if (i10 > charSequence.length() || i10 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                String str = (String) obj;
                return !yVar.s(charSequence, i10, str, 0, str.length()) ? ~i10 : str.length() + i10;
        }
    }

    public final String toString() {
        int i10 = this.f35013a;
        Object obj = this.f35014b;
        switch (i10) {
            case 0:
                return "LocalizedOffset(" + ((H) obj) + Separators.RPAREN;
            default:
                String replace = ((String) obj).replace(Separators.QUOTE, "''");
                return Separators.QUOTE + replace + Separators.QUOTE;
        }
    }
}
