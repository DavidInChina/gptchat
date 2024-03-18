package Lg;

import id.AbstractC3557B;
import java.util.List;
import java.util.regex.Matcher;
import kf.C4270F;

/* loaded from: classes2.dex */
public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Matcher f11148a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f11149b;

    /* renamed from: c  reason: collision with root package name */
    public final f f11150c = new f(this);

    /* renamed from: d  reason: collision with root package name */
    public C4270F f11151d;

    public g(Matcher matcher, CharSequence charSequence) {
        AbstractC3557B.c0("input", charSequence);
        this.f11148a = matcher;
        this.f11149b = charSequence;
    }

    public final List a() {
        if (this.f11151d == null) {
            this.f11151d = new C4270F(this);
        }
        C4270F c4270f = this.f11151d;
        AbstractC3557B.Z(c4270f);
        return c4270f;
    }

    public final g b() {
        int i10;
        Matcher matcher = this.f11148a;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = end + i10;
        CharSequence charSequence = this.f11149b;
        if (i11 > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        AbstractC3557B.b0("matcher(...)", matcher2);
        if (!matcher2.find(i11)) {
            return null;
        }
        return new g(matcher2, charSequence);
    }
}
