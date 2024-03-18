package o3;

import android.gov.nist.core.Separators;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import p2.O;
import s2.AbstractC5530A;
import s2.u;

/* renamed from: o3.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4913i {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) {
        if (str.endsWith(Separators.PERCENT)) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        int i10 = AbstractC5530A.f45131a;
        String[] split = str.split("\\.", 2);
        long j6 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j6 = (j6 * 60) + Long.parseLong(str2);
        }
        long j10 = j6 * 1000;
        if (split.length == 2) {
            j10 += Long.parseLong(split[1]);
        }
        return j10 * 1000;
    }

    public static void c(u uVar) {
        int i10 = uVar.f45194b;
        Charset charset = w8.e.f48221c;
        String h10 = uVar.h(charset);
        if (h10 != null && h10.startsWith("WEBVTT")) {
            return;
        }
        uVar.F(i10);
        throw O.a("Expected WEBVTT. Got " + uVar.h(charset), null);
    }
}
