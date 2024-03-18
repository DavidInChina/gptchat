package o3;

import java.util.regex.Pattern;
import s2.u;

/* renamed from: o3.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4905a {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f40525c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f40526d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a  reason: collision with root package name */
    public final u f40527a = new u();

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f40528b = new StringBuilder();

    public static String a(u uVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = uVar.f45194b;
        int i11 = uVar.f45195c;
        while (i10 < i11 && !z10) {
            char c10 = (char) uVar.f45193a[i10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && ((c10 < '0' || c10 > '9') && c10 != '#' && c10 != '-' && c10 != '.' && c10 != '_'))) {
                z10 = true;
            } else {
                i10++;
                sb2.append(c10);
            }
        }
        uVar.G(i10 - uVar.f45194b);
        return sb2.toString();
    }

    public static String b(u uVar, StringBuilder sb2) {
        c(uVar);
        if (uVar.a() == 0) {
            return null;
        }
        String a5 = a(uVar, sb2);
        if (!"".equals(a5)) {
            return a5;
        }
        return "" + ((char) uVar.u());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
        r1 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
        if (r1 >= r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
        if (((char) r2[r5]) != '*') goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
        if (((char) r2[r1]) != '/') goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
        r5 = r5 + 2;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
        r8.G(r4 - r8.f45194b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(u uVar) {
        while (true) {
            for (boolean z10 = true; uVar.a() > 0 && z10; z10 = false) {
                int i10 = uVar.f45194b;
                byte[] bArr = uVar.f45193a;
                byte b10 = bArr[i10];
                char c10 = (char) b10;
                if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                    int i11 = uVar.f45195c;
                    int i12 = i10 + 2;
                    if (i12 <= i11) {
                        int i13 = i10 + 1;
                        if (b10 == 47 && bArr[i13] == 42) {
                            break;
                        }
                    }
                } else {
                    uVar.G(1);
                }
            }
            return;
        }
    }
}
