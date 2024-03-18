package P8;

import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class c implements Closeable, Flushable {

    /* renamed from: o0  reason: collision with root package name */
    public static final Pattern f13865o0 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: p0  reason: collision with root package name */
    public static final String[] f13866p0 = new String[128];

    /* renamed from: q0  reason: collision with root package name */
    public static final String[] f13867q0;

    /* renamed from: Y  reason: collision with root package name */
    public final Writer f13868Y;

    /* renamed from: Z  reason: collision with root package name */
    public int[] f13869Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f13870h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f13871i0;

    /* renamed from: j0  reason: collision with root package name */
    public String f13872j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f13873k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f13874l0;

    /* renamed from: m0  reason: collision with root package name */
    public String f13875m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f13876n0;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f13866p0[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f13866p0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f13867q0 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.f13869Z = iArr;
        this.f13870h0 = 0;
        if (iArr.length == 0) {
            this.f13869Z = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f13869Z;
        int i10 = this.f13870h0;
        this.f13870h0 = i10 + 1;
        iArr2[i10] = 6;
        this.f13872j0 = ":";
        this.f13876n0 = true;
        Objects.requireNonNull(writer, "out == null");
        this.f13868Y = writer;
    }

    public c F() {
        if (this.f13875m0 != null) {
            if (this.f13876n0) {
                u0();
            } else {
                this.f13875m0 = null;
                return this;
            }
        }
        a();
        this.f13868Y.write("null");
        return this;
    }

    public final int O() {
        int i10 = this.f13870h0;
        if (i10 != 0) {
            return this.f13869Z[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(String str) {
        String[] strArr;
        String str2;
        if (this.f13874l0) {
            strArr = f13867q0;
        } else {
            strArr = f13866p0;
        }
        Writer writer = this.f13868Y;
        writer.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt < '\u0080') {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i10 < i11) {
                    writer.write(str, i10, i11 - i10);
                }
                writer.write(str2);
                i10 = i11 + 1;
            } else {
                if (charAt == '\u2028') {
                    str2 = "\\u2028";
                } else if (charAt == '\u2029') {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                }
                writer.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            writer.write(str, i10, length - i10);
        }
        writer.write(34);
    }

    public void S(double d10) {
        u0();
        if (!this.f13873k0 && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        a();
        this.f13868Y.append((CharSequence) Double.toString(d10));
    }

    public void V(long j6) {
        u0();
        a();
        this.f13868Y.write(Long.toString(j6));
    }

    public final void a() {
        int O10 = O();
        if (O10 != 1) {
            Writer writer = this.f13868Y;
            if (O10 != 2) {
                if (O10 != 4) {
                    if (O10 != 6) {
                        if (O10 == 7) {
                            if (!this.f13873k0) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.f13869Z[this.f13870h0 - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.f13872j0);
                this.f13869Z[this.f13870h0 - 1] = 5;
                return;
            }
            writer.append(',');
            r();
            return;
        }
        this.f13869Z[this.f13870h0 - 1] = 2;
        r();
    }

    public void a0(Boolean bool) {
        String str;
        if (bool == null) {
            F();
            return;
        }
        u0();
        a();
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        this.f13868Y.write(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f13868Y.close();
        int i10 = this.f13870h0;
        if (i10 <= 1 && (i10 != 1 || this.f13869Z[i10 - 1] == 7)) {
            this.f13870h0 = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public void d0(Number number) {
        if (number == null) {
            F();
            return;
        }
        u0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f13865o0.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f13873k0) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        a();
        this.f13868Y.append((CharSequence) obj);
    }

    public void f0(String str) {
        if (str == null) {
            F();
            return;
        }
        u0();
        a();
        P(str);
    }

    public void flush() {
        if (this.f13870h0 != 0) {
            this.f13868Y.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void h() {
        u0();
        a();
        int i10 = this.f13870h0;
        int[] iArr = this.f13869Z;
        if (i10 == iArr.length) {
            this.f13869Z = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f13869Z;
        int i11 = this.f13870h0;
        this.f13870h0 = i11 + 1;
        iArr2[i11] = 1;
        this.f13868Y.write(91);
    }

    public void i() {
        u0();
        a();
        int i10 = this.f13870h0;
        int[] iArr = this.f13869Z;
        if (i10 == iArr.length) {
            this.f13869Z = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f13869Z;
        int i11 = this.f13870h0;
        this.f13870h0 = i11 + 1;
        iArr2[i11] = 3;
        this.f13868Y.write(123);
    }

    public final void j(char c10, int i10, int i11) {
        int O10 = O();
        if (O10 != i11 && O10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f13875m0 == null) {
            this.f13870h0--;
            if (O10 == i11) {
                r();
            }
            this.f13868Y.write(c10);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.f13875m0);
    }

    public void k() {
        j(']', 1, 2);
    }

    public void m() {
        j('}', 3, 5);
    }

    public void m0(boolean z10) {
        String str;
        u0();
        a();
        if (z10) {
            str = "true";
        } else {
            str = "false";
        }
        this.f13868Y.write(str);
    }

    public void p(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f13875m0 == null) {
            if (this.f13870h0 != 0) {
                this.f13875m0 = str;
                return;
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new IllegalStateException();
    }

    public final void r() {
        if (this.f13871i0 == null) {
            return;
        }
        Writer writer = this.f13868Y;
        writer.write(10);
        int i10 = this.f13870h0;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(this.f13871i0);
        }
    }

    public final void u0() {
        if (this.f13875m0 != null) {
            int O10 = O();
            if (O10 == 5) {
                this.f13868Y.write(44);
            } else if (O10 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            r();
            this.f13869Z[this.f13870h0 - 1] = 4;
            P(this.f13875m0);
            this.f13875m0 = null;
        }
    }
}
