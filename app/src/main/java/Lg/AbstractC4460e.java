package lg;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: lg.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4460e implements Iterable {

    /* renamed from: Y  reason: collision with root package name */
    public static final w f38378Y = new w(new byte[0]);

    public static C4459d U() {
        return new C4459d();
    }

    public static AbstractC4460e f(Iterator it, int i10) {
        if (i10 == 1) {
            return (AbstractC4460e) it.next();
        }
        int i11 = i10 >>> 1;
        return f(it, i11).r(f(it, i10 - i11));
    }

    public abstract int I();

    public abstract boolean M();

    public abstract boolean T();

    public abstract int V(int i10, int i11, int i12);

    public abstract int i0(int i10, int i11, int i12);

    public abstract int m0();

    public abstract String q0();

    public final AbstractC4460e r(AbstractC4460e abstractC4460e) {
        C4443A c4443a;
        int size = size();
        int size2 = abstractC4460e.size();
        if (size + size2 < 2147483647L) {
            int[] iArr = C4443A.f38330m0;
            if (this instanceof C4443A) {
                c4443a = (C4443A) this;
            } else {
                c4443a = null;
            }
            if (abstractC4460e.size() == 0) {
                return this;
            }
            if (size() != 0) {
                int size3 = abstractC4460e.size() + size();
                if (size3 < 128) {
                    int size4 = size();
                    int size5 = abstractC4460e.size();
                    byte[] bArr = new byte[size4 + size5];
                    s(0, 0, size4, bArr);
                    abstractC4460e.s(0, size4, size5, bArr);
                    return new w(bArr);
                }
                if (c4443a != null) {
                    AbstractC4460e abstractC4460e2 = c4443a.f38333i0;
                    if (abstractC4460e.size() + abstractC4460e2.size() < 128) {
                        int size6 = abstractC4460e2.size();
                        int size7 = abstractC4460e.size();
                        byte[] bArr2 = new byte[size6 + size7];
                        abstractC4460e2.s(0, 0, size6, bArr2);
                        abstractC4460e.s(0, size6, size7, bArr2);
                        return new C4443A(c4443a.f38332h0, new w(bArr2));
                    }
                }
                if (c4443a != null) {
                    AbstractC4460e abstractC4460e3 = c4443a.f38332h0;
                    int I10 = abstractC4460e3.I();
                    AbstractC4460e abstractC4460e4 = c4443a.f38333i0;
                    if (I10 > abstractC4460e4.I()) {
                        if (c4443a.f38335k0 > abstractC4460e.I()) {
                            return new C4443A(abstractC4460e3, new C4443A(abstractC4460e4, abstractC4460e));
                        }
                    }
                }
                if (size3 >= C4443A.f38330m0[Math.max(I(), abstractC4460e.I()) + 1]) {
                    return new C4443A(this, abstractC4460e);
                }
                y7.b bVar = new y7.b();
                bVar.j(this);
                bVar.j(abstractC4460e);
                AbstractC4460e abstractC4460e5 = (AbstractC4460e) ((Stack) bVar.f50831Z).pop();
                while (!((Stack) bVar.f50831Z).isEmpty()) {
                    abstractC4460e5 = new C4443A((AbstractC4460e) ((Stack) bVar.f50831Z).pop(), abstractC4460e5);
                }
                return abstractC4460e5;
            }
            return abstractC4460e;
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final String r0() {
        try {
            return q0();
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public final void s(int i10, int i11, int i12, byte[] bArr) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                if (i12 >= 0) {
                    int i13 = i10 + i12;
                    if (i13 <= size()) {
                        int i14 = i11 + i12;
                        if (i14 <= bArr.length) {
                            if (i12 > 0) {
                                y(i10, i11, i12, bArr);
                                return;
                            }
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder(34);
                        sb2.append("Target end offset < 0: ");
                        sb2.append(i14);
                        throw new IndexOutOfBoundsException(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder(34);
                    sb3.append("Source end offset < 0: ");
                    sb3.append(i13);
                    throw new IndexOutOfBoundsException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder(23);
                sb4.append("Length < 0: ");
                sb4.append(i12);
                throw new IndexOutOfBoundsException(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder(30);
            sb5.append("Target offset < 0: ");
            sb5.append(i11);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        StringBuilder sb6 = new StringBuilder(30);
        sb6.append("Source offset < 0: ");
        sb6.append(i10);
        throw new IndexOutOfBoundsException(sb6.toString());
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract void u0(OutputStream outputStream, int i10, int i11);

    public abstract void y(int i10, int i11, int i12, byte[] bArr);
}
