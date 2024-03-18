package V1;

import android.util.Log;
import j$.util.Objects;
import java.io.Writer;

/* loaded from: classes2.dex */
public final class b0 extends Writer {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f18157Y = 0;

    /* renamed from: h0  reason: collision with root package name */
    public final CharSequence f18159h0 = new StringBuilder(128);

    /* renamed from: Z  reason: collision with root package name */
    public final Object f18158Z = "FragmentManager";

    public final void a() {
        if (((StringBuilder) this.f18159h0).length() > 0) {
            Log.d((String) this.f18158Z, ((StringBuilder) this.f18159h0).toString());
            CharSequence charSequence = this.f18159h0;
            ((StringBuilder) charSequence).delete(0, ((StringBuilder) charSequence).length());
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        switch (this.f18157Y) {
            case 1:
                ((Appendable) this.f18158Z).append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f18157Y) {
            case 0:
                a();
                return;
            default:
                return;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f18157Y) {
            case 0:
                a();
                return;
            default:
                return;
        }
    }

    @Override // java.io.Writer
    public final void write(int i10) {
        switch (this.f18157Y) {
            case 1:
                ((Appendable) this.f18158Z).append((char) i10);
                return;
            default:
                super.write(i10);
                return;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i10, int i11) {
        switch (this.f18157Y) {
            case 1:
                ((Appendable) this.f18158Z).append(charSequence, i10, i11);
                return this;
            default:
                return super.append(charSequence, i10, i11);
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i10, int i11) {
        switch (this.f18157Y) {
            case 1:
                Objects.requireNonNull(str);
                ((Appendable) this.f18158Z).append(str, i10, i11 + i10);
                return;
            default:
                super.write(str, i10, i11);
                return;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        switch (this.f18157Y) {
            case 0:
                for (int i12 = 0; i12 < i11; i12++) {
                    char c10 = cArr[i10 + i12];
                    if (c10 == '\n') {
                        a();
                    } else {
                        ((StringBuilder) this.f18159h0).append(c10);
                    }
                }
                return;
            default:
                K8.r rVar = (K8.r) this.f18159h0;
                rVar.getClass();
                rVar.getClass();
                ((Appendable) this.f18158Z).append(rVar, i10, i11 + i10);
                return;
        }
    }
}
