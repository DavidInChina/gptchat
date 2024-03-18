package lg;

import java.io.OutputStream;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class w extends AbstractC4460e {

    /* renamed from: Z  reason: collision with root package name */
    public final byte[] f38418Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f38419h0 = 0;

    public w(byte[] bArr) {
        this.f38418Z = bArr;
    }

    @Override // lg.AbstractC4460e
    public final int I() {
        return 0;
    }

    @Override // lg.AbstractC4460e
    public final boolean M() {
        return true;
    }

    @Override // lg.AbstractC4460e
    public final boolean T() {
        byte[] bArr = this.f38418Z;
        if (K4.J.P(bArr, 0, bArr.length) != 0) {
            return false;
        }
        return true;
    }

    @Override // lg.AbstractC4460e
    public final int V(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f38418Z[i13];
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4460e) || size() != ((AbstractC4460e) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof w) {
            return v0((w) obj, 0, size());
        }
        if (obj instanceof C4443A) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(R.a.t(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    public final int hashCode() {
        int i10 = this.f38419h0;
        if (i10 == 0) {
            int size = size();
            i10 = V(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f38419h0 = i10;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r0[r9] > (-65)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
        if (r0[r9] > (-65)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0095, code lost:
        if (r0[r8] > (-65)) goto L12;
     */
    @Override // lg.AbstractC4460e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i0(int i10, int i11, int i12) {
        byte b10;
        int i13;
        int i14;
        int i15 = i12 + i11;
        byte[] bArr = this.f38418Z;
        if (i10 != 0) {
            if (i11 < i15) {
                byte b11 = (byte) i10;
                if (b11 < -32) {
                    if (b11 >= -62) {
                        i14 = i11 + 1;
                    }
                    return -1;
                }
                if (b11 < -16) {
                    byte b12 = (byte) (~(i10 >> 8));
                    if (b12 == 0) {
                        int i16 = i11 + 1;
                        byte b13 = bArr[i11];
                        if (i16 >= i15) {
                            return K4.J.E(b11, b13);
                        }
                        i11 = i16;
                        b12 = b13;
                    }
                    if (b12 <= -65 && ((b11 != -32 || b12 >= -96) && (b11 != -19 || b12 < -96))) {
                        i14 = i11 + 1;
                    }
                } else {
                    byte b14 = (byte) (~(i10 >> 8));
                    if (b14 == 0) {
                        i13 = i11 + 1;
                        b14 = bArr[i11];
                        if (i13 >= i15) {
                            return K4.J.E(b11, b14);
                        }
                        b10 = 0;
                    } else {
                        b10 = (byte) (i10 >> 16);
                        i13 = i11;
                    }
                    if (b10 == 0) {
                        int i17 = i13 + 1;
                        byte b15 = bArr[i13];
                        if (i17 >= i15) {
                            if (b11 <= -12 && b14 <= -65 && b15 <= -65) {
                                return (b15 << 16) ^ ((b14 << 8) ^ b11);
                            }
                        } else {
                            b10 = b15;
                            i13 = i17;
                        }
                    }
                    if (b14 <= -65) {
                        if ((((b14 + 112) + (b11 << 28)) >> 30) == 0 && b10 <= -65) {
                            i11 = i13 + 1;
                        }
                    }
                }
                return -1;
            }
            return i10;
        }
        return K4.J.P(bArr, i11, i15);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C4458c(this, 0);
    }

    @Override // lg.AbstractC4460e
    public final int m0() {
        return this.f38419h0;
    }

    @Override // lg.AbstractC4460e
    public final String q0() {
        byte[] bArr = this.f38418Z;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // lg.AbstractC4460e
    public int size() {
        return this.f38418Z.length;
    }

    @Override // lg.AbstractC4460e
    public final void u0(OutputStream outputStream, int i10, int i11) {
        outputStream.write(this.f38418Z, i10, i11);
    }

    public final boolean v0(w wVar, int i10, int i11) {
        byte[] bArr = wVar.f38418Z;
        int length = bArr.length;
        byte[] bArr2 = this.f38418Z;
        if (i11 <= length) {
            int i12 = i10 + i11;
            int length2 = bArr.length;
            byte[] bArr3 = wVar.f38418Z;
            if (i12 <= length2) {
                int i13 = 0;
                while (i13 < i11) {
                    if (bArr2[i13] != bArr3[i10]) {
                        return false;
                    }
                    i13++;
                    i10++;
                }
                return true;
            }
            int length3 = bArr3.length;
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(length3);
            throw new IllegalArgumentException(sb2.toString());
        }
        int length4 = bArr2.length;
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Length too large: ");
        sb3.append(i11);
        sb3.append(length4);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // lg.AbstractC4460e
    public void y(int i10, int i11, int i12, byte[] bArr) {
        System.arraycopy(this.f38418Z, i10, bArr, i11, i12);
    }
}
