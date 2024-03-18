package Lg;

import id.AbstractC3557B;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f11131a;

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f11132b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile Charset f11133c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile Charset f11134d;

    static {
        Charset forName = Charset.forName("UTF-8");
        AbstractC3557B.b0("forName(...)", forName);
        f11131a = forName;
        AbstractC3557B.b0("forName(...)", Charset.forName("UTF-16"));
        AbstractC3557B.b0("forName(...)", Charset.forName("UTF-16BE"));
        AbstractC3557B.b0("forName(...)", Charset.forName("UTF-16LE"));
        AbstractC3557B.b0("forName(...)", Charset.forName("US-ASCII"));
        Charset forName2 = Charset.forName("ISO-8859-1");
        AbstractC3557B.b0("forName(...)", forName2);
        f11132b = forName2;
    }
}
