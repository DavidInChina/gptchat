package H4;

import U3.c;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class a implements Closeable {

    /* renamed from: j0  reason: collision with root package name */
    public static final String[] f7432j0 = new String[128];

    /* renamed from: Y  reason: collision with root package name */
    public int f7433Y;

    /* renamed from: Z  reason: collision with root package name */
    public int[] f7434Z;

    /* renamed from: h0  reason: collision with root package name */
    public String[] f7435h0;

    /* renamed from: i0  reason: collision with root package name */
    public int[] f7436i0;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f7432j0[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f7432j0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract int F();

    public abstract String O();

    public abstract int P();

    public final void S(int i10) {
        int i11 = this.f7433Y;
        int[] iArr = this.f7434Z;
        if (i11 == iArr.length) {
            if (i11 != 256) {
                this.f7434Z = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f7435h0;
                this.f7435h0 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f7436i0;
                this.f7436i0 = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new RuntimeException("Nesting too deep at " + k());
            }
        }
        int[] iArr3 = this.f7434Z;
        int i12 = this.f7433Y;
        this.f7433Y = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int V(c cVar);

    public abstract void a();

    public abstract void a0();

    public abstract void d0();

    public final void f0(String str) {
        StringBuilder r10 = android.gov.nist.core.a.r(str, " at path ");
        r10.append(k());
        throw new IOException(r10.toString());
    }

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public final String k() {
        int i10 = this.f7433Y;
        int[] iArr = this.f7434Z;
        String[] strArr = this.f7435h0;
        int[] iArr2 = this.f7436i0;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 != 1 && i12 != 2) {
                if (i12 == 3 || i12 == 4 || i12 == 5) {
                    sb2.append('.');
                    String str = strArr[i11];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append('[');
                sb2.append(iArr2[i11]);
                sb2.append(']');
            }
        }
        return sb2.toString();
    }

    public abstract boolean m();

    public abstract boolean p();

    public abstract double r();
}
