package fh;

import id.AbstractC3557B;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kf.C4288m;

/* renamed from: fh.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3084k {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f30878a;

    /* renamed from: b  reason: collision with root package name */
    public final CharsetDecoder f30879b;

    /* renamed from: c  reason: collision with root package name */
    public final ByteBuffer f30880c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f30881d;

    /* renamed from: e  reason: collision with root package name */
    public char f30882e;

    public C3084k(io.ktor.utils.io.jvm.javaio.i iVar, Charset charset) {
        byte[] bArr;
        Object obj;
        AbstractC3557B.c0("charset", charset);
        this.f30878a = iVar;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        AbstractC3557B.b0("onUnmappableCharacter(...)", onUnmappableCharacter);
        this.f30879b = onUnmappableCharacter;
        C3080g c3080g = C3080g.f30872c;
        synchronized (c3080g) {
            C4288m c4288m = c3080g.f30873a;
            bArr = null;
            if (c4288m.isEmpty()) {
                obj = null;
            } else {
                obj = c4288m.removeLast();
            }
            byte[] bArr2 = (byte[]) obj;
            if (bArr2 != null) {
                c3080g.f30874b -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr == null ? new byte[8196] : bArr);
        AbstractC3557B.b0("wrap(...)", wrap);
        this.f30880c = wrap;
        wrap.flip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
        if (r11 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e7, code lost:
        r12.reset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ee, code lost:
        if (r4.position() != 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f1, code lost:
        r3 = r4.position();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f6, code lost:
        return r3 + r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(char[] cArr, int i10, int i11) {
        int i12;
        int i13;
        char c10;
        if (i11 == 0) {
            return 0;
        }
        if (i10 >= 0 && i10 < cArr.length && i11 >= 0 && i10 + i11 <= cArr.length) {
            if (this.f30881d) {
                cArr[i10] = this.f30882e;
                i10++;
                i11--;
                this.f30881d = false;
                if (i11 == 0) {
                    return 1;
                }
                i12 = 1;
            } else {
                i12 = 0;
            }
            int i14 = -1;
            if (i11 == 1) {
                if (this.f30881d) {
                    this.f30881d = false;
                    c10 = this.f30882e;
                } else {
                    char[] cArr2 = new char[2];
                    int a5 = a(cArr2, 0, 2);
                    if (a5 != -1) {
                        if (a5 != 1) {
                            if (a5 == 2) {
                                this.f30882e = cArr2[1];
                                this.f30881d = true;
                                c10 = cArr2[0];
                            } else {
                                throw new IllegalStateException(("Unreachable state: " + a5).toString());
                            }
                        } else {
                            c10 = cArr2[0];
                        }
                    } else {
                        c10 = '\uffff';
                    }
                }
                if (c10 == '\uffff') {
                    if (i12 == 0) {
                        return -1;
                    }
                    return i12;
                }
                cArr[i10] = c10;
                return i12 + 1;
            }
            CharBuffer wrap = CharBuffer.wrap(cArr, i10, i11);
            if (wrap.position() != 0) {
                wrap = wrap.slice();
            }
            CharBuffer charBuffer = wrap;
            boolean z10 = false;
            while (true) {
                CharsetDecoder charsetDecoder = this.f30879b;
                ByteBuffer byteBuffer = this.f30880c;
                CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z10);
                if (decode.isUnderflow()) {
                    if (z10 || !charBuffer.hasRemaining()) {
                        break;
                    }
                    byteBuffer.compact();
                    try {
                        int limit = byteBuffer.limit();
                        int position = byteBuffer.position();
                        if (position <= limit) {
                            i13 = limit - position;
                        } else {
                            i13 = 0;
                        }
                        int read = this.f30878a.read(byteBuffer.array(), byteBuffer.arrayOffset() + position, i13);
                        if (read >= 0) {
                            byteBuffer.position(position + read);
                            byteBuffer.flip();
                            read = byteBuffer.remaining();
                        }
                        if (read < 0) {
                            if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                                break;
                            }
                            charsetDecoder.reset();
                            z10 = true;
                        } else {
                            continue;
                        }
                    } finally {
                        byteBuffer.flip();
                    }
                } else if (decode.isOverflow()) {
                    charBuffer.position();
                    break;
                } else {
                    decode.throwException();
                }
            }
        } else {
            StringBuilder A10 = E9.f.A("Unexpected arguments: ", i10, ", ", i11, ", ");
            A10.append(cArr.length);
            throw new IllegalArgumentException(A10.toString().toString());
        }
    }
}
