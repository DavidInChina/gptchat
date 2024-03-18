package ze;

import Lg.n;
import Lg.o;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import l8.AbstractC4344b;
import xe.C6398C;
import xe.C6417f;

/* loaded from: classes.dex */
public final class l extends AbstractC6844c {

    /* renamed from: a  reason: collision with root package name */
    public final String f52013a;

    /* renamed from: b  reason: collision with root package name */
    public final C6417f f52014b;

    /* renamed from: c  reason: collision with root package name */
    public final C6398C f52015c = null;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f52016d;

    public l(String str, C6417f c6417f) {
        byte[] bArr;
        AbstractC3557B.c0(ParameterNames.TEXT, str);
        AbstractC3557B.c0("contentType", c6417f);
        this.f52013a = str;
        this.f52014b = c6417f;
        Charset S = AbstractC4344b.S(c6417f);
        S = S == null ? Lg.a.f11131a : S;
        if (AbstractC3557B.K(S, Lg.a.f11131a)) {
            bArr = n.b2(str);
        } else {
            CharsetEncoder newEncoder = S.newEncoder();
            AbstractC3557B.b0("charset.newEncoder()", newEncoder);
            bArr = Le.a.c(newEncoder, str, str.length());
        }
        this.f52016d = bArr;
    }

    @Override // ze.AbstractC6848g
    public final Long a() {
        return Long.valueOf(this.f52016d.length);
    }

    @Override // ze.AbstractC6848g
    public final C6417f b() {
        return this.f52014b;
    }

    @Override // ze.AbstractC6848g
    public final C6398C d() {
        return this.f52015c;
    }

    @Override // ze.AbstractC6844c
    public final byte[] e() {
        return this.f52016d;
    }

    public final String toString() {
        return "TextContent[" + this.f52014b + "] \"" + o.Z2(30, this.f52013a) + '\"';
    }
}
