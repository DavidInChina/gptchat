package xe;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;

/* renamed from: xe.L  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6407L {

    /* renamed from: a  reason: collision with root package name */
    public static final List f49849a = AbstractC4344b.F0("");

    public static final int a(int i10, int i11, String str) {
        boolean z10 = false;
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt == '[') {
                z10 = true;
            } else if (charAt == ']') {
                z10 = false;
            } else if (charAt == ':' && !z10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final void b(C6405J c6405j, String str) {
        AbstractC3557B.c0("<this>", c6405j);
        AbstractC3557B.c0("urlString", str);
        if (Lg.n.n2(str)) {
            return;
        }
        try {
            c(c6405j, str);
        } catch (Throwable th2) {
            throw new IllegalStateException("Fail to parse url: ".concat(str), th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(C6405J c6405j, String str) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        List list;
        int i16;
        boolean z10;
        Integer num;
        int i17;
        List list2;
        List list3;
        int i18;
        int i19;
        char c10;
        AbstractC3557B.c0("<this>", c6405j);
        AbstractC3557B.c0("urlString", str);
        int length = str.length();
        int i20 = 0;
        while (true) {
            if (i20 < length) {
                if (!K4.J.I(str.charAt(i20))) {
                    break;
                }
                i20++;
            } else {
                i20 = -1;
                break;
            }
        }
        int length2 = str.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i21 = length2 - 1;
                if (!K4.J.I(str.charAt(length2))) {
                    break;
                } else if (i21 < 0) {
                    break;
                } else {
                    length2 = i21;
                }
            }
        }
        length2 = -1;
        int i22 = length2 + 1;
        char charAt = str.charAt(i20);
        if (('a' <= charAt && charAt < '{') || ('A' <= charAt && charAt < '[')) {
            i10 = -1;
            i11 = i20;
        } else {
            i11 = i20;
            i10 = i11;
        }
        while (i11 < i22) {
            char charAt2 = str.charAt(i11);
            if (charAt2 == ':') {
                if (i10 == -1) {
                    i12 = i11 - i20;
                    if (i12 <= 0) {
                        String substring = str.substring(i20, i20 + i12);
                        AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
                        C6408M c6408m = C6408M.f49850c;
                        c6405j.e(C6431t.j(substring));
                        i13 = 1;
                        i20 += i12 + 1;
                    } else {
                        i13 = 1;
                    }
                    i14 = 0;
                    while (true) {
                        i15 = i20 + i14;
                        if (i15 >= i22 || str.charAt(i15) != '/') {
                            break;
                        }
                        i14 += i13;
                    }
                    if (!AbstractC3557B.K(c6405j.f49839a.f49854a, "file")) {
                        if (i14 != 2) {
                            if (i14 == 3) {
                                c6405j.d("");
                                String substring2 = str.substring(i15, i22);
                                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring2);
                                P4.a.H0(c6405j, Separators.SLASH.concat(substring2));
                                return;
                            }
                            throw new IllegalArgumentException("Invalid file url: ".concat(str));
                        }
                        int k22 = Lg.n.k2(str, '/', i15, false, 4);
                        if (k22 != -1 && k22 != i22) {
                            String substring3 = str.substring(i15, k22);
                            AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring3);
                            c6405j.d(substring3);
                            String substring4 = str.substring(k22, i22);
                            AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring4);
                            P4.a.H0(c6405j, substring4);
                            return;
                        }
                        String substring5 = str.substring(i15, i22);
                        AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring5);
                        c6405j.d(substring5);
                        return;
                    } else if (AbstractC3557B.K(c6405j.f49839a.f49854a, "mailto")) {
                        if (i14 == 0) {
                            int l22 = Lg.n.l2(str, Separators.AT, i15, false, 4);
                            if (l22 != -1) {
                                String substring6 = str.substring(i15, l22);
                                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring6);
                                c6405j.f49843e = AbstractC6412a.f(AbstractC6412a.d(substring6), false);
                                String substring7 = str.substring(l22 + 1, i22);
                                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring7);
                                c6405j.d(substring7);
                                return;
                            }
                            throw new IllegalArgumentException(android.gov.nist.core.a.A("Invalid mailto url: ", str, ", it should contain '@'."));
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    } else {
                        if (i14 >= 2) {
                            while (true) {
                                int m22 = Lg.n.m2(i15, str, false, Df.H.v0("@/\\?#"));
                                Integer valueOf = Integer.valueOf(m22);
                                if (m22 <= 0) {
                                    valueOf = null;
                                }
                                if (valueOf != null) {
                                    i18 = valueOf.intValue();
                                } else {
                                    i18 = i22;
                                }
                                if (i18 >= i22 || str.charAt(i18) != '@') {
                                    break;
                                }
                                int a5 = a(i15, i18, str);
                                if (a5 != -1) {
                                    String substring8 = str.substring(i15, a5);
                                    AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring8);
                                    c6405j.f49843e = substring8;
                                    String substring9 = str.substring(a5 + 1, i18);
                                    AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring9);
                                    c6405j.f49844f = substring9;
                                } else {
                                    String substring10 = str.substring(i15, i18);
                                    AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring10);
                                    c6405j.f49843e = substring10;
                                }
                                i15 = i18 + 1;
                            }
                            int a10 = a(i15, i18, str);
                            Integer valueOf2 = Integer.valueOf(a10);
                            if (a10 <= 0) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                i19 = valueOf2.intValue();
                            } else {
                                i19 = i18;
                            }
                            String substring11 = str.substring(i15, i19);
                            AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring11);
                            c6405j.d(substring11);
                            int i23 = i19 + 1;
                            if (i23 < i18) {
                                String substring12 = str.substring(i23, i18);
                                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring12);
                                c6405j.f49841c = Integer.parseInt(substring12);
                            } else {
                                c6405j.f49841c = 0;
                            }
                            i15 = i18;
                        }
                        List list4 = kf.v.f37483Y;
                        List list5 = f49849a;
                        if (i15 >= i22) {
                            if (str.charAt(length2) == '/') {
                                list4 = list5;
                            }
                            c6405j.c(list4);
                            return;
                        }
                        if (i14 == 0) {
                            list = kf.t.a2(c6405j.f49846h);
                        } else {
                            list = list4;
                        }
                        c6405j.c(list);
                        int m23 = Lg.n.m2(i15, str, false, Df.H.v0("?#"));
                        Integer valueOf3 = Integer.valueOf(m23);
                        if (m23 <= 0) {
                            valueOf3 = null;
                        }
                        if (valueOf3 != null) {
                            i16 = valueOf3.intValue();
                        } else {
                            i16 = i22;
                        }
                        if (i16 > i15) {
                            String substring13 = str.substring(i15, i16);
                            AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring13);
                            if (c6405j.f49846h.size() == 1 && ((CharSequence) kf.t.f2(c6405j.f49846h)).length() == 0) {
                                list2 = list4;
                            } else {
                                list2 = c6405j.f49846h;
                            }
                            if (AbstractC3557B.K(substring13, Separators.SLASH)) {
                                list3 = list5;
                                z10 = true;
                            } else {
                                z10 = true;
                                list3 = Lg.n.F2(substring13, new char[]{'/'});
                            }
                            if (i14 == z10) {
                                list4 = list5;
                            }
                            c6405j.c(kf.t.w2(kf.t.w2(list3, list4), list2));
                            i15 = i16;
                        } else {
                            z10 = true;
                        }
                        if (i15 < i22 && str.charAt(i15) == '?') {
                            int i24 = z10 ? 1 : 0;
                            int i25 = z10 ? 1 : 0;
                            int i26 = z10 ? 1 : 0;
                            int i27 = z10 ? 1 : 0;
                            int i28 = i15 + i24;
                            if (i28 == i22) {
                                c6405j.f49842d = z10;
                                i15 = i22;
                            } else {
                                int k23 = Lg.n.k2(str, '#', i28, false, 4);
                                Integer valueOf4 = Integer.valueOf(k23);
                                if (k23 > 0) {
                                    num = valueOf4;
                                } else {
                                    num = null;
                                }
                                if (num != null) {
                                    i17 = num.intValue();
                                } else {
                                    i17 = i22;
                                }
                                String substring14 = str.substring(i28, i17);
                                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring14);
                                AbstractC4344b.P0(substring14).d(new Jb.c(16, c6405j));
                                i15 = i17;
                            }
                        }
                        if (i15 < i22 && str.charAt(i15) == '#') {
                            String substring15 = str.substring(i15 + 1, i22);
                            AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring15);
                            c6405j.f49845g = substring15;
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalArgumentException(android.gov.nist.core.a.e("Illegal character in scheme at position ", i10));
            } else if (charAt2 == '/' || charAt2 == '?' || charAt2 == '#') {
                break;
            } else {
                if (i10 != -1 || ('a' <= charAt2 && charAt2 < '{')) {
                    c10 = '[';
                } else {
                    c10 = '[';
                    if (('A' > charAt2 || charAt2 >= '[') && (('0' > charAt2 || charAt2 >= ':') && charAt2 != '.' && charAt2 != '+' && charAt2 != '-')) {
                        i10 = i11;
                    }
                }
                i11++;
            }
        }
        i12 = -1;
        if (i12 <= 0) {
        }
        i14 = 0;
        while (true) {
            i15 = i20 + i14;
            if (i15 >= i22) {
                break;
            }
            break;
            i14 += i13;
        }
        if (!AbstractC3557B.K(c6405j.f49839a.f49854a, "file")) {
        }
    }
}
