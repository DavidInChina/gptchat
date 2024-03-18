package Ee;

import Lg.n;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4694a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f4695b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f4696c;

    public a(Charset charset) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        AbstractC3557B.c0("charset", charset);
        Charset charset2 = Lg.a.f11131a;
        if (AbstractC3557B.K(charset, charset2)) {
            bArr = n.b2("[");
        } else {
            CharsetEncoder newEncoder = charset.newEncoder();
            AbstractC3557B.b0("charset.newEncoder()", newEncoder);
            bArr = Le.a.c(newEncoder, "[", 1);
        }
        this.f4694a = bArr;
        if (AbstractC3557B.K(charset, charset2)) {
            bArr2 = n.b2("]");
        } else {
            CharsetEncoder newEncoder2 = charset.newEncoder();
            AbstractC3557B.b0("charset.newEncoder()", newEncoder2);
            bArr2 = Le.a.c(newEncoder2, "]", 1);
        }
        this.f4695b = bArr2;
        if (AbstractC3557B.K(charset, charset2)) {
            bArr3 = n.b2(Separators.COMMA);
        } else {
            CharsetEncoder newEncoder3 = charset.newEncoder();
            AbstractC3557B.b0("charset.newEncoder()", newEncoder3);
            bArr3 = Le.a.c(newEncoder3, Separators.COMMA, 1);
        }
        this.f4696c = bArr3;
    }
}
