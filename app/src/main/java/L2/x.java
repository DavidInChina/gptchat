package L2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p2.L;
import p2.M;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f10655c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f10656a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f10657b = -1;

    public final boolean a(String str) {
        Matcher matcher = f10655c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i10 = AbstractC5530A.f45131a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f10656a = parseInt;
                    this.f10657b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(M m10) {
        int i10 = 0;
        while (true) {
            L[] lArr = m10.f41915Y;
            if (i10 < lArr.length) {
                L l10 = lArr[i10];
                if (l10 instanceof Y2.e) {
                    Y2.e eVar = (Y2.e) l10;
                    if ("iTunSMPB".equals(eVar.f22071h0) && a(eVar.f22072i0)) {
                        return;
                    }
                } else if (l10 instanceof Y2.k) {
                    Y2.k kVar = (Y2.k) l10;
                    if ("com.apple.iTunes".equals(kVar.f22083Z) && "iTunSMPB".equals(kVar.f22084h0) && a(kVar.f22085i0)) {
                        return;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
