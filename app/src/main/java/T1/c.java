package T1;

import android.gov.nist.core.Separators;
import io.sentry.android.core.AbstractC3612c;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f16840a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16841b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16842c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f16843d;

    public c(byte[] bArr, int i10, int i11) {
        this(-1L, bArr, i10, i11);
    }

    public static c a(long j6, ByteOrder byteOrder) {
        long[] jArr = {j6};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f16852C[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(wrap.array(), 4, 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        e[] eVarArr = {eVar};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f16852C[5]]);
        wrap.order(byteOrder);
        e eVar2 = eVarArr[0];
        wrap.putInt((int) eVar2.f16848a);
        wrap.putInt((int) eVar2.f16849b);
        return new c(wrap.array(), 5, 1);
    }

    public static c c(int i10, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f16852C[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i10}[0]);
        return new c(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Serializable g10 = g(byteOrder);
        if (g10 != null) {
            if (g10 instanceof String) {
                return Double.parseDouble((String) g10);
            }
            if (g10 instanceof long[]) {
                long[] jArr = (long[]) g10;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g10 instanceof int[]) {
                int[] iArr = (int[]) g10;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g10 instanceof double[]) {
                double[] dArr = (double[]) g10;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g10 instanceof e[]) {
                e[] eVarArr = (e[]) g10;
                if (eVarArr.length == 1) {
                    e eVar = eVarArr[0];
                    return eVar.f16848a / eVar.f16849b;
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int e(ByteOrder byteOrder) {
        Serializable g10 = g(byteOrder);
        if (g10 != null) {
            if (g10 instanceof String) {
                return Integer.parseInt((String) g10);
            }
            if (g10 instanceof long[]) {
                long[] jArr = (long[]) g10;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g10 instanceof int[]) {
                int[] iArr = (int[]) g10;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String f(ByteOrder byteOrder) {
        Serializable g10 = g(byteOrder);
        if (g10 == null) {
            return null;
        }
        if (g10 instanceof String) {
            return (String) g10;
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        if (g10 instanceof long[]) {
            long[] jArr = (long[]) g10;
            while (i10 < jArr.length) {
                sb2.append(jArr[i10]);
                i10++;
                if (i10 != jArr.length) {
                    sb2.append(Separators.COMMA);
                }
            }
            return sb2.toString();
        } else if (g10 instanceof int[]) {
            int[] iArr = (int[]) g10;
            while (i10 < iArr.length) {
                sb2.append(iArr[i10]);
                i10++;
                if (i10 != iArr.length) {
                    sb2.append(Separators.COMMA);
                }
            }
            return sb2.toString();
        } else if (g10 instanceof double[]) {
            double[] dArr = (double[]) g10;
            while (i10 < dArr.length) {
                sb2.append(dArr[i10]);
                i10++;
                if (i10 != dArr.length) {
                    sb2.append(Separators.COMMA);
                }
            }
            return sb2.toString();
        } else if (!(g10 instanceof e[])) {
            return null;
        } else {
            e[] eVarArr = (e[]) g10;
            while (i10 < eVarArr.length) {
                sb2.append(eVarArr[i10].f16848a);
                sb2.append('/');
                sb2.append(eVarArr[i10].f16849b);
                i10++;
                if (i10 != eVarArr.length) {
                    sb2.append(Separators.COMMA);
                }
            }
            return sb2.toString();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:78|(2:80|(2:81|(2:83|(2:164|85)(1:86))(2:163|87)))|88|(2:90|(6:166|92|98|150|99|102)(3:93|(2:95|168)(2:96|167)|97))|165|98|150|99|102) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0128, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0129, code lost:
        io.sentry.android.core.AbstractC3612c.d("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:16:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [T1.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [T1.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ByteOrder byteOrder) {
        Throwable th2;
        IOException e10;
        b bVar;
        InputStream inputStream;
        byte b10;
        int i10 = 0;
        byte[] bArr = this.f16843d;
        InputStream inputStream2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    bVar.f16837h0 = byteOrder;
                    int i11 = this.f16840a;
                    int i12 = this.f16841b;
                    switch (i11) {
                        case 1:
                        case 6:
                            if (bArr.length == 1 && (b10 = bArr[0]) >= 0 && b10 <= 1) {
                                String str = new String(new char[]{(char) (b10 + 48)});
                                try {
                                    bVar.close();
                                } catch (IOException e11) {
                                    AbstractC3612c.d("ExifInterface", "IOException occurred while closing InputStream", e11);
                                }
                                return str;
                            }
                            String str2 = new String(bArr, g.f16861L);
                            try {
                                bVar.close();
                            } catch (IOException e12) {
                                AbstractC3612c.d("ExifInterface", "IOException occurred while closing InputStream", e12);
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (i12 >= g.f16853D.length) {
                                int i13 = 0;
                                while (true) {
                                    byte[] bArr2 = g.f16853D;
                                    if (i13 < bArr2.length) {
                                        if (bArr[i13] == bArr2[i13]) {
                                            i13++;
                                        }
                                    } else {
                                        i10 = bArr2.length;
                                    }
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            while (i10 < i12) {
                                byte b11 = bArr[i10];
                                if (b11 != 0) {
                                    if (b11 >= 32) {
                                        sb2.append((char) b11);
                                    } else {
                                        sb2.append('?');
                                    }
                                    i10++;
                                } else {
                                    String sb3 = sb2.toString();
                                    bVar.close();
                                    return sb3;
                                }
                            }
                            String sb32 = sb2.toString();
                            bVar.close();
                            return sb32;
                        case 3:
                            ?? r15 = new int[i12];
                            while (i10 < i12) {
                                r15[i10] = bVar.readUnsignedShort();
                                i10++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e13) {
                                AbstractC3612c.d("ExifInterface", "IOException occurred while closing InputStream", e13);
                            }
                            return r15;
                        case 4:
                            ?? r152 = new long[i12];
                            while (i10 < i12) {
                                r152[i10] = bVar.readInt() & 4294967295L;
                                i10++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e14) {
                                AbstractC3612c.d("ExifInterface", "IOException occurred while closing InputStream", e14);
                            }
                            return r152;
                        case 5:
                            ?? r153 = new e[i12];
                            while (i10 < i12) {
                                r153[i10] = new e(bVar.readInt() & 4294967295L, bVar.readInt() & 4294967295L);
                                i10++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e15) {
                                AbstractC3612c.d("ExifInterface", "IOException occurred while closing InputStream", e15);
                            }
                            return r153;
                        case 8:
                            ?? r154 = new int[i12];
                            while (i10 < i12) {
                                r154[i10] = bVar.readShort();
                                i10++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e16) {
                                AbstractC3612c.d("ExifInterface", "IOException occurred while closing InputStream", e16);
                            }
                            return r154;
                        case 9:
                            ?? r155 = new int[i12];
                            while (i10 < i12) {
                                r155[i10] = bVar.readInt();
                                i10++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e17) {
                                AbstractC3612c.d("ExifInterface", "IOException occurred while closing InputStream", e17);
                            }
                            return r155;
                        case 10:
                            ?? r156 = new e[i12];
                            while (i10 < i12) {
                                r156[i10] = new e(bVar.readInt(), bVar.readInt());
                                i10++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e18) {
                                AbstractC3612c.d("ExifInterface", "IOException occurred while closing InputStream", e18);
                            }
                            return r156;
                        case 11:
                            ?? r157 = new double[i12];
                            while (i10 < i12) {
                                r157[i10] = bVar.readFloat();
                                i10++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e19) {
                                AbstractC3612c.d("ExifInterface", "IOException occurred while closing InputStream", e19);
                            }
                            return r157;
                        case 12:
                            ?? r158 = new double[i12];
                            while (i10 < i12) {
                                r158[i10] = bVar.readDouble();
                                i10++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e20) {
                                AbstractC3612c.d("ExifInterface", "IOException occurred while closing InputStream", e20);
                            }
                            return r158;
                        default:
                            try {
                                bVar.close();
                            } catch (IOException e21) {
                                AbstractC3612c.d("ExifInterface", "IOException occurred while closing InputStream", e21);
                            }
                            return null;
                    }
                } catch (IOException e22) {
                    e10 = e22;
                    AbstractC3612c.s("ExifInterface", "IOException occurred during reading a value", e10);
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e23) {
                            AbstractC3612c.d("ExifInterface", "IOException occurred while closing InputStream", e23);
                        }
                    }
                    return null;
                }
            } catch (Throwable th3) {
                th2 = th3;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e24) {
                        AbstractC3612c.d("ExifInterface", "IOException occurred while closing InputStream", e24);
                    }
                }
                throw th2;
            }
        } catch (IOException e25) {
            e10 = e25;
            bVar = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (inputStream2 != null) {
            }
            throw th2;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
        sb2.append(g.f16851B[this.f16840a]);
        sb2.append(", data length:");
        return android.gov.nist.core.a.l(sb2, this.f16843d.length, Separators.RPAREN);
    }

    public c(long j6, byte[] bArr, int i10, int i11) {
        this.f16840a = i10;
        this.f16841b = i11;
        this.f16842c = j6;
        this.f16843d = bArr;
    }
}
