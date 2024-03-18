package k3;

import android.gov.nist.core.Separators;
import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s2.AbstractC5530A;
import s2.p;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f36985b;

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f36986c;

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f36984a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f36987d = Pattern.compile("\\\\an(\\d+)");

    static {
        int i10 = AbstractC5530A.f45131a;
        Locale locale = Locale.US;
        f36985b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f36986c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    }

    public static PointF a(String str) {
        String str2;
        String str3;
        Matcher matcher = f36985b.matcher(str);
        Matcher matcher2 = f36986c.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                p.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + Separators.QUOTE);
            }
            str2 = matcher.group(1);
            str3 = matcher.group(2);
        } else if (find2) {
            str2 = matcher2.group(1);
            str3 = matcher2.group(2);
        } else {
            return null;
        }
        str2.getClass();
        float parseFloat = Float.parseFloat(str2.trim());
        str3.getClass();
        return new PointF(parseFloat, Float.parseFloat(str3.trim()));
    }
}
