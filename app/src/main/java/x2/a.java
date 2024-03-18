package X2;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.AbstractC4344b;
import p2.M;
import r.f;
import w8.e;

/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f21765h = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: f  reason: collision with root package name */
    public final CharsetDecoder f21766f = e.f48221c.newDecoder();

    /* renamed from: g  reason: collision with root package name */
    public final CharsetDecoder f21767g = e.f48220b.newDecoder();

    @Override // r.f
    public final M u(T2.a aVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f21767g;
        charsetDecoder = this.f21766f;
        String str2 = null;
        try {
            str = charsetDecoder.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th2) {
                throw th2;
            }
        } finally {
            charsetDecoder.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new M(new c(null, null, bArr));
        }
        Matcher matcher = f21765h.matcher(str);
        String str3 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String k12 = AbstractC4344b.k1(group);
                k12.getClass();
                if (!k12.equals("streamurl")) {
                    if (k12.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new M(new c(str2, str3, bArr));
    }
}
