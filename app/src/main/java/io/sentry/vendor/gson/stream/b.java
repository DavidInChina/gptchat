package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements Closeable, Flushable {

    /* renamed from: m0  reason: collision with root package name */
    public static final String[] f34791m0 = new String[128];

    /* renamed from: Y  reason: collision with root package name */
    public final Writer f34792Y;

    /* renamed from: Z  reason: collision with root package name */
    public int[] f34793Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f34794h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f34795i0;

    /* renamed from: j0  reason: collision with root package name */
    public String f34796j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f34797k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f34798l0;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f34791m0[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f34791m0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f34793Z = iArr;
        this.f34794h0 = 0;
        if (iArr.length == 0) {
            this.f34793Z = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f34793Z;
        int i10 = this.f34794h0;
        this.f34794h0 = i10 + 1;
        iArr2[i10] = 6;
        this.f34796j0 = ":";
        this.f34798l0 = true;
        this.f34792Y = writer;
    }

    public final void a() {
        int k10 = k();
        if (k10 != 1) {
            Writer writer = this.f34792Y;
            if (k10 != 2) {
                if (k10 != 4) {
                    if (k10 != 6) {
                        if (k10 == 7) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                        throw new IllegalStateException("Nesting problem.");
                    }
                    this.f34793Z[this.f34794h0 - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.f34796j0);
                this.f34793Z[this.f34794h0 - 1] = 5;
                return;
            }
            writer.append(',');
            i();
            return;
        }
        this.f34793Z[this.f34794h0 - 1] = 2;
        i();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34792Y.close();
        int i10 = this.f34794h0;
        if (i10 <= 1 && (i10 != 1 || this.f34793Z[i10 - 1] == 7)) {
            this.f34794h0 = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f34794h0 != 0) {
            this.f34792Y.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void h(char c10, int i10, int i11) {
        int k10 = k();
        if (k10 != i11 && k10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f34797k0 == null) {
            this.f34794h0--;
            if (k10 == i11) {
                i();
            }
            this.f34792Y.write(c10);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.f34797k0);
    }

    public final void i() {
        if (this.f34795i0 == null) {
            return;
        }
        Writer writer = this.f34792Y;
        writer.write(10);
        int i10 = this.f34794h0;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(this.f34795i0);
        }
    }

    public final void j() {
        if (this.f34797k0 != null) {
            if (this.f34798l0) {
                p();
            } else {
                this.f34797k0 = null;
                return;
            }
        }
        a();
        this.f34792Y.write("null");
    }

    public final int k() {
        int i10 = this.f34794h0;
        if (i10 != 0) {
            return this.f34793Z[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(String str) {
        String str2;
        String[] strArr = f34791m0;
        Writer writer = this.f34792Y;
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

    public final void p() {
        if (this.f34797k0 != null) {
            int k10 = k();
            if (k10 == 5) {
                this.f34792Y.write(44);
            } else if (k10 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            i();
            this.f34793Z[this.f34794h0 - 1] = 4;
            m(this.f34797k0);
            this.f34797k0 = null;
        }
    }
}
