package Le;

import id.AbstractC3557B;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import r.f;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final CharBuffer f11059a = CharBuffer.allocate(0);

    /* renamed from: b  reason: collision with root package name */
    public static final ByteBuffer f11060b;

    static {
        ByteBuffer allocate = ByteBuffer.allocate(0);
        AbstractC3557B.Z(allocate);
        f11060b = allocate;
    }

    public static final boolean a(CharsetEncoder charsetEncoder, Ne.c cVar) {
        int i10 = cVar.f12023c;
        int i11 = cVar.f12025e - i10;
        ByteBuffer byteBuffer = Ke.c.f9786a;
        ByteBuffer W6 = f.W(cVar.f12021a, i10, i11);
        CoderResult encode = charsetEncoder.encode(f11059a, W6, true);
        if (encode.isMalformed() || encode.isUnmappable()) {
            e(encode);
        }
        boolean isUnderflow = encode.isUnderflow();
        if (W6.limit() == i11) {
            cVar.a(W6.position());
            return isUnderflow;
        }
        throw new IllegalStateException("Buffer's limit change is not allowed".toString());
    }

    public static final int b(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11, Ne.c cVar) {
        AbstractC3557B.c0("input", charSequence);
        CharBuffer wrap = CharBuffer.wrap(charSequence, i10, i11);
        int remaining = wrap.remaining();
        int i12 = cVar.f12023c;
        int i13 = cVar.f12025e - i12;
        ByteBuffer byteBuffer = Ke.c.f9786a;
        ByteBuffer W6 = f.W(cVar.f12021a, i12, i13);
        CoderResult encode = charsetEncoder.encode(wrap, W6, false);
        if (encode.isMalformed() || encode.isUnmappable()) {
            e(encode);
        }
        if (W6.limit() == i13) {
            cVar.a(W6.position());
            return remaining - wrap.remaining();
        }
        throw new IllegalStateException("Buffer's limit change is not allowed".toString());
    }

    public static final byte[] c(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10) {
        AbstractC3557B.c0("input", charSequence);
        if (charSequence instanceof String) {
            if (i10 == charSequence.length()) {
                byte[] bytes = ((String) charSequence).getBytes(charsetEncoder.charset());
                AbstractC3557B.b0("input as java.lang.String).getBytes(charset())", bytes);
                return bytes;
            }
            String substring = ((String) charSequence).substring(0, i10);
            AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
            byte[] bytes2 = substring.getBytes(charsetEncoder.charset());
            AbstractC3557B.b0("input.substring(fromInde\u2026ring).getBytes(charset())", bytes2);
            return bytes2;
        }
        ByteBuffer encode = charsetEncoder.encode(CharBuffer.wrap(charSequence, 0, i10));
        byte[] bArr = null;
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            byte[] array = encode.array();
            if (array.length == encode.remaining()) {
                bArr = array;
            }
        }
        if (bArr == null) {
            byte[] bArr2 = new byte[encode.remaining()];
            encode.get(bArr2);
            return bArr2;
        }
        return bArr;
    }

    public static final String d(Charset charset) {
        AbstractC3557B.c0("<this>", charset);
        String name = charset.name();
        AbstractC3557B.b0("name()", name);
        return name;
    }

    public static final void e(CoderResult coderResult) {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new b(message);
        }
    }
}
