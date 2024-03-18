package Lg;

import id.AbstractC3557B;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class i implements Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final Pattern f11153Y;

    public i(String str) {
        AbstractC3557B.c0("pattern", str);
        Pattern compile = Pattern.compile(str);
        AbstractC3557B.b0("compile(...)", compile);
        this.f11153Y = compile;
    }

    public final g a(CharSequence charSequence) {
        AbstractC3557B.c0("input", charSequence);
        Matcher matcher = this.f11153Y.matcher(charSequence);
        AbstractC3557B.b0("matcher(...)", matcher);
        if (!matcher.matches()) {
            return null;
        }
        return new g(matcher, charSequence);
    }

    public final boolean b(CharSequence charSequence) {
        AbstractC3557B.c0("input", charSequence);
        return this.f11153Y.matcher(charSequence).matches();
    }

    public final String c(CharSequence charSequence, String str) {
        AbstractC3557B.c0("input", charSequence);
        String replaceAll = this.f11153Y.matcher(charSequence).replaceAll(str);
        AbstractC3557B.b0("replaceAll(...)", replaceAll);
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.f11153Y.toString();
        AbstractC3557B.b0("toString(...)", pattern);
        return pattern;
    }
}
